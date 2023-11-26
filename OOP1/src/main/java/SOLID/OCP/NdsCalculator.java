package SOLID.OCP;

import java.util.Map;

public class NdsCalculator {
    public double getPriceWithNds(Product product){
        double price = product.getPrice();
        return price + price * product.getType().getCoefficient();
    }
}
