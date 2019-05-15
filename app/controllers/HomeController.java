package controllers;

import FormClasses.FormIngredient;
import FormClasses.NewProduct;
import FormClasses.ProductDelete;
import FormClasses.MailMessage;
import akka.stream.actor.ActorPublisherMessage;
import models.Ingredient;
import models.IngredientProduct;
import models.Product;
import models.User;
import org.apache.commons.io.FileUtils;
import play.api.Mode;
import play.data.Form;
import play.data.FormFactory;
import play.data.validation.ValidationError;
import play.mvc.*;
import views.html.pizza;
import views.html.drink;
import views.html.extra;
import views.html.ingredient;
import views.html.creator;
import views.html.info;
import views.html.message;
import org.apache.commons.mail.*;

import javax.inject.Inject;
import java.io.File;
import java.io.IOException;
import java.util.*;


/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */

public class HomeController extends Controller {

    @Inject
    FormFactory formFactory;



    public static class PizzaGroup{
        public String name;
        public String imagePath;
        public String notAvailImagePath;
        public String ingredients;
        public float price1;
        public int id1;
        public float price2;
        public int id2;
        public float price3;
        public int id3;
    }





    public Result pizza() {
        List<Product> allPizzas = Product.getPizzas();
        HashMap<Integer,List<Ingredient>> ingredientsOfPizzas = getIngredientsOfPizzas(allPizzas);

        List<PizzaGroup> groups = groupsOfThree(allPizzas);

        List<Ingredient> alling = Ingredient.find.all();
        for(Ingredient ing : alling) {
            System.out.println(ing.name + " " + ing.quantity);
        }

        HashSet<String> creatablePizzas = creatablePizzas();
        for(String pizza : creatablePizzas) {
        }


        return ok(pizza.render(Secured.getUserInstance(ctx()), groups, creatablePizzas, ingredientsOfPizzas, CartController.sumPrice()));
    }

    public HashSet<String> creatablePizzas() {
        HashSet<String> creatable = new HashSet<>();
        List<Product> allPizzas = Product.getPizzas();
        for(Product pizza : allPizzas) {
            if(isCreatable(pizza)) {
                creatable.add(pizza.name);
            }
        }
        return creatable;
    }

    public boolean isCreatable(Product pizza) {
        List<IngredientProduct> ingProds = IngredientProduct.find.query().where().eq("ProductId", pizza.id).findList();

        for(IngredientProduct ingProd : ingProds) {
            Ingredient ing = Ingredient.find.query().where().eq("id", ingProd.IngredientId).findOne();
            if(ing.quantity < 1) {
                return false;
            }
        }
        return true;
    }

    public Result drink() {
        return redirect(routes.HomeController.drinkByType("refreshing"));
    }


    public Result drinkByType(String type) {
        List<Product> drinks = Product.find.query().where().eq("typeP", type).findList();

        return ok(drink.render(Secured.getUserInstance(ctx()), drinks, CartController.sumPrice()));
    }

    public Result extra() {
        return redirect(routes.HomeController.extraByType("streetfood"));
    }

    public Result extraByType(String type) {
        List<Product> extras = Product.find.query().where().eq("typeP", type).findList();

        return ok(extra.render(Secured.getUserInstance(ctx()), extras, CartController.sumPrice()));
    }



    public Result creator(){
        List<Integer> sizes = new LinkedList<>();
        sizes.addAll(Arrays.asList(24, 32, 51));
        List<Ingredient> allIngredients = Ingredient.find.all();

        return ok(creator.render(Secured.getUserInstance(ctx()), sizes, allIngredients, CartController.sumPrice()));
    }

    public Result info() {
        return ok(info.render(Secured.getUserInstance(ctx()), CartController.sumPrice()));
    }

    static HashMap<Integer, List<Ingredient>> getIngredientsOfPizzas(List<Product> pizzas) {
        HashMap<Integer, List<Ingredient>> ingredientsOfPizzas = new HashMap<>();
        for(Product pizza : pizzas) {
            List<IngredientProduct> ingredientsPizza = IngredientProduct.find.query().where().eq("ProductId", pizza.id).findList();
            List<Ingredient> ingredientsOfPizza  = new ArrayList<>();
            for(IngredientProduct ingredient: ingredientsPizza) {
                ingredientsOfPizza.add(Ingredient.find.byId(Integer.toString(ingredient.IngredientId)));
            }
            ingredientsOfPizzas.put(pizza.id, ingredientsOfPizza);
        }
        return ingredientsOfPizzas;
    }


    public Result message() {
        Form<MailMessage> messageForm;
        MailMessage newMessage = new MailMessage();
        if(Secured.getUserInstance(ctx()) != null) {
            newMessage.name = Secured.getUserInstance(ctx()).username;
            newMessage.email = Secured.getUserInstance(ctx()).email;
        }
        messageForm = formFactory.form(MailMessage.class).fill(newMessage);
        return ok(message.render(Secured.getUserInstance(ctx()), messageForm, CartController.sumPrice()));
    }

