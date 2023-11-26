package SOLID.OCP;

public enum ProductType {
    LOCAL(0.1),
    IMPORTED(0.2),
    SANCTIONED(0.3),
    CONFISCATED(0.5);

    private final Double coefficient;
    ProductType(double coefficient) {
        this.coefficient = coefficient;
    }
    public Double getCoefficient(){
        return coefficient;
    }
}
