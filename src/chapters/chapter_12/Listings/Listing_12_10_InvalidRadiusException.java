package chapters.chapter_12.Listings;

public class Listing_12_10_InvalidRadiusException extends Exception {

    private double radius;
    /** Construct an exception */
    public Listing_12_10_InvalidRadiusException(double radius) {
        super("Invalid radius " + radius);
        this.radius = radius;
    }
    /** Return the radius */
    public double getRadius() {
        return radius;
    }
}
