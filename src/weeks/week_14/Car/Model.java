package weeks.week_14.Car;

public final class Model extends Brand {

    private String model;
    private double engine;
    private double price;

    public Model(){

        this("Polo", 2.0, 750_000);
    }

    public Model(String model, double engine, double price) {
        this.model = model;
        this.engine = engine;
        this.price = price;
    }

    public Model(String brand, int wheels, int airbag, String color, int year, String model, double engine, double price) {
        super(brand, wheels, airbag, color, year);
        this.model = model;
        this.engine = engine;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getEngine() {
        return engine;
    }

    public void setEngine(double engine) {
        this.engine = engine;
    }

    final double getTax(double price){

        return price * engine * year / 1000;
    }

    @Override
    public String toString(){

        return "Brand: " + getBrand() + "\nWheels: " + getWheels()  + "\nAirbag: " + getAirbag() + "\nColor: " + getColor() + "\nYear: " + getYear() + "\nModel: " + getModel() + "\nEngine:" + getEngine() + "\nTax: " + getTax(getPrice());
    }
}
