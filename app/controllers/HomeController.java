package controllers;

import play.*;

import play.routing.JavaScriptReverseRouter;

import play.mvc.*;

import views.html.*;

import play.mvc.LegacyWebSocket;

import play.mvc.WebSocket;

import play.mvc.Controller;

import model.WebSocketActor;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {



    
    
    /**
     * An action that renders an HTML page with a welcome message.
     * The configuration in the <code>routes</code> file means that
     * this method will be called when the application receives a
     * <code>GET</code> request with a path of <code>/</code>.
     */
    public Result index() {
        return ok(index.render("Your new application is ready."));
    }
    
    public Result game() {
        return ok(game.render("Your game is ready"));
    }
    
    public Result home() {
        return ok(home.render("Welcome Home"));
    }
    
    public Result login() {
	    return ok(views.html.login.render());
	}
     
    public Result tui() {
        return ok("Hello World");
        //return ok(Chess.getView.getFieldString());
    }
    
    //public Result makeMove(String Command) {
        //Chess.sig.setInput(command);
        //return ok(Chess.getView.getFieldString());
    //}

    public Result rules() {
        return ok(rules.render("Rules are ready."));
    }
    
   
    
    public LegacyWebSocket<String> createWebSocket() {
        return WebSocket.withActor(WebSocketActor::props);
    }
    
}
