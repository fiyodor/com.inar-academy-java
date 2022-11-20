package weeks.week_15.Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter 2 integers: ");

        int n1 = input.nextInt();
        int n2 = input.nextInt();

        try {
            System.out.printf("%d / %d = %d", n1, n2, (n1 / n2));
        }
        catch (Throwable e){

            System.out.println("Hata");


        }
    }                         
}
