
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object main_Scope0 {
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

class main extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /*
 * This template is called from the `index` template. This template
 * handles the rendering of the page header and body tags. It takes
 * two arguments, a `String` for the title of the page and an `Html`
 * object to insert into the body of the page.
 */
  def apply/*7.2*/(title: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*7.32*/("""

"""),format.raw/*9.1*/("""<!DOCTYPE html>
<html lang="en">
<!--<div class="rechts"></div> -->


    <head>
    
    <!doctype html>
    <meta charset="utf-8">
    <title>Web Chess</title>
    <script src="bower_components/platform/platform.js"></script>
    
    <!-- Latest compiled and minified CSS -->
    <link rel="stylesheet" href="//netdna.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <!-- Optional theme -->
    <link rel="stylesheet" href="//netdna.bootstrapcdn.com/bootstrap/3.3.7/css/bootstraptheme.min.css">
    <!-- Latest compiled and minified JavaScript -->
    <script src="//netdna.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    
    
    <link rel="import" href="assets/polymerElement/login-polymer.html" />
    
    <script src="http://code.jquery.com/jquery-1.10.1.min.js"></script>
    
        """),format.raw/*33.62*/("""
        """),format.raw/*34.9*/("""<title>Schach.de</title>
        
    <link href=""""),_display_(/*36.18*/routes/*36.24*/.Assets.versioned("stylesheets/main.css")),format.raw/*36.65*/("""" rel="stylesheet">
    
    <script src=""""),_display_(/*38.19*/routes/*38.25*/.Assets.versioned("polymer/bower_components/webcomponentsjs/webcomponents-lite.js")),format.raw/*38.108*/(""""></script>
    <link rel="import" href=""""),_display_(/*39.31*/routes/*39.37*/.Assets.versioned("polymer/bower_components/polymer/polymer.html")),format.raw/*39.103*/("""">
    <link rel="import" href=""""),_display_(/*40.31*/routes/*40.37*/.Assets.versioned("polymer/src/chess-app/chess-app.html")),format.raw/*40.94*/("""">
    
    <script src="https://apis.google.com/js/platform.js" async defer></script>
        <meta name="google-signin-client_id" content="652729356373-eb59ib44t596h4c5vo7ppg0hn70ho7en.apps.googleusercontent.com">
        
    
   
    </head>
    
    <body>
    
     """),_display_(/*51.7*/content),format.raw/*51.14*/("""
    
    
    """),format.raw/*54.5*/("""</body>
</html>
"""))
      }
    }
  }

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}


}

/*
 * This template is called from the `index` template. This template
 * handles the rendering of the page header and body tags. It takes
 * two arguments, a `String` for the title of the page and an `Html`
 * object to insert into the body of the page.
 */
object main extends main_Scope0.main
              /*
                  -- GENERATED --
                  DATE: Tue Jan 24 17:31:27 CET 2017
                  SOURCE: Z:/6. Semester/Web Tech/play-java/app/views/main.scala.html
                  HASH: 41ca20480b3991a90cb79441328666a6524331de
                  MATRIX: 1002->260|1127->290|1155->292|2010->1172|2046->1181|2124->1232|2139->1238|2201->1279|2271->1322|2286->1328|2391->1411|2460->1453|2475->1459|2563->1525|2623->1558|2638->1564|2716->1621|3015->1894|3043->1901|3085->1916
                  LINES: 32->7|37->7|39->9|63->33|64->34|66->36|66->36|66->36|68->38|68->38|68->38|69->39|69->39|69->39|70->40|70->40|70->40|81->51|81->51|84->54
                  -- GENERATED --
              */
          