package models;

import FormClasses.CouponHelper;
import io.ebean.Finder;
import io.ebean.Model;
import play.data.validation.Constraints;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * Kupon-User(KuponID, UserID)
 */

@Entity
public class CouponUser extends Model {


    @Id
    @Constraints.Required
    public int id;

    @Constraints.Required
    public int couponId;

    //@Id
    @Constraints.Required
    public String userId;

    public static Finder<String, CouponUser> find = new Finder<>(CouponUser.class);

    public CouponUser(int couponId, String userId) {
        this.couponId = couponId;
        this.userId = userId;
    }

    public static List<CouponHelper> getCouponsByUser(User user){

        HashMap<Integer, Integer> coupons = new HashMap<>();

        for (Coupon cp: Coupon.find.all()){
            coupons.put(cp.id, 0);
        }

        for (CouponUser copUs: find.query().where().ilike("userId", user.email).findList()){
            coupons.put(copUs.couponId, coupons.get(copUs.couponId)+1);
        }
        List<CouponHelper> cpHelper = new LinkedList<>();

        for (Map.Entry<Integer, Integer> entry : coupons.entrySet()) {
            Integer key = entry.getKey();
            Integer value = entry.getValue();
            Coupon cp = Coupon.find.query().where().ilike("id", Integer.toString(key)).findOne();

            if(cp.id > 0 && cp.id < 6) cpHelper.add(new CouponHelper(value, user.email, cp.imageGot,  cp.imageNone, cp.discount, cp.description));
        }
        return cpHelper;

    }

}
