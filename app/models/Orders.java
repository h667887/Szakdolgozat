package models;

import io.ebean.Finder;
import io.ebean.Model;
import play.data.validation.Constraints;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.List;

/**
 * Rendelés(ID, termékID, mennyiség, megrendelve, dátum)
 */

@Entity
public class Orders extends Model {



    @Id
    @Constraints.Required
    public int id;

    @Constraints.Required
    public String user;

    @Constraints.Required
    public int productID;

    public String fullName;
    public String address;
    public String phoneNumber;
    public String email;



    public boolean isOrdered;
	
	public boolean isDelivered;

    public String date;

    public Orders(String user, int productID, String date) {
        this.user = user;
        this.productID = productID;
        this.isOrdered = false;
		this.isDelivered = false;
        this.date = date;

    }

    public static Finder<String, Orders> find = new Finder<>(Orders.class);

    public static List<Orders> getByUser(String user){
        return Orders.find.query().where().eq("user", user).findList();
    }

}
