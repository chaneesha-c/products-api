package uk.ac.westminster.products_api;

public class PhysicalProduct extends Product{

    private double weightKg;
    private String  dimensions;

public PhysicalProduct(){
}

public PhysicalProduct(long id, String name, double price, double weightKg, String dimentions){
    super(id, name, price);

    this.weightKg = weightKg;
    this.dimensions = dimentions;

}

    public PhysicalProduct(Object id, String name, double price, double weightKg) {
    }

    public double getWeightKg(){
    return weightKg;
}

public String getDimensions(){
    return dimensions;
}
}
