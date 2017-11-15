
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wdd/webapps/playapps/Lab6v3/conf/routes
// @DATE:Wed Nov 15 22:37:44 GMT 2017


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
