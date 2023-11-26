package SOLID.SRP;

// SRP - Single Responsibility Principe
// может быть лишь одна причина изменить класс
public class NdsCalculator {

    private final double nds;
    public NdsCalculator(double nds){
        this.nds = nds;
    }
    public double getPriceWithNds(Product product){
        double price = product.getPrice();
        return price + price * nds;
    }
}


