
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object home_Scope0 {
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

class home extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

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
    
    
    

    

    """),format.raw/*19.5*/("""<div id="hintergrund">
            
    
            <nav class="navbar navbar-default">
          <div class="container-fluid">
            <!-- Brand and toggle get grouped for better mobile display -->
            <div class="navbar-header">
              <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
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
                <li class="active"><a href="/game"><span class="glyphicon glyphicon-knight" aria-hidden="true"></span> Spiel <span class="sr-only">(current)</span></a></li>
                <li><a href="/rules"><span class="glyphicon glyphicon-tower" aria-hidden="true"></span> Regeln</a></li>
                
              </ul>
              <ul class="nav navbar-nav navbar-right" padding-top="5px">
                 <li><a href="https://www.google.com/accounts/Logout?continue=https://appengine.google.com/_ah/logout?continue=http://localhost:9000/"><span class="glyphicon glyphicon-bishop" aria-hidden="true"></span>Sign out from Game</a></li>
                 <button style="background-color:#8b4513" class="btn btn-default" onclick="document.getElementByClassName('white_field').style.color = '#8b4513';"></button>  <!-- braun -->
                 <button style="background-color:#8B0000" class="btn btn-default" onclick="document.getElementByClassName('white_field').style.color = '#8B0000';"></button>  <!-- rot -->
                 <button style="background-color:#008000" class="btn btn-default" onclick="document.getElementByClassName('white_field1').style.color = '#008000';"></button>  <!-- grün -->
                 <button style="background-color:#0000FF" class="btn btn-default" onclick="document.getElementByClassName('white_field').style.color = '#0000FF';"></button>  <!-- blau -->
                 <button style="background-color:#FFD700" class="btn btn-default" onclick="document.getElementByClassName('white_field').style.color = '#FFD700';"></button>  <!-- gold -->
                 <button style="background-color:#000000" class="btn btn-default" onclick="document.getElementByClassName('white_field').style.color = '#000000';"></button>  <!-- schwarz -->
                 <button style="background-color:#4B0082" class="btn btn-default" onclick="document.getElementById('black_field').style.color = '#4B0082';"></button>  <!-- lila -->
                 <button style="background-color:#8b4513" class="btn btn-default" onclick="document.getElementById('bereich1').style.color = '#8b4513';"></button>  <!-- braun -->
              </ul>
            </div><!-- /.navbar-collapse -->
          </div><!-- /.container-fluid -->
        </nav>
    </div>
    
     <home-page></home-page>
    
    <p>
    <center>
         <button type="button" class="btn btn-default"><a href="/chess.html">Starte ein Spiel mit Angular</a></button>
         <button type="button" class="btn btn-default"><a href="/game">Starte ein Spiel mit Play</a></button>
        
         
    </center>
    </p>
    
    
    
""")))}),format.raw/*70.2*/("""
"""))
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
object home extends home_Scope0.home
              /*
                  -- GENERATED --
                  DATE: Tue Jan 24 17:36:58 CET 2017
                  SOURCE: Z:/6. Semester/Web Tech/play-java/app/views/home.scala.html
                  HASH: 731d8f1e2da4db23338f6db86335bc479448af16
                  MATRIX: 832->95|944->112|973->308|1001->310|1033->333|1073->335|1127->362|4766->3971
                  LINES: 30->5|35->5|37->11|38->12|38->12|38->12|45->19|96->70
                  -- GENERATED --
              */
          