
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object index_Scope0 {
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

class index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

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
    
    

    """),format.raw/*16.5*/("""<div>
            
    
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
              <a class="navbar-brand active" href=""><span class="glyphicon glyphicon-king" aria-hidden="true"></span> Schach<span class="sr-only">(current)</span></a>
            </div>
            <!-- Collect the nav links, forms, and other content for toggling -->
            <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
              <ul class="nav navbar-nav">
                <li><a href="/game"><span class="glyphicon glyphicon-knight" aria-hidden="true"></span> Spiel</a></li>
                <li><a href="/rules"><span class="glyphicon glyphicon-tower" aria-hidden="true"></span> Regeln</a></li>
              </ul>
              <ul class="nav navbar-nav navbar-right">
                 <button style="background-color:#8b4513" class="btn btn-default" onclick="document.getElementById('bereich1').style.color = '#8b4513';"></button>  <!-- braun -->
                 <button style="background-color:#8B0000" class="btn btn-default" onclick="document.getElementById('bereich1').style.color = '#8B0000';"></button>  <!-- rot -->
                 <button style="background-color:#008000" class="btn btn-default" onclick="document.getElementById('bereich1').style.color = '#008000';"></button>  <!-- grün -->
                 <button style="background-color:#0000FF" class="btn btn-default" onclick="document.getElementById('bereich1').style.color = '#0000FF';"></button>  <!-- blau -->
                 <button style="background-color:#FFD700" class="btn btn-default" onclick="document.getElementById('bereich1').style.color = '#FFD700';"></button>  <!-- gold -->
                 <button style="background-color:#000000" class="btn btn-default" onclick="document.getElementById('bereich1').style.color = '#000000';"></button>  <!-- schwarz -->
                 <button style="background-color:#4B0082" class="btn btn-default" onclick="document.getElementById('bereich1').style.color = '#4B0082';"></button>  <!-- lila -->
              </ul>
            </div><!-- /.navbar-collapse -->
          </div><!-- /.container-fluid -->
        </nav>
        
        
         <ul class="breadcrumb">
                <li>
                    <a href="#">Home</a> <span class="divider"></span>
                </li>
                <li>
                    <a herf="#">Libary</a> <span class="divider"></span>
                </li>
                <li class="activate">Data</li>
            </ul>
            
            <div class="panel panel-default">
                <div class="panel-body">
                <p id="bereich1">
                    Hier könnte Ihre Werbung stehen!
                </p>
                </div>
            </div>
            
            
            
            <div class="panel panel-default">
                <div class="panel-heading">
                    <h3 class="panel-title">Spielfiguren:</h3>
                </div>
                <div class="panel-body">
                     <span class="glyphicon glyphicon-king" aria-hidden="true"> König<span style="margin-left:64px"></span>  </span>
                     <span class="glyphicon glyphicon-queen" aria-hidden="true"> Dame<span style="margin-left:64px"></span></span>
                     <span class="glyphicon glyphicon-bishop" aria-hidden="true"> Läufer<span style="margin-left:64px"></span>  </span>
                     <span class="glyphicon glyphicon-knight" aria-hidden="true"> Springer<span style="margin-left:64px"></span>  </span>
                     <span class="glyphicon glyphicon-tower" aria-hidden="true"> Turm<span style="margin-left:64px"></span>  </span>
                     <span class="glyphicon glyphicon-pawn" aria-hidden="true"> Bauer<span style="margin-left:64px"></span>  </span>
                     
                </div>
            </div>
    </div>
""")))}),format.raw/*86.2*/("""
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
object index extends index_Scope0.index
              /*
                  -- GENERATED --
                  DATE: Tue Jan 24 17:31:27 CET 2017
                  SOURCE: Z:/6. Semester/Web Tech/play-java/app/views/index.scala.html
                  HASH: 6159e06985f1a300d51d0bf441e0c54df368335d
                  MATRIX: 834->95|946->112|975->308|1003->310|1035->333|1075->335|1118->351|5576->4779
                  LINES: 30->5|35->5|37->11|38->12|38->12|38->12|42->16|112->86
                  -- GENERATED --
              */
          