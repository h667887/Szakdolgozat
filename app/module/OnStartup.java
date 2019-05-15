package module;

import models.*;
import FormClasses.NewProduct;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class OnStartup {

    @Inject
    public OnStartup() {
        if (User.findByUsername("admin") == null) {
            User user = new User("admin@admin.com", "admin", "admin", true);
//            user.setPassword(user.password);
           
            user.save();
            LoadSomePizzas();
            LoadSomeItals();
            LoadSomeExtras();
            InsertCoupons();
        }
        System.out.println("On Startup called");
        
    }

    private void InsertCoupons() {

        if (Coupon.find.all().size() >= 5){
            return;
        }
        new Coupon(1,0.95f,  "images/Kupon/5kupon.png", "images/Kupon/5no.png", "5%-os kedvezmény").save();
        new Coupon(2,0.90f,  "images/Kupon/10kupon.png", "images/Kupon/10no.png", "10%-os kedvezmény").save();
        new Coupon(3,0.75f,  "images/Kupon/25kupon.png", "images/Kupon/25no.png", "25%-os kedvezmény").save();
        new Coupon(4,0.50f,  "images/Kupon/50kupon.png", "images/Kupon/50no.png", "50%-os kedvezmény").save();
        new Coupon(5,0.25f,  "images/Kupon/75kupon.png", "images/Kupon/75no.png", "75%-os kedvezmény").save();

    }

    private void LoadSomePizzas() {


        if (Product.find.query().where().ilike("typeP", "pizza").findList().size() >= 5) {
            return;
        }

        System.out.println("Loading some pizzas");
        float s_multiplier = 0.75f;
        float m_multiplier = 1f;
        float l_multiplier = 2f;

        Product cheeky_cheesy1 = new Product("Cheeky Cheesey", "images/Item/Pizza/Cheeky Cheesey.png", "images/Item/Pizza/Cheeky Cheesey SOLD.png", "pizza", 890, 24, s_multiplier, false, "Pizza sauce, Cheddar, Blue cheese, Smoked cheese, Mozarella");
        cheeky_cheesy1.save();
        Product cheeky_cheesy2 = new Product("Cheeky Cheesey", "images/Item/Pizza/Cheeky Cheesey.png", "images/Item/Pizza/Cheeky Cheesey SOLD.png", "pizza", 1390, 32, m_multiplier, false, "Pizza sauce, Cheddar, Blue cheese, Smoked cheese, Mozarella");
        cheeky_cheesy2.save();
        Product cheeky_cheesy3 = new Product("Cheeky Cheesey", "images/Item/Pizza/Cheeky Cheesey.png", "images/Item/Pizza/Cheeky Cheesey SOLD.png", "pizza", 2890, 51, l_multiplier, false, "Pizza sauce, Cheddar, Blue cheese, Smoked cheese, Mozarella");
        cheeky_cheesy3.save();

        Product pean_bites1 = new Product("Pean Bites", "images/Item/Pizza/Pean Bites.png", "images/Item/Pizza/Pean Bites SOLD.png", "pizza", 990, 24, s_multiplier, false, "Tartar sauce, Bean, Ham, Beef ribs, Mozarella");
        pean_bites1.save();
        Product pean_bites2 = new Product("Pean Bites", "images/Item/Pizza/Pean Bites.png", "images/Item/Pizza/Pean Bites SOLD.png", "pizza", 1490, 32, m_multiplier, false, "Tartar sauce, Bean, Ham, Beef ribs, Mozarella");
        pean_bites2.save();
        Product pean_bites3 = new Product("Pean Bites", "images/Item/Pizza/Pean Bites.png", "images/Item/Pizza/Pean Bites.png SOLD.png", "pizza", 2990, 51, l_multiplier, false, "Tartar sauce, Bean, Ham, Beef ribs, Mozarella");
        pean_bites3.save();

        Product bacon_wonder1 = new Product("Bacon Wonder", "images/Item/Pizza/BaconWonder.png", "images/Item/Pizza/BaconWonder SOLD.png", "pizza", 990, 24, s_multiplier, false, "Mustard-honey sauce, Bacon, Smoked cheese, Ham");
        bacon_wonder1.save();
        Product bacon_wonder2 = new Product("Bacon Wonder", "images/Item/Pizza/BaconWonder.png", "images/Item/Pizza/BaconWonder SOLD.png", "pizza", 1490, 32, m_multiplier, false, "Mustard-honey sauce, Bacon, Smoked cheese, Ham");
        bacon_wonder2.save();
        Product bacon_wonder3 = new Product("Bacon Wonder", "images/Item/Pizza/BaconWonder.png", "images/Item/Pizza/BaconWonder SOLD.png", "pizza", 2990, 51, l_multiplier, false, "Mustard-honey sauce, Bacon, Smoked cheese, Ham");
        bacon_wonder3.save();

        Product bbq_snail1 = new Product("BBQ Snail", "images/Item/Pizza/BBQ Snail.png", "images/Item/Pizza/BBQ Snail SOLD.png", "pizza", 890, 24, s_multiplier, false, "BBQ sauce, Beef ribs, Jalapeno, Mozarella, Tomato");
        bbq_snail1.save();
        Product bbq_snail2 = new Product("BBQ Snail", "images/Item/Pizza/BBQ Snail.png", "images/Item/Pizza/BBQ Snail SOLD.png", "pizza", 1390, 32, m_multiplier, false, "BBQ sauce, Beef ribs, Jalapeno, Mozarella, Tomato");
        bbq_snail2.save();
        Product bbq_snail3 = new Product("BBQ Snail", "images/Item/Pizza/BBQ Snail.png", "images/Item/Pizza/BBQ Snail SOLD.png", "pizza", 2890, 51, l_multiplier, false, "BBQ sauce, Beef ribs, Jalapeno, Mozarella, Tomato");
        bbq_snail3.save();



        Product gold_digger1 = new Product("Gold Digger", "images/Item/Pizza/Gold Digger.png", "images/Item/Pizza/Gold Digger SOLD.png", "pizza", 1090, 24, s_multiplier, false, "Szechuan sauce, Jalapeno, Smoked cheese, Chicken breasts, Purple onion, Sesame");
        gold_digger1.save();
        Product gold_digger2 = new Product("Gold Digger", "images/Item/Pizza/Gold Digger.png", "images/Item/Pizza/Gold Digger SOLD.png", "pizza", 1690, 32, m_multiplier, false, "Szechuan sauce, Jalapeno, Smoked cheese, Chicken breasts, Purple onion, Sesame");
        gold_digger2.save();
        Product gold_digger3 = new Product("Gold Digger", "images/Item/Pizza/Gold Digger.png", "images/Item/Pizza/Gold Digger SOLD.png", "pizza", 3390, 51, l_multiplier, false, "Szechuan sauce, Jalapeno, Smoked cheese, Chicken breasts, Purple onion, Sesame");
        gold_digger3.save();

        Product exotic1 = new Product("Exotic", "images/Item/Pizza/Exotic.png", "images/Item/Pizza/Exotic SOLD.png", "pizza", 790, 24, s_multiplier, false, "Mustard-honey sauce, Corn, Mozarella, Ham");
        exotic1.save();
        Product exotic2 = new Product("Exotic", "images/Item/Pizza/Exotic.png", "images/Item/Pizza/Exotic SOLD.png", "pizza", 1290, 32, m_multiplier, false, "Mustard-honey sauce, Corn, Mozarella, Ham");
        exotic2.save();
        Product exotic3 = new Product("Exotic", "images/Item/Pizza/Exotic.png", "images/Item/Pizza/Exotic SOLD.png", "pizza", 2690, 51, l_multiplier, false, "Mustard-honey sauce, Corn, Mozarella, Ham");
        exotic3.save();

        Product edens_garden1 = new Product("Eden's Garden", "images/Item/Pizza/Eden's Garden.png", "images/Item/Pizza/Eden's Garden SOLD.png", "pizza", 990, 24, s_multiplier, false, "Cheddar sauce, Mozarella, Pineapple, Peach, Chicken breasts, Almond");
        edens_garden1.save();
        Product edens_garden2 = new Product("Eden's Garden", "images/Item/Pizza/Eden's Garden.png", "images/Item/Pizza/Eden's Garden SOLD.png", "pizza", 1490, 32, m_multiplier, false, "Cheddar sauce, Mozarella, Pineapple, Peach, Chicken breasts, Almond");
        edens_garden2.save();
        Product edens_garden3 = new Product("Eden's Garden", "images/Item/Pizza/Eden's Garden.png", "images/Item/Pizza/Eden's Garden SOLD.png", "pizza", 2990, 51, l_multiplier, false, "Cheddar sauce, Mozarella, Pineapple, Peach, Chicken breasts, Almond");
        edens_garden3.save();

        Product tiger_bite1 = new Product("Tiger Bite", "images/Item/Pizza/Tiger Bite.png", "images/Item/Pizza/Tiger Bite SOLD.png", "pizza", 990, 24, s_multiplier, false, "Salsa sauce, Cheddar, Mozarella, Chicken breasts");
        tiger_bite1.save();
        Product tiger_bite2 = new Product("Tiger Bite", "images/Item/Pizza/Tiger Bite.png", "images/Item/Pizza/Tiger Bite SOLD.png", "pizza", 1490, 32, m_multiplier, false, "Salsa sauce, Cheddar, Mozarella, Chicken breasts");
        tiger_bite2.save();
        Product tiger_bite3 = new Product("Tiger Bite", "images/Item/Pizza/Tiger Bite.png", "images/Item/Pizza/Tiger Bite SOLD.png", "pizza", 2990, 51, l_multiplier, false, "Salsa sauce, Cheddar, Mozarella, Chicken breasts");
        tiger_bite3.save();

        Product greek_touch1 = new Product("Greek Touch", "images/Item/Pizza/Greek Touch.png", "images/Item/Pizza/Greek Touch SOLD.png", "pizza", 1090, 24, s_multiplier, false, "Tzaziki sauce, Feta cheese, Chicken breasts, Tomato, Cucumber, Purple onion, Olive");
        greek_touch1.save();
        Product greek_touch2 = new Product("Greek Touch", "images/Item/Pizza/Greek Touch.png", "images/Item/Pizza/Greek Touch SOLD.png", "pizza", 1790, 32, m_multiplier, false, "Tzaziki sauce, Feta cheese, Chicken breasts, Tomato, Cucumber, Purple onion, Olive");
        greek_touch2.save();
        Product greek_touch3 = new Product("Greek Touch", "images/Item/Pizza/Greek Touch.png", "images/Item/Pizza/Greek Touch SOLD.png", "pizza", 3590, 51, l_multiplier, false, "Tzaziki sauce, Feta cheese, Chicken breasts, Tomato, Cucumber, Purple onion, Olive");
        greek_touch3.save();

        Product season_pass1 = new Product("Season Pass", "images/Item/Pizza/Season Pass.png", "images/Item/Pizza/Season Pass SOLD.png", "pizza", 1090, 24, s_multiplier, false, "Garlic-oil sauce, Parmesan, Blue cheese, Chicken breasts, Purple onion, Leeks, Mushroom");
        season_pass1.save();
        Product season_pass2 = new Product("Season Pass", "images/Item/Pizza/Season Pass.png", "images/Item/Pizza/Season Pass SOLD.png", "pizza", 1690, 32, m_multiplier, false, "Garlic-oil sauce, Parmesan, Blue cheese, Chicken breasts, Purple onion, Leeks, Mushroom");
        season_pass2.save();
        Product season_pass3 = new Product("Season Pass", "images/Item/Pizza/Season Pass.png", "images/Item/Pizza/Season Pass SOLD.png", "pizza", 3390, 51, l_multiplier, false, "Garlic-oil sauce, Parmesan, Blue cheese, Chicken breasts, Purple onion, Leeks, Mushroom");
        season_pass3.save();

        Product four_stores1 = new Product("Four Stores", "images/Item/Pizza/Four Stores.png", "images/Item/Pizza/Four Stores SOLD.png", "pizza", 990, 24, s_multiplier, false, "Pizza sauce, Parmesan, Ham, Pea, Corn, Pineapple, Mushroom");
        four_stores1.save();
        Product four_stores2 = new Product("Four Stores", "images/Item/Pizza/Four Stores.png", "images/Item/Pizza/Four Stores SOLD.png", "pizza", 1490, 32, m_multiplier, false, "Pizza sauce, Parmesan, Ham, Pea, Corn, Pineapple, Mushroom");
        four_stores2.save();
        Product four_stores3 = new Product("Four Stores", "images/Item/Pizza/Four Stores.png", "images/Item/Pizza/Four Stores SOLD.png", "pizza", 2990, 51, l_multiplier, false, "Pizza sauce, Parmesan, Ham, Pea, Corn, Pineapple, Mushroom");
        four_stores3.save();

        Product leviathan1 = new Product("Leviathan", "images/Item/Pizza/Leviathan.png", "images/Item/Pizza/Leviathan SOLD.png", "pizza", 890, 24, s_multiplier, false, "Garlic-oil sauce, Mozarella, Smoked cheese, Salmon, Olive");
        leviathan1.save();
        Product leviathan2 = new Product("Leviathan", "images/Item/Pizza/Leviathan.png", "images/Item/Pizza/Leviathan SOLD.png", "pizza", 1390, 32, m_multiplier, false, "Garlic-oil sauce, Mozarella, Smoked cheese, Salmon, Olive");
        leviathan2.save();
        Product leviathan3 = new Product("Leviathan", "images/Item/Pizza/Leviathan.png", "images/Item/Pizza/Leviathan SOLD.png", "pizza", 2890, 51, l_multiplier, false, "Garlic-oil sauce, Mozarella, Smoked cheese, Salmon, Olive");
        leviathan3.save();

        Product havaiis_fruit1 = new Product("Hawaii's Fruit", "images/Item/Pizza/Hawaii's Fruit.png", "images/Item/Pizza/Hawaii's Fruit SOLD.png", "pizza", 790, 24, s_multiplier, false, "Pizza sauce, Ham, Mozarella, Pineapple");
        havaiis_fruit1.save();
        Product havaiis_fruit2 = new Product("Hawaii's Fruit", "images/Item/Pizza/Hawaii's Fruit.png", "images/Item/Pizza/Hawaii's Fruit SOLD.png", "pizza", 1290, 32, m_multiplier, false, "Pizza sauce, Ham, Mozarella, Pineapple");
        havaiis_fruit2.save();
        Product havaiis_fruit3 = new Product("Hawaii's Fruit", "images/Item/Pizza/Hawaii's Fruit.png", "images/Item/Pizza/Hawaii's Fruit SOLD.png", "pizza", 2690, 51, l_multiplier, false, "Pizza sauce, Ham, Mozarella, Pineapple");
        havaiis_fruit3.save();

        Product diablos_revenge1 = new Product("Diablo's Revenge", "images/Item/Pizza/Diablo's Revenge.png", "images/Item/Pizza/Diablo's Revenge SOLD.png", "pizza", 1090, 24, s_multiplier, false, "Chili sauce, Jalapeno, Purple onion, Onion, Salami, Bacon, Mozarella");
        diablos_revenge1.save();
        Product diablos_revenge2 = new Product("Diablo's Revenge", "images/Item/Pizza/Diablo's Revenge.png", "images/Item/Pizza/Diablo's Revenge SOLD.png", "pizza", 1690, 32, m_multiplier, false, "Chili sauce, Jalapeno, Purple onion, Onion, Salami, Bacon, Mozarella");
        diablos_revenge2.save();
        Product diablos_revenge3 = new Product("Diablo's Revenge", "images/Item/Pizza/Diablo's Revenge.png", "images/Item/Pizza/Diablo's Revenge SOLD.png", "pizza", 3390, 51, l_multiplier, false, "Chili sauce, Jalapeno, Purple onion, Onion, Salami, Bacon, Mozarella");
        diablos_revenge3.save();

        Product sausage_fest1 = new Product("Sausage Fest", "images/Item/Pizza/Sausage Fest.png", "images/Item/Pizza/Sausage Fest SOLD.png", "pizza", 890, 24, s_multiplier, false, "Chili sauce, Sausage, Salami, Parmesan");
        sausage_fest1.save();
        Product sausage_fest2 = new Product("Sausage Fest", "images/Item/Pizza/Sausage Fest.png", "images/Item/Pizza/Sausage Fest SOLD.png", "pizza", 1390, 32, m_multiplier, false, "Chili sauce, Sausage, Salami, Parmesan");
        sausage_fest2.save();
        Product sausage_fest3 = new Product("Sausage Fest", "images/Item/Pizza/Sausage Fest.png", "images/Item/Pizza/Sausage Fest SOLD.png", "pizza", 2890, 51, l_multiplier, false, "Chili sauce, Sausage, Salami, Parmesan");
        sausage_fest3.save();

        Product just_sauce1 = new Product("No ketchup, just sauce", "images/Item/Pizza/No ketchup, just sauce.png", "images/Item/Pizza/No ketchup, just sauce SOLD.png", "pizza", 1290, 24, s_multiplier, false, "Raw sauce, Jalapeno, Frankfurter, Ham, Bacon, Chicken breasts, Cheddar cheese, Sesame");
        just_sauce1.save();
        Product just_sauce2 = new Product("No ketchup, just sauce", "images/Item/Pizza/No ketchup, just sauce.png", "images/Item/Pizza/No ketchup, just sauce SOLD.png", "pizza", 2290, 32, m_multiplier, false, "Raw sauce, Jalapeno, Frankfurter, Ham, Bacon, Chicken breasts, Cheddar cheese, Sesame");
        just_sauce2.save();
        Product just_sauce3 = new Product("No ketchup, just sauce", "images/Item/Pizza/No ketchup, just sauce.png", "images/Item/Pizza/No ketchup, just sauce SOLD.png", "pizza", 4490, 51, l_multiplier, false, "Raw sauce, Jalapeno, Frankfurter, Ham, Bacon, Chicken breasts, Cheddar cheese, Sesame");
        just_sauce3.save();

        Product machine_for_pigs1 = new Product("Machine for Pigs", "images/Item/Pizza/Machine for Pigs.png", "images/Item/Pizza/Machine for Pigs SOLD.png", "pizza", 1290, 24, s_multiplier, false, "Szechuan sauce, Cheddar cheese, Mozarella, Salami, Bacon, Sausage, Beef ribs, Pariser");
        machine_for_pigs1.save();
        Product machine_for_pigs2 = new Product("Machine for Pigs", "images/Item/Pizza/Machine for Pigs.png", "images/Item/Pizza/Machine for Pigs SOLD.png", "pizza", 2290, 32, m_multiplier, false, "Szechuan sauce, Cheddar cheese, Mozarella, Salami, Bacon, Sausage, Beef ribs, Pariser");
        machine_for_pigs2.save();
        Product machine_for_pigs3 = new Product("Machine for Pigs", "images/Item/Pizza/Machine for Pigs.png", "images/Item/Pizza/Machine for Pigs SOLD.png", "pizza", 4490, 51, l_multiplier, false, "Szechuan sauce, Cheddar cheese, Mozarella, Salami, Bacon, Sausage, Beef ribs, Pariser");
        machine_for_pigs3.save();

        Product margeret1 = new Product("Margaret's pleasure", "images/Item/Pizza/Margaret's pleasure.png", "images/Item/Pizza/Margaret's pleasure SOLD.png", "pizza", 690, 24, s_multiplier, false, "Pizza sauce, Mozarella, Tomato, Pepper") ;
        margeret1.save();
        Product margeret2 = new Product("Margaret's pleasure", "images/Item/Pizza/Margaret's pleasure.png", "images/Item/Pizza/Margaret's pleasure SOLD.png", "pizza", 1090, 32, m_multiplier, false, "Pizza sauce, Mozarella, Tomato, Pepper");
        margeret2.save();
        Product margeret3 = new Product("Margaret's pleasure", "images/Item/Pizza/Margaret's pleasure.png", "images/Item/Pizza/Margaret's pleasure SOLD.png", "pizza", 2190, 51, l_multiplier, false, "Pizza sauce, Mozarella, Tomato, Pepper");
        margeret3.save();

        Product pesto_squad1 = new Product("Pesto Squad", "images/Item/Pizza/Pesto Squad.png", "images/Item/Pizza/Pesto Squad SOLD.png", "pizza", 990, 24, s_multiplier, false, "Pesto sauce, Blue cheese, Mozarella, Mushroom, Ham") ;
        pesto_squad1.save();
        Product pesto_squad2 = new Product("Pesto Squad", "images/Item/Pizza/Pesto Squad.png", "images/Item/Pizza/Pesto Squad SOLD.png", "pizza", 1490, 32, m_multiplier, false, "Pesto sauce, Blue cheese, Mozarella, Mushroom, Ham");
        pesto_squad2.save();
        Product pesto_squad3 = new Product("Pesto Squad", "images/Item/Pizza/Pesto Squad.png", "images/Item/Pizza/Pesto Squad SOLD.png", "pizza", 2290, 51, l_multiplier, false, "Pesto sauce, Blue cheese, Mozarella, Mushroom, Ham");
        pesto_squad3.save();

        Product rainforest1 = new Product("Rain Forest", "images/Item/Pizza/Rain Forest.png", "images/Item/Pizza/Rain Forest SOLD.png", "pizza", 890, 24, s_multiplier, false, "Pesto sauce, Ruccola, Cucumber, Parmesan, Pariser") ;
        rainforest1.save();
        Product rainforest2 = new Product("Rain Forest", "images/Item/Pizza/Rain Forest.png", "images/Item/Pizza/Rain Forest SOLD.png", "pizza", 1390, 32, m_multiplier, false, "Pesto sauce, Ruccola, Cucumber, Parmesan, Pariser");
        rainforest2.save();
        Product rainforest3 = new Product("Rain Forest", "images/Item/Pizza/Rain Forest.png", "images/Item/Pizza/Rain Forest SOLD.png", "pizza", 2890, 51, l_multiplier, false, "Pesto sauce, Ruccola, Cucumber, Parmesan, Pariser");
        rainforest3.save();

        Product scarlxrd1 = new Product("Scarlxrd's Wrath", "images/Item/Pizza/Scarlxrd's Wrath.png", "images/Item/Pizza/Scarlxrd's Wrath SOLD.png", "pizza", 1090, 24, s_multiplier, false, "Raw sauce, Sausage, Salami, Corn, Mozarella, Parmesan, Smoked cheese");
        scarlxrd1.save();
        Product scarlxrd2 = new Product("Scarlxrd's Wrath", "images/Item/Pizza/Scarlxrd's Wrath.png", "images/Item/Pizza/Scarlxrd's Wrath SOLD.png", "pizza", 1990, 32, m_multiplier, false, "Raw sauce, Sausage, Salami, Corn, Mozarella, Parmesan, Smoked cheese");
        scarlxrd2.save();
        Product scarlxrd3 = new Product("Scarlxrd's Wrath", "images/Item/Pizza/Scarlxrd's Wrath.png", "images/Item/Pizza/Scarlxrd's Wrath SOLD.png", "pizza", 4190, 51, l_multiplier, false, "Raw sauce, Sausage, Salami, Corn, Mozarella, Parmesan, Smoked cheese");
        scarlxrd3.save();

        Product szegeds_fate1 = new Product("Szeged's Fate", "images/Item/Pizza/Szeged's Fate.png", "images/Item/Pizza/Szeged's Fate SOLD.png", "pizza", 790, 24, s_multiplier, false, "Tartar sauce, Salami, Onion, Mozarella, Pepper") ;
        szegeds_fate1.save();
        Product szegeds_fate2 = new Product("Szeged's Fate", "images/Item/Pizza/Szeged's Fate.png", "images/Item/Pizza/Szeged's Fate SOLD.png", "pizza", 1290, 32, m_multiplier, false, "Tartar sauce, Salami, Onion, Mozarella, Pepper");
        szegeds_fate2.save();
        Product szegeds_fate3 = new Product("Szeged's Fate", "images/Item/Pizza/Szeged's Fate.png", "images/Item/Pizza/Szeged's Fate SOLD.png", "pizza", 2690, 51, l_multiplier, false, "Tartar sauce, Salami, Onion, Mozarella, Pepper");
        szegeds_fate3.save();

        Product borgore1 = new Product("Borgore King", "images/Item/Pizza/Borgore King.png", "images/Item/Pizza/Borgore King SOLD.png", "pizza", 1090, 24, s_multiplier, false, "Salsa sauce, Cucumber, Tomato, Pepper, Ham, Bacon, Blue cheese, Cheddar sauce");
        borgore1.save();
        Product borgore2 = new Product("Borgore King", "images/Item/Pizza/Borgore King.png", "images/Item/Pizza/Borgore King SOLD.png", "pizza", 1990, 32, m_multiplier, false, "Salsa sauce, Cucumber, Tomato, Pepper, Ham, Bacon, Blue cheese, Cheddar sauce");
        borgore2.save();
        Product borgore3 = new Product("Borgore King", "images/Item/Pizza/Borgore King.png", "images/Item/Pizza/Borgore King SOLD.png", "pizza", 4190, 51, l_multiplier, false, "Salsa sauce, Cucumber, Tomato, Pepper, Ham, Bacon, Blue cheese, Cheddar sauce");
        borgore3.save();

        Product ysera1 = new Product("Ysera's Dream", "images/Item/Pizza/Ysera's Dream.png", "images/Item/Pizza/Ysera's Dream SOLD.png", "pizza", 1090, 24, s_multiplier, false, "Mustard-honey sauce, Ham, Eggs, Bacon, Onion, Smoked cheese, Blue Cheese");
        ysera1.save();
        Product ysera2 = new Product("Ysera's Dream", "images/Item/Pizza/Ysera's Dream.png", "images/Item/Pizza/Ysera's Dream SOLD.png", "pizza", 1890, 32, m_multiplier, false, "Mustard-honey sauce, Ham, Eggs, Bacon, Onion, Smoked cheese, Blue Cheese");
        ysera2.save();
        Product ysera3 = new Product("Ysera's Dream", "images/Item/Pizza/Ysera's Dream.png", "images/Item/Pizza/Ysera's Dream SOLD.png", "pizza", 4090, 51, l_multiplier, false, "Mustard-honey sauce, Ham, Eggs, Bacon, Onion, Smoked cheese, Blue Cheese");
        ysera3.save();

        Product erron_black1 = new Product("Erron Black", "images/Item/Pizza/Erron Black.png", "images/Item/Pizza/Erron Black SOLD.png", "pizza", 1090, 24, s_multiplier, false, "Chili sauce, Mozarella, Bean, Corn, Jalapeno, Eggs, Tomato, Bacon, Ham");
        erron_black1.save();
        Product erron_black2 = new Product("Erron Black", "images/Item/Pizza/Erron Black.png", "images/Item/Pizza/Erron Black SOLD.png", "pizza", 1990, 32, m_multiplier, false, "Chili sauce, Mozarella, Bean, Corn, Jalapeno, Eggs, Tomato, Bacon, Ham");
        erron_black2.save();
        Product erron_black3 = new Product("Erron Black", "images/Item/Pizza/Erron Black.png", "images/Item/Pizza/Erron Black SOLD.png", "pizza", 4190, 51, l_multiplier, false, "Chili sauce, Mozarella, Bean, Corn, Jalapeno, Eggs, Tomato, Bacon, Ham");
        erron_black3.save();

        Product soy_boi1 = new Product("Soy Boi", "images/Item/Pizza/Soy Boi.png", "images/Item/Pizza/Soy Boi SOLD.png", "pizza", 1090, 24, s_multiplier, false, "Tzaziki sauce, Cucumber, Pepper, Tomato, Almond, Sesame, Mushroom, Onion, Ruccola, Mozarella");
        soy_boi1.save();
        Product soy_boi2 = new Product("Soy Boi", "images/Item/Pizza/Soy Boi.png", "images/Item/Pizza/Soy Boi SOLD.png", "pizza", 1790, 32, m_multiplier, false, "Tzaziki sauce, Cucumber, Pepper, Tomato, Almond, Sesame, Mushroom, Onion, Ruccola, Mozarella");
        soy_boi2.save();
        Product soy_boi3 = new Product("Soy Boi", "images/Item/Pizza/Soy Boi.png", "images/Item/Pizza/Soy Boi SOLD.png", "pizza", 3590, 51, l_multiplier, false, "Tzaziki sauce, Cucumber, Pepper, Tomato, Almond, Sesame, Mushroom, Onion, Ruccola, Mozarella");
        soy_boi3.save();

        Product bliss1 = new Product("The Bliss", "images/Item/Pizza/The Bliss.png", "images/Item/Pizza/The Bliss SOLD.png", "pizza", 990, 24, s_multiplier, false, "Cheddar sauce, Cheddar cheese, Parmesan, Eggs, Onion, Chicken breasts, Beef ribs, leeks") ;
        bliss1.save();
        Product bliss2 = new Product("The Bliss", "images/Item/Pizza/The Bliss.png", "images/Item/Pizza/The Bliss SOLD.png", "pizza", 1490, 32, m_multiplier, false, "Cheddar sauce, Cheddar cheese, Parmesan, Eggs, Onion, Chicken breasts, Beef ribs, leeks");
        bliss2.save();
        Product bliss3 = new Product("The Bliss", "images/Item/Pizza/The Bliss.png", "images/Item/Pizza/The Bliss SOLD.png", "pizza", 2990, 51, l_multiplier, false, "Cheddar sauce, Cheddar cheese, Parmesan, Eggs, Onion, Chicken breasts, Beef ribs, leeks");
        bliss3.save();

        Product vgod1 = new Product("VGOD", "images/Item/Pizza/VGOD.png", "images/Item/Pizza/VGOD SOLD.png", "pizza", 690, 24, s_multiplier, false, "Nutella, Banana") ;
        vgod1.save();
        Product vgod2 = new Product("VGOD", "images/Item/Pizza/VGOD.png", "images/Item/Pizza/VGOD SOLD.png", "pizza", 1190, 32, m_multiplier, false, "Nutella, Banana");
        vgod2.save();
        Product vgod3 = new Product("VGOD", "images/Item/Pizza/VGOD.png", "images/Item/Pizza/VGOD SOLD.png", "pizza", 2490, 51, l_multiplier, false, "Nutella, Banana");
        vgod3.save();





        NewProduct newProduct1 = new NewProduct();

        newProduct1.name = "Almond";
        newProduct1.imagepath = null;
        newProduct1.price = (float)150;
        Ingredient almond = new Ingredient(newProduct1);
        almond.quantity = 10;
        almond.save();


        newProduct1.name = "Bacon";
        newProduct1.imagepath = null;
        newProduct1.price = (float)250;
        Ingredient bacon = new Ingredient(newProduct1);
        bacon.quantity = 10;
        bacon.save();

        newProduct1.name = "Bean";
        newProduct1.imagepath = null;
        newProduct1.price = (float)100;
        Ingredient bean = new Ingredient(newProduct1);
        bean.quantity = 10;
        bean.save();

        newProduct1.name = "Beef ribs";
        newProduct1.imagepath = null;
        newProduct1.price = (float)300;
        Ingredient beef_ribs = new Ingredient(newProduct1);
        beef_ribs.quantity = 10;
        beef_ribs.save();

        newProduct1.name = "Blue cheese";
        newProduct1.imagepath = null;
        newProduct1.price = (float)250;
        Ingredient blue_cheese = new Ingredient(newProduct1);
        blue_cheese.quantity = 10;
        blue_cheese.save();

        newProduct1.name = "Cheddar";
        newProduct1.imagepath = null;
        newProduct1.price = (float)250;
        Ingredient cheddar = new Ingredient(newProduct1);
        cheddar.quantity = 10;
        cheddar.save();

        newProduct1.name = "Chicken breasts";
        newProduct1.imagepath = null;
        newProduct1.price = (float)300;
        Ingredient chicken_breasts = new Ingredient(newProduct1);
        chicken_breasts.quantity = 10;
        chicken_breasts.save();

        newProduct1.name = "Corn";
        newProduct1.imagepath = null;
        newProduct1.price = (float)100;
        Ingredient corn = new Ingredient(newProduct1);
        corn.quantity = 10;
        corn.save();

        newProduct1.name = "Cucumber";
        newProduct1.imagepath = null;
        newProduct1.price = (float)100;
        Ingredient cucumber = new Ingredient(newProduct1);
        cucumber.quantity = 10;
        cucumber.save();

        newProduct1.name = "Egg";
        newProduct1.imagepath = null;
        newProduct1.price = (float)150;
        Ingredient egg = new Ingredient(newProduct1);
        egg.quantity = 10;
        egg.save();

        newProduct1.name = "Feta";
        newProduct1.imagepath = null;
        newProduct1.price = (float)300;
        Ingredient feta = new Ingredient(newProduct1);
        feta.quantity = 10;
        feta.save();

        newProduct1.name = "Frankfurter";
        newProduct1.imagepath = null;
        newProduct1.price = (float)200;
        Ingredient frankfurter = new Ingredient(newProduct1);
        frankfurter.quantity = 10;
        frankfurter.save();

        newProduct1.name = "Shrimps";
        newProduct1.imagepath = null;
        newProduct1.price = (float)350;
        Ingredient shrimps = new Ingredient(newProduct1);
        shrimps.quantity = 10;
        shrimps.save();

        newProduct1.name = "Ham";
        newProduct1.imagepath = null;
        newProduct1.price = (float)250;
        Ingredient ham = new Ingredient(newProduct1);
        ham.quantity = 10;
        ham.save();

        newProduct1.name = "Jalapeno";
        newProduct1.imagepath = null;
        newProduct1.price = (float)150;
        Ingredient jalapeno = new Ingredient(newProduct1);
        jalapeno.quantity = 10;
        jalapeno.save();

        newProduct1.name = "Leeks";
        newProduct1.imagepath = null;
        newProduct1.price = (float)100;
        Ingredient leeks = new Ingredient(newProduct1);
        leeks.quantity = 10;
        leeks.save();

        newProduct1.name = "Mozzarella";
        newProduct1.imagepath = null;
        newProduct1.price = (float)200;
        Ingredient mozzarella = new Ingredient(newProduct1);
        mozzarella.quantity = 10;
        mozzarella.save();

        newProduct1.name = "Mushroom";
        newProduct1.imagepath = null;
        newProduct1.price = (float)150;
        Ingredient mushroom = new Ingredient(newProduct1);
        mushroom.quantity = 10;
        mushroom.save();

        newProduct1.name = "Olive";
        newProduct1.imagepath = null;
        newProduct1.price = (float)100;
        Ingredient olive = new Ingredient(newProduct1);
        olive.quantity = 10;
        olive.save();

        newProduct1.name = "Onions";
        newProduct1.imagepath = null;
        newProduct1.price = (float)100;
        Ingredient onions = new Ingredient(newProduct1);
        onions.quantity = 10;
        onions.save();

        newProduct1.name = "Pariser";
        newProduct1.imagepath = null;
        newProduct1.price = (float)150;
        Ingredient pariser = new Ingredient(newProduct1);
        pariser.quantity = 10;
        pariser.save();

        newProduct1.name = "Parmesan";
        newProduct1.imagepath = null;
        newProduct1.price = (float)250;
        Ingredient parmesan = new Ingredient(newProduct1);
        parmesan.quantity = 10;
        parmesan.save();

        newProduct1.name = "Peach";
        newProduct1.imagepath = null;
        newProduct1.price = (float)200;
        Ingredient peach = new Ingredient(newProduct1);
        peach.quantity = 10;
        peach.save();

        newProduct1.name = "Peas";
        newProduct1.imagepath = null;
        newProduct1.price = (float)100;
        Ingredient peas = new Ingredient(newProduct1);
        peas.quantity = 10;
        peas.save();

        newProduct1.name = "Pepper";
        newProduct1.imagepath = null;
        newProduct1.price = (float)100;
        Ingredient pepper = new Ingredient(newProduct1);
        pepper.quantity = 10;
        pepper.save();

        newProduct1.name = "Pineapple";
        newProduct1.imagepath = null;
        newProduct1.price = (float)150;
        Ingredient pineapple = new Ingredient(newProduct1);
        pineapple.quantity = 10;
        pineapple.save();

        newProduct1.name = "Purple onion";
        newProduct1.imagepath = null;
        newProduct1.price = (float)100;
        Ingredient purple_onion = new Ingredient(newProduct1);
        purple_onion.quantity = 10;
        purple_onion.save();

        newProduct1.name = "Ruccola";
        newProduct1.imagepath = null;
        newProduct1.price = (float)100;
        Ingredient ruccola = new Ingredient(newProduct1);
        ruccola.quantity = 10;
        ruccola.save();

        newProduct1.name = "Salami";
        newProduct1.imagepath = null;
        newProduct1.price = (float)250;
        Ingredient salami = new Ingredient(newProduct1);
        salami.quantity = 10;
        salami.save();

        newProduct1.name = "Salmon";
        newProduct1.imagepath = null;
        newProduct1.price = (float)200;
        Ingredient salmon = new Ingredient(newProduct1);
        salmon.quantity = 10;
        salmon.save();

        newProduct1.name = "Sausage";
        newProduct1.imagepath = null;
        newProduct1.price = (float)250;
        Ingredient sausage = new Ingredient(newProduct1);
        sausage.quantity = 10;
        sausage.save();

        newProduct1.name = "Sesame";
        newProduct1.imagepath = null;
        newProduct1.price = (float)100;
        Ingredient sesame = new Ingredient(newProduct1);
        sesame.quantity = 10;
        sesame.save();

        newProduct1.name = "Smoked cheese";
        newProduct1.imagepath = null;
        newProduct1.price = (float)200;
        Ingredient smoked_cheese = new Ingredient(newProduct1);
        smoked_cheese.quantity = 10;
        smoked_cheese.save();

        newProduct1.name = "Tomato";
        newProduct1.imagepath = null;
        newProduct1.price = (float)150;
        Ingredient tomato = new Ingredient(newProduct1);
        tomato.quantity = 10;
        tomato.save();

        newProduct1.name = "Pizza sauce";
        newProduct1.imagepath = null;
        newProduct1.price = (float)150;
        Ingredient pizza_sauce = new Ingredient(newProduct1);
        pizza_sauce.quantity = 10;
        pizza_sauce.save();

        newProduct1.name = "BBQ sauce";
        newProduct1.imagepath = null;
        newProduct1.price = (float)200;
        Ingredient bbq_sauce = new Ingredient(newProduct1);
        bbq_sauce.quantity = 10;
        bbq_sauce.save();

        newProduct1.name = "Raw sauce";
        newProduct1.imagepath = null;
        newProduct1.price = (float)300;
        Ingredient raw_sauce = new Ingredient(newProduct1);
        raw_sauce.quantity = 10;
        raw_sauce.save();

        newProduct1.name = "Cheddar sauce";
        newProduct1.imagepath = null;
        newProduct1.price = (float)200;
        Ingredient cheddar_sauce = new Ingredient(newProduct1);
        cheddar_sauce.quantity = 10;
        cheddar_sauce.save();

        newProduct1.name = "Chili sauce";
        newProduct1.imagepath = null;
        newProduct1.price = (float)150;
        Ingredient chili_sauce = new Ingredient(newProduct1);
        chili_sauce.quantity = 10;
        chili_sauce.save();

        newProduct1.name = "Garlic-oil sauce";
        newProduct1.imagepath = null;
        newProduct1.price = (float)150;
        Ingredient garlicoil_sauce = new Ingredient(newProduct1);
        garlicoil_sauce.quantity = 10;
        garlicoil_sauce.save();

        newProduct1.name = "Mustard-honey sauce";
        newProduct1.imagepath = null;
        newProduct1.price = (float)200;
        Ingredient mustard_honey_sauce = new Ingredient(newProduct1);
        mustard_honey_sauce.quantity = 10;
        mustard_honey_sauce.save();

        newProduct1.name = "Pesto";
        newProduct1.imagepath = null;
        newProduct1.price = (float)250;
        Ingredient pesto = new Ingredient(newProduct1);
        pesto.quantity = 10;
        pesto.save();

        newProduct1.name = "Salsa";
        newProduct1.imagepath = null;
        newProduct1.price = (float)200;
        Ingredient salsa = new Ingredient(newProduct1);
        salsa.quantity = 10;
        salsa.save();

        newProduct1.name = "Szechuan sauce";
        newProduct1.imagepath = null;
        newProduct1.price = (float)250;
        Ingredient szechuan_sauce = new Ingredient(newProduct1);
        szechuan_sauce.quantity = 10;
        szechuan_sauce.save();

        newProduct1.name = "Tartar sauce";
        newProduct1.imagepath = null;
        newProduct1.price = (float)150;
        Ingredient tartar_sauce = new Ingredient(newProduct1);
        tartar_sauce.quantity = 10;
        tartar_sauce.save();

        newProduct1.name = "Tzatiki sauce";
        newProduct1.imagepath = null;
        newProduct1.price = (float)200;
        Ingredient tzatiki_sauce = new Ingredient(newProduct1);
        tzatiki_sauce.quantity = 10;
        tzatiki_sauce.save();

        newProduct1.name = "Nutella";
        newProduct1.imagepath = null;
        newProduct1.price = (float)0;
        Ingredient nutella = new Ingredient(newProduct1);
        nutella.quantity = 10;
        nutella.save();

        newProduct1.name = "Banana";
        newProduct1.imagepath = null;
        newProduct1.price = (float)0;
        Ingredient banana = new Ingredient(newProduct1);
        banana.quantity = 10;
        banana.save();

        newProduct1.name = "Mozarella";
        newProduct1.imagepath = null;
        newProduct1.price = (float)0;
        Ingredient mozarella = new Ingredient(newProduct1);
        mozarella.quantity = 10;
        mozarella.save();




        //Cheeky Cheesey: Pizza sauce, Cheddar, Blue cheese, Smoked cheese, Mozarella
        new IngredientProduct(cheeky_cheesy1.id, pizza_sauce.id).save();
        new IngredientProduct(cheeky_cheesy1.id, cheddar.id).save();
        new IngredientProduct(cheeky_cheesy1.id, blue_cheese.id).save();
        new IngredientProduct(cheeky_cheesy1.id, smoked_cheese.id).save();
        new IngredientProduct(cheeky_cheesy1.id, mozarella.id).save();
        new IngredientProduct(cheeky_cheesy2.id, pizza_sauce.id).save();
        new IngredientProduct(cheeky_cheesy2.id, cheddar.id).save();
        new IngredientProduct(cheeky_cheesy2.id, blue_cheese.id).save();
        new IngredientProduct(cheeky_cheesy2.id, smoked_cheese.id).save();
        new IngredientProduct(cheeky_cheesy2.id, mozarella.id).save();
        new IngredientProduct(cheeky_cheesy3.id, pizza_sauce.id).save();
        new IngredientProduct(cheeky_cheesy3.id, cheddar.id).save();
        new IngredientProduct(cheeky_cheesy3.id, blue_cheese.id).save();
        new IngredientProduct(cheeky_cheesy3.id, smoked_cheese.id).save();
        new IngredientProduct(cheeky_cheesy3.id, mozarella.id).save();

        //Pean Bites: Tartar sauce, Bean, Ham, Beef ribs, Mozarella
        new IngredientProduct(pean_bites1.id, tartar_sauce.id).save();
        new IngredientProduct(pean_bites1.id, bean.id).save();
        new IngredientProduct(pean_bites1.id, ham.id).save();
        new IngredientProduct(pean_bites1.id, beef_ribs.id).save();
        new IngredientProduct(pean_bites1.id, mozarella.id).save();
        new IngredientProduct(pean_bites2.id, tartar_sauce.id).save();
        new IngredientProduct(pean_bites2.id, bean.id).save();
        new IngredientProduct(pean_bites2.id, ham.id).save();
        new IngredientProduct(pean_bites2.id, beef_ribs.id).save();
        new IngredientProduct(pean_bites2.id, mozarella.id).save();
        new IngredientProduct(pean_bites3.id, tartar_sauce.id).save();
        new IngredientProduct(pean_bites3.id, bean.id).save();
        new IngredientProduct(pean_bites3.id, ham.id).save();
        new IngredientProduct(pean_bites3.id, beef_ribs.id).save();
        new IngredientProduct(pean_bites3.id, mozarella.id).save();

        //Bacon Wonder: Mustard-honey sauce, Bacon, Smoked cheese, Ham
        new IngredientProduct(bacon_wonder1.id, mustard_honey_sauce.id).save();
        new IngredientProduct(bacon_wonder1.id, bacon.id).save();
        new IngredientProduct(bacon_wonder1.id, smoked_cheese.id).save();
        new IngredientProduct(bacon_wonder1.id, ham.id).save();
        new IngredientProduct(bacon_wonder2.id, mustard_honey_sauce.id).save();
        new IngredientProduct(bacon_wonder2.id, bacon.id).save();
        new IngredientProduct(bacon_wonder2.id, smoked_cheese.id).save();
        new IngredientProduct(bacon_wonder2.id, ham.id).save();
        new IngredientProduct(bacon_wonder3.id, mustard_honey_sauce.id).save();
        new IngredientProduct(bacon_wonder3.id, bacon.id).save();
        new IngredientProduct(bacon_wonder3.id, smoked_cheese.id).save();
        new IngredientProduct(bacon_wonder3.id, ham.id).save();

        //BBQ Snail: BBQ sauce, Beef ribs, Jalapeno, Mozarella, Tomato
        new IngredientProduct(bbq_snail1.id, bbq_sauce.id).save();
        new IngredientProduct(bbq_snail1.id, beef_ribs.id).save();
        new IngredientProduct(bbq_snail1.id, jalapeno.id).save();
        new IngredientProduct(bbq_snail1.id, mozzarella.id).save();
        new IngredientProduct(bbq_snail1.id, tomato.id).save();
        new IngredientProduct(bbq_snail2.id, bbq_sauce.id).save();
        new IngredientProduct(bbq_snail2.id, beef_ribs.id).save();
        new IngredientProduct(bbq_snail2.id, jalapeno.id).save();
        new IngredientProduct(bbq_snail2.id, mozzarella.id).save();
        new IngredientProduct(bbq_snail2.id, tomato.id).save();
        new IngredientProduct(bbq_snail3.id, bbq_sauce.id).save();
        new IngredientProduct(bbq_snail3.id, beef_ribs.id).save();
        new IngredientProduct(bbq_snail3.id, jalapeno.id).save();
        new IngredientProduct(bbq_snail3.id, mozzarella.id).save();
        new IngredientProduct(bbq_snail3.id, tomato.id).save();

        //Gold Digger: Szechuan sauce, Jalapeno, Smoked cheese, Chicken breasts, Purple onion, Sesame
        new IngredientProduct(gold_digger1.id, szechuan_sauce.id).save();
        new IngredientProduct(gold_digger1.id, jalapeno.id).save();
        new IngredientProduct(gold_digger1.id, smoked_cheese.id).save();
        new IngredientProduct(gold_digger1.id, chicken_breasts.id).save();
        new IngredientProduct(gold_digger1.id, purple_onion.id).save();
        new IngredientProduct(gold_digger1.id, sesame.id).save();
        new IngredientProduct(gold_digger2.id, szechuan_sauce.id).save();
        new IngredientProduct(gold_digger2.id, jalapeno.id).save();
        new IngredientProduct(gold_digger2.id, smoked_cheese.id).save();
        new IngredientProduct(gold_digger2.id, chicken_breasts.id).save();
        new IngredientProduct(gold_digger2.id, purple_onion.id).save();
        new IngredientProduct(gold_digger2.id, sesame.id).save();
        new IngredientProduct(gold_digger3.id, szechuan_sauce.id).save();
        new IngredientProduct(gold_digger3.id, jalapeno.id).save();
        new IngredientProduct(gold_digger3.id, smoked_cheese.id).save();
        new IngredientProduct(gold_digger3.id, chicken_breasts.id).save();
        new IngredientProduct(gold_digger3.id, purple_onion.id).save();
        new IngredientProduct(gold_digger3.id, sesame.id).save();

        //Exotic: Mustard-honey sauce, Corn, Mozarella, Ham
        new IngredientProduct(exotic1.id, mustard_honey_sauce.id).save();
        new IngredientProduct(exotic1.id, corn.id).save();
        new IngredientProduct(exotic1.id, mozzarella.id).save();
        new IngredientProduct(exotic1.id, ham.id).save();
        new IngredientProduct(exotic2.id, mustard_honey_sauce.id).save();
        new IngredientProduct(exotic2.id, corn.id).save();
        new IngredientProduct(exotic2.id, mozzarella.id).save();
        new IngredientProduct(exotic2.id, ham.id).save();
        new IngredientProduct(exotic3.id, mustard_honey_sauce.id).save();
        new IngredientProduct(exotic3.id, corn.id).save();
        new IngredientProduct(exotic3.id, mozzarella.id).save();
        new IngredientProduct(exotic3.id, ham.id).save();

        //Eden's Garden: Cheddar sauce, Mozarella, Pineapple, Peach, Chicken breasts, Almond
        new IngredientProduct(edens_garden1.id, cheddar_sauce.id).save();
        new IngredientProduct(edens_garden1.id, mozzarella.id).save();
        new IngredientProduct(edens_garden1.id, pineapple.id).save();
        new IngredientProduct(edens_garden1.id, peach.id).save();
        new IngredientProduct(edens_garden1.id, chicken_breasts.id).save();
        new IngredientProduct(edens_garden1.id, almond.id).save();
        new IngredientProduct(edens_garden2.id, cheddar_sauce.id).save();
        new IngredientProduct(edens_garden2.id, mozzarella.id).save();
        new IngredientProduct(edens_garden2.id, pineapple.id).save();
        new IngredientProduct(edens_garden2.id, peach.id).save();
        new IngredientProduct(edens_garden2.id, chicken_breasts.id).save();
        new IngredientProduct(edens_garden2.id, almond.id).save();
        new IngredientProduct(edens_garden3.id, cheddar_sauce.id).save();
        new IngredientProduct(edens_garden3.id, mozzarella.id).save();
        new IngredientProduct(edens_garden3.id, pineapple.id).save();
        new IngredientProduct(edens_garden3.id, peach.id).save();
        new IngredientProduct(edens_garden3.id, chicken_breasts.id).save();
        new IngredientProduct(edens_garden3.id, almond.id).save();

        //Tiger Bite: Salsa sauce, Cheddar, Mozarella, Chicken breasts
        new IngredientProduct(tiger_bite1.id, salsa.id).save();
        new IngredientProduct(tiger_bite1.id, cheddar.id).save();
        new IngredientProduct(tiger_bite1.id, chicken_breasts.id).save();
        new IngredientProduct(tiger_bite1.id, mozzarella.id).save();
        new IngredientProduct(tiger_bite2.id, salsa.id).save();
        new IngredientProduct(tiger_bite2.id, cheddar.id).save();
        new IngredientProduct(tiger_bite2.id, chicken_breasts.id).save();
        new IngredientProduct(tiger_bite2.id, mozzarella.id).save();
        new IngredientProduct(tiger_bite3.id, salsa.id).save();
        new IngredientProduct(tiger_bite3.id, cheddar.id).save();
        new IngredientProduct(tiger_bite3.id, chicken_breasts.id).save();
        new IngredientProduct(tiger_bite3.id, mozzarella.id).save();

        //Greek Touch: Tzaziki sauce, Feta cheese, Chicken breasts, Tomato, Cucumber, Purple onion, Olive
        new IngredientProduct(greek_touch1.id, tzatiki_sauce.id).save();
        new IngredientProduct(greek_touch1.id, feta.id).save();
        new IngredientProduct(greek_touch1.id, chicken_breasts.id).save();
        new IngredientProduct(greek_touch1.id, tomato.id).save();
        new IngredientProduct(greek_touch1.id, cucumber.id).save();
        new IngredientProduct(greek_touch1.id, purple_onion.id).save();
        new IngredientProduct(greek_touch1.id, olive.id).save();
        new IngredientProduct(greek_touch2.id, tzatiki_sauce.id).save();
        new IngredientProduct(greek_touch2.id, feta.id).save();
        new IngredientProduct(greek_touch2.id, chicken_breasts.id).save();
        new IngredientProduct(greek_touch2.id, tomato.id).save();
        new IngredientProduct(greek_touch2.id, cucumber.id).save();
        new IngredientProduct(greek_touch2.id, purple_onion.id).save();
        new IngredientProduct(greek_touch2.id, olive.id).save();
        new IngredientProduct(greek_touch3.id, tzatiki_sauce.id).save();
        new IngredientProduct(greek_touch3.id, feta.id).save();
        new IngredientProduct(greek_touch3.id, chicken_breasts.id).save();
        new IngredientProduct(greek_touch3.id, tomato.id).save();
        new IngredientProduct(greek_touch3.id, cucumber.id).save();
        new IngredientProduct(greek_touch3.id, purple_onion.id).save();
        new IngredientProduct(greek_touch3.id, olive.id).save();

        //Season Pass: Garlic-oil sauce, Parmesan, Blue cheese, Chicken breasts, Purple onion, Leeks, Mushroom
        new IngredientProduct(season_pass1.id, garlicoil_sauce.id).save();
        new IngredientProduct(season_pass1.id, parmesan.id).save();
        new IngredientProduct(season_pass1.id, blue_cheese.id).save();
        new IngredientProduct(season_pass1.id, chicken_breasts.id).save();
        new IngredientProduct(season_pass1.id, purple_onion.id).save();
        new IngredientProduct(season_pass1.id, leeks.id).save();
        new IngredientProduct(season_pass1.id, mushroom.id).save();
        new IngredientProduct(season_pass2.id, garlicoil_sauce.id).save();
        new IngredientProduct(season_pass2.id, parmesan.id).save();
        new IngredientProduct(season_pass2.id, blue_cheese.id).save();
        new IngredientProduct(season_pass2.id, chicken_breasts.id).save();
        new IngredientProduct(season_pass2.id, purple_onion.id).save();
        new IngredientProduct(season_pass2.id, leeks.id).save();
        new IngredientProduct(season_pass2.id, mushroom.id).save();
        new IngredientProduct(season_pass3.id, garlicoil_sauce.id).save();
        new IngredientProduct(season_pass3.id, parmesan.id).save();
        new IngredientProduct(season_pass3.id, blue_cheese.id).save();
        new IngredientProduct(season_pass3.id, chicken_breasts.id).save();
        new IngredientProduct(season_pass3.id, purple_onion.id).save();
        new IngredientProduct(season_pass3.id, leeks.id).save();
        new IngredientProduct(season_pass3.id, mushroom.id).save();

        //Four Stores: Pizza sauce, Parmesan, Ham, Pea, Corn, Pineapple, Mushroom
        new IngredientProduct(four_stores1.id, pizza_sauce.id).save();
        new IngredientProduct(four_stores1.id, parmesan.id).save();
        new IngredientProduct(four_stores1.id, ham.id).save();
        new IngredientProduct(four_stores1.id, peas.id).save();
        new IngredientProduct(four_stores1.id, corn.id).save();
        new IngredientProduct(four_stores1.id, pineapple.id).save();
        new IngredientProduct(four_stores1.id, mushroom.id).save();
        new IngredientProduct(four_stores2.id, pizza_sauce.id).save();
        new IngredientProduct(four_stores2.id, parmesan.id).save();
        new IngredientProduct(four_stores2.id, ham.id).save();
        new IngredientProduct(four_stores2.id, peas.id).save();
        new IngredientProduct(four_stores2.id, corn.id).save();
        new IngredientProduct(four_stores2.id, pineapple.id).save();
        new IngredientProduct(four_stores2.id, mushroom.id).save();
        new IngredientProduct(four_stores3.id, pizza_sauce.id).save();
        new IngredientProduct(four_stores3.id, parmesan.id).save();
        new IngredientProduct(four_stores3.id, ham.id).save();
        new IngredientProduct(four_stores3.id, peas.id).save();
        new IngredientProduct(four_stores3.id, corn.id).save();
        new IngredientProduct(four_stores3.id, pineapple.id).save();
        new IngredientProduct(four_stores3.id, mushroom.id).save();

        //Leviathan: Garlic-oil sauce, Mozarella, Smoked cheese, Salmon, Olive
        new IngredientProduct(leviathan1.id, garlicoil_sauce.id).save();
        new IngredientProduct(leviathan1.id, mozzarella.id).save();
        new IngredientProduct(leviathan1.id, smoked_cheese.id).save();
        new IngredientProduct(leviathan1.id, salmon.id).save();
        new IngredientProduct(leviathan1.id, olive.id).save();
        new IngredientProduct(leviathan2.id, garlicoil_sauce.id).save();
        new IngredientProduct(leviathan2.id, mozzarella.id).save();
        new IngredientProduct(leviathan2.id, smoked_cheese.id).save();
        new IngredientProduct(leviathan2.id, salmon.id).save();
        new IngredientProduct(leviathan2.id, olive.id).save();
        new IngredientProduct(leviathan3.id, garlicoil_sauce.id).save();
        new IngredientProduct(leviathan3.id, mozzarella.id).save();
        new IngredientProduct(leviathan3.id, smoked_cheese.id).save();
        new IngredientProduct(leviathan3.id, salmon.id).save();
        new IngredientProduct(leviathan3.id, olive.id).save();

        //Hawaii's Fruit: Pizza sauce, Ham, Mozarella, Pineapple
        new IngredientProduct(havaiis_fruit1.id, pizza_sauce.id).save();
        new IngredientProduct(havaiis_fruit1.id, ham.id).save();
        new IngredientProduct(havaiis_fruit1.id, mozzarella.id).save();
        new IngredientProduct(havaiis_fruit1.id, pineapple.id).save();
        new IngredientProduct(havaiis_fruit2.id, pizza_sauce.id).save();
        new IngredientProduct(havaiis_fruit2.id, ham.id).save();
        new IngredientProduct(havaiis_fruit2.id, mozzarella.id).save();
        new IngredientProduct(havaiis_fruit2.id, pineapple.id).save();
        new IngredientProduct(havaiis_fruit3.id, pizza_sauce.id).save();
        new IngredientProduct(havaiis_fruit3.id, ham.id).save();
        new IngredientProduct(havaiis_fruit3.id, mozzarella.id).save();
        new IngredientProduct(havaiis_fruit3.id, pineapple.id).save();

        //Diablo's Revenge: Chili sauce, Jalapeno, Purple onion, Onion, Salami, Bacon, Mozarella
        new IngredientProduct(diablos_revenge1.id, chili_sauce.id).save();
        new IngredientProduct(diablos_revenge1.id, jalapeno.id).save();
        new IngredientProduct(diablos_revenge1.id, purple_onion.id).save();
        new IngredientProduct(diablos_revenge1.id, onions.id).save();
        new IngredientProduct(diablos_revenge1.id, salami.id).save();
        new IngredientProduct(diablos_revenge1.id, bacon.id).save();
        new IngredientProduct(diablos_revenge1.id, mozzarella.id).save();
        new IngredientProduct(diablos_revenge2.id, chili_sauce.id).save();
        new IngredientProduct(diablos_revenge2.id, jalapeno.id).save();
        new IngredientProduct(diablos_revenge2.id, purple_onion.id).save();
        new IngredientProduct(diablos_revenge2.id, onions.id).save();
        new IngredientProduct(diablos_revenge2.id, salami.id).save();
        new IngredientProduct(diablos_revenge2.id, bacon.id).save();
        new IngredientProduct(diablos_revenge2.id, mozzarella.id).save();
        new IngredientProduct(diablos_revenge3.id, chili_sauce.id).save();
        new IngredientProduct(diablos_revenge3.id, jalapeno.id).save();
        new IngredientProduct(diablos_revenge3.id, purple_onion.id).save();
        new IngredientProduct(diablos_revenge3.id, onions.id).save();
        new IngredientProduct(diablos_revenge3.id, salami.id).save();
        new IngredientProduct(diablos_revenge3.id, bacon.id).save();
        new IngredientProduct(diablos_revenge3.id, mozzarella.id).save();


        //Sausage Fest: Chili sauce, Sausage, Salami, Parmesan
        new IngredientProduct(sausage_fest1.id, chili_sauce.id).save();
        new IngredientProduct(sausage_fest1.id, sausage.id).save();
        new IngredientProduct(sausage_fest1.id, salami.id).save();
        new IngredientProduct(sausage_fest1.id, parmesan.id).save();
        new IngredientProduct(sausage_fest2.id, chili_sauce.id).save();
        new IngredientProduct(sausage_fest2.id, sausage.id).save();
        new IngredientProduct(sausage_fest2.id, salami.id).save();
        new IngredientProduct(sausage_fest2.id, parmesan.id).save();
        new IngredientProduct(sausage_fest3.id, chili_sauce.id).save();
        new IngredientProduct(sausage_fest3.id, sausage.id).save();
        new IngredientProduct(sausage_fest3.id, salami.id).save();
        new IngredientProduct(sausage_fest3.id, parmesan.id).save();

        //No ketchup, just sauce: Raw sauce, Jalapeno, Frankfurter, Ham, Bacon, Chicken breasts, Cheddar cheese, Sesame
        new IngredientProduct(just_sauce1.id, raw_sauce.id).save();
        new IngredientProduct(just_sauce1.id, jalapeno.id).save();
        new IngredientProduct(just_sauce1.id, frankfurter.id).save();
        new IngredientProduct(just_sauce1.id, ham.id).save();
        new IngredientProduct(just_sauce1.id, bacon.id).save();
        new IngredientProduct(just_sauce1.id, chicken_breasts.id).save();
        new IngredientProduct(just_sauce1.id, cheddar.id).save();
        new IngredientProduct(just_sauce1.id, sesame.id).save();
        new IngredientProduct(just_sauce2.id, raw_sauce.id).save();
        new IngredientProduct(just_sauce2.id, jalapeno.id).save();
        new IngredientProduct(just_sauce2.id, frankfurter.id).save();
        new IngredientProduct(just_sauce2.id, ham.id).save();
        new IngredientProduct(just_sauce2.id, bacon.id).save();
        new IngredientProduct(just_sauce2.id, chicken_breasts.id).save();
        new IngredientProduct(just_sauce2.id, cheddar.id).save();
        new IngredientProduct(just_sauce2.id, sesame.id).save();
        new IngredientProduct(just_sauce3.id, raw_sauce.id).save();
        new IngredientProduct(just_sauce3.id, jalapeno.id).save();
        new IngredientProduct(just_sauce3.id, frankfurter.id).save();
        new IngredientProduct(just_sauce3.id, ham.id).save();
        new IngredientProduct(just_sauce3.id, bacon.id).save();
        new IngredientProduct(just_sauce3.id, chicken_breasts.id).save();
        new IngredientProduct(just_sauce3.id, cheddar.id).save();
        new IngredientProduct(just_sauce3.id, sesame.id).save();


        //Machine for Pigs: Szechuan sauce, Cheddar cheese, Mozarella, Salami, Bacon, Sausage, Beef ribs, Pariser
        new IngredientProduct(machine_for_pigs1.id, szechuan_sauce.id).save();
        new IngredientProduct(machine_for_pigs1.id, cheddar.id).save();
        new IngredientProduct(machine_for_pigs1.id, mozzarella.id).save();
        new IngredientProduct(machine_for_pigs1.id, salami.id).save();
        new IngredientProduct(machine_for_pigs1.id, bacon.id).save();
        new IngredientProduct(machine_for_pigs1.id, sausage.id).save();
        new IngredientProduct(machine_for_pigs1.id, beef_ribs.id).save();
        new IngredientProduct(machine_for_pigs1.id, pariser.id).save();
        new IngredientProduct(machine_for_pigs2.id, szechuan_sauce.id).save();
        new IngredientProduct(machine_for_pigs2.id, cheddar.id).save();
        new IngredientProduct(machine_for_pigs2.id, mozzarella.id).save();
        new IngredientProduct(machine_for_pigs2.id, salami.id).save();
        new IngredientProduct(machine_for_pigs2.id, bacon.id).save();
        new IngredientProduct(machine_for_pigs2.id, sausage.id).save();
        new IngredientProduct(machine_for_pigs2.id, beef_ribs.id).save();
        new IngredientProduct(machine_for_pigs2.id, pariser.id).save();
        new IngredientProduct(machine_for_pigs3.id, szechuan_sauce.id).save();
        new IngredientProduct(machine_for_pigs3.id, cheddar.id).save();
        new IngredientProduct(machine_for_pigs3.id, mozzarella.id).save();
        new IngredientProduct(machine_for_pigs3.id, salami.id).save();
        new IngredientProduct(machine_for_pigs3.id, bacon.id).save();
        new IngredientProduct(machine_for_pigs3.id, sausage.id).save();
        new IngredientProduct(machine_for_pigs3.id, beef_ribs.id).save();
        new IngredientProduct(machine_for_pigs3.id, pariser.id).save();

        //Margaret's pleasure: Pizza sauce, Mozarella, Tomato, Pepper
        new IngredientProduct(margeret1.id, pizza_sauce.id).save();
        new IngredientProduct(margeret1.id, mozzarella.id).save();
        new IngredientProduct(margeret1.id, tomato.id).save();
        new IngredientProduct(margeret1.id, pepper.id).save();
        new IngredientProduct(margeret2.id, pizza_sauce.id).save();
        new IngredientProduct(margeret2.id, mozzarella.id).save();
        new IngredientProduct(margeret2.id, tomato.id).save();
        new IngredientProduct(margeret2.id, pepper.id).save();
        new IngredientProduct(margeret3.id, pizza_sauce.id).save();
        new IngredientProduct(margeret3.id, mozzarella.id).save();
        new IngredientProduct(margeret3.id, tomato.id).save();
        new IngredientProduct(margeret3.id, pepper.id).save();

        //Pesto Squad: Pesto sauce, Blue cheese, Mozarella, Mushroom, Ham
        new IngredientProduct(pesto_squad1.id, pesto.id).save();
        new IngredientProduct(pesto_squad1.id, blue_cheese.id).save();
        new IngredientProduct(pesto_squad1.id, mozzarella.id).save();
        new IngredientProduct(pesto_squad1.id, mushroom.id).save();
        new IngredientProduct(pesto_squad1.id, ham.id).save();
        new IngredientProduct(pesto_squad2.id, pesto.id).save();
        new IngredientProduct(pesto_squad2.id, blue_cheese.id).save();
        new IngredientProduct(pesto_squad2.id, mozzarella.id).save();
        new IngredientProduct(pesto_squad2.id, mushroom.id).save();
        new IngredientProduct(pesto_squad2.id, ham.id).save();
        new IngredientProduct(pesto_squad3.id, pesto.id).save();
        new IngredientProduct(pesto_squad3.id, blue_cheese.id).save();
        new IngredientProduct(pesto_squad3.id, mozzarella.id).save();
        new IngredientProduct(pesto_squad3.id, mushroom.id).save();
        new IngredientProduct(pesto_squad3.id, ham.id).save();

        //Rain Forest: Pesto sauce, Ruccola, Cucumber, Parmesan, Pariser
        new IngredientProduct(rainforest1.id, pesto.id).save();
        new IngredientProduct(rainforest1.id, ruccola.id).save();
        new IngredientProduct(rainforest1.id, cucumber.id).save();
        new IngredientProduct(rainforest1.id, parmesan.id).save();
        new IngredientProduct(rainforest1.id, pariser.id).save();
        new IngredientProduct(rainforest2.id, pesto.id).save();
        new IngredientProduct(rainforest2.id, ruccola.id).save();
        new IngredientProduct(rainforest2.id, cucumber.id).save();
        new IngredientProduct(rainforest2.id, parmesan.id).save();
        new IngredientProduct(rainforest2.id, pariser.id).save();
        new IngredientProduct(rainforest3.id, pesto.id).save();
        new IngredientProduct(rainforest3.id, ruccola.id).save();
        new IngredientProduct(rainforest3.id, cucumber.id).save();
        new IngredientProduct(rainforest3.id, parmesan.id).save();
        new IngredientProduct(rainforest3.id, pariser.id).save();

        //Scarlxrd's Wrath: Raw sauce, Sausage, Salami, Corn, Mozarella, Parmesan, Smoked cheese
        new IngredientProduct(scarlxrd1.id, raw_sauce.id).save();
        new IngredientProduct(scarlxrd1.id, sausage.id).save();
        new IngredientProduct(scarlxrd1.id, salami.id).save();
        new IngredientProduct(scarlxrd1.id, corn.id).save();
        new IngredientProduct(scarlxrd1.id, mozzarella.id).save();
        new IngredientProduct(scarlxrd1.id, parmesan.id).save();
        new IngredientProduct(scarlxrd1.id, smoked_cheese.id).save();
        new IngredientProduct(scarlxrd2.id, raw_sauce.id).save();
        new IngredientProduct(scarlxrd2.id, sausage.id).save();
        new IngredientProduct(scarlxrd2.id, salami.id).save();
        new IngredientProduct(scarlxrd2.id, corn.id).save();
        new IngredientProduct(scarlxrd2.id, mozzarella.id).save();
        new IngredientProduct(scarlxrd2.id, parmesan.id).save();
        new IngredientProduct(scarlxrd2.id, smoked_cheese.id).save();
        new IngredientProduct(scarlxrd3.id, raw_sauce.id).save();
        new IngredientProduct(scarlxrd3.id, sausage.id).save();
        new IngredientProduct(scarlxrd3.id, salami.id).save();
        new IngredientProduct(scarlxrd3.id, corn.id).save();
        new IngredientProduct(scarlxrd3.id, mozzarella.id).save();
        new IngredientProduct(scarlxrd3.id, parmesan.id).save();
        new IngredientProduct(scarlxrd3.id, smoked_cheese.id).save();

        //Szeged's Fate: Tartar sauce, Salami, Onion, Mozarella, Pepper
        new IngredientProduct(szegeds_fate1.id, tartar_sauce.id).save();
        new IngredientProduct(szegeds_fate1.id, salami.id).save();
        new IngredientProduct(szegeds_fate1.id, onions.id).save();
        new IngredientProduct(szegeds_fate1.id, mozzarella.id).save();
        new IngredientProduct(szegeds_fate1.id, pepper.id).save();
        new IngredientProduct(szegeds_fate2.id, tartar_sauce.id).save();
        new IngredientProduct(szegeds_fate2.id, salami.id).save();
        new IngredientProduct(szegeds_fate2.id, onions.id).save();
        new IngredientProduct(szegeds_fate2.id, mozzarella.id).save();
        new IngredientProduct(szegeds_fate2.id, pepper.id).save();
        new IngredientProduct(szegeds_fate3.id, tartar_sauce.id).save();
        new IngredientProduct(szegeds_fate3.id, salami.id).save();
        new IngredientProduct(szegeds_fate3.id, onions.id).save();
        new IngredientProduct(szegeds_fate3.id, mozzarella.id).save();
        new IngredientProduct(szegeds_fate3.id, pepper.id).save();

        //Borgore King: Salsa sauce, Cucumber, Tomato, Pepper, Ham, Bacon, Blue cheese, Cheddar sauce
        new IngredientProduct(borgore1.id, salsa.id).save();
        new IngredientProduct(borgore1.id, cucumber.id).save();
        new IngredientProduct(borgore1.id, tomato.id).save();
        new IngredientProduct(borgore1.id, pepper.id).save();
        new IngredientProduct(borgore1.id, ham.id).save();
        new IngredientProduct(borgore1.id, bacon.id).save();
        new IngredientProduct(borgore1.id, blue_cheese.id).save();
        new IngredientProduct(borgore1.id, cheddar_sauce.id).save();
        new IngredientProduct(borgore2.id, salsa.id).save();
        new IngredientProduct(borgore2.id, cucumber.id).save();
        new IngredientProduct(borgore2.id, tomato.id).save();
        new IngredientProduct(borgore2.id, pepper.id).save();
        new IngredientProduct(borgore2.id, ham.id).save();
        new IngredientProduct(borgore2.id, bacon.id).save();
        new IngredientProduct(borgore2.id, blue_cheese.id).save();
        new IngredientProduct(borgore2.id, cheddar_sauce.id).save();
        new IngredientProduct(borgore3.id, salsa.id).save();
        new IngredientProduct(borgore3.id, cucumber.id).save();
        new IngredientProduct(borgore3.id, tomato.id).save();
        new IngredientProduct(borgore3.id, pepper.id).save();
        new IngredientProduct(borgore3.id, ham.id).save();
        new IngredientProduct(borgore3.id, bacon.id).save();
        new IngredientProduct(borgore3.id, blue_cheese.id).save();
        new IngredientProduct(borgore3.id, cheddar_sauce.id).save();

        //Ysera's Dream: Mustard-honey sauce, Ham, Eggs, Bacon, Onion, Smoked cheese, Blue Cheese
        new IngredientProduct(ysera1.id, mustard_honey_sauce.id).save();
        new IngredientProduct(ysera1.id, ham.id).save();
        new IngredientProduct(ysera1.id, egg.id).save();
        new IngredientProduct(ysera1.id, bacon.id).save();
        new IngredientProduct(ysera1.id, onions.id).save();
        new IngredientProduct(ysera1.id, smoked_cheese.id).save();
        new IngredientProduct(ysera1.id, blue_cheese.id).save();
        new IngredientProduct(ysera2.id, mustard_honey_sauce.id).save();
        new IngredientProduct(ysera2.id, ham.id).save();
        new IngredientProduct(ysera2.id, egg.id).save();
        new IngredientProduct(ysera2.id, bacon.id).save();
        new IngredientProduct(ysera2.id, onions.id).save();
        new IngredientProduct(ysera2.id, smoked_cheese.id).save();
        new IngredientProduct(ysera2.id, blue_cheese.id).save();
        new IngredientProduct(ysera3.id, mustard_honey_sauce.id).save();
        new IngredientProduct(ysera3.id, ham.id).save();
        new IngredientProduct(ysera3.id, egg.id).save();
        new IngredientProduct(ysera3.id, bacon.id).save();
        new IngredientProduct(ysera3.id, onions.id).save();
        new IngredientProduct(ysera3.id, smoked_cheese.id).save();
        new IngredientProduct(ysera3.id, blue_cheese.id).save();

        //Erron Black: Chili sauce, Mozarella, Bean, Corn, Jalapeno, Eggs, Tomato, Bacon, Ham
        new IngredientProduct(erron_black1.id, chili_sauce.id).save();
        new IngredientProduct(erron_black1.id, mozzarella.id).save();
        new IngredientProduct(erron_black1.id, bean.id).save();
        new IngredientProduct(erron_black1.id, corn.id).save();
        new IngredientProduct(erron_black1.id, jalapeno.id).save();
        new IngredientProduct(erron_black1.id, egg.id).save();
        new IngredientProduct(erron_black1.id, tomato.id).save();
        new IngredientProduct(erron_black1.id, bacon.id).save();
        new IngredientProduct(erron_black1.id, ham.id).save();
        new IngredientProduct(erron_black2.id, chili_sauce.id).save();
        new IngredientProduct(erron_black2.id, mozzarella.id).save();
        new IngredientProduct(erron_black2.id, bean.id).save();
        new IngredientProduct(erron_black2.id, corn.id).save();
        new IngredientProduct(erron_black2.id, jalapeno.id).save();
        new IngredientProduct(erron_black2.id, egg.id).save();
        new IngredientProduct(erron_black2.id, tomato.id).save();
        new IngredientProduct(erron_black2.id, bacon.id).save();
        new IngredientProduct(erron_black2.id, ham.id).save();
        new IngredientProduct(erron_black3.id, chili_sauce.id).save();
        new IngredientProduct(erron_black3.id, mozzarella.id).save();
        new IngredientProduct(erron_black3.id, bean.id).save();
        new IngredientProduct(erron_black3.id, corn.id).save();
        new IngredientProduct(erron_black3.id, jalapeno.id).save();
        new IngredientProduct(erron_black3.id, egg.id).save();
        new IngredientProduct(erron_black3.id, tomato.id).save();
        new IngredientProduct(erron_black3.id, bacon.id).save();
        new IngredientProduct(erron_black3.id, ham.id).save();

        //Soy Boi: Tzaziki sauce, Cucumber, Pepper, Tomato, Almond, Sesame, Mushroom, Onion, Ruccola, Mozarella
        new IngredientProduct(soy_boi1.id, tzatiki_sauce.id).save();
        new IngredientProduct(soy_boi1.id, cucumber.id).save();
        new IngredientProduct(soy_boi1.id, pepper.id).save();
        new IngredientProduct(soy_boi1.id, tomato.id).save();
        new IngredientProduct(soy_boi1.id, almond.id).save();
        new IngredientProduct(soy_boi1.id, sesame.id).save();
        new IngredientProduct(soy_boi1.id, mushroom.id).save();
        new IngredientProduct(soy_boi1.id, onions.id).save();
        new IngredientProduct(soy_boi1.id, ruccola.id).save();
        new IngredientProduct(soy_boi1.id, mozzarella.id).save();
        new IngredientProduct(soy_boi2.id, tzatiki_sauce.id).save();
        new IngredientProduct(soy_boi2.id, cucumber.id).save();
        new IngredientProduct(soy_boi2.id, pepper.id).save();
        new IngredientProduct(soy_boi2.id, tomato.id).save();
        new IngredientProduct(soy_boi2.id, almond.id).save();
        new IngredientProduct(soy_boi2.id, sesame.id).save();
        new IngredientProduct(soy_boi2.id, mushroom.id).save();
        new IngredientProduct(soy_boi2.id, onions.id).save();
        new IngredientProduct(soy_boi2.id, ruccola.id).save();
        new IngredientProduct(soy_boi2.id, mozzarella.id).save();
        new IngredientProduct(soy_boi3.id, tzatiki_sauce.id).save();
        new IngredientProduct(soy_boi3.id, cucumber.id).save();
        new IngredientProduct(soy_boi3.id, pepper.id).save();
        new IngredientProduct(soy_boi3.id, tomato.id).save();
        new IngredientProduct(soy_boi3.id, almond.id).save();
        new IngredientProduct(soy_boi3.id, sesame.id).save();
        new IngredientProduct(soy_boi3.id, mushroom.id).save();
        new IngredientProduct(soy_boi3.id, onions.id).save();
        new IngredientProduct(soy_boi3.id, ruccola.id).save();
        new IngredientProduct(soy_boi3.id, mozzarella.id).save();

        //The Bliss: Cheddar sauce, Cheddar cheese, Parmesan, Eggs, Onion, Chicken breasts, Beef ribs, leeks
        new IngredientProduct(bliss1.id, cheddar_sauce.id).save();
        new IngredientProduct(bliss1.id, cheddar.id).save();
        new IngredientProduct(bliss1.id, parmesan.id).save();
        new IngredientProduct(bliss1.id, egg.id).save();
        new IngredientProduct(bliss1.id, onions.id).save();
        new IngredientProduct(bliss1.id, chicken_breasts.id).save();
        new IngredientProduct(bliss1.id, beef_ribs.id).save();
        new IngredientProduct(bliss1.id, leeks.id).save();
        new IngredientProduct(bliss2.id, cheddar_sauce.id).save();
        new IngredientProduct(bliss2.id, cheddar.id).save();
        new IngredientProduct(bliss2.id, parmesan.id).save();
        new IngredientProduct(bliss2.id, egg.id).save();
        new IngredientProduct(bliss2.id, onions.id).save();
        new IngredientProduct(bliss2.id, chicken_breasts.id).save();
        new IngredientProduct(bliss2.id, beef_ribs.id).save();
        new IngredientProduct(bliss2.id, leeks.id).save();
        new IngredientProduct(bliss3.id, cheddar_sauce.id).save();
        new IngredientProduct(bliss3.id, cheddar.id).save();
        new IngredientProduct(bliss3.id, parmesan.id).save();
        new IngredientProduct(bliss3.id, egg.id).save();
        new IngredientProduct(bliss3.id, onions.id).save();
        new IngredientProduct(bliss3.id, chicken_breasts.id).save();
        new IngredientProduct(bliss3.id, beef_ribs.id).save();
        new IngredientProduct(bliss3.id, leeks.id).save();

        //VGOD: Nutella, Banana
        new IngredientProduct(vgod1.id, nutella.id).save();
        new IngredientProduct(vgod1.id, banana.id).save();
        new IngredientProduct(vgod2.id, nutella.id).save();
        new IngredientProduct(vgod2.id, banana.id).save();
        new IngredientProduct(vgod3.id, nutella.id).save();
        new IngredientProduct(vgod3.id, banana.id).save();




    }


    private void LoadSomeItals() {


        if (Product.find.query().where().ilike("typeP", "refreshing").findList().size() >= 5){
            return;
        }
        if (Product.find.query().where().ilike("typeP", "monster").findList().size() >= 5){
            return;
        }
        if (Product.find.query().where().ilike("typeP", "beer").findList().size() >= 5){
            return;
        }
    	System.out.println("Loading some itals");

        new Product("7up", "images/Item/Drink/7up.png", "refreshing", 299, "lemon-lime-flavored non-caffeinated soft drink").save();
        new Product("Lipton Peach", "images/Item/Drink/LiptonB.png", "refreshing", 299, "non-carbonated peach flavored ice tea").save();
        new Product("Lipton Lemon", "images/Item/Drink/LiptonC.png", "refreshing", 299, "non-carbonated lemon flavored ice tea").save();
        new Product("Lipton Green", "images/Item/Drink/LiptonZ.png", "refreshing", 299, "non-carbonated green ice tea").save();
        new Product("Dr.Pepper", "images/Item/Drink/Pepper.png", "refreshing", 299, "carbonated soft drink with a unique flavor").save();
        new Product("Pepsi", "images/Item/Drink/Pepsi.png", "refreshing", 299, "carbonated cola flavored soft drink").save();
        new Product("Pepsi Cherry", "images/Item/Drink/PepsiC.png", "refreshing", 299, "carbonated cola and cherry flavored soft drink").save();
        new Product("Pepsi Lime", "images/Item/Drink/PepsiL.png", "refreshing", 299, "carbonated cola and lime flavored soft drink").save();
        new Product("Pepsi Max", "images/Item/Drink/PepsiM.png", "refreshing", 299, "carbonated cola flavored soft drink with no sugar").save();
        new Product("Schweppes Citrus", "images/Item/Drink/SchweppesC.png", "refreshing", 299, "carbonated citrus flavored lemonade").save();
        new Product("Schweppes Orange", "images/Item/Drink/SchweppesN.png", "refreshing", 299, "carbonated orange flavored lemonade").save();
        new Product("Schweppes Grape", "images/Item/Drink/SchweppesS.png", "refreshing", 299, "carbonated grape flavored ginger ale").save();
        new Product("Sparkling Water", "images/Item/Drink/Water.png", "refreshing", 199, "carbonated water").save();
        new Product("Spring Water", "images/Item/Drink/WaterM.png", "refreshing", 199, "non-carbonated water").save();
        


        new Product("Assault", "images/Item/Drink/assault.png", "monster", 399, "a cola flavored camo energy beast").save();
        new Product("Absolutely Zero", "images/Item/Drink/Absolutezero.png", "monster", 399, "zero calories, zero sugar, monster buzz").save();
        new Product("Lewis Hamilton", "images/Item/Drink/lewis.png", "monster", 399, "life moves at 15,000 RPM and 200 MPH").save();
        new Product("Khaos", "images/Item/Drink/khaos.png", "monster", 399, "a killer combo of fruit juices").save();
        new Product("Lo-carb", "images/Item/Drink/locarb.png", "monster", 399, "a fraction of the calories and carbohydrates").save();
        new Product("Mango Loco", "images/Item/Drink/loco.png", "monster", 399, "heavenly blend of exotic juices ").save();
        new Product("Original", "images/Item/Drink/Monster.png", "monster", 399, "the original beast energy drink").save();
        new Product("The Doctor", "images/Item/Drink/thedoctor.png", "monster", 399, "unique and bold with its own personality, like Mr Valentino himself").save();
        new Product("Ultra Blue", "images/Item/Drink/ultrablue.png", "monster", 399, "zero calories and a full-load of our Monster energy").save();
        new Product("Ultra Violet", "images/Item/Drink/ultralila.png", "monster", 399, "sweet and tart pixie dust flavor").save();
        new Product("Ultra Black", "images/Item/Drink/ultrablack.png", "monster", 399, "crisp, slightly sweet and for a limited time only").save();
        new Product("Ultra Citron", "images/Item/Drink/ultrayellow.png", "monster", 399, "modern citrus flavor with a classic taste").save();
        new Product("Unleaded", "images/Item/Drink/unleaded.png", "monster", 399, "unleash the caffeine free beast").save();
        new Product("Zero Ultra", "images/Item/Drink/zeroultra.png", "monster", 399, "a little less sweet, lighter-tasting, zero calories").save();
        new Product("Pipeline Punch", "images/Item/Drink/fruitpunch.png", "monster", 399, "Hawaii has to offer passion fruit, orange and guava").save();
        new Product("Pacific Punch", "images/Item/Drink/juice.png", "monster", 399, "Pacific Punch your adventure awaits arrgh").save();
        
        
        //Beer price: 499
        new Product("O-Gold", "images/Item/Drink/bszaarany.png", "beer", 499, "In the twentieth century, more lager types conquered the brewery, but only the Viennese aces came to Mexico").save();
        new Product("Black Rose", "images/Item/Drink/bszarose.png", "beer", 499, "Unspecified duplavors, full bodied and richly distorted, yet with soft and velvety flavors, coffee and caramels").save();
        new Product("Raspberry Wheat", "images/Item/Drink/bszamalna.png", "beer", 499, "the unfiltered mackerel matured on a raspberry bed ends in a pale pink foam").save();
        new Product("Sourcherry Beer", "images/Item/Drink/bszameggyes.png", "beer", 499, "made from genuine fruit, the fruity tasty flavor meets harmoniously with sweet maltose notes").save();
        new Product("Rabbit", "images/Item/Drink/bszanyul.png", "beer", 499, "real Red IPA beer, which is perhaps the most profitable domestic expert in spices").save();
        new Product("Ogre", "images/Item/Drink/bszaogre.png", "beer", 499, "a remarkably hoped-in Pilz beer experience with a strong alcohol content and exciting aroma").save();
        new Product("Hungarian Wanderer", "images/Item/Drink/bszavandor.png", "beer", 499, "special lager ale hybrid: made with two types of yeast, four hops and three types of malt").save();
        new Product("Grape Beer", "images/Item/Drink/bszaszolo.png", "beer", 499, "so it was made out of three vases of grapes with an exciting honey").save();
        new Product("Plum Beer", "images/Item/Drink/bszaszilva.png", "beer", 499, "the plum characters smoothly mimic the harmoniously hoped beer's flavor").save();
        new Product("Outlaw King", "images/Item/Drink/bszabetyar.png", "beer", 499, "The four types of fruits - sour cherry, plum, blackcurrant, blueberries - have a strong taste for the first tasting").save();
        new Product("Tears of St. Andrew", "images/Item/Drink/bszakonny.png", "beer", 499, "blue cranberry twigs, which is released from the bottle with a terribly intense blueberries").save();
        new Product("Dark Black", "images/Item/Drink/bszafekete.png", "beer", 499, "The taste of traditional balsam is defined by maltose notes").save();

        new Product("Day Treasure", "images/Item/Drink/csiki.png", "beer", 499, "In our Bavarian style, the intimate mood of post-harvest life and typical freshness").save();
        new Product("Blueberry Iced Beer", "images/Item/Drink/bszanapkincs.png", "beer", 499, "great beer with cranberry juice added by the special colors this reflects.").save();
    }

    private void LoadSomeExtras() {

        if (Product.find.query().where().ilike("typeP", "streetfood").findList().size() >= 5){
            return;
        }
        if (Product.find.query().where().ilike("typeP", "salad").findList().size() >= 5){
            return;
        }
    	System.out.println("Loading some extras");
		//streetfood
		new Product("Bacon Burger", "images/Item/Extra/Streetfood/BaconBurger.png", "streetfood", 1290, "100% beef cake, bacon, home made red onion, blue cheese, homemade BBQ sauce").save();
		new Product("Cheese Burger", "images/Item/Extra/Streetfood/CheeseBurger.png", "streetfood", 1290, "100% beef cake, grilled onion, cheese sauce, homemade mustard-honey sauce, fried parmesan").save();
		new Product("Chicken Burger", "images/Item/Extra/Streetfood/ChickenBurger.png", "streetfood", 1290, " 100% beef cake, grilled chicken slices, grilled onion, cheddar cheese, homemade Szechuan sauce").save();
		new Product("Papa's Burying Burrito", "images/Item/Extra/Streetfood/Burrito.png", "streetfood", 590, "wheat bran wraps with garlic, spicy beef, tomato, pickled cucumber and salad").save();
		new Product("Papa's Taken Taco", "images/Item/Extra/Streetfood/Taco.jpg", "streetfood", 590, "cornflour tortilla, chili beans, minced chicken meat, corn, guacamole, pepper, salad").save();
		new Product("Papa's Glorious Gyros", "images/Item/Extra/Streetfood/gyros.png", "streetfood", 690, "gyros meat, cucumber, tomato, onion, feta cheese, salad, tzatziki sauce").save();
		new Product("Papa's Hot Doge", "images/Item/Extra/Streetfood/hotdog.jpg", "streetfood", 690, "roasted crescent, bacon cubes, melted mozarella, ketchup, mayonnaise, mustard, grilled onion").save();
	
		//sandwich
		new Product("Cheese Sandwich", "images/Item/Extra/Szendvics/CheeseSzednvics.png", "sandwich", 1290, "dashed juicy beef meat and cheddar cream cheese sauce").save();
		new Product("Pork Sandwich", "images/Item/Extra/Szendvics/PorkSzendvics.png", "sandwich", 1290, "red onion jam with dashed juicy pork meat").save();
		new Product("Parma ham Sandwich", "images/Item/Extra/Szendvics/HamSzendvics.png", "sandwich", 1290, "parma ham, pillow case, mozzarella, dried tomatoes, arugula").save();
		new Product("Schnitzel Sandwich", "images/Item/Extra/Szendvics/SchnitzeSzendvics.png", "sandwich", 1290, "fried chicken breast, fillet, home-made mayonnaise monkey, vegetables").save();
		new Product("Sausage Sandwich", "images/Item/Extra/Szendvics/Sausage Sandwich.png", "sandwich", 1290, "spicy butter, homemade, sausage, boiled egg cartilage, pepper, tomato").save();
	
		//pasta
		new Product("Cottage Cheese", "images/Item/Extra/Pasta/cottage cheese.png", "pasta", 990, "cottage cheese with greaves").save();
		new Product("Four Cheesed", "images/Item/Extra/Pasta/Cheese.png", "pasta", 990, "creamy base, mozarella, beef, smoked cheese, Parmesan cheese").save();
		new Product("Amatricina Chicken", "images/Item/Extra/Pasta/Chicken.png", "pasta", 990, "creamy tomato sauce, chicken breast, penne pasta, parmesan, olive oil").save();
		new Product("Bolognai", "images/Item/Extra/Pasta/Bolognai.png", "pasta", 990, "minced pork meat Bolognese sauce, grated cheese, spaghetti pasta").save();
		new Product("Carbonara", "images/Item/Extra/Pasta/Ham.png", "pasta", 990, "creamy carbonara base, bacon, parmesan cheese, butterfly noodles").save();
		new Product("Pesto", "images/Item/Extra/Pasta/Pesto.png", "pasta", 990, "chicken breast, mushroom, garlic, spices, pesto, cream, butterfly pasta").save();
		new Product("Ramen", "images/Item/Extra/Pasta/Ramen.png", "pasta", 990, "the true original japanese beauty ").save();
	
		//salad
		new Product("Caesar Salad", "images/Item/Extra/Sali/CézárSali.png", "salad", 990, "salad mix, handcut, tomato, cheese, cucumber, garlic kruton, chicken breast").save();
		new Product("Greek Salad", "images/Item/Extra/Sali/GörögSali.png", "salad", 990, "cucumber, tomato, red onion, green olives, black olives, feta cheese").save();
		new Product("Gorilla Salad", "images/Item/Extra/Sali/GorillaSali.png", "salad", 990, "salad mix, pickle, tomato, cheese, cucumber, feta cheese, bacon, chicken breast strips, maize").save();
		new Product("Tuna Salad", "images/Item/Extra/Sali/TunaSali.png", "salad", 990, "salad base, tuna, maize, olives, thousands of sauces").save();
		new Product("Gyros Salad", "images/Item/Extra/Sali/GyrosSali.png", "salad", 990, "salad base, gyros meat, cucumber, tomato, red onion, feta cheese, tzatziki dressing").save();
		new Product("Pestos Salad", "images/Item/Extra/Sali/PestosSali.png", "salad", 990, "ice lettuce, chicken breast, tomato, pesto, mozarella balls, olive oil").save();
		new Product("Vitamin Salad", "images/Item/Extra/Sali/VitaminSali.png", "salad", 990, "ice lettuce, orange, chicken breast, carrot, mullet, curd, yoghurt sauce").save();
	
		//sidedish
		new Product("Stewed Vegetable", "images/Item/Extra/Köretek/stewed vegetable.png", "sidedish", 490, "cauliflower, carrots, broccoli").save();
		new Product("Sweet Potatoes", "images/Item/Extra/Köretek/Sweetpotato.png", "sidedish", 690, "Roasted sweet potatoes with a lot of flavor").save();
		new Product("Chips Potatoes", "images/Item/Extra/Köretek/Chips.png", "sidedish", 390, "dollar chips of fried potatoes").save();
		new Product("Rice", "images/Item/Extra/Köretek/Rice.png", "sidedish", 390, "steamed rice with pepper and salt").save();
		new Product("Croquettes", "images/Item/Extra/Köretek/croquette.png", "sidedish", 490, "baked potato croquettes").save();
		new Product("Frenchfries", "images/Item/Extra/Köretek/Frenchfries.png", "sidedish", 390, "cajun spiced crunchy fried potatoes").save();
	
		//dessert
		new Product("Dumplings", "images/Item/Extra/Desszert/dumplings.png", "dessert", 590, "classic Somalo dumpling").save();
		new Product("Pancake", "images/Item/Extra/Desszert/Pancake.png", "dessert", 190, "Homemade cranberry nutella pancake").save();
		new Product("Chestnut Puree", "images/Item/Extra/Desszert/chestnut puree.png", "dessert", 490, "classic chestnut puree").save();
		new Product("Cottage Cheese Rolls", "images/Item/Extra/Desszert/cottage cheese roll.png", "dessert", 590, "almond coat dessert with cottage cheese").save();
		new Product("Chocholate Rolls", "images/Item/Extra/Desszert/Chocolateroll.png", "dessert", 490, "fried pancake stuffed with chocolate").save();
		new Product("Tiramisu", "images/Item/Extra/Desszert/Tiramisu.png", "dessert", 390, "italian dessert based on original recipe").save();
		new Product("Choco Muffins", "images/Item/Extra/Desszert/ChocoMuffin.jpg", "dessert", 390, "triple chocholate wonder").save();
		new Product("Vanilla Muffins", "images/Item/Extra/Desszert/Muffin.png", "dessert", 390, "classic muffin stuffed with vanilla").save();
		new Product("Apple Rolls", "images/Item/Extra/Desszert/Appleroll.png", "dessert", 490, "fried pancake stuffed with cinnamon and apple").save();
	
		//sauce
		new Product("BBQ", "images/Item/Extra/Szószok/BBQ.png", "sauce", 290, "vinegar, tomato paste with liquid smoke, onion powder, mustard, black pepper and sugar").save();
		new Product("Cheddar", "images/Item/Extra/Szószok/Cheddar.png", "sauce", 290, "cheddar cheese to white sauce spiced with English mustard, Worcestershire sauce and pepper").save();
		new Product("Chili", "images/Item/Extra/Szószok/Chili.png", "sauce", 290, "cheddar cheese to white sauce spiced with English mustard, Worcestershire sauce and pepper").save();
		new Product("Garlic", "images/Item/Extra/Szószok/Garlic.png", "sauce", 290, "olive oil, garlic, salt, pepper, red paprika powder").save();
		new Product("Mustard-honey", "images/Item/Extra/Szószok/Mustardhoney.png", "sauce", 290, "yellow mustard, honey, wine vinegar, mayonnaise, red paprika powder").save();
		new Product("Pesto", "images/Item/Extra/Szószok/Pesto.png", "sauce", 290, "garlic, pine nuts, coarse salt, basil leaves and pecorino sardo, all blended with olive oil").save();
		new Product("Pizzacream", "images/Item/Extra/Szószok/Pizzasauce.jpg", "sauce", 290, "tomato paste, olive oil, garlic, oregano, basil, black pepper, salt, anise").save();
		new Product("Raw", "images/Item/Extra/Szószok/Raw.png", "sauce", 290, "a secret list of ingredients but obviously don't contain ketchup just sauce, raw sauce").save();
		new Product("Salsa", "images/Item/Extra/Szószok/Salsa.png", "sauce", 290, "a spicy sauce of chopped, vegetables and fruit, used as a condiment").save();
		new Product("Szechuan", "images/Item/Extra/Szószok/Szechuan.png", "sauce", 290, "soy, maple syrup, chili garlic, cornstrach, rice vinegar, pepper, ginger").save();
		new Product("Tartar", "images/Item/Extra/Szószok/Tartar.png", "sauce", 290, "mayonaisse, egg yolk, mustard, oil, sour cream, pepper, salt, sugar").save();
		new Product("Tzaziki", "images/Item/Extra/Szószok/Tzaziki.png", "sauce", 290, "salted strained yogurt, cucumber, garlic, olive oil, vinegar, lemon juice, parsley, herb spices").save();

    }
}
