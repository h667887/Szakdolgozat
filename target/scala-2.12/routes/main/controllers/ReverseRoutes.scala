// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/Flash/Desktop/git/PizzaPapa/4-prototipus 2/pizza-papa/conf/routes
// @DATE:Thu Dec 06 19:23:19 CET 2018

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers {

  // @LINE:37
  class ReverseCartController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:41
    def cart(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "cart")
    }
  
    // @LINE:39
    def myOrders(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "my_orders")
    }
  
    // @LINE:40
    def adminOrders(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "admin_orders")
    }
  
    // @LINE:43
    def deleteItem(productId:Int): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "remove_cart" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("productId", productId)))))
    }
  
    // @LINE:38
    def orders(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "orders")
    }
  
    // @LINE:37
    def makeOrder(): Call = {
    
      () match {
      
        // @LINE:37
        case ()  =>
          
          Call("GET", _prefix + { _defaultPrefix } + "orders/finalize")
      
      }
    
    }
  
    // @LINE:45
    def checkout(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "checkout")
    }
  
    // @LINE:44
    def addToCart(pizzaId:Int, cart:Boolean): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "add_cart" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("pizzaId", pizzaId)), Some(implicitly[play.api.mvc.QueryStringBindable[Boolean]].unbind("cart", cart)))))
    }
  
  }

  // @LINE:21
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:33
    def notAuthorized(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "unauthorized")
    }
  
    // @LINE:59
    def deleteIngredient(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "delete_ingredient")
    }
  
    // @LINE:58
    def deleteExtra(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "delete_extra")
    }
  
    // @LINE:52
    def message(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "message")
    }
  
    // @LINE:21
    def creator(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "creator")
    }
  
    // @LINE:48
    def drink(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "drink")
    }
  
    // @LINE:47
    def drinkByType(drinkType:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "drink/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("drinkType", drinkType)))
    }
  
    // @LINE:34
    def pizza(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "pizza")
    }
  
    // @LINE:53
    def send(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "message")
    }
  
    // @LINE:49
    def extra(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "extra")
    }
  
    // @LINE:55
    def newItem(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "additem")
    }
  
    // @LINE:50
    def extraByType(extraType:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "extra/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("extraType", extraType)))
    }
  
    // @LINE:56
    def deletePizza(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "delete_pizza")
    }
  
    // @LINE:57
    def deleteDrink(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "delete_drink")
    }
  
    // @LINE:51
    def listIngredients(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "ingredients")
    }
  
    // @LINE:22
    def info(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "info")
    }
  
  }

  // @LINE:14
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:14
    def versioned(file:Asset): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }

  // @LINE:6
  class ReverseUserController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:17
    def askResetPasswordGet(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "register/reset_password")
    }
  
    // @LINE:30
    def profileEdit(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "user/profile")
    }
  
    // @LINE:31
    def admin(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "admin")
    }
  
    // @LINE:29
    def profile(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "user/profile")
    }
  
    // @LINE:15
    def resetPassword(token:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "register/reset_password/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("token", token)))
    }
  
    // @LINE:18
    def askResetPasswordPost(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "register/reset_password")
    }
  
    // @LINE:10
    def logout(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "logout")
    }
  
    // @LINE:26
    def listUsers(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "userek")
    }
  
    // @LINE:24
    def register(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "register")
    }
  
    // @LINE:25
    def save(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "register")
    }
  
    // @LINE:16
    def resetPasswordPost(token:String): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "register/reset_password/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("token", token)))
    }
  
    // @LINE:9
    def authenticate(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "login")
    }
  
    // @LINE:6
    def index(): Call = {
    
      () match {
      
        // @LINE:6
        case ()  =>
          
          Call("GET", _prefix)
      
      }
    
    }
  
    // @LINE:8
    def login(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "login")
    }
  
  }


}
