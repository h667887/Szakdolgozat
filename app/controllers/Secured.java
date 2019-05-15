package controllers;

import play.*;
import play.mvc.*;
import play.mvc.Http.*;

import models.*;

public class Secured extends Security.Authenticator {

    public static final String key = "MFwwDQYJKoZIhvcNAQEBBQADSwAwSAJBAI6ymgdbP7axQvWmN+WjGcITtcV9UWlDA6ylfSJXfI2bJROOoj+9uDQ7JwgJhc9rh6dh31bRvmv3hfTZp+Sag6sCAwEAAQ==";

    @Override
    public String getUsername(Context ctx) {
        return ctx.session().get("email");
    }

    @Override
    public Result onUnauthorized(Context ctx) {
        return redirect(routes.UserController.index());
    }

    public static String getUser(Context ctx) {
        return ctx.session().get("email");
    }

    public static boolean isLoggedIn(Context ctx) {
        return (getUser(ctx) != null);
    }

    public static User getUserInstance(Context ctx) {
        return (isLoggedIn(ctx) ? User.find.byId(ctx.session().get("email")) : null);
    }

    static boolean Check(String profile) {
        if("admin".equalsIgnoreCase(profile)){
            User user = getUserInstance(Context.current());
            return (user != null ? user.admin : false);
        }
        return false;
    }

    static boolean CheckByUser(User user,String profile) {
        if("admin".equalsIgnoreCase(profile)){
            return (user != null ? user.admin : false);
        }
        return false;
    }


}