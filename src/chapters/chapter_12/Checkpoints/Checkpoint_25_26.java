package chapters.chapter_12.Checkpoints;

import chapters.chapter_11.Checkpoints.Checkpoint_29_A.Circle;
import chapters.chapter_12.Listings.Listing_12_07_CircleWithException;

public class Checkpoint_25_26 {

    /*by extending Exception class or its subclass*/



 /*   public static void main(String[] args) {
        try {
            method();
            System.out.println("After the method call");
        }
        catch (RuntimeException ex) {
            System.out.println("RuntimeException in main");
        }
        catch (Exception ex) {
            System.out.println("Exception in main");
        }
    }
    static void method() throws Exception {
        try {
            Circle c1 = new Circle(1);
            c1.setRadius(-1);
            System.out.println(c1.getRadius());
        }
        catch (RuntimeException ex) {
            System.out.println("RuntimeException in method()");
        }
        catch (Exception ex) {
            System.out.println("Exception in method()");
            throw ex;
        }
    }
    Exception in method()
    Axception in main
  */
}
