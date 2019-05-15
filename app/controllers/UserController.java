package controllers;

import FormClasses.*;
import models.*;
import play.data.Form;
import play.data.FormFactory;
import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.Security;
import views.html.*;

import javax.inject.Inject;
import java.time.LocalDateTime;
import java.util.List;

import org.apache.commons.mail.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class UserController extends Controller {

    @Inject
    FormFactory formFactory;

    public Result index() {

        List<IngredientProduct> ingprod = IngredientProduct.find.all();

        for(IngredientProduct ing : ingprod) {
//            System.out.println(ing.IngredientId + " " + (int)ing.ProductId);
        }

        return ok(index.render(Secured.getUserInstance(ctx()), CartController.sumPrice()));

    }


    public static class Login {
        public String email;
        public String password;
    }

    public static class PwReset {
        public String email;
    }

    public static class NewPassword{
        public String newPW1;
        public String newPW2;
    }
    /**
     * Főoldal
     * Itt történik a bejelentkezés és regisztráció
     * @return
     */
    public Result login() {
        System.out.println("Most loginnolok");
        Form<Login> loginForm = formFactory.form(Login.class);
        System.out.println(session().get("email"));
        User user = Secured.getUserInstance(ctx());
//        Product ital1 = new Product(12121, null, "favágó", 900, "pizza", "kenyeres", 21, 0, false);
       // ital1.save();
//        Product ital2 = new Product(1352, null, "favágó", 1100, "pizza", "kenyeres", 32, 0, false);
       // ital2.save();
//        Product extra1 = new Product(1532, null, "favágó", 1600, "pizza", "kenyeres", 50, 0, false);
//        Product extra2 = new Product(134, "public/images/Products/Extras/szendvics.jpg", "Szendvics Papa", 600, "extra", null, 0, 0, false);
       // extra1.save();
//        extra2.update();

        return ok(login.render(loginForm, user, CartController.sumPrice()/*User.find.byId(request().username())*/));
    }

    /**
     * Kijelentkezést végző metódus
     */
    public Result logout() {
        session().clear();
        flash("success", "Kifele lettél jelentkezve");
        return redirect(routes.UserController.index());
    }


    /**
     * A bejelentkezéssel foglalkozó metódus
     *
     */
    public  Result authenticate() {
        Form<Login> loginForm = formFactory.form(Login.class).bindFromRequest();
        if (loginForm.hasErrors() || !validate(loginForm.get().email, loginForm.get().password)) {
            System.out.println("Sikertelen bejelentkezés"); //Z
            return badRequest(login.render(loginForm, null, CartController.sumPrice()));
        } else {
            session().clear();
            session("email", loginForm.get().email);
            flash("success", "Sikeresen bejelentkeztél!"); //Z
            return redirect(routes.UserController.index());
        }
    }

    /**
     *
     * @param email - email cím
     * @param password - jelszó
     * @return True - helyes email - jelszó páros
     */
    public boolean validate(String email, String password) {
        if (User.authenticate(email, password) == false) {
            return false;
        }
        return true;
    }

    /**
     * Regisztrációval foglalkozó metódus
     *
     */
    public Result register() {
        Form<User> userForm = formFactory.form(User.class);
        User user;
        //TODO itt a Usert úgy kérjük már le pls mint lejjebb is
        if(request().username() == null) {
            user = null;
        } else {
            user = User.find.byId(request().username());
        }
        return ok(register.render(user, userForm, CartController.sumPrice()));
    }


    /**
     * Ez a metódus kapja meg a regisztráláskor kitöltött formot
     * Itt viszi be az adatbázisba ha helyes
     */
    public Result save() {
        Form<User> userForm = formFactory.form(User.class).bindFromRequest();
//        User form_user = formFactory.form(User.class).bindFromRequest().get();
        System.out.println("Regisztrálok");
        if (userForm.hasErrors()){
            System.out.println(userForm.allErrors());
            return badRequest(register.render(Secured.getUserInstance(ctx()), userForm, CartController.sumPrice()));
        }
        User form_user = userForm.get();

	//Email regex:
	String emailAddress = form_user.email;
	String emailRegex = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$";
	Pattern emailPattern = Pattern.compile(emailRegex, Pattern.CASE_INSENSITIVE);
	Matcher matcher = emailPattern.matcher(emailAddress);
	boolean isEmailValid = matcher.find();
		
	if (!isEmailValid) {
		System.out.println("Ez nem egy email");
        	return badRequest(register.render(Secured.getUserInstance(ctx()), userForm, CartController.sumPrice()));		}
	else {
        	System.out.println("Ez egy email");
	}

        if (!User.validUser(form_user, this)){
            return badRequest(register.render(Secured.getUserInstance(ctx()), userForm, CartController.sumPrice()));
        }
        form_user.save();
        System.out.println(form_user.username);
        return redirect(routes.UserController.index());
    }

    /**
     * Ideiglenes oldal
     * Userek kilistázása
     */
    public Result listUsers() {
        User user = Secured.getUserInstance(ctx());
        
        return ok(userek.render(user, User.find.all(), CartController.sumPrice()));
    }

    /**
     * Elfelejtett jelszó után megadni az emailt
     */
    public Result askResetPasswordGet() {
        Form<PwReset> pwResetForm = formFactory.form(PwReset.class);
        User user = Secured.getUserInstance(ctx());
        
        return ok(ask_reset_password.render(user, pwResetForm, CartController.sumPrice()));
    }

    /**
     * Kitöltötte az elfelejtett jelszó formot a USEr az emailjével
     * Itt kémne küldeni egy emailt
     */
    public Result askResetPasswordPost() {
        Form<PwReset> pwResetForm = formFactory.form(PwReset.class).bindFromRequest();
//        User form_user = formFactory.form(User.class).bindFromRequest().get();
        if (pwResetForm.hasErrors()){
            System.out.println(pwResetForm.allErrors());
            return badRequest(ask_reset_password.render(Secured.getUserInstance(ctx()), pwResetForm, CartController.sumPrice()));
        }
        String email = pwResetForm.get().email;
        User form_user = User.findByEmail(email);
        //létezik a felhasználó akkor küldjük az emailt
        if (form_user != null){
            form_user.token = User.generateToken(form_user.username);
            form_user.validityDate = LocalDateTime.now().plusDays(1).toString();
            form_user.update();
            
            SimpleEmail emailo = new SimpleEmail();
            try {
            	emailo.setHostName("smtp.gmail.com");
            	emailo.setSmtpPort(587);
                emailo.setTLS(true);
                emailo.setAuthenticator(new DefaultAuthenticator("pizzapapa.hyenas@gmail.com", "Kecskesajt20"));
    	        emailo.setFrom("pizzapapa.hyenas@gmail.com", "Elfejeltett jelszó");
    	        emailo.addTo(form_user.email);
    	        emailo.setSubject("Elfelejtett jelszó");
    	        emailo.setMsg("Kattintoson az alábbi linkre elfelejtett jelszó esetén:" + routes.UserController.resetPassword(form_user.token).absoluteURL(request()));
    	        System.out.println("TRYING TO SEND DA EMAILO");
    	        emailo.send();
    	        System.out.println("Email elküldve");
            } catch(Exception e) {
                System.out.println("Error: " + e);
            }
            
        }
        /*flash("pw_reset", routes.UserController.resetPassword(form_user.token).absoluteURL(request()));
        System.out.println("Flasheltem egy pw_resetet");
        return redirect(routes.UserController.index());*/
		
		flash("pw_reset", routes.UserController.resetPassword(form_user.token).absoluteURL(request()));
        //flash("pw_reset", routes.UserController.resetPassword(form_user.token).absoluteURL(request()));
        System.out.println("Flasheltem egy pw_resetet");
        return redirect(routes.UserController.index());

		
    }

    /**
     * Itt történik az új jelszó megadása
     * @param token - ideiglenes létrehozott token a jelszó megújitásra
     */
    public Result resetPassword(String token){
        User user = User.findByToken(token);
        if (user != null && LocalDateTime.parse(user.validityDate).isAfter(LocalDateTime.now()) ){

            
            Form<NewPassword> newPasswordForm = formFactory.form(NewPassword.class);
            User logged_in = Secured.getUserInstance(ctx());

            return ok(do_reset_password.render(Secured.getUserInstance(ctx()), newPasswordForm, CartController.sumPrice()));
        }


        return ok(not_found_404.render());
    }

    /**
     * Beírta a felhasználó az új jelszó, megváltoztathatjuk itt
     * @param token - innen tudjuk kinek kell megváltoztatni
     */
    public Result resetPasswordPost(String token){
        User user = User.findByToken(token);
        if (user != null && LocalDateTime.parse(user.validityDate).isAfter(LocalDateTime.now()) ){
            
            Form<NewPassword> newPasswordForm = formFactory.form(NewPassword.class).bindFromRequest();

            if (newPasswordForm.hasErrors()){
                return badRequest(do_reset_password.render(Secured.getUserInstance(ctx()), newPasswordForm, CartController.sumPrice()));
            }
            if (!newPasswordForm.get().newPW1.equals(newPasswordForm.get().newPW2)){
                flash("danger", "Nem egyezik a két jelszó!");
                return badRequest(do_reset_password.render(Secured.getUserInstance(ctx()), newPasswordForm, CartController.sumPrice()));
            }
            user.setNewPassword(newPasswordForm.get().newPW1); //z TODO
            user.update();

            flash("success", "Sikeresen megváltoztattad a jelszavad!");
            return redirect(routes.UserController.index());
        }


        return ok(not_found_404.render());
    }

    /**
     * Felhasználó profiljának megjleneítése
     * Csak bejelentkezve érhető el
     */
    @Security.Authenticated(Secured.class)
    public Result profile() {
        User loggedInUser = Secured.getUserInstance(ctx());
        if (loggedInUser == null){
            flash("not_logged_in", "Kérlek jelentkezz be!");
            return redirect(routes.UserController.index());
        }
        List<CouponHelper> cpHelper = CouponUser.getCouponsByUser(loggedInUser);
        for(CouponHelper helper : cpHelper) {
            System.out.println(helper.userId + " " +helper.quantity);
        }


        Form<User> userForm = formFactory.form(User.class).fill(loggedInUser);
        return ok(profile.render(loggedInUser, userForm, cpHelper, CartController.sumPrice()));
    }

    /**
     * Ha a felhasználó megváltoztattot valamit ez a metódus kezeli le
     */
    public Result profileEdit() {

        Form<User> userForm = formFactory.form(User.class).bindFromRequest();

        if (userForm.hasErrors()){
            System.out.println(userForm.allErrors());
            return badRequest(profile.render(Secured.getUserInstance(ctx()), userForm, CouponUser.getCouponsByUser(Secured.getUserInstance(ctx())), CartController.sumPrice()));
        }
        
        User user = userForm.get();
        user.update();
        System.out.println("Profile edit successful");
        System.out.println(user.toString());
        return redirect(routes.UserController.profile());
        /*
         * @inputText(userForm("username"), '_label -> null, '_showConstraints -> false, 'hidden -> "hidden")
         * @inputPassword(userForm("password"), '_showConstraints -> false, '_label -> null, 'hidden -> "hidden")
         */
    }


    public Result admin() {
        User user = Secured.getUserInstance(ctx());
        if (!Secured.CheckByUser(user, "admin")){
            return redirect(/* Z ilyen nincs: routes.HomeController.notAuthorized()*/ routes.HomeController.notAuthorized());
        }

        Form<ProductDelete> pizzaDeleteForm = formFactory.form(ProductDelete.class);
        Form<ProductDelete> drinkDeleteForm = formFactory.form(ProductDelete.class);
        Form<ProductDelete> extraDeleteForm = formFactory.form(ProductDelete.class);
        Form<ProductDelete> ingredientDeleteForm = formFactory.form(ProductDelete.class);
        Form<FormIngredient> updateIngredientForm = formFactory.form(FormIngredient.class);
        List<String> pizzasNames = Product.getPizzaNames();
        List<String> extraNames = Product.getNameOfProducts(Product.getByType("extra"));

        List<String> drinkNames = Product.getNameOfProducts(Product.getByType("refreshing"));

        List<String> monsterNames = Product.getNameOfProducts(Product.getByType("monster"));
        List<String> beerNames = Product.getNameOfProducts(Product.getByType("beer"));
        drinkNames.addAll(monsterNames);
        drinkNames.addAll(beerNames);


        List<String> ingredientNames = Ingredient.getNames();

        Form<NewProduct> newProductForm = formFactory.form(NewProduct.class);

//        return ok(admin.render(user, pizzaDeleteForm, drinkDeleteForm, extraDeleteForm, ingredientDeleteForm, pizzas));
//        (pizzaDeleteForm : Form[ProductDelete])(drinkDeleteForm : Form[ProductDelete])(extraDeleteForm : Form[ProductDelete])(ingredientDeleteForm : Form[IngredientDelete])(pizzas: Seq[(Integer, String)])

        return ok(admin.render(user, Orders.find.all(), updateIngredientForm, newProductForm, pizzaDeleteForm, pizzasNames, drinkDeleteForm, drinkNames, extraDeleteForm, extraNames, ingredientDeleteForm, ingredientNames, CartController.sumPrice()));
    }

    public int rankCalc() { //TODO
        int rank = 0;

        return rank;
    }


}
