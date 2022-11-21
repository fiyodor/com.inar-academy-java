package chapters.chapter_11.Exercises.Exercise_06;

import chapters.chapter_10.Listings.Listing_02_Loan;
import chapters.chapter_11.Listings.Listing_11_02_CircleFromSimpleGeometricObject;

import java.util.ArrayList;
import java.util.Date;

public class Exercise_06 {

    public static void main(String[] args) {

        ArrayList<Object> list = new ArrayList<>();

        list.add(new Listing_02_Loan());
        list.add(new Date());
        list.add("DONMEZ Ertugrul");
        list.add(new Listing_11_02_CircleFromSimpleGeometricObject());

        System.out.println(list.toString());
    }

}
