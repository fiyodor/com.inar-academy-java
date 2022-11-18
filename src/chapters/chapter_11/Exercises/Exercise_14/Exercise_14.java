package chapters.chapter_11.Exercises.Exercise_14;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise_14 {

    public static void main(String[] args) {

        System.out.print("Enter five integers for list1:");

        ArrayList<Integer> list1 = getFromUser(5);

        System.out.print("Enter five integers for list2:");

        ArrayList<Integer> list2 = getFromUser(5);

        System.out.print("The combined list is ");

        System.out.println(union(list1, list2));


    }

    public static ArrayList<Integer> getFromUser(int numberOfIntegers){

        ArrayList<Integer> list = new ArrayList<>();

        Scanner input = new Scanner(System.in);

        for(int i = 0; i < numberOfIntegers; i++) {

            list.add(input.nextInt());
        }
        return list;
    }

    public static ArrayList<Integer> union(ArrayList<Integer> list1, ArrayList<Integer> list2){

        ArrayList<Integer> unionList = new ArrayList<>();

        unionList.addAll(list1);
        unionList.addAll(list2);

        return unionList;
    }
}
