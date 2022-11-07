package weeks.week_13;

public class Home {

    final static int SOUTH_WEST = 1;
    final static int SOUTH_EAST = 2;
    final static int NORTH_WEST = 3;
    final static int NORTH_EAST = 4;

    private double area;
    private int numberOfBathrooms;
    private int numberOfRooms;
    private boolean garage;
    private double salePrice;
    private double rentalPrice;
    private int facade;
    private int year;

    public Home(double area, int numberOfBathrooms, int numberOfRooms, boolean aGarage, double salePrice, double rentalPrice, int facade, int year) {

        this.area = area;
        this.numberOfBathrooms = numberOfBathrooms;
        this.numberOfRooms = numberOfRooms;
        this.garage = aGarage;
        this.salePrice = salePrice;
        this.rentalPrice = rentalPrice;
        this.facade = facade;
        this.year = year;
    }

    public Home(){

        this(100,1,2,false,500_000,1000,1,1);
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public int getNumberOfBathrooms() {
        return numberOfBathrooms;
    }

    public void setNumberOfBathrooms(int numberOfBathrooms) {
        this.numberOfBathrooms = numberOfBathrooms;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    public boolean isThereAGarage() {
        return garage;
    }

    public void setGarage(boolean garage) {
        this.garage = garage;
    }

    public double getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(double salePrice) {
        this.salePrice = salePrice;
    }

    public double getRentalPrice() {
        return rentalPrice;
    }

    public void setRentalPrice(double rentalPrice) {
        this.rentalPrice = rentalPrice;
    }

    public String getFacade() {

        String front = "";

        if(this.facade == 1){

            front = "SOUTH WEST";
        }
        else if(facade == 2) {

            front = "SOUTH EAST";

        } else if(facade == 3) {

            front = "NORTH WEST";

        }
        else {

            front = "NORTH EAST";
        }
        return front;
    }

    public void setFacade(int facade) {
        this.facade = facade;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getAnnualRentFee(){

        double annualFee = getRentalPrice() * 12;

        return annualFee;
    }

    public void renovation(){

        this.rentalPrice *= 0.2;
        this.salePrice *= 0.1;
    }
    public String toString(){

        String result = ("Area: " + getArea() +
                "\nNumber of bathrooms: " + getNumberOfBathrooms() +
                "\nNumber of rooms: " + getNumberOfRooms() +
                "\nHas a garage?: " + (isThereAGarage() ? "Yes" : "No") +
                "Fee: " + getSalePrice() +
                "\nRentFee: " + getRentalPrice() +
                "\nAnnual rent fee: " + getAnnualRentFee() +
                "\nFacade: " + getFacade() +
                "\nYear: " + getYear() +
                "\n------------------------------");

        return result;
    }
}
