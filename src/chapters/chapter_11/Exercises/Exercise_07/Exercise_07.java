package chapters.chapter_11.Exercises.Exercise_07;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise_07 {

    public static void main(String[] args) {

        ArrayList<Integer> list = getFromUser();

       /* System.out.print("Before shuffling: ");

        displayList(list);*/

        System.out.println("\nBefore shuffling:" + list);

        System.out.print("\nAfter shuffling: ");

        shuffle(list);

        displayList(list);

       // System.out.println("\nAfter shuffling" + list);
    }

    public static void shuffle(ArrayList<Integer> list){

        int temp;
        int randomIndex;

        for(int i = 0; i < list.size(); i++) {

            randomIndex = (int)(Math.random() * list.size());
            temp = list.get(randomIndex);
            list.set(randomIndex, list.get(i));
            list.set(i, temp);
        }
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

    public static void displayList(ArrayList<Integer> list){

        for(int i = 0; i < list.size(); i++) {

            System.out.print(list.get(i) + " ");

        }
    }
}
