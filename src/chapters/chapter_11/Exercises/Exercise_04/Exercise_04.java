package chapters.chapter_11.Exercises.Exercise_04;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise_04 {

    public static void main(String[] args) {

        ArrayList<Integer> list = getFromUser();

        Integer max = max(list);

        System.out.println("The maximum value in the ArrayList of integers is " + max);

    }

    public static Integer max(ArrayList<Integer> list){

        if(list == null || list.size() == 0){

            return null;
        }
        int max = list.get(0);

        for(int i = 0; i < list.size(); i++) {

            if(list.get(i) > max){

                max = list.get(i);
            }
        }
        return max;
    }

    public static ArrayList<Integer> getFromUser(){

        ArrayList<Integer> list = new ArrayList<>();

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a sequence of numbers ending with 0 : ");

        int number = input.nextInt();

        while (number != 0){

            list.add(number);

            number = input.nextInt();
        }
        return list;
    }
}
