package reviewOfChapters.chapter_01.Listings;

public class Listing_01_05_ShowRuntimeErrors {
    public static void main(String[] args) {
        System.out.println(1 / 0);
    }
}

/*
Exception in thread "main" java.lang.ArithmeticException: / by zero
	at reviewOfChapters.chapter_01.Listings.Listing_01_05_ShowRuntimeErrors.main(Listing_01_05_ShowRuntimeErrors.java:5)
 */