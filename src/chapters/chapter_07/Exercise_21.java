package chapters.chapter_07;

import java.util.Scanner;

public class Exercise_21 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of balls: ");

        final int NUMBER_OF_BALLS = input.nextInt();

        System.out.print("Enter the numberr of slots in the machine: ");

        final int NUMBER_OF_SLOTS = input.nextInt();

        int[] slots = new int[NUMBER_OF_SLOTS];

        startBeanMachine(slots, NUMBER_OF_BALLS);



    }

    public static void startBeanMachine(int[] array, int number){

        int lOrR;

        String dropPattern;

        for (int i = 0; i < number; i++) {

            dropPattern = "";

            for (int j = 0; j < array.length; j++) {

                lOrR = (int)(Math.random() * 2);

                if (lOrR % 2 == 0){

                    dropPattern += 'R';
                }
                else{

                    dropPattern += 'L';
                }
            }

        }
    }




}
