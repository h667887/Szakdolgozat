package models;

import io.ebean.Finder;
import io.ebean.Model;
import play.data.validation.Constraints;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.Constraint;

/**
 *
 *
 *
 *
 */

@Entity
public class Coupon extends Model {

    @Id
    @Constraints.Required
    public int id;

    @Constraints.Required
    public float discount;

    public String imageGot;
    public String imageNone;


    public String description;

    public static Finder<String, Coupon> find = new Finder<>(Coupon.class);

    public Coupon(int id, float discount, String imageGot, String imageNone, String description) {
        this.id = id;
        this.discount = discount;
        this.imageGot = imageGot;
        this.imageNone = imageNone;
        this.description = description;
    }


    public Coupon(float discount, String imageGot, String imageNone, String description) {
        this.discount = discount;
        this.imageGot = imageGot;
        this.imageNone = imageNone;
        this.description = description;
    }
}
