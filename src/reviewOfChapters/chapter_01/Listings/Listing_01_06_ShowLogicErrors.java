package reviewOfChapters.chapter_01.Listings;

public class Listing_01_06_ShowLogicErrors {
    public static void main(String[] args) {
        System.out.println("Celcius 35 is Fahrenheit degree ");
        System.out.println((9 / 5) * 35 + 32);
    }
}

/*
You will get Fahrenheit 67 degrees, which is wrong. It should be 95.0. In Java, the division
for integers is the quotient—the fractional part is truncated—so in Java 9 / 5 is 1. To
get the correct result, you need to use 9.0 / 5, which results in 1.8.
 */
