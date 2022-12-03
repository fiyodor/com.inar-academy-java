package chapters.chapter_13.Listings;

public class Listing_13_12_TestRationalClass {

    /** Main method */
    public static void main(String[] args) {

        // Create and initialize two rational numbers r1 and r2
        Listing_13_13_Rational r1 = new Listing_13_13_Rational(4, 2);
        Listing_13_13_Rational r2 = new Listing_13_13_Rational(2, 3);

        // Display results
        System.out.println(r1 + " + " + r2 + " = " + r1.add(r2));
        System.out.println(r1 + " - " + r2 + " = " + r1.subtract(r2));
        System.out.println(r1 + " * " + r2 + " = " + r1.multiply(r2));
        System.out.println(r1 + " / " + r2 + " = " + r1.divide(r2));
        System.out.println(r2 + " is " + r2.doubleValue());
    }
}