    public Result send() {
        System.out.println("Megjöttem az email küldsébe");
        Form<MailMessage> messageForm = formFactory.form(MailMessage.class).bindFromRequest();

        if(messageForm.hasErrors()) {

            for (ValidationError error: messageForm.allErrors()){
                System.out.println("Error: ");
                System.out.println(error);
            }

        }
        MailMessage message = messageForm.get();

        if(message.message.equals("") || message.name.equals("") || message.email.equals("")) {
            flash("warning", "Minden mező kitöltése kötelező!");
            return redirect(routes.HomeController.message());
        }

        System.out.println(message.toString());

        SimpleEmail email = new SimpleEmail();
        try {
            email.setHostName("smtp.gmail.com");
            email.setSmtpPort(587);
            email.setTLS(true);
            email.setAuthenticator(new DefaultAuthenticator("pizzapapa.hyenas@gmail.com", "Kecskesajt20"));
            email.setFrom("pizzapapa.hyenas@gmail.com", message.name);
            email.addTo("pizzapapa.hyenas@gmail.com");
            email.setSubject("Felhasználói üzenet");
            email.setMsg("Feladó neve: " + message.name + "\n" + "Feladó e-mail címe: " + message.email + "\n\n" + message.message);
            email.send();
            System.out.println(message.toString());
            System.out.println("Itt már elküldtem elvileg");
        } catch(Exception e) {
            System.out.println("Error: " + e);
        }
        return redirect(routes.UserController.index());
    }

    public Result listIngredients(){
        List<Ingredient> allIngredient = Ingredient.find.all();
        return ok(ingredient.render(Secured.getUserInstance(ctx()), allIngredient, CartController.sumPrice()));
    }

    @Security.Authenticated(Secured.class)
    public  Result newItem() {
        Form formIngForm = formFactory.form(FormIngredient.class).bindFromRequest();
        FormIngredient formIng = (FormIngredient)formIngForm.get();
        if(!formIng.quantity.equals("")) {
            return addIngredient(formIng);
        } else {


            User user = Secured.getUserInstance(ctx());
            if (!Secured.CheckByUser(user, "admin")) {
                return redirect(routes.HomeController.notAuthorized());
            }

            Form<NewProduct> newProductForm = formFactory.form(NewProduct.class).bindFromRequest();
            Http.MultipartFormData<File> body = request().body().asMultipartFormData();
            Http.MultipartFormData.FilePart<File> picture = body.getFile("imagepath");

            if (newProductForm.hasErrors()) {
                System.out.println(newProductForm.allErrors());
                for (ValidationError error : newProductForm.allErrors()) {
                    System.out.println(error.key());
                    System.out.println(error.message());
                }
                return redirect(routes.UserController.admin());
            }

            NewProduct newProduct = newProductForm.get();

            if (!isValidNewItem(newProduct)) {
                flash("warning", "Hibásan töltötte ki az űrlapot!");
                redirect(routes.UserController.admin());
            }

            File file = picture.getFile();
            File destination;
            String fileName = picture.getFilename();
            String imagePath;

            if (newProduct.typeP.equals("pizza")) {
                imagePath = "images/Item/Pizza/";
            } else if (newProduct.typeP.equals("drink")) {
                imagePath = "images/Item/Drink/";
            } else if (newProduct.typeP.equals("ingredient")) {
                imagePath = "images/Item/Creator/";
            } else {
                imagePath = "images/Item/Extra/";
            }

            destination = new File("public/" + imagePath, fileName);
            newProduct.imagepath = imagePath + fileName;

            try {
                FileUtils.moveFile(file, destination);
            } catch (IOException e) {
                System.out.println("Error: " + e);
                flash("noimage", "Sikertelen képfeltöltés.");
            }

            if (newProduct.typeP.equals("ingredient")) {
                Ingredient ingredient = new Ingredient(newProduct);
                ingredient.save();
            } else {
                List<Product> generated = Product.generateFromNewProduct(newProduct);
                for (Product product : generated) {
                    product.save();
                }
            }
            flash("success", "Sikeresen felvetted a tételeket!");
        }
        return redirect(routes.UserController.admin());
    }

    public void deleteProductImage(Product product) {
        File file = new File("public/" + product.imagePath);
        file.delete();
    }

    public void deleteIngredientImage(Ingredient ingredient) {
        File file = new File("public/" + ingredient.imagePath);
        file.delete();
    }

    @Security.Authenticated(Secured.class)
    public Result addIngredient(FormIngredient formIng) {
        String ingName = formIng.ingName;
        int quantity = Integer.parseInt(formIng.quantity);
        Ingredient ing = Ingredient.find.query().where().eq("name", ingName).findOne();
        System.out.println(ingName + " " + " sadasdsadasdsada");

        ing.quantity += quantity;
        ing.update();


        flash("success", "Sikeresen feltöltöttél " + quantity + " darab " + ingName + "-t!");
        return redirect(routes.UserController.admin());
    }

