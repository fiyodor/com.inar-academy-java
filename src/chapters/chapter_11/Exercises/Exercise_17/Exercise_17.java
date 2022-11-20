package chapters.chapter_11.Exercises.Exercise_17;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise_17 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer m: ");

        int m = input.nextInt();

        int n = findFactors(m);

        System.out.println("The smallest number n for m * n to be a perfect square is " + n);
        System.out.println("m * n is " + (m * n));
    }

    public static int findFactors(int m){

        ArrayList<Integer> factors = new ArrayList<>();

        int divisor = 2;

        while (m != 1){

            if(!isPrime(divisor)){

                divisor++;
            }
            else {

                if(m % divisor == 0){

                    factors.add(divisor);

                    m = m / divisor;
                }
                else{

                    divisor++;
                }
            }
        }
        return findN(factors);
    }

    public static boolean isPrime(int number){

        if(number == 2){

            return true;

        }
        else if(number % 2 == 0) {

            return false;
        }
        else {

            for(int i = 3; i < Math.sqrt(number); i += 2) {

                if(number % i == 0){

                    return false;
                }
            }
            return true;
        }
    }
    public static int findN(ArrayList<Integer> list){

        int counter = 0;

        ArrayList<Integer> odd = new ArrayList<>();

        for(int i = 0; i < list.size(); i++) {

            counter =0;

            for(int j = 0; j < list.size(); j++) {

                if(list.get(i).equals(list.get(j))){

                    counter++;
                }
            }
            if(counter % 2 == 1 && !odd.contains(list.get(i))){

                odd.add(list.get(i));
            }
        }
        int n = 1;

        for(int i = 0; i < odd.size(); i++) {

            n = n * odd.get(i);
        }
        return n;
    }
}
