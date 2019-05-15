package models;

import FormClasses.NewProduct;
import io.ebean.Finder;
import io.ebean.Model;
import play.data.validation.Constraints;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.ArrayList;
import java.util.List;

/**
 * Alapanyag(ID, név, ár, mennyiség)
 */

@Entity
public class Ingredient extends Model {

    @Id
    @Constraints.Required
    public int id;

    @Constraints.Required
    public String name;


    @Constraints.Required
    public String imagePath;


    public float price;

    public int quantity;

    public static Finder<String, Ingredient> find = new Finder<>(Ingredient.class);

    public static List<Ingredient> getByName(String name){

        return find.query().where().ilike("nameC", name).findList();

    }
    public Ingredient(NewProduct newProduct){
        this.name = newProduct.name;
        this.imagePath = newProduct.imagepath;
        this.price = newProduct.price;
        this.quantity = 0;
    }

    public static List<String> getNames(){
        List<String> names = new ArrayList<>();
        for (Ingredient ingredient: find.all()){
            names.add(ingredient.name);
        }
        return names;
    }

    public static Ingredient productToIngredient(){
        return null;
    }

}