    @Security.Authenticated(Secured.class)
    public Result deletePizza() {
        User user = Secured.getUserInstance(ctx());
        if (!Secured.CheckByUser(user, "admin")){
            return redirect(routes.HomeController.notAuthorized());
        }

        int counter = 0;
        Form<ProductDelete> pizzaDeleteForm = formFactory.form(ProductDelete.class).bindFromRequest();
        for (Product product: Product.getByNameWithType(pizzaDeleteForm.get().name, "pizza")){
            //deleteProductImage(product)
            product.delete();
            counter += 1;
        }
        flash("success", "Sikeresen töröltél " + Integer.toString(counter) + " pizzát!");
        return redirect(routes.UserController.admin());
    }



    @Security.Authenticated(Secured.class)
    public Result deleteDrink() {
        User user = Secured.getUserInstance(ctx());
        if (!Secured.CheckByUser(user, "admin")){
            return redirect(routes.HomeController.notAuthorized());
        }

        int counter = 0;
        Form<ProductDelete> drinkDeleteForm = formFactory.form(ProductDelete.class).bindFromRequest();
        for (Product product: Product.getByNameWithType(drinkDeleteForm.get().name, "drink")){
            deleteProductImage(product);
            product.delete();
            counter += 1;
        }
        flash("success", "Sikeresen töröltél " + Integer.toString(counter) + " üdítőt!");
        return redirect(routes.UserController.admin());
    }


    @Security.Authenticated(Secured.class)
    public Result deleteExtra() {
        User user = Secured.getUserInstance(ctx());
        if (!Secured.CheckByUser(user, "admin")){
            return redirect(routes.HomeController.notAuthorized());
        }

        int counter = 0;
        Form<ProductDelete> extraDeleteForm = formFactory.form(ProductDelete.class).bindFromRequest();
        for (Product product: Product.getByNameWithType(extraDeleteForm.get().name, "extra")){
            deleteProductImage(product);
            product.delete();
            counter += 1;
        }
        flash("success", "Sikeresen töröltél " + Integer.toString(counter) + " extrát!");
        return redirect(routes.UserController.admin());
    }

    @Security.Authenticated(Secured.class)
    public Result deleteIngredient() {
        User user = Secured.getUserInstance(ctx());
        if (!Secured.CheckByUser(user, "admin")){
            return redirect(routes.HomeController.notAuthorized());
        }

        int counter = 0;
        Form<ProductDelete> ingredientDeleteForm = formFactory.form(ProductDelete.class).bindFromRequest();
        for (Ingredient ingredient: Ingredient.getByName(ingredientDeleteForm.get().name)){
            deleteIngredientImage(ingredient);
            ingredient.delete();
            counter += 1;
        }
        flash("success", "Sikeresen töröltél " + Integer.toString(counter) + " alapanyagot!");
        return redirect(routes.UserController.admin());
    }

    
    public Result notAuthorized() {
        return Results.TODO;
    }

    private boolean isValidNewItem(NewProduct newProduct){
        if (newProduct.name == null || newProduct.imagepath == null || newProduct.typeP == null){
            return false;
        }
        if (newProduct.typeP.equals("pizza") && (newProduct.price24 == null || newProduct.price32 == null || newProduct.price51 == null)){
            return false;
        }else return newProduct.price != null;

    }



    private List<PizzaGroup> groupsOfThree(List<Product> pizzas){
        List<PizzaGroup> pizzaGroups = new ArrayList<>();
        Map<String, List<Product>> groups = new HashMap<>();

        for (Product product: pizzas){

            if(groups.containsKey(product.name)){
                groups.get(product.name).add(product);
            }else {
                List<Product> tmp = new ArrayList<>();
                tmp.add(product);
                groups.put(product.name, tmp);
            }
        }
        for (List<Product> list: groups.values()) {
            pizzaGroups.add(makeGroup(list));
        }
        return pizzaGroups;
    }

    private PizzaGroup makeGroup(List<Product> threePizza){
        PizzaGroup pg = new PizzaGroup();
        int index = 0;
        for (Product product: threePizza){
            switch (index){
                case 0:
                    pg.name = product.name;
                    pg.imagePath = product.imagePath;
                    pg.notAvailImagePath = product.notAvailImagePath;
                    pg.id1 = product.id;
                    pg.price1 = product.price;
                    break;
                case 1:
                    pg.id2 = product.id;
                    pg.price2 = product.price;
                    break;
                case 2:
                    pg.id3 = product.id;
                    pg.price3 = product.price;
                    break;
            }
            index++;
        }

        return pg;
    }


}
