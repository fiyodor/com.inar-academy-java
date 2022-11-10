package chapters.chapter_10.Exercise_05;

import java.util.Scanner;

public class Exercise_05 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");

        int number = input.nextInt();

        StackOfIntegers factors = getFactors(number);

        display(factors);

    }

    public static StackOfIntegers getFactors(int number){

        StackOfIntegers factors = new StackOfIntegers();

        int divisor = 2;

        while (number != 1){

            if(number % divisor == 0){

                factors.push(divisor);

                number /= divisor;
            }
            else {

                divisor++;
            }
        }
        return factors;
    }
    public static void display(StackOfIntegers factors){

        while (!factors.empty()){

            System.out.print(factors.pop() + " ");
        }
    }
}
