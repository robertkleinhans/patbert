
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object rules_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._

class rules extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /*
 * This template takes a single argument, a String containing a
 * message to display.
 */
  def apply/*5.2*/(message: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*5.19*/("""

"""),format.raw/*11.4*/("""
"""),_display_(/*12.2*/main("Welcome to Play")/*12.25*/ {_display_(Seq[Any](format.raw/*12.27*/("""
 
    

    

    """),format.raw/*18.5*/("""<div>
            
    
            <nav class="navbar navbar-default navbar-fixed-top">
          <div class="container-fluid">
            <!-- Brand and toggle get grouped for better mobile display -->
            <div class="navbar-header">
              <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="true">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
              </button>
              <a class="navbar-brand" href="/home"><span class="glyphicon glyphicon-king" aria-hidden="true"></span> Schach</a>
            </div>
            <!-- Collect the nav links, forms, and other content for toggling -->
            <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
              <ul class="nav navbar-nav">
                <li><a href="/game"><span class="glyphicon glyphicon-knight" aria-hidden="true"></span> Spiel </a></li>
                <li class="active"><a href="/rules"><span class="glyphicon glyphicon-tower" aria-hidden="true"></span> Regeln<span class="sr-only">(current)</span></a></li>
                <li><a href="https://www.google.com/accounts/Logout?continue=https://appengine.google.com/_ah/logout?continue=http://localhost:9000/"><span class="glyphicon glyphicon-bishop" aria-hidden="true"></span> Ausloggen</a></li>
              </ul>
              <ul class="nav navbar-nav navbar-right">
                <button style="background-color:#8b4513" class="btn btn-default" onclick="document.getElementById('page-wrap').style.color = '#8b4513';"></button>  <!-- braun -->
                 <button style="background-color:#8B0000" class="btn btn-default" onclick="document.getElementById('page-wrap').style.color = '#8B0000';"></button>  <!-- rot -->
                 <button style="background-color:#008000" class="btn btn-default" onclick="document.getElementById('page-wrap').style.color = '#008000';"></button>  <!-- grün -->
                 <button style="background-color:#0000FF" class="btn btn-default" onclick="document.getElementById('page-wrap').style.color = '#0000FF';"></button>  <!-- blau -->
                 <button style="background-color:#FFD700" class="btn btn-default" onclick="document.getElementById('page-wrap').style.color = '#FFD700';"></button>  <!-- gold -->
                 <button style="background-color:#000000" class="btn btn-default" onclick="document.getElementById('page-wrap').style.color = '#000000';"></button>  <!-- schwarz -->
                 <button style="background-color:#4B0082" class="btn btn-default" onclick="document.getElementById('page-wrap').style.color = '#4B0082';"></button>  <!-- lila -->
              </ul>
            </div><!-- /.navbar-collapse -->
          </div><!-- /.container-fluid -->
        </nav>
        
        
    <div id="page-wrap" font color="#0000FF">
    
     
    
    
        <h2>Schach Regeln</h2>
        
            <ul id="ruleset" style="list-style-type: none">
            
            <li>
            <h3><span class="glyphicon glyphicon-pawn" aria-hidden="true" style="margin-right: 10px"></span><span class="label label-default">Einleitung</span></h3>
            <p>
            Schach ist ein Spiel für 2 Spieler, mit weißen und schwarzen Figuren.Bei Spielbeginn hat jeder Spieler 16 Figuren: ein König, eine Dame, zwei Türme, zwei Läufer, zwei Springer und acht Bauern.
            </p>
            </li>
            
            <li>
            <h3><span class="glyphicon glyphicon-knight" aria-hidden="true" style="margin-right: 10px"></span><span class="label label-default">Ziel</span></h3>
            <p>
            Gegenstand des Spiels ist es den gegnerischen König zu schlagen. Zwar wird der König nie geschlagen, aber kann der König nicht auf ein Feld ziehen, was nicht von einer gegnerischen Figur bedroht wird, so spricht man von Schachmatt und das Spiel ist zuende.
            </p>
            </li>
            
            <li>
            <h3><span class="glyphicon glyphicon-tower" aria-hidden="true" style="margin-right: 10px"></span><span class="label label-default">Spielen</span></h3>
            <p>
            Ein Zug besteht aus dem Platzieren der Figur auf einem anderen Quadrat, gemäß den Regeln und Bewegungen der Schachfiguren. <br>
            Sie können eine gegnerische Figur schlagen, indem Sie Ihre Figur auf das Feld der gegnerischen Figur setzen. Die gegnerische Figur wird vom Brett genommen und scheidet für den Rest des Spiels aus.
            </p>
            </li>
            
            <li>
            <h3><span class="glyphicon glyphicon-tower" aria-hidden="true" style="margin-right: 10px"></span><span class="label label-default">Bewegung der Figuren</span></h3>
            <p>
            Pro Zug kann nur eine Figur bewegt werden. Sie kann entweder ein Feld oder beliebig viele Felder gehen. Wenn sie beliebig viele Felder gehen kann, dann in einem Zug nur in eine Richtung. Sie kann nur solange Felder laufen
            bis sie an den Rand des Spielbrettes oder an eine andere Figur stößt. Ist die andere Figur eine eigene, kann die Figur die eigene nicht Schlagen, ist die Figur eine gegnerische kann diese geschlagen werden.
            </p>
            <p>
            <b>König</b>: Der König kann sich diagonal, vertikal und horizontal bewegen. Dabei kann er genau ein Feld laufen.<br>
            <b>Dame</b>: Die Dame kann sich diagonal, vertikal und horizontal bewegen. Dabei kann sie beliebig viele Felder laufen.<br>
            <b>Turm</b>: Der Turm kann sich nur vertikal und horizontal bewegen. Dabei kann er beliebig viele Felder laufen.<br>
            <b>Läufer</b>: Der Läufer kann sich nur diagonal bewegen. Dabei kann er belibig viele Felder laufen. So kann sich ein Läufer nur auf den Schwarzen Feldern bewegen und der andere nur auf den Weißen.<br>
            <b>Springer</b>: Der Springer kann sich jede Richtung bewegen. Dabei geht er immer ein Feld vor und ein Feld Diagonal.Alternativ kann er statt ein Feld vor auch ein Feld zurück oder ein Feld zur horizontalen. Dabei kann er andere Figuren überspringen. Der Springer kann dabei nicht ein Feld vor und dann diagnoal zurück. 
            Der Springer kann also nicht neben seine Ursprungsposition springen. Die Angrifslinie des Springers kann nicht geblockt werden.<br>
            <b>Bauer</b>: Der Bauer bewegt sich immer nur ein Feld nach vorne. Bewegt sich der Bauer zum ersten Mal, kann er zwei Felder auf einmal laufen. Ab jedem weiteren Zug nur noch ein Feld. Rückwärts kann der Bauer nicht laufen. Außnahme ist, wenn der Bauer eine gegnerische Figur schlägt. Dabei bewegt er sich diagonal nach vorne. Gerade aus geschlagen kann der Bauer nicht.<br>
            </p>
            </li>


            <li>
            <h3><span class="glyphicon glyphicon-king" aria-hidden="true" style="margin-right: 10px"></span><span class="label label-default">Schach</span></h3>
            <p>
            Wird ein König von einer Figur bedroht und kann er noch auf ein nicht bedrohtes Feld ziehen, so nennt man das Schach. Ein König darf nicht ins Schach gezogen werden. Steht der König im Schach, muss er sofort herausgezogen werden. Es gibt drei Möglichkeiten aus dem Schach zu ziehen:
            <br>
            - Schlage die Figur, die den König bedroht. <br>
            - Blockiere die Angriffslinie, stelle eine Figur zwischen den Angreifer und dem König. (Ein Springer kann nicht geblockt werden) <br>
            - Den König aus dem Schach ziehen <br>
            </p>
            </li>

            <li>
            <h3><span class="glyphicon glyphicon-bishop" aria-hidden="true" style="margin-right: 10px"></span><span class="label label-default">Schachmatt</span></h3>
            <p>
            Das Ziel ist, den gegnerischen König Schachmatt zu setzen. Kann der König nicht aus dem Schach ziehen, der Angreifer kann nicht geschlagen werden und die Angriffslinie kann nicht blockiert werden,
            dann ist er Schachmatt und das Spiel ist beendet. Wurde man Schachmatt gesetzt, verliert man das Spiel und der Gegener ist der Gewinner.
            </p>
            </li>

            <li>
            <h3><span class="glyphicon glyphicon-queen" aria-hidden="true" style="margin-right: 10px"></span><span class="label label-default">Patt</span></h3>
            <p>
            Das Spiel endet unentschieden, wenn der Spieler der seinen Zug machen muß, keinen legalen Zug machen kann und der König nicht im Schach steht. Man spricht dann von einem Patt. Die Partie ist dann beendet und endet unentschieden.
            </p>
            </li>
            
            </ul>
    </div>
    
    </div>
    
    """)))}))
      }
    }
  }

  def render(message:String): play.twirl.api.HtmlFormat.Appendable = apply(message)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (message) => apply(message)

  def ref: this.type = this

}


}

/*
 * This template takes a single argument, a String containing a
 * message to display.
 */
object rules extends rules_Scope0.rules
              /*
                  -- GENERATED --
                  DATE: Tue Jan 24 17:31:27 CET 2017
                  SOURCE: Z:/6. Semester/Web Tech/play-java/app/views/rules.scala.html
                  HASH: 5cf0f467281463841e71ce1ae9bbfd95ac17c5bd
                  MATRIX: 834->95|946->112|975->308|1003->310|1035->333|1075->335|1121->354
                  LINES: 30->5|35->5|37->11|38->12|38->12|38->12|44->18
                  -- GENERATED --
              */
          