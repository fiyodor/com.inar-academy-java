package chapters.chapter_12.Checkpoints;

public class Checkpoint_07_08 {

    /*7
    *
    * Throwable is the superclass of all the exception classes. Error and Exception are subclasses of it.
    * Error is for errors that isnt related to user. they are system errors.LinkageError, VirtualMachineError are subclasses of Error
    * Exceptions are errors that can be handled. RuntimeException, IOException , ClassNotFoundException are subclasses of Exception
    * ArithmeticException, NullPointerException, IndexOutOfBoundsException, IllegalArgumentException are subclasses of RuntimeException
    *
    *
    *
    *
    *
    * 8*/

    /*public static void main(String[] args) {            //AritmethicException
        System.out.println(1 / 0);
    }
     */

   /* public static void main(String[] args){             //ArrayIndexOutOfBoundsException
    int[] list = new int[5];
    System.out.println(list[5]);
    }

    */

   /* public static void main(String[] args) {            //StringIndexOutOfBoundsException
        String s = "abc";
        System.out.println(s.charAt(3));
    }

    */

  /*  public static void main(String[] args) {            //ClassCatException
        Object o = new Object();
        String d = (String)o;
    }

   */

  /*  public static void main(String[] args) {            //NullPointerException
        Object o = null;
        System.out.println(o.toString());
    }

    */

 /*   public static void main(String[] args) {            //no exception threw. yhe output is Infinity
        System.out.println(1.0 / 0);
    }

  */


}
