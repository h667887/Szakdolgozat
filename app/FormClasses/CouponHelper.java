package FormClasses;

public class CouponHelper {

    public int quantity;

    public String userId;
    public String imageGot;
    public String imageNone;

    public float discount;
    public String description;


    public CouponHelper(int quantity, String userId, String imageGot, String imageNone, float discount, String description) {
        this.quantity = quantity;
        this.userId = userId;
        this.imageGot = imageGot;
        this.imageNone = imageNone;
        this.discount = discount;
        this.description = description;
    }
}
