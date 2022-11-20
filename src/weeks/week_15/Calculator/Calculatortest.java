package weeks.week_15.Calculator;

import java.util.Scanner;

public class Calculatortest {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.print("Please enter 2 values: ");


        Number n1 = new Number(input.nextInt());
        Number n2 = new Number(input.nextInt());

        System.out.print("Please enter the calculation: ");

        String cal = input.next();

        switch (cal){

            case("sum"): Calculator.print(Calculator.sum(n1, n2)); break;
            case("sub"): Calculator.print(Calculator.subtract(n1, n2)); break;
            case("mult"): Calculator.print(Calculator.multiply(n1, n2)); break;
            case("div"): Calculator.print(Calculator.divide(n1, n2)); break;
            case("mod"): Calculator.print(Calculator.divide(n1, n2)); break;
        }
    }
}