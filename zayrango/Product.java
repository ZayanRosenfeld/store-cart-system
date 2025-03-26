package zayrango;
//here we actually add new stuff, "int" for amount of things and "double" for price, yet overall, same class as others  
public class Product {
    private String code;
    private String name;
    private int quantity;
    private double price;

    public Product(String code, String name, int quantity, double price) {
        this.code = code;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public String getCode() { return code; }
    public String getName() { return name; }
    public int getQuantity() { return quantity; }
    public double getPrice() { return price; }
}
