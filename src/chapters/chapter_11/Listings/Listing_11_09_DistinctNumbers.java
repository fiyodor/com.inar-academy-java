package chapters.chapter_11.Listings;

import java.util.ArrayList;

import java.util.Scanner;

public class Listing_11_09_DistinctNumbers {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        Scanner input = new Scanner(System.in);

        System.out.print("Enter integers (input ends with 0): ");

        int value;

        do{
            value = input.nextInt();

            if(!list.contains(value) && value != 0){

                list.add(value);
            }
        }while (value != 0);

        System.out.print("The distinct numbers are: ");

        for(int i = 0; i < list.size(); i++) {

            System.out.print(list.get(i) + " ");
        }
        System.out.println();

       // System.out.println(list);
    }
}
