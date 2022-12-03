package chapters.chapter_13.Checkpoints;

public class Checkpoint_04_05_06_07_08 {

    /*jvm tries to convert numberRef to a Double object. but numberRef is an instance of Integer
    *
    *bwcause numberArray[0] is an Integer. a casting error will occur
    *
    *  */

   /* public static void main(String[] args) {
        Number x = 3;
        System.out.println(x.intValue());           3
        System.out.println(x.doubleValue());        3.0
    }

    */
 /*  public static void main(String[] args) {
       Number x = new Integer(3);
       System.out.println(x.intValue());
       System.out.println(x.compareTo(new Integer(4)));    // x doesnt have conmpareTo method we have to cast x into Integer
   }*/
 /*  public static void main(String[] args) {
       Number x = new Integer(3);
       System.out.println(x.intValue());
       System.out.println((Integer)x.compareTo(new Integer(4))); // firstly x must be casted to Integer then compareTo method must be invoked ((Integer)x).compsreto
   }*/

}
