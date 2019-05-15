package models;

import io.ebean.Finder;
import io.ebean.Model;
import play.data.validation.Constraints;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * Alapanyag-Termék(TermékID, AlapanyagID, mennyiség)
 */

@Entity
public class IngredientProduct extends Model {


    @Id
    public int id;

    @Constraints.Required
    public int ProductId;

    @Constraints.Required
    public int IngredientId;

    @ManyToOne()
    public Product product;

    public IngredientProduct(int productId, int ingredientId) {
        this.ProductId = productId;
        this.IngredientId = ingredientId;
    }

    public static Finder<String, IngredientProduct> find = new Finder<>(IngredientProduct.class);


}
