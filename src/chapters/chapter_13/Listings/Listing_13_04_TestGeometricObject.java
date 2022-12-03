package chapters.chapter_13.Listings;

public class Listing_13_04_TestGeometricObject {

    /** Main method */
    public static void main(String[] args) {

        // Create two geometric objects
        Listing_13_01_GeometricObject geoObject1 = new Listing_13_02_Circle(5);
        Listing_13_01_GeometricObject geoObject2 = new Listing_13_02_Rectangle(5, 3);
        System.out.println("The two objects have the same area? " + equalArea(geoObject1, geoObject2));

        // Display circle
        displayGeometricObject(geoObject1);

        // Display rectangle
        displayGeometricObject(geoObject2);
    }
    /** A method for comparing the areas of two geometric objects */
    public static boolean equalArea(Listing_13_01_GeometricObject object1, Listing_13_01_GeometricObject object2) {
        return object1.getArea() == object2.getArea();
    }
    /** A method for displaying a geometric object */
    public static void displayGeometricObject(Listing_13_01_GeometricObject object) {
        System.out.println();
        System.out.println("The area is " + object.getArea());
        System.out.println("The perimeter is " + object.getPerimeter());
    }
}
