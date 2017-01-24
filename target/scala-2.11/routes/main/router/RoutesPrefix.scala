
// @GENERATOR:play-routes-compiler
// @SOURCE:Z:/6. Semester/Web Tech/play-java/conf/routes
// @DATE:Tue Jan 24 17:34:33 CET 2017


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
