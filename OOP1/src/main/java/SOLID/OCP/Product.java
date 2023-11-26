package SOLID.OCP;

public class Product{
    private double price;
    private ProductType type;
    public Product(double price, ProductType type){
        this.price = price;
        this.type = type;
    }
    public double getPrice(){
        return price;
    }

    public ProductType getType() {
        return type;
    }
}