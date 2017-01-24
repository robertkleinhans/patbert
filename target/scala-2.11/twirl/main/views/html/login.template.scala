
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object login_Scope0 {
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

class login extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*1.2*/main("Welcome to Play")/*1.25*/ {_display_(Seq[Any](format.raw/*1.27*/("""


 """),format.raw/*4.2*/("""<script src="https://apis.google.com/js/platform.js" async defer></script>
        <meta name="google-signin-client_id" content="145682336450-h7dhjmddoqjclvs3jpes83pv2mkr40ji.apps.googleusercontent.com">
   
    
    <chess-app></chess-app>
  
    
    <center>
    
    <div id="login-div" class="middle">
        <div id="login-button" class="middle pt5">
            <div class="g-signin2" data-onsuccess="onSignIn"></div>
        </div>
    </div>
    
    
     </center>
    
<script>
     function onSignIn(googleUser) """),format.raw/*23.36*/("""{"""),format.raw/*23.37*/("""
        """),format.raw/*24.9*/("""window.location = "/home"
    """),format.raw/*25.5*/("""}"""),format.raw/*25.6*/("""; 
</script>
  
  
""")))}),format.raw/*29.2*/("""



"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


}

/**/
object login extends login_Scope0.login
              /*
                  -- GENERATED --
                  DATE: Tue Jan 24 17:31:27 CET 2017
                  SOURCE: Z:/6. Semester/Web Tech/play-java/app/views/login.scala.html
                  HASH: 1b02249bc557f1d1a2db8ca9a47e23e72934519f
                  MATRIX: 827->1|858->24|897->26|927->30|1481->556|1510->557|1546->566|1603->596|1631->597|1681->617
                  LINES: 32->1|32->1|32->1|35->4|54->23|54->23|55->24|56->25|56->25|60->29
                  -- GENERATED --
              */
          