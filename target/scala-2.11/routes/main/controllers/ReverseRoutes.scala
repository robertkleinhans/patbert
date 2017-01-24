
// @GENERATOR:play-routes-compiler
// @SOURCE:Z:/6. Semester/Web Tech/play-java/conf/routes
// @DATE:Tue Jan 24 17:34:33 CET 2017

import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:7
package controllers {

  // @LINE:11
  class ReverseAsyncController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:11
    def message(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "message")
    }
  
  }

  // @LINE:7
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:19
    def tui(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "tui")
    }
  
    // @LINE:27
    def createWebSocket(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "socket")
    }
  
    // @LINE:17
    def game(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "game")
    }
  
    // @LINE:23
    def rules(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "rules")
    }
  
    // @LINE:21
    def home(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "home")
    }
  
    // @LINE:7
    def login(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix)
    }
  
  }

  // @LINE:14
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:25
    def at(path:String, file:String): Call = {
    
      (path: @unchecked, file: @unchecked) match {
      
        // @LINE:25
        case (path, file) if path == "/public/images" =>
          implicit val _rrc = new ReverseRouteContext(Map(("path", "/public/images")))
          Call("GET", _prefix + { _defaultPrefix } + "images/" + implicitly[PathBindable[String]].unbind("file", file))
      
        // @LINE:31
        case (path, file) if path == "/public/html" && file == "chess.html" =>
          implicit val _rrc = new ReverseRouteContext(Map(("path", "/public/html"), ("file", "chess.html")))
          Call("GET", _prefix + { _defaultPrefix } + "chess.html")
      
        // @LINE:32
        case (path, file) if path == "/public/javascripts" && file == "chess_ng.js" =>
          implicit val _rrc = new ReverseRouteContext(Map(("path", "/public/javascripts"), ("file", "chess_ng.js")))
          Call("GET", _prefix + { _defaultPrefix } + "chess_ng.js")
      
        // @LINE:33
        case (path, file) if path == "/public/stylesheets" && file == "chess.css" =>
          implicit val _rrc = new ReverseRouteContext(Map(("path", "/public/stylesheets"), ("file", "chess.css")))
          Call("GET", _prefix + { _defaultPrefix } + "chess.css")
      
      }
    
    }
  
    // @LINE:14
    def versioned(file:Asset): Call = {
      implicit val _rrc = new ReverseRouteContext(Map(("path", "/public")))
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[Asset]].unbind("file", file))
    }
  
  }

  // @LINE:9
  class ReverseCountController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:9
    def count(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "count")
    }
  
  }


}
