// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/Flash/Documents/GitHub/Szakdolgozat/conf/routes
// @DATE:Wed May 15 13:56:36 CEST 2019

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  UserController_1: controllers.UserController,
  // @LINE:14
  Assets_2: controllers.Assets,
  // @LINE:21
  HomeController_0: controllers.HomeController,
  // @LINE:37
  CartController_3: controllers.CartController,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    UserController_1: controllers.UserController,
    // @LINE:14
    Assets_2: controllers.Assets,
    // @LINE:21
    HomeController_0: controllers.HomeController,
    // @LINE:37
    CartController_3: controllers.CartController
  ) = this(errorHandler, UserController_1, Assets_2, HomeController_0, CartController_3, "/")

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, UserController_1, Assets_2, HomeController_0, CartController_3, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.UserController.index()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """index""", """controllers.UserController.index()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login""", """controllers.UserController.login()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login""", """controllers.UserController.authenticate()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """logout""", """controllers.UserController.logout()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """register/reset_password/""" + "$" + """token<[^/]+>""", """controllers.UserController.resetPassword(token:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """register/reset_password/""" + "$" + """token<[^/]+>""", """controllers.UserController.resetPasswordPost(token:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """register/reset_password""", """controllers.UserController.askResetPasswordGet()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """register/reset_password""", """controllers.UserController.askResetPasswordPost()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """creator""", """controllers.HomeController.creator()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """info""", """controllers.HomeController.info()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """register""", """controllers.UserController.register()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """register""", """controllers.UserController.save()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """userek""", """controllers.UserController.listUsers()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """user/profile""", """controllers.UserController.profile()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """user/profile""", """controllers.UserController.profileEdit()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admin""", """controllers.UserController.admin()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """unauthorized""", """controllers.HomeController.notAuthorized()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """pizza""", """controllers.HomeController.pizza()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """orders/finalize""", """controllers.CartController.makeOrder()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """orders""", """controllers.CartController.orders()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """my_orders""", """controllers.CartController.myOrders()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admin_orders""", """controllers.CartController.adminOrders()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """cart""", """controllers.CartController.cart()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """cart""", """controllers.CartController.makeOrder()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """remove_cart""", """controllers.CartController.deleteItem(productId:Int)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """add_cart""", """controllers.CartController.addToCart(pizzaId:Int, cart:Boolean)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """checkout""", """controllers.CartController.checkout()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """drink/""" + "$" + """drinkType<[^/]+>""", """controllers.HomeController.drinkByType(drinkType:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """drink""", """controllers.HomeController.drink()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """extra""", """controllers.HomeController.extra()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """extra/""" + "$" + """extraType<[^/]+>""", """controllers.HomeController.extraByType(extraType:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """ingredients""", """controllers.HomeController.listIngredients()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """message""", """controllers.HomeController.message()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """message""", """controllers.HomeController.send()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """additem""", """controllers.HomeController.newItem()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """delete_pizza""", """controllers.HomeController.deletePizza()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """delete_drink""", """controllers.HomeController.deleteDrink()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """delete_extra""", """controllers.HomeController.deleteExtra()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """delete_ingredient""", """controllers.HomeController.deleteIngredient()"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_UserController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_UserController_index0_invoker = createInvoker(
    UserController_1.index(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "index",
      Nil,
      "GET",
      this.prefix + """""",
      """ An example controller showing a sample home page""",
      Seq()
    )
  )

  // @LINE:7
  private[this] lazy val controllers_UserController_index1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("index")))
  )
  private[this] lazy val controllers_UserController_index1_invoker = createInvoker(
    UserController_1.index(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "index",
      Nil,
      "GET",
      this.prefix + """index""",
      """""",
      Seq()
    )
  )

  // @LINE:8
  private[this] lazy val controllers_UserController_login2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_UserController_login2_invoker = createInvoker(
    UserController_1.login(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "login",
      Nil,
      "GET",
      this.prefix + """login""",
      """""",
      Seq()
    )
  )

  // @LINE:9
  private[this] lazy val controllers_UserController_authenticate3_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_UserController_authenticate3_invoker = createInvoker(
    UserController_1.authenticate(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "authenticate",
      Nil,
      "POST",
      this.prefix + """login""",
      """""",
      Seq()
    )
  )

  // @LINE:10
  private[this] lazy val controllers_UserController_logout4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("logout")))
  )
  private[this] lazy val controllers_UserController_logout4_invoker = createInvoker(
    UserController_1.logout(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "logout",
      Nil,
      "GET",
      this.prefix + """logout""",
      """""",
      Seq()
    )
  )

  // @LINE:14
  private[this] lazy val controllers_Assets_versioned5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned5_invoker = createInvoker(
    Assets_2.versioned(fakeValue[String], fakeValue[Asset]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """ Map static resources from the /public folder to the /assets URL path""",
      Seq()
    )
  )

  // @LINE:15
  private[this] lazy val controllers_UserController_resetPassword6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("register/reset_password/"), DynamicPart("token", """[^/]+""",true)))
  )
  private[this] lazy val controllers_UserController_resetPassword6_invoker = createInvoker(
    UserController_1.resetPassword(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "resetPassword",
      Seq(classOf[String]),
      "GET",
      this.prefix + """register/reset_password/""" + "$" + """token<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:16
  private[this] lazy val controllers_UserController_resetPasswordPost7_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("register/reset_password/"), DynamicPart("token", """[^/]+""",true)))
  )
  private[this] lazy val controllers_UserController_resetPasswordPost7_invoker = createInvoker(
    UserController_1.resetPasswordPost(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "resetPasswordPost",
      Seq(classOf[String]),
      "POST",
      this.prefix + """register/reset_password/""" + "$" + """token<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:17
  private[this] lazy val controllers_UserController_askResetPasswordGet8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("register/reset_password")))
  )
  private[this] lazy val controllers_UserController_askResetPasswordGet8_invoker = createInvoker(
    UserController_1.askResetPasswordGet(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "askResetPasswordGet",
      Nil,
      "GET",
      this.prefix + """register/reset_password""",
      """""",
      Seq()
    )
  )

  // @LINE:18
  private[this] lazy val controllers_UserController_askResetPasswordPost9_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("register/reset_password")))
  )
  private[this] lazy val controllers_UserController_askResetPasswordPost9_invoker = createInvoker(
    UserController_1.askResetPasswordPost(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "askResetPasswordPost",
      Nil,
      "POST",
      this.prefix + """register/reset_password""",
      """""",
      Seq()
    )
  )

  // @LINE:21
  private[this] lazy val controllers_HomeController_creator10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("creator")))
  )
  private[this] lazy val controllers_HomeController_creator10_invoker = createInvoker(
    HomeController_0.creator(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "creator",
      Nil,
      "GET",
      this.prefix + """creator""",
      """""",
      Seq()
    )
  )

  // @LINE:22
  private[this] lazy val controllers_HomeController_info11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("info")))
  )
  private[this] lazy val controllers_HomeController_info11_invoker = createInvoker(
    HomeController_0.info(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "info",
      Nil,
      "GET",
      this.prefix + """info""",
      """""",
      Seq()
    )
  )

  // @LINE:24
  private[this] lazy val controllers_UserController_register12_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("register")))
  )
  private[this] lazy val controllers_UserController_register12_invoker = createInvoker(
    UserController_1.register(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "register",
      Nil,
      "GET",
      this.prefix + """register""",
      """""",
      Seq()
    )
  )

  // @LINE:25
  private[this] lazy val controllers_UserController_save13_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("register")))
  )
  private[this] lazy val controllers_UserController_save13_invoker = createInvoker(
    UserController_1.save(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "save",
      Nil,
      "POST",
      this.prefix + """register""",
      """""",
      Seq()
    )
  )

  // @LINE:26
  private[this] lazy val controllers_UserController_listUsers14_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("userek")))
  )
  private[this] lazy val controllers_UserController_listUsers14_invoker = createInvoker(
    UserController_1.listUsers(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "listUsers",
      Nil,
      "GET",
      this.prefix + """userek""",
      """""",
      Seq()
    )
  )

  // @LINE:29
  private[this] lazy val controllers_UserController_profile15_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("user/profile")))
  )
  private[this] lazy val controllers_UserController_profile15_invoker = createInvoker(
    UserController_1.profile(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "profile",
      Nil,
      "GET",
      this.prefix + """user/profile""",
      """""",
      Seq()
    )
  )

  // @LINE:30
  private[this] lazy val controllers_UserController_profileEdit16_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("user/profile")))
  )
  private[this] lazy val controllers_UserController_profileEdit16_invoker = createInvoker(
    UserController_1.profileEdit(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "profileEdit",
      Nil,
      "POST",
      this.prefix + """user/profile""",
      """""",
      Seq()
    )
  )

  // @LINE:31
  private[this] lazy val controllers_UserController_admin17_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin")))
  )
  private[this] lazy val controllers_UserController_admin17_invoker = createInvoker(
    UserController_1.admin(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "admin",
      Nil,
      "GET",
      this.prefix + """admin""",
      """""",
      Seq()
    )
  )

  // @LINE:33
  private[this] lazy val controllers_HomeController_notAuthorized18_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("unauthorized")))
  )
  private[this] lazy val controllers_HomeController_notAuthorized18_invoker = createInvoker(
    HomeController_0.notAuthorized(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "notAuthorized",
      Nil,
      "GET",
      this.prefix + """unauthorized""",
      """""",
      Seq()
    )
  )

  // @LINE:34
  private[this] lazy val controllers_HomeController_pizza19_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("pizza")))
  )
  private[this] lazy val controllers_HomeController_pizza19_invoker = createInvoker(
    HomeController_0.pizza(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "pizza",
      Nil,
      "GET",
      this.prefix + """pizza""",
      """""",
      Seq()
    )
  )

  // @LINE:37
  private[this] lazy val controllers_CartController_makeOrder20_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("orders/finalize")))
  )
  private[this] lazy val controllers_CartController_makeOrder20_invoker = createInvoker(
    CartController_3.makeOrder(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CartController",
      "makeOrder",
      Nil,
      "GET",
      this.prefix + """orders/finalize""",
      """""",
      Seq()
    )
  )

  // @LINE:38
  private[this] lazy val controllers_CartController_orders21_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("orders")))
  )
  private[this] lazy val controllers_CartController_orders21_invoker = createInvoker(
    CartController_3.orders(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CartController",
      "orders",
      Nil,
      "GET",
      this.prefix + """orders""",
      """""",
      Seq()
    )
  )

  // @LINE:39
  private[this] lazy val controllers_CartController_myOrders22_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("my_orders")))
  )
  private[this] lazy val controllers_CartController_myOrders22_invoker = createInvoker(
    CartController_3.myOrders(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CartController",
      "myOrders",
      Nil,
      "GET",
      this.prefix + """my_orders""",
      """""",
      Seq()
    )
  )

  // @LINE:40
  private[this] lazy val controllers_CartController_adminOrders23_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin_orders")))
  )
  private[this] lazy val controllers_CartController_adminOrders23_invoker = createInvoker(
    CartController_3.adminOrders(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CartController",
      "adminOrders",
      Nil,
      "GET",
      this.prefix + """admin_orders""",
      """""",
      Seq()
    )
  )

  // @LINE:41
  private[this] lazy val controllers_CartController_cart24_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("cart")))
  )
  private[this] lazy val controllers_CartController_cart24_invoker = createInvoker(
    CartController_3.cart(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CartController",
      "cart",
      Nil,
      "GET",
      this.prefix + """cart""",
      """""",
      Seq()
    )
  )

  // @LINE:42
  private[this] lazy val controllers_CartController_makeOrder25_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("cart")))
  )
  private[this] lazy val controllers_CartController_makeOrder25_invoker = createInvoker(
    CartController_3.makeOrder(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CartController",
      "makeOrder",
      Nil,
      "POST",
      this.prefix + """cart""",
      """""",
      Seq()
    )
  )

  // @LINE:43
  private[this] lazy val controllers_CartController_deleteItem26_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("remove_cart")))
  )
  private[this] lazy val controllers_CartController_deleteItem26_invoker = createInvoker(
    CartController_3.deleteItem(fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CartController",
      "deleteItem",
      Seq(classOf[Int]),
      "GET",
      this.prefix + """remove_cart""",
      """""",
      Seq()
    )
  )

  // @LINE:44
  private[this] lazy val controllers_CartController_addToCart27_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("add_cart")))
  )
  private[this] lazy val controllers_CartController_addToCart27_invoker = createInvoker(
    CartController_3.addToCart(fakeValue[Int], fakeValue[Boolean]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CartController",
      "addToCart",
      Seq(classOf[Int], classOf[Boolean]),
      "GET",
      this.prefix + """add_cart""",
      """""",
      Seq()
    )
  )

  // @LINE:45
  private[this] lazy val controllers_CartController_checkout28_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("checkout")))
  )
  private[this] lazy val controllers_CartController_checkout28_invoker = createInvoker(
    CartController_3.checkout(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CartController",
      "checkout",
      Nil,
      "GET",
      this.prefix + """checkout""",
      """""",
      Seq()
    )
  )

  // @LINE:47
  private[this] lazy val controllers_HomeController_drinkByType29_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("drink/"), DynamicPart("drinkType", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_drinkByType29_invoker = createInvoker(
    HomeController_0.drinkByType(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "drinkByType",
      Seq(classOf[String]),
      "GET",
      this.prefix + """drink/""" + "$" + """drinkType<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:48
  private[this] lazy val controllers_HomeController_drink30_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("drink")))
  )
  private[this] lazy val controllers_HomeController_drink30_invoker = createInvoker(
    HomeController_0.drink(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "drink",
      Nil,
      "GET",
      this.prefix + """drink""",
      """""",
      Seq()
    )
  )

  // @LINE:49
  private[this] lazy val controllers_HomeController_extra31_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("extra")))
  )
  private[this] lazy val controllers_HomeController_extra31_invoker = createInvoker(
    HomeController_0.extra(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "extra",
      Nil,
      "GET",
      this.prefix + """extra""",
      """""",
      Seq()
    )
  )

  // @LINE:50
  private[this] lazy val controllers_HomeController_extraByType32_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("extra/"), DynamicPart("extraType", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_extraByType32_invoker = createInvoker(
    HomeController_0.extraByType(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "extraByType",
      Seq(classOf[String]),
      "GET",
      this.prefix + """extra/""" + "$" + """extraType<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:51
  private[this] lazy val controllers_HomeController_listIngredients33_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("ingredients")))
  )
  private[this] lazy val controllers_HomeController_listIngredients33_invoker = createInvoker(
    HomeController_0.listIngredients(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "listIngredients",
      Nil,
      "GET",
      this.prefix + """ingredients""",
      """""",
      Seq()
    )
  )

  // @LINE:52
  private[this] lazy val controllers_HomeController_message34_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("message")))
  )
  private[this] lazy val controllers_HomeController_message34_invoker = createInvoker(
    HomeController_0.message(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "message",
      Nil,
      "GET",
      this.prefix + """message""",
      """""",
      Seq()
    )
  )

  // @LINE:53
  private[this] lazy val controllers_HomeController_send35_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("message")))
  )
  private[this] lazy val controllers_HomeController_send35_invoker = createInvoker(
    HomeController_0.send(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "send",
      Nil,
      "POST",
      this.prefix + """message""",
      """""",
      Seq()
    )
  )

  // @LINE:55
  private[this] lazy val controllers_HomeController_newItem36_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("additem")))
  )
  private[this] lazy val controllers_HomeController_newItem36_invoker = createInvoker(
    HomeController_0.newItem(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "newItem",
      Nil,
      "POST",
      this.prefix + """additem""",
      """""",
      Seq()
    )
  )

  // @LINE:56
  private[this] lazy val controllers_HomeController_deletePizza37_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("delete_pizza")))
  )
  private[this] lazy val controllers_HomeController_deletePizza37_invoker = createInvoker(
    HomeController_0.deletePizza(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "deletePizza",
      Nil,
      "POST",
      this.prefix + """delete_pizza""",
      """""",
      Seq()
    )
  )

  // @LINE:57
  private[this] lazy val controllers_HomeController_deleteDrink38_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("delete_drink")))
  )
  private[this] lazy val controllers_HomeController_deleteDrink38_invoker = createInvoker(
    HomeController_0.deleteDrink(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "deleteDrink",
      Nil,
      "POST",
      this.prefix + """delete_drink""",
      """""",
      Seq()
    )
  )

  // @LINE:58
  private[this] lazy val controllers_HomeController_deleteExtra39_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("delete_extra")))
  )
  private[this] lazy val controllers_HomeController_deleteExtra39_invoker = createInvoker(
    HomeController_0.deleteExtra(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "deleteExtra",
      Nil,
      "POST",
      this.prefix + """delete_extra""",
      """""",
      Seq()
    )
  )

  // @LINE:59
  private[this] lazy val controllers_HomeController_deleteIngredient40_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("delete_ingredient")))
  )
  private[this] lazy val controllers_HomeController_deleteIngredient40_invoker = createInvoker(
    HomeController_0.deleteIngredient(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "deleteIngredient",
      Nil,
      "POST",
      this.prefix + """delete_ingredient""",
      """""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_UserController_index0_route(params@_) =>
      call { 
        controllers_UserController_index0_invoker.call(UserController_1.index())
      }
  
    // @LINE:7
    case controllers_UserController_index1_route(params@_) =>
      call { 
        controllers_UserController_index1_invoker.call(UserController_1.index())
      }
  
    // @LINE:8
    case controllers_UserController_login2_route(params@_) =>
      call { 
        controllers_UserController_login2_invoker.call(UserController_1.login())
      }
  
    // @LINE:9
    case controllers_UserController_authenticate3_route(params@_) =>
      call { 
        controllers_UserController_authenticate3_invoker.call(UserController_1.authenticate())
      }
  
    // @LINE:10
    case controllers_UserController_logout4_route(params@_) =>
      call { 
        controllers_UserController_logout4_invoker.call(UserController_1.logout())
      }
  
    // @LINE:14
    case controllers_Assets_versioned5_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned5_invoker.call(Assets_2.versioned(path, file))
      }
  
    // @LINE:15
    case controllers_UserController_resetPassword6_route(params@_) =>
      call(params.fromPath[String]("token", None)) { (token) =>
        controllers_UserController_resetPassword6_invoker.call(UserController_1.resetPassword(token))
      }
  
    // @LINE:16
    case controllers_UserController_resetPasswordPost7_route(params@_) =>
      call(params.fromPath[String]("token", None)) { (token) =>
        controllers_UserController_resetPasswordPost7_invoker.call(UserController_1.resetPasswordPost(token))
      }
  
    // @LINE:17
    case controllers_UserController_askResetPasswordGet8_route(params@_) =>
      call { 
        controllers_UserController_askResetPasswordGet8_invoker.call(UserController_1.askResetPasswordGet())
      }
  
    // @LINE:18
    case controllers_UserController_askResetPasswordPost9_route(params@_) =>
      call { 
        controllers_UserController_askResetPasswordPost9_invoker.call(UserController_1.askResetPasswordPost())
      }
  
    // @LINE:21
    case controllers_HomeController_creator10_route(params@_) =>
      call { 
        controllers_HomeController_creator10_invoker.call(HomeController_0.creator())
      }
  
    // @LINE:22
    case controllers_HomeController_info11_route(params@_) =>
      call { 
        controllers_HomeController_info11_invoker.call(HomeController_0.info())
      }
  
    // @LINE:24
    case controllers_UserController_register12_route(params@_) =>
      call { 
        controllers_UserController_register12_invoker.call(UserController_1.register())
      }
  
    // @LINE:25
    case controllers_UserController_save13_route(params@_) =>
      call { 
        controllers_UserController_save13_invoker.call(UserController_1.save())
      }
  
    // @LINE:26
    case controllers_UserController_listUsers14_route(params@_) =>
      call { 
        controllers_UserController_listUsers14_invoker.call(UserController_1.listUsers())
      }
  
    // @LINE:29
    case controllers_UserController_profile15_route(params@_) =>
      call { 
        controllers_UserController_profile15_invoker.call(UserController_1.profile())
      }
  
    // @LINE:30
    case controllers_UserController_profileEdit16_route(params@_) =>
      call { 
        controllers_UserController_profileEdit16_invoker.call(UserController_1.profileEdit())
      }
  
    // @LINE:31
    case controllers_UserController_admin17_route(params@_) =>
      call { 
        controllers_UserController_admin17_invoker.call(UserController_1.admin())
      }
  
    // @LINE:33
    case controllers_HomeController_notAuthorized18_route(params@_) =>
      call { 
        controllers_HomeController_notAuthorized18_invoker.call(HomeController_0.notAuthorized())
      }
  
    // @LINE:34
    case controllers_HomeController_pizza19_route(params@_) =>
      call { 
        controllers_HomeController_pizza19_invoker.call(HomeController_0.pizza())
      }
  
    // @LINE:37
    case controllers_CartController_makeOrder20_route(params@_) =>
      call { 
        controllers_CartController_makeOrder20_invoker.call(CartController_3.makeOrder())
      }
  
    // @LINE:38
    case controllers_CartController_orders21_route(params@_) =>
      call { 
        controllers_CartController_orders21_invoker.call(CartController_3.orders())
      }
  
    // @LINE:39
    case controllers_CartController_myOrders22_route(params@_) =>
      call { 
        controllers_CartController_myOrders22_invoker.call(CartController_3.myOrders())
      }
  
    // @LINE:40
    case controllers_CartController_adminOrders23_route(params@_) =>
      call { 
        controllers_CartController_adminOrders23_invoker.call(CartController_3.adminOrders())
      }
  
    // @LINE:41
    case controllers_CartController_cart24_route(params@_) =>
      call { 
        controllers_CartController_cart24_invoker.call(CartController_3.cart())
      }
  
    // @LINE:42
    case controllers_CartController_makeOrder25_route(params@_) =>
      call { 
        controllers_CartController_makeOrder25_invoker.call(CartController_3.makeOrder())
      }
  
    // @LINE:43
    case controllers_CartController_deleteItem26_route(params@_) =>
      call(params.fromQuery[Int]("productId", None)) { (productId) =>
        controllers_CartController_deleteItem26_invoker.call(CartController_3.deleteItem(productId))
      }
  
    // @LINE:44
    case controllers_CartController_addToCart27_route(params@_) =>
      call(params.fromQuery[Int]("pizzaId", None), params.fromQuery[Boolean]("cart", None)) { (pizzaId, cart) =>
        controllers_CartController_addToCart27_invoker.call(CartController_3.addToCart(pizzaId, cart))
      }
  
    // @LINE:45
    case controllers_CartController_checkout28_route(params@_) =>
      call { 
        controllers_CartController_checkout28_invoker.call(CartController_3.checkout())
      }
  
    // @LINE:47
    case controllers_HomeController_drinkByType29_route(params@_) =>
      call(params.fromPath[String]("drinkType", None)) { (drinkType) =>
        controllers_HomeController_drinkByType29_invoker.call(HomeController_0.drinkByType(drinkType))
      }
  
    // @LINE:48
    case controllers_HomeController_drink30_route(params@_) =>
      call { 
        controllers_HomeController_drink30_invoker.call(HomeController_0.drink())
      }
  
    // @LINE:49
    case controllers_HomeController_extra31_route(params@_) =>
      call { 
        controllers_HomeController_extra31_invoker.call(HomeController_0.extra())
      }
  
    // @LINE:50
    case controllers_HomeController_extraByType32_route(params@_) =>
      call(params.fromPath[String]("extraType", None)) { (extraType) =>
        controllers_HomeController_extraByType32_invoker.call(HomeController_0.extraByType(extraType))
      }
  
    // @LINE:51
    case controllers_HomeController_listIngredients33_route(params@_) =>
      call { 
        controllers_HomeController_listIngredients33_invoker.call(HomeController_0.listIngredients())
      }
  
    // @LINE:52
    case controllers_HomeController_message34_route(params@_) =>
      call { 
        controllers_HomeController_message34_invoker.call(HomeController_0.message())
      }
  
    // @LINE:53
    case controllers_HomeController_send35_route(params@_) =>
      call { 
        controllers_HomeController_send35_invoker.call(HomeController_0.send())
      }
  
    // @LINE:55
    case controllers_HomeController_newItem36_route(params@_) =>
      call { 
        controllers_HomeController_newItem36_invoker.call(HomeController_0.newItem())
      }
  
    // @LINE:56
    case controllers_HomeController_deletePizza37_route(params@_) =>
      call { 
        controllers_HomeController_deletePizza37_invoker.call(HomeController_0.deletePizza())
      }
  
    // @LINE:57
    case controllers_HomeController_deleteDrink38_route(params@_) =>
      call { 
        controllers_HomeController_deleteDrink38_invoker.call(HomeController_0.deleteDrink())
      }
  
    // @LINE:58
    case controllers_HomeController_deleteExtra39_route(params@_) =>
      call { 
        controllers_HomeController_deleteExtra39_invoker.call(HomeController_0.deleteExtra())
      }
  
    // @LINE:59
    case controllers_HomeController_deleteIngredient40_route(params@_) =>
      call { 
        controllers_HomeController_deleteIngredient40_invoker.call(HomeController_0.deleteIngredient())
      }
  }
}
