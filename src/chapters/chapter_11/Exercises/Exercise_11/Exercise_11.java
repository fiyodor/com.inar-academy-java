package chapters.chapter_11.Exercises.Exercise_11;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise_11 {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        Scanner input = new Scanner(System.in);

        final int NUMBER_OF_NUMBERS = 5;

        System.out.print("Enter " + NUMBER_OF_NUMBERS + " numbers: ");

        for(int i = 0; i < NUMBER_OF_NUMBERS; i++) {

            list.add(input.nextInt());
        }
        System.out.println(list);

        sort(list);

        System.out.println(list);



    }
    public static void sort(ArrayList<Integer> list){

        int min;
        int replaceIndex;

        for(int i = 0; i < list.size() - 1; i++) {

            min = list.get(i);
            replaceIndex = i;

            for(int j = i + 1; j < list.size(); j++) {

                if(min > list.get(j)){

                    min = list.get(j);
                    replaceIndex = j;
                }
            }
            if(replaceIndex != i){

                list.set(replaceIndex, list.get(i));
                list.set(i,min);
            }
        }
    }
}
