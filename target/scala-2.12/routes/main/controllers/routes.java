// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/Flash/Desktop/git/PizzaPapa/4-prototipus 2/pizza-papa/conf/routes
// @DATE:Thu Dec 06 19:23:19 CET 2018

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseCartController CartController = new controllers.ReverseCartController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseHomeController HomeController = new controllers.ReverseHomeController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseAssets Assets = new controllers.ReverseAssets(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseUserController UserController = new controllers.ReverseUserController(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseCartController CartController = new controllers.javascript.ReverseCartController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseHomeController HomeController = new controllers.javascript.ReverseHomeController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseAssets Assets = new controllers.javascript.ReverseAssets(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseUserController UserController = new controllers.javascript.ReverseUserController(RoutesPrefix.byNamePrefix());
  }

}
