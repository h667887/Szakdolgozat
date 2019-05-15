package controllers;

import FormClasses.CartProduct;
import FormClasses.CheckoutUser;
import FormClasses.CouponHelper;
import FormClasses.FormCoupon;
import io.ebean.cache.TenantAwareKey;
import models.*;
import play.data.Form;
import play.data.FormFactory;
import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.Results;
import views.html.*;

import javax.inject.Inject;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;


public class CartController extends Controller {

    @Inject
    FormFactory formFactory;

    public Result adminOrders() {
        User user = Secured.getUserInstance(ctx());
        if (!Secured.CheckByUser(user, "admin")){
            return redirect(/* ilyen nincs: routes.HomeController.notAuthorized()*/ routes.HomeController.notAuthorized());
        }

        return ok(adminorders.render(user, Orders.find.all(), CartController.sumPrice()));

    }

    public Result myOrders() {
//        User user = Secured.getUserInstance(ctx());
//
//        List<Orders> orders = Orders.getByUser(user.username);
//        return ok(my_orders.render(user, orders, Product.getByOrder(orders), CartController.sumPrice()));

        return Results.TODO;
    }

    public Result makeOrder() {
        List<Orders> orderInstances = getPendingOrdersOfUser();
        List<Product> cartProducts = getOrderedProducts(orderInstances);
        List<CartProduct> cartItems = new LinkedList<>();
        Map<Product, Integer> quantityOfItems = new HashMap<>();
        if(getPendingOrdersOfUser().isEmpty()) {
            flash("empty", "Your cart is empty!");
            return redirect(routes.CartController.cart());
        }

        for(Product product : cartProducts) {
            if(quantityOfItems.containsKey(product)) {
                quantityOfItems.put(product, quantityOfItems.get(product)+1);
            } else {
                quantityOfItems.put(product, 1);
            }
        }
        for (Map.Entry<Product, Integer> entry : quantityOfItems.entrySet())
        {
            Product product = entry.getKey();
            cartItems.add(new CartProduct(product.id, product.name, product.imagePath, product.typeP, product.description, product.price, entry.getValue(), product.size));
        }
        HashMap<Integer,List<Ingredient>> ingredientsOfPizzas = HomeController.getIngredientsOfPizzas(Product.getPizzas());

        CheckoutUser checkoutUser = new CheckoutUser();

        if(Secured.getUserInstance(ctx()) != null) {
            System.out.println("beallitom a cuccot");
            checkoutUser.fullName = Secured.getUserInstance(ctx()).fullName;
            checkoutUser.address = Secured.getUserInstance(ctx()).address;
            checkoutUser.phoneNumber = Secured.getUserInstance(ctx()).phoneNumber;
            checkoutUser.email = Secured.getUserInstance(ctx()).email;
        }

        String couponDesc = formFactory.form(FormCoupon.class).bindFromRequest().get().description;

        int sumPrice = sumPrice();

        User currentUser = Secured.getUserInstance(ctx());

        if(couponDesc.equals("5%-os kedvezmény")) {
            sumPrice *=0.95;
            List<CouponUser> cu = CouponUser.find.query().where().eq("userId", currentUser.email).and().eq("couponId", 1).findList();
            cu.get(0).delete();
        } else if(couponDesc.equals("10%-os kedvezmény")) {
            sumPrice *=0.90;
            List<CouponUser> cu = CouponUser.find.query().where().eq("userId", currentUser.email).and().eq("couponId", 2).findList();
            cu.get(0).delete();
        } else if(couponDesc.equals("25%-os kedvezmény")) {
            sumPrice *=0.75;
            List<CouponUser> cu = CouponUser.find.query().where().eq("userId", currentUser.email).and().eq("couponId", 3).findList();
            cu.get(0).delete();
        } else if(couponDesc.equals("50%-os kedvezmény")) {
            sumPrice *=0.50;
            List<CouponUser> cu = CouponUser.find.query().where().eq("userId", currentUser.email).and().eq("couponId", 4).findList();
            cu.get(0).delete();
        } else if(couponDesc.equals("75%-os kedvezmény")) {
            sumPrice *=0.25;
            List<CouponUser> cu = CouponUser.find.query().where().eq("userId", currentUser.email).and().eq("couponId", 5).findList();
            cu.get(0).delete();
        }


        Form<CheckoutUser> checkoutForm = formFactory.form(CheckoutUser.class).fill(checkoutUser);





        return ok(finalize.render(Secured.getUserInstance(ctx()), checkoutForm, cartItems, cartItems.isEmpty(), ingredientsOfPizzas, sumPrice));
    }

