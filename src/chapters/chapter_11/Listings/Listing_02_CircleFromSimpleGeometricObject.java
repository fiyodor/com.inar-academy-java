package chapters.chapter_11.Listings;

public class Listing_02_CircleFromSimpleGeometricObject extends Listing_01_SimpleGeometricObject {
    private double radius;

    public Listing_02_CircleFromSimpleGeometricObject() {

    }

    public  Listing_02_CircleFromSimpleGeometricObject(double radius) {

        this.radius = radius;
    }

    public  Listing_02_CircleFromSimpleGeometricObject(double radius, String color, boolean filled) {

        this.radius = radius;
        setColor(color);
        setFilled(filled);
    }
    /** Return radius */
    public double getRadius() {
        return radius;
    }
    /** Set a new radius */
    public void setRadius(double radius) {
        this.radius = radius;
    }
    /** Return area */
    public double getArea() {
        return radius * radius * Math.PI;
    }
    /** Return diameter */
    public double getDiameter() {
        return 2 * radius;
    }
    /** Return perimeter */
    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }
    /** Print the circle info */
    public void printCircle() {
        System.out.println("The circle is created " + getDateCreated() + " and the radius is " + radius);
    }
    // Override the toString method defined in the superclass
    public String toString() {
        return super.toString() + "\nradius is " + radius;
    }
}
