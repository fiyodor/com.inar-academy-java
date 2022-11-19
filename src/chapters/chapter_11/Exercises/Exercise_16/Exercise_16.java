package chapters.chapter_11.Exercises.Exercise_16;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise_16 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        ArrayList<Integer> answers = new ArrayList<>();

        int number1 = (int)(Math.random() * 100);
        int number2 = (int)(Math.random() * 100);
        int answer;

        System.out.print("What is " + number1 + " + " + number2 + " ? ");

        answer = input.nextInt();

        while (number1 + number2 != answer){

            if(answers.contains(answer)){

                System.out.println("You already entered " + answer);

            }
            else {

                answers.add(answer);

            }
            System.out.println("Wrong answer.Try again.What is " + number1 + " +  " + number2 + " ? ");

            answer = input.nextInt();
        }
        System.out.println("You got it!");


    }


}
