
// @GENERATOR:play-routes-compiler
// @SOURCE:Z:/6. Semester/Web Tech/play-java/conf/routes
// @DATE:Tue Jan 24 17:34:33 CET 2017

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:7
  HomeController_0: controllers.HomeController,
  // @LINE:9
  CountController_3: controllers.CountController,
  // @LINE:11
  AsyncController_2: controllers.AsyncController,
  // @LINE:14
  Assets_1: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:7
    HomeController_0: controllers.HomeController,
    // @LINE:9
    CountController_3: controllers.CountController,
    // @LINE:11
    AsyncController_2: controllers.AsyncController,
    // @LINE:14
    Assets_1: controllers.Assets
  ) = this(errorHandler, HomeController_0, CountController_3, AsyncController_2, Assets_1, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_0, CountController_3, AsyncController_2, Assets_1, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.login"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """count""", """controllers.CountController.count"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """message""", """controllers.AsyncController.message"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """game""", """controllers.HomeController.game"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """tui""", """controllers.HomeController.tui"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """home""", """controllers.HomeController.home"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """rules""", """controllers.HomeController.rules"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """images/""" + "$" + """file<.+>""", """controllers.Assets.at(path:String = "/public/images", file:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """socket""", """controllers.HomeController.createWebSocket"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """chess.html""", """controllers.Assets.at(path:String = "/public/html", file:String = "chess.html")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """chess_ng.js""", """controllers.Assets.at(path:String = "/public/javascripts", file:String = "chess_ng.js")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """chess.css""", """controllers.Assets.at(path:String = "/public/stylesheets", file:String = "chess.css")"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:7
  private[this] lazy val controllers_HomeController_login0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_login0_invoker = createInvoker(
    HomeController_0.login,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "login",
      Nil,
      "GET",
      """ An example controller showing a sample home page""",
      this.prefix + """"""
    )
  )

  // @LINE:9
  private[this] lazy val controllers_CountController_count1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("count")))
  )
  private[this] lazy val controllers_CountController_count1_invoker = createInvoker(
    CountController_3.count,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CountController",
      "count",
      Nil,
      "GET",
      """ An example controller showing how to use dependency injection""",
      this.prefix + """count"""
    )
  )

  // @LINE:11
  private[this] lazy val controllers_AsyncController_message2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("message")))
  )
  private[this] lazy val controllers_AsyncController_message2_invoker = createInvoker(
    AsyncController_2.message,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AsyncController",
      "message",
      Nil,
      "GET",
      """ An example controller showing how to write asynchronous code""",
      this.prefix + """message"""
    )
  )

  // @LINE:14
  private[this] lazy val controllers_Assets_versioned3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned3_invoker = createInvoker(
    Assets_1.versioned(fakeValue[String], fakeValue[Asset]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      """ Map static resources from the /public folder to the /assets URL path""",
      this.prefix + """assets/""" + "$" + """file<.+>"""
    )
  )

  // @LINE:17
  private[this] lazy val controllers_HomeController_game4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("game")))
  )
  private[this] lazy val controllers_HomeController_game4_invoker = createInvoker(
    HomeController_0.game,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "game",
      Nil,
      "GET",
      """""",
      this.prefix + """game"""
    )
  )

  // @LINE:19
  private[this] lazy val controllers_HomeController_tui5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("tui")))
  )
  private[this] lazy val controllers_HomeController_tui5_invoker = createInvoker(
    HomeController_0.tui,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "tui",
      Nil,
      "GET",
      """""",
      this.prefix + """tui"""
    )
  )

  // @LINE:21
  private[this] lazy val controllers_HomeController_home6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("home")))
  )
  private[this] lazy val controllers_HomeController_home6_invoker = createInvoker(
    HomeController_0.home,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "home",
      Nil,
      "GET",
      """""",
      this.prefix + """home"""
    )
  )

  // @LINE:23
  private[this] lazy val controllers_HomeController_rules7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("rules")))
  )
  private[this] lazy val controllers_HomeController_rules7_invoker = createInvoker(
    HomeController_0.rules,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "rules",
      Nil,
      "GET",
      """""",
      this.prefix + """rules"""
    )
  )

  // @LINE:25
  private[this] lazy val controllers_Assets_at8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("images/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_at8_invoker = createInvoker(
    Assets_1.at(fakeValue[String], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "at",
      Seq(classOf[String], classOf[String]),
      "GET",
      """""",
      this.prefix + """images/""" + "$" + """file<.+>"""
    )
  )

  // @LINE:27
  private[this] lazy val controllers_HomeController_createWebSocket9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("socket")))
  )
  private[this] lazy val controllers_HomeController_createWebSocket9_invoker = createInvoker(
    HomeController_0.createWebSocket,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "createWebSocket",
      Nil,
      "GET",
      """""",
      this.prefix + """socket"""
    )
  )

  // @LINE:31
  private[this] lazy val controllers_Assets_at10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("chess.html")))
  )
  private[this] lazy val controllers_Assets_at10_invoker = createInvoker(
    Assets_1.at(fakeValue[String], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "at",
      Seq(classOf[String], classOf[String]),
      "GET",
      """ Implememtation using Angular.js""",
      this.prefix + """chess.html"""
    )
  )

  // @LINE:32
  private[this] lazy val controllers_Assets_at11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("chess_ng.js")))
  )
  private[this] lazy val controllers_Assets_at11_invoker = createInvoker(
    Assets_1.at(fakeValue[String], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "at",
      Seq(classOf[String], classOf[String]),
      "GET",
      """""",
      this.prefix + """chess_ng.js"""
    )
  )

  // @LINE:33
  private[this] lazy val controllers_Assets_at12_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("chess.css")))
  )
  private[this] lazy val controllers_Assets_at12_invoker = createInvoker(
    Assets_1.at(fakeValue[String], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "at",
      Seq(classOf[String], classOf[String]),
      "GET",
      """""",
      this.prefix + """chess.css"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:7
    case controllers_HomeController_login0_route(params) =>
      call { 
        controllers_HomeController_login0_invoker.call(HomeController_0.login)
      }
  
    // @LINE:9
    case controllers_CountController_count1_route(params) =>
      call { 
        controllers_CountController_count1_invoker.call(CountController_3.count)
      }
  
    // @LINE:11
    case controllers_AsyncController_message2_route(params) =>
      call { 
        controllers_AsyncController_message2_invoker.call(AsyncController_2.message)
      }
  
    // @LINE:14
    case controllers_Assets_versioned3_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned3_invoker.call(Assets_1.versioned(path, file))
      }
  
    // @LINE:17
    case controllers_HomeController_game4_route(params) =>
      call { 
        controllers_HomeController_game4_invoker.call(HomeController_0.game)
      }
  
    // @LINE:19
    case controllers_HomeController_tui5_route(params) =>
      call { 
        controllers_HomeController_tui5_invoker.call(HomeController_0.tui)
      }
  
    // @LINE:21
    case controllers_HomeController_home6_route(params) =>
      call { 
        controllers_HomeController_home6_invoker.call(HomeController_0.home)
      }
  
    // @LINE:23
    case controllers_HomeController_rules7_route(params) =>
      call { 
        controllers_HomeController_rules7_invoker.call(HomeController_0.rules)
      }
  
    // @LINE:25
    case controllers_Assets_at8_route(params) =>
      call(Param[String]("path", Right("/public/images")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at8_invoker.call(Assets_1.at(path, file))
      }
  
    // @LINE:27
    case controllers_HomeController_createWebSocket9_route(params) =>
      call { 
        controllers_HomeController_createWebSocket9_invoker.call(HomeController_0.createWebSocket)
      }
  
    // @LINE:31
    case controllers_Assets_at10_route(params) =>
      call(Param[String]("path", Right("/public/html")), Param[String]("file", Right("chess.html"))) { (path, file) =>
        controllers_Assets_at10_invoker.call(Assets_1.at(path, file))
      }
  
    // @LINE:32
    case controllers_Assets_at11_route(params) =>
      call(Param[String]("path", Right("/public/javascripts")), Param[String]("file", Right("chess_ng.js"))) { (path, file) =>
        controllers_Assets_at11_invoker.call(Assets_1.at(path, file))
      }
  
    // @LINE:33
    case controllers_Assets_at12_route(params) =>
      call(Param[String]("path", Right("/public/stylesheets")), Param[String]("file", Right("chess.css"))) { (path, file) =>
        controllers_Assets_at12_invoker.call(Assets_1.at(path, file))
      }
  }
}
