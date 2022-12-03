package chapters.chapter_13.Listings;

public class Listing_13_09_ComparableRectangle extends Listing_13_02_Rectangle implements Comparable<Listing_13_09_ComparableRectangle> {

    /** Construct a ComparableRectangle with specified properties */
    public Listing_13_09_ComparableRectangle(double width, double height) {
        super(width, height);
    }
    @Override // Implement the compareTo method defined in Comparable
    public int compareTo(Listing_13_09_ComparableRectangle o) {
        if (getArea() > o.getArea())
            return 1;
        else if (getArea() < o.getArea())
            return -1;
        else
            return 0;
    }
    @Override // Implement the toString method in GeometricObject
    public String toString() {
        return super.toString() + " Area: " + getArea();
    }
}
