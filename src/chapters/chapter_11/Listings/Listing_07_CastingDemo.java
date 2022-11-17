package chapters.chapter_11.Listings;

public class Listing_07_CastingDemo {

    /** Main method */
    public static void main(String[] args) {
// Create and initialize two objects
        Object object1 = new Listing_02_CircleFromSimpleGeometricObject(1);
        Object object2 = new Listing_03_RectangleFromSimpleGeometricObject(1, 1);
// Display circle and rectangle
        displayObject(object1);
        displayObject(object2);
    }
    /** A method for displaying an object */
    public static void displayObject(Object object) {

        if (object instanceof Listing_02_CircleFromSimpleGeometricObject) {

            System.out.println("The circle area is " + ((Listing_02_CircleFromSimpleGeometricObject)object).getArea());
            System.out.println("The circle diameter is " + ((Listing_02_CircleFromSimpleGeometricObject)object).getDiameter());
        }
        else if (object instanceof Listing_03_RectangleFromSimpleGeometricObject) {

            System.out.println("The rectangle area is " + ((Listing_03_RectangleFromSimpleGeometricObject)object).getArea());
        }
    }
}
