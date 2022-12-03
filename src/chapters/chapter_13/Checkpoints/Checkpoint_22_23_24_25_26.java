package chapters.chapter_13.Checkpoints;

import java.util.ArrayList;

public class Checkpoint_22_23_24_25_26 {

    /*No we cant invoke clone() method
    * Yes Date clas implements Cloneable
    *
    * if House doesnt implement Cloneable CloneNotSupportedExcepiton will occur
    *
    * */
/*
        java.util.Date date = new java.util.Date();
        java.util.Date date1 = date;
        java.util.Date date2 = (java.util.Date)(date.clone());
        System.out.println(date == date1);                                          true    they are pointing the same reference
        System.out.println(date == date2);                                          false   they are different Date objects
        System.out.println(date.equals(date2));                                     true    date and date2 are equal
  */

    /*

        ArrayList<String> list = new ArrayList<>();
        list.add("New York");
        ArrayList<String> list1 = list;
        ArrayList<String> list2 = (ArrayList<String>)(list.clone());
        list.add("Atlanta");
        System.out.println(list == list1);                                      //true
        System.out.println(list == list2);                                      //false
        System.out.println("list is " + list);                                  // ny, Atlanta
        System.out.println("list1 is " + list1);                                // ny , atlanta
        System.out.println("list2.get(0) is " + list2.get(0));                  //ny
        System.out.println("list2.size() is " + list2.size());                  // 1
    */

    /*in Test class clone() method isnt overridden and Cloneable doesnt implemented*/
}
