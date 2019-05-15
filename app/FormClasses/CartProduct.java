package FormClasses;

public class CartProduct {
    public int id;
    public String name;
    public String imagePath;
    public String typeP;
    public String description;
    public float price;
    public int quantity;
    public int size;

    public CartProduct(int id, String name, String imagePath, String typeP, String description, float price, int quantity, int size) {
        this.id = id;
        this.name = name;
        this.imagePath = imagePath;
        this.typeP = typeP;
        this.description = description;
        this.price = price;
        this.quantity = quantity;
        this.size = size;
    }
}
