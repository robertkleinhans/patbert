package model;


import akka.actor.*;

import java.awt.Point;

import de.htwg.se.schach.control.impl.Tuple;

import de.htwg.se.schach.control.impl.Position;

import de.htwg.se.schach.control.impl.MovementHandler;

import de.htwg.se.schach.view.impl.Signal;

import de.htwg.se.schach.view.impl.GuiChess;

import controllers.HomeController;

public class WebSocketActor extends UntypedActor {
    
    private MovementHandler mov;
    
    private Signal sig;
    
    private GuiChess gui;
    
    private int player = 1;
    
    public static Props props(ActorRef out) {
        return Props.create(WebSocketActor.class, out);
    }
    
    private final ActorRef out;
    
    public WebSocketActor(ActorRef out) {
        
        this.sig = new Signal();
        
        this.gui = new GuiChess(sig);
        
        this.mov = new MovementHandler();
        this.out = out;
        
        
        gui.initializePieces(mov.getField());
        gui.show();
    }
    
    
    public boolean checkMove(Tuple<Position,Position> move, int team) {
        if (mov.movePiece(move.getFirst(),move.getSecond(),team,true)) {
            gui.movePiece(new Point(move.getFirst().getColumn(),move.getFirst().getRow()), new Point(move.getSecond().getColumn(),move.getSecond().getRow()));
            return true;
        }
        return false;
    }
    
    public Tuple<Position,Position> convertMsg(Object msg) {
        Tuple<Position,Position> pos = new Tuple<Position,Position>(null,null);
        String message = msg.toString();
        String[] m_holder = message.split("-");
        int s_row = Character.getNumericValue(m_holder[0].charAt(0)) - 1;
        int s_col = Character.getNumericValue(m_holder[0].charAt(1));
        
        int t_row = Character.getNumericValue(m_holder[1].charAt(0)) - 1;
        int t_col = Character.getNumericValue(m_holder[1].charAt(1));
        
        pos.setFirst(new Position(s_row,s_col));
        pos.setSecond(new Position(t_row,t_col));
        return pos;
    }
    
    public String convertToMsg(Tuple<Position,Position> tp) {
        StringBuilder sb = new StringBuilder();
        Position first = tp.getFirst();
        Position second = tp.getSecond();
        sb.append(Integer.toString(first.getRow()+1)).append(Integer.toString(first.getColumn())).append("0").append("-");
        sb.append(Integer.toString(second.getRow()+1)).append(Integer.toString(second.getColumn())).append("0");
        return sb.toString();
    }

    public void sendMessage(String message) throws Exception {
        out.tell(message,self());
        player = 1;
    }
    
    public void checkGameEnd() {
        int tmp = mov.checkWin();
        if(tmp == 1) {
            out.tell("WON_P",self());   
        } else if (tmp == 0) {
            out.tell("WON_B",self());
        }
    }
    
    public void onReceive(Object message)  throws Exception {
        if("refresh".equals(message.toString())) {
            this.mov = new MovementHandler();
            return;
        }
        
        if(player != 1) {
            out.tell("err",self());
            return;
        }
        Tuple<Position,Position> tmp = convertMsg(message);
        
        if(checkMove(tmp,1)) {
            out.tell(message.toString(),self());
            
            checkGameEnd();
            
            
            player = 0;
            tmp = mov.patbert(0,6);
            checkMove(tmp,0);
            sendMessage(convertToMsg(tmp));
            
            checkGameEnd();
        } else {
            out.tell("err",self());
        }
        
        
        /*
        if(message instanceof String) {
            out.tell("I received your message: " + message, self());
        }
        */
    }

}
