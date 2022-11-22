package chapters.chapter_12.Checkpoints;

public class Checkpoint_30_31_32_33_34_35_36_37 {

    /*
    30

    by using new PrintWriter(filename)
    *
    * because that statement may throw an exception
    * if close() method isnt invoked the data may not be saved*/

    //31
 /*   public static void main(String[] args) throws Exception {

        java.io.PrintWriter output = new java.io.PrintWriter("temp.txt");

        output.printf("amount is %f %e\r\n", 32.32, 32.32);
        output.printf("amount is %5.4f %5.4e\r\n", 32.32, 32.32);
        output.printf("%6b\r\n", (1 > 2));
        output.printf("%6s\r\n", "Java");
        output.close();
    }

      amount is 32.320000 3.232000e+01
      amount is 32.3200 3.2320e+01
        false
         Java
*/

  /*
    32

    public static void main(String[] args) throws Exception {

        try (java.io.PrintWriter output = new java.io.PrintWriter("tempp.txt");) {


            output.printf("amount is %f %e\r\n", 32.32, 32.32);
            output.printf("amount is %5.4f %5.4e\r\n", 32.32, 32.32);
            output.printf("%6b\r\n", (1 > 2));
            output.printf("%6s\r\n", "Java");
            //output.close();
        }
       amount is 32.320000 3.232000e+01
        amount is 32.3200 3.2320e+01
        false
        Java

    }

    33

    new Scanner(new File(filename))
    it may throw an excepiton
    it close() method isnt invoked, no problem will occur. it is good to close files

    34

    an exception will be thrown
    the contents of the file will be gone

    35

    line seperators may be different on different platforms
    line seperator for windows is \r\n

    36

    intValue = 45
    doubleValue = 57.8
    line = ' ','7', '8', '9'

    37

    intValue = 45
    doubleValue = 57.8
    line =  null
    */


}
