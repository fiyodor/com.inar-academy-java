package chapters.chapter_12.Listings;

public class Listing_12_08_TestCircleWithException {

    public static void main(String[] args) {
        try {
            Listing_12_07_CircleWithException c1 = new Listing_12_07_CircleWithException(5);
            Listing_12_07_CircleWithException c2 = new Listing_12_07_CircleWithException(-5);
            Listing_12_07_CircleWithException c3 = new Listing_12_07_CircleWithException(0);
        }
        catch (IllegalArgumentException ex) {
            System.out.println(ex);
        }
        System.out.println("Number of objects created: " +
                Listing_12_07_CircleWithException.getNumberOfObjects());
    }
}
