package models;

import FormClasses.NewProduct;
import io.ebean.*;
import io.ebean.annotation.PrivateOwned;
import play.api.Mode;
import play.data.validation.Constraints;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.*;

/**
 * Termék(ID, képfájl, név, ár, típus, méret, szorzó, egyedi)
 */

@Entity
public class Product extends Model {


    @Id
    @Constraints.Required
    public int id;

    @Constraints.Required
    public String imagePath;

    public String notAvailImagePath;

    public String name;

    public float price;

    public String typeP;

    public int size;

    public float multiplier;

    public boolean uniqueP;
	
	public String description; 
	
	public int quantity;			

    @OneToMany(cascade = CascadeType.REMOVE)    
    public List<IngredientProduct> ingredients = new ArrayList<>();

    public static Finder<String, Product> find = new Finder<>(Product.class);

    public String getUniqueName(){

        return this.name+"_"+this.size;
    }
    
    
    //Pizza konstruktor
    public Product(String name, String imagePath, String notAvailImagePath, String typeP, float price, int size, float multiplier, boolean uniqueP, String description) {
        this.imagePath = imagePath;
        this.notAvailImagePath = notAvailImagePath;
        this.name = name;
        this.price = price;
        this.typeP = typeP;
        this.size = size;
        this.multiplier = multiplier;
        this.uniqueP = uniqueP;
		this.description = "";
		this.quantity = 0;
    }
    
  //Ital & Extras konstruktor
    public Product(String name, String imagePath, String typeP, int price, String description) { //int quantity
        this.imagePath = imagePath;
        this.name = name;
        this.typeP = typeP;
        this.price = price;
        this.description = description;
    }

	
    public Product(String name, String imagePath, String typeP) {
        this.imagePath = imagePath;
        this.name = name;
        this.typeP = typeP;
    }
	

    public Product(Product product) {
        this.id = product.id;
        this.imagePath = product.imagePath;
        this.name = product.name;
        this.price = product.price;
        this.typeP = product.typeP;
        this.size = product.size;
        this.multiplier = product.multiplier;
        this.uniqueP = product.uniqueP;
		this.description = product.description;
		this.quantity = product.quantity;
    }



    public static List<Product> getByNameWithType(String name, String typeP){

        return find.query().where().ilike("name", name).where().ilike("typeP", typeP).findList();
    }

    public static List<Product> getByType( String typeP){
        if (typeP == "extra"){
            
//            return find.query().where().not().ilike("typeP", "pizza").ilike("typeP", "drink").endNot().findList();
//            return find.query().where().ilike("typeP", "pizza").not().and().ilike("typeP", "drink").not().findList();
            String sql = "Select * from product where name not in (Select name from product where typeP = 'pizza' or typeP = 'drink')";
            RawSql rawSql = RawSqlBuilder.parse(sql).create();
//            return  find.query().setRawSql(rawSql).findList();

            List<Product> products = new ArrayList<>();
            for (Product product: find.all()){
                if (product.typeP.equals("pizza") || product.typeP.equals("drink")){
                    continue;
                }
                products.add(product);

            }
            return products;
            /*"pizza"->"Pizza",
            "drink"->"Drink",
            "extra"->"Extra",
            "ingredient"->"Ingredient",
            "dessert"->"Dessert",
            "sideDish"->"Side Dish",
            "salad"->"Salad",
            "pasta"->"Pasta",
            "streetFood"->"Street Food",
            "sandwich"->"Sandwich",
            "sauce"->"Sauce"*/
        }else{
            return find.query().where().ilike("typeP", typeP).findList();
        }


    }

    public static List<String> getNameOfProducts(List<Product> products){
        List<String> names = new ArrayList<>();

        for (Product product: products){
            names.add(product.name);
        }

        return names;

    }

    public static List<Product> getPizzas(){
        return Product.find.query().where().eq("typeP", "pizza").orderBy("name").orderBy("size").findList();
    }
    public static List<Product> getDrinks(){
        return Product.find.query().where().eq("typeP", "drink").findList();
    }
    public static List<Product> getExtras(){
        return Product.find.query().where().eq("typeP", "extra").findList();
    }


    public static List<Product> getExtrasKind(){
        List<Product> products = new ArrayList<>();
        for (Product product: find.all()){
            if (product.typeP.equals("pizza") || product.typeP.equals("drink")){
                continue;
            }
            products.add(product);

        }
        return products;
    }


    public static Map<String, String> getPizzaIdToName(){
        Map<String, String> pizzas = new HashMap<>();
         for(Product product: getPizzas()){
             pizzas.put(Integer.toString(product.id), product.name);
         }
         return pizzas;
    }

    public static List<String> getPizzaNames(){
        Set<String> names = new HashSet<>();

        for(Product product: getPizzas()){
            names.add(product.name);
        }

        return new ArrayList<>(names);

    }

    public static List<Product> generateFromNewProduct(NewProduct newProduct){
        List<Product> generated = new LinkedList<>();
       

        Product baseProduct = new Product(newProduct.name, newProduct.imagepath, newProduct.typeP);
        if (baseProduct.typeP.equals("pizza")){

            generated.add(setSmall(new Product(baseProduct), newProduct));
            generated.add(setMedium(new Product(baseProduct), newProduct));
            generated.add(setLarge(new Product(baseProduct), newProduct));

        }else {
            baseProduct.uniqueP = false;
            baseProduct.multiplier = 1f;
            if(newProduct.price == null) {
                baseProduct.price = 0;
            } else {
                baseProduct.price = newProduct.price;
            }
            baseProduct.size = 0;
            baseProduct.description = newProduct.description;
            generated.add(baseProduct);

        }
        return generated;
    }

    private static Product setSmall(Product product, NewProduct newProduct){
        product.size = 24;
        product.price = newProduct.price24;
        product.multiplier = 0.75f;
        product.uniqueP = false;
        return product;
    }

    private static Product setMedium(Product product, NewProduct newProduct){
        product.size = 32;
        product.price = newProduct.price32;
        product.multiplier = 1f;
        product.uniqueP = false;
        return product;
    }
    private static Product setLarge(Product product, NewProduct newProduct){
        product.size = 51;
        product.price = newProduct.price51;
        product.multiplier = 1.5f;
        product.uniqueP = false;
        return product;
    }


    public static List<Product> getByOrder(List<Orders> orders){
        List<Product> lista = new ArrayList<>();

        return lista;
    }

}