    //temporary
    public Result orders() {
        return ok(orders.render(Secured.getUserInstance(ctx()), Orders.find.all(), CartController.sumPrice()));
    }

    public Result addToCart(int termekId, boolean cart) {
        System.out.println("Bejöttem berakni valamit a kosárkádba");
        if (Secured.getUserInstance(ctx()) == null) {
            if (session().get("order") == null) {
                String token = User.generateTokenUnauthorized();
                session().put("order", token);
            }
            Orders orders = new Orders(session().get("order"), termekId, "asd");
            orders.save();
        } else {
            Orders orders = new Orders(Secured.getUserInstance(ctx()).username, termekId, "asd");
            orders.save();
        }
        Product product = Product.find.byId(Integer.toString(termekId));
        String type = product.typeP;
        if(cart) {
            return redirect(routes.CartController.cart());
        } else if(type.equals("pizza")) {
            return redirect(routes.HomeController.pizza());
        } else if(type.equals("refreshing") || type.equals("monster") || type.equals("beer")) {
            return redirect(routes.HomeController.drinkByType(type));
        } else if(product.typeP.equals("unique")) {
            return redirect(routes.HomeController.creator());
        } else {
            return redirect(routes.HomeController.extraByType(type));
        }
    }

    public Result cart() {
        List<Orders> orderInstances = getPendingOrdersOfUser();
        List<Product> cartProducts = getOrderedProducts(orderInstances);
        List<CartProduct> cartItems = new LinkedList<>();
        Map<Product, Integer> quantityOfItems = new HashMap<>();

        for(Product product : cartProducts) {
            if(quantityOfItems.containsKey(product)) {
                quantityOfItems.put(product, quantityOfItems.get(product)+1);
            } else {
                quantityOfItems.put(product, 1);
            }
        }

        for (Map.Entry<Product, Integer> entry : quantityOfItems.entrySet())
        {
            Product product = entry.getKey();
            cartItems.add(new CartProduct(product.id, product.name, product.imagePath, product.typeP, product.description, product.price, entry.getValue(), product.size));
        }

        HashMap<Integer,List<Ingredient>> ingredientsOfPizzas = HomeController.getIngredientsOfPizzas(Product.getPizzas());

        User loggedInUser = Secured.getUserInstance(ctx());

        List<String> availableCoupons = new LinkedList<>();
        if(loggedInUser != null) {
            List<CouponHelper> cpHelpers = CouponUser.getCouponsByUser(loggedInUser);
            for(CouponHelper helper : cpHelpers) {
                if(helper.quantity > 0) {
                    availableCoupons.add(helper.description);
                }
            }
        }

        Form<FormCoupon> couponForm = formFactory.form(FormCoupon.class);

        
        return ok(cart.render(Secured.getUserInstance(ctx()), availableCoupons, couponForm, cartItems, orderInstances, cartItems.isEmpty(), ingredientsOfPizzas, sumPrice()));
    }

