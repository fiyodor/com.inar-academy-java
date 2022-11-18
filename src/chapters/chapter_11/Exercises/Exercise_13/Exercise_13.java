package chapters.chapter_11.Exercises.Exercise_13;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise_13 {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        Scanner input = new Scanner(System.in);

        final int NUMBER_OF_NUMBERS = 10;

        System.out.print("Enter " + NUMBER_OF_NUMBERS + " numbers: ");

        for(int i = 0; i < NUMBER_OF_NUMBERS; i++) {

            list.add(input.nextInt());
        }
        System.out.println(list);

        removeDuplicate(list);

        System.out.print("The distinct integers are " + list);
    }

    public static void removeDuplicate(ArrayList<Integer> list){

        ArrayList<Integer> duplicatesRemoved = new ArrayList<>();

        while (!list.isEmpty()){

            int number = list.remove(list.size() - list.size());

            if(!duplicatesRemoved.contains(number)){

                duplicatesRemoved.add(number);
            }
        }
        list.addAll(duplicatesRemoved);


    }


}
