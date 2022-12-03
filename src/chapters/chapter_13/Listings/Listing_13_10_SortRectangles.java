package chapters.chapter_13.Listings;

public class Listing_13_10_SortRectangles {

    public static void main(String[] args) {
        Listing_13_09_ComparableRectangle[] rectangles = {
                new Listing_13_09_ComparableRectangle(3.4, 5.4),
                new Listing_13_09_ComparableRectangle(13.24, 55.4),
                new Listing_13_09_ComparableRectangle(7.4, 35.4),
                new Listing_13_09_ComparableRectangle(1.4, 25.4)};
        java.util.Arrays.sort(rectangles);
        for (Listing_13_02_Rectangle rectangle: rectangles) {
            System.out.print(rectangle + " ");
            System.out.println();
        }
    }

}
