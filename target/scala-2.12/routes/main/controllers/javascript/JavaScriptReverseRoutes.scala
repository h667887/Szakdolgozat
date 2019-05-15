// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/Flash/Documents/GitHub/Szakdolgozat/conf/routes
// @DATE:Wed May 15 13:56:36 CEST 2019

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers.javascript {

  // @LINE:37
  class ReverseCartController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:41
    def cart: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CartController.cart",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "cart"})
        }
      """
    )
  
    // @LINE:39
    def myOrders: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CartController.myOrders",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "my_orders"})
        }
      """
    )
  
    // @LINE:40
    def adminOrders: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CartController.adminOrders",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "admin_orders"})
        }
      """
    )
  
    // @LINE:43
    def deleteItem: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CartController.deleteItem",
      """
        function(productId0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "remove_cart" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[Int]].javascriptUnbind + """)("productId", productId0)])})
        }
      """
    )
  
    // @LINE:38
    def orders: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CartController.orders",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "orders"})
        }
      """
    )
  
    // @LINE:37
    def makeOrder: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CartController.makeOrder",
      """
        function() {
        
          if (true) {
            return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "orders/finalize"})
          }
        
        }
      """
    )
  
    // @LINE:45
    def checkout: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CartController.checkout",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "checkout"})
        }
      """
    )
  
    // @LINE:44
    def addToCart: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CartController.addToCart",
      """
        function(pizzaId0,cart1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "add_cart" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[Int]].javascriptUnbind + """)("pizzaId", pizzaId0), (""" + implicitly[play.api.mvc.QueryStringBindable[Boolean]].javascriptUnbind + """)("cart", cart1)])})
        }
      """
    )
  
  }

  // @LINE:21
  class ReverseHomeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:33
    def notAuthorized: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.notAuthorized",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "unauthorized"})
        }
      """
    )
  
    // @LINE:59
    def deleteIngredient: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.deleteIngredient",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "delete_ingredient"})
        }
      """
    )
  
    // @LINE:58
    def deleteExtra: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.deleteExtra",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "delete_extra"})
        }
      """
    )
  
    // @LINE:52
    def message: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.message",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "message"})
        }
      """
    )
  
    // @LINE:21
    def creator: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.creator",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "creator"})
        }
      """
    )
  
    // @LINE:48
    def drink: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.drink",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "drink"})
        }
      """
    )
  
    // @LINE:47
    def drinkByType: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.drinkByType",
      """
        function(drinkType0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "drink/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("drinkType", drinkType0))})
        }
      """
    )
  
    // @LINE:34
    def pizza: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.pizza",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "pizza"})
        }
      """
    )
  
    // @LINE:53
    def send: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.send",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "message"})
        }
      """
    )
  
    // @LINE:49
    def extra: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.extra",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "extra"})
        }
      """
    )
  
    // @LINE:55
    def newItem: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.newItem",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "additem"})
        }
      """
    )
  
    // @LINE:50
    def extraByType: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.extraByType",
      """
        function(extraType0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "extra/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("extraType", extraType0))})
        }
      """
    )
  
    // @LINE:56
    def deletePizza: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.deletePizza",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "delete_pizza"})
        }
      """
    )
  
    // @LINE:57
    def deleteDrink: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.deleteDrink",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "delete_drink"})
        }
      """
    )
  
    // @LINE:51
    def listIngredients: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.listIngredients",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "ingredients"})
        }
      """
    )
  
    // @LINE:22
    def info: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.info",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "info"})
        }
      """
    )
  
  }

  // @LINE:14
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:14
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[play.api.mvc.PathBindable[Asset]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }

  // @LINE:6
  class ReverseUserController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:17
    def askResetPasswordGet: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.askResetPasswordGet",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "register/reset_password"})
        }
      """
    )
  
    // @LINE:30
    def profileEdit: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.profileEdit",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "user/profile"})
        }
      """
    )
  
    // @LINE:31
    def admin: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.admin",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "admin"})
        }
      """
    )
  
    // @LINE:29
    def profile: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.profile",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "user/profile"})
        }
      """
    )
  
    // @LINE:15
    def resetPassword: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.resetPassword",
      """
        function(token0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "register/reset_password/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("token", token0))})
        }
      """
    )
  
    // @LINE:18
    def askResetPasswordPost: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.askResetPasswordPost",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "register/reset_password"})
        }
      """
    )
  
    // @LINE:10
    def logout: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.logout",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "logout"})
        }
      """
    )
  
    // @LINE:26
    def listUsers: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.listUsers",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "userek"})
        }
      """
    )
  
    // @LINE:24
    def register: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.register",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "register"})
        }
      """
    )
  
    // @LINE:25
    def save: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.save",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "register"})
        }
      """
    )
  
    // @LINE:16
    def resetPasswordPost: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.resetPasswordPost",
      """
        function(token0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "register/reset_password/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("token", token0))})
        }
      """
    )
  
    // @LINE:9
    def authenticate: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.authenticate",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
        }
      """
    )
  
    // @LINE:6
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.index",
      """
        function() {
        
          if (true) {
            return _wA({method:"GET", url:"""" + _prefix + """"})
          }
        
        }
      """
    )
  
    // @LINE:8
    def login: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.login",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
        }
      """
    )
  
  }


}
