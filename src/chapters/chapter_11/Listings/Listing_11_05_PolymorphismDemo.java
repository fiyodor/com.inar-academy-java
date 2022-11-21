package chapters.chapter_11.Listings;

public class Listing_11_05_PolymorphismDemo {

    /* Main method */
    public static void main(String[] args) {

        // Display circle and rectangle properties
        displayObject(new Listing_11_02_CircleFromSimpleGeometricObject(1, "red", false));

        displayObject(new Listing_11_03_RectangleFromSimpleGeometricObject(1, 1, "black", true));
    }


    /* Display geometric objects properties */
    public static void displayObject(Listing_11_01_SimpleGeometricObject object) {

        System.out.println("Created on: " + object.getDateCreated() + ". Color: " + object.getColor());
    }
}

