// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/Flash/Desktop/git/PizzaPapa/4-prototipus 2/pizza-papa/conf/routes
// @DATE:Thu Dec 06 19:23:19 CET 2018


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