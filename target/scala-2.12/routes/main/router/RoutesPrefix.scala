// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/Flash/Documents/GitHub/Szakdolgozat/conf/routes
// @DATE:Wed May 15 13:56:36 CEST 2019


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