    public Result checkout() {
        Form<CheckoutUser> checkoutUserForm = formFactory.form(CheckoutUser.class).bindFromRequest();
        CheckoutUser checkoutUser = checkoutUserForm.get();
        if(checkoutUser.phoneNumber.equals("") || checkoutUser.address.equals("")|| checkoutUser.email.equals("") || checkoutUser.fullName.equals("")) {
            flash("warning", "Minden mező kitöltése kötelező!");
            return redirect(routes.CartController.makeOrder());
        }


        User currentUser = Secured.getUserInstance(ctx());

        if (currentUser != null){
            couponGiver();
            currentUser.fullName = checkoutUser.fullName;
            currentUser.address = checkoutUser.address;
            currentUser.phoneNumber= checkoutUser.phoneNumber;
            currentUser.email = checkoutUser.email;
            currentUser.update();
        }

        List<Orders> orderInstances = getPendingOrdersOfUser();

        LinkedList<Product> pizzas = getPizzaOrders(getPendingOrdersOfUser());
        for(Product pizza : pizzas) {
            System.out.println(pizza.id);
            removeIngredients(pizza);
        }


        for(Orders order: orderInstances) {
            order.isOrdered = true;
            order.fullName = checkoutUser.fullName;
            order.address = checkoutUser.address;
            order.phoneNumber = checkoutUser.phoneNumber;
            order.email = checkoutUser.email;
            order.update();
        }


        return redirect(routes.UserController.index());
    }

    public LinkedList<Product> getPizzaOrders(List<Orders> orders) {
        LinkedList<Product> pizzas = new LinkedList<>();
        for(Orders order : orders) {
            Product product = Product.find.byId(Integer.toString(order.productID));
            if(product.typeP.equals("pizza")) {
                pizzas.add(product);
            }
        }
        return pizzas;
    }

    public void removeIngredients(Product pizza) {
        List<IngredientProduct> ingProds = IngredientProduct.find.query().where().eq("ProductId", pizza.id).findList();
        for(IngredientProduct ingProd: ingProds) {
            System.out.println("ingId: " + ingProd.IngredientId + " productId:" + ingProd.ProductId);
            Ingredient ing = Ingredient.find.query().where().eq("id", ingProd.IngredientId).findOne();
            ing.quantity -= 1;
            ing.save();
        }
    }

    public void couponGiver() {
        if(sumPrice() >= 20000) {
            new CouponUser(5, Secured.getUserInstance(ctx()).email).save();
        } else if(sumPrice() >= 15000) {
            new CouponUser(4, Secured.getUserInstance(ctx()).email).save();
        } else if(sumPrice() >= 10000) {
            new CouponUser(3, Secured.getUserInstance(ctx()).email).save();
        } else if(sumPrice() >= 5000) {
            new CouponUser(2, Secured.getUserInstance(ctx()).email).save();
        } else if(sumPrice() >= 2500) {
            new CouponUser(1, Secured.getUserInstance(ctx()).email).save();
        }
    }

    public Result deleteItem(int termekId) {
        List<Orders> orderInstances = getPendingOrdersOfUser();
        for(Orders order : orderInstances) {
            if(order.productID == termekId) {
                Orders toDelete = Orders.find.byId(Integer.toString(order.id));
                toDelete.delete();
                break;
            }
        }
        return redirect(routes.CartController.cart());
    }

    public static List<Orders> getPendingOrdersOfUser() {
        List<Orders> orderInstances;
        List<Orders> pendingOrderInstances = new LinkedList<>();
        if(Secured.getUserInstance(ctx()) == null) {
            if (session().get("order") == null) {
                return new LinkedList<Orders>();
            }
            orderInstances = Orders.getByUser(session().get("order"));
        } else {
            orderInstances = Orders.getByUser(Secured.getUserInstance(ctx()).username);
        }

        for(Orders order : orderInstances) {
            if(!order.isOrdered) {
                pendingOrderInstances.add(order);
            }
        }
        return pendingOrderInstances;
    }

    public static List<Product> getOrderedProducts(List<Orders> orderInstances) {
        List<Product> cartItems = new LinkedList<>();
        for(Orders order: orderInstances) {
            cartItems.add(Product.find.byId(Integer.toString(order.productID)));
        }
        return cartItems;
    }

    public static int sumPrice() {
        int sum = 0;
        List<Orders> cartItems = getPendingOrdersOfUser();
        for(Orders item : cartItems) {
            Product product = Product.find.byId(Integer.toString(item.productID));
            sum += product.price;
        }
        return sum;
    }




}
