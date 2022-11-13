package weeks.week_14.Car;

public class Brand {

    private final int DIESEL = 1;
    private final int GASOLINE = 2;
    private final int HYBRID = 3;

   protected String brand;
   protected int wheels;
   protected int airbag;
   protected String color;
   protected int year;

   protected int fuel;

    public Brand() {

        this("Volkswagen", 4, 2, "Blue", 3);
    }

    public Brand(String brand, int wheels, int airbag, String color, int year) {
        this.brand = brand;
        this.wheels = wheels;
        this.airbag = airbag;
        this.color = color;
        this.year = year;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public int getAirbag() {
        return airbag;
    }

    public void setAirbag(int airbag) {
        this.airbag = airbag;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String toString(){

        return "Brand: " + getBrand() + "\nWheels: " + getWheels()  + "\nAirbag: " + getAirbag() + "\nColor: " + getColor() + "\nYear: " + getYear();
    }
}
