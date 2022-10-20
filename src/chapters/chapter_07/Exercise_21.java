package chapters.chapter_07;

import java.util.Scanner;

public class Exercise_21 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of balls: ");

        final int NUMBER_OF_BALLS = input.nextInt();

        System.out.print("Enter the number of slots in the machine: ");

        final int NUMBER_OF_SLOTS = input.nextInt();

        int[] slots = new int[NUMBER_OF_SLOTS];

        startBeanMachine(slots, NUMBER_OF_BALLS);

        System.out.println();

        showResult(slots, NUMBER_OF_BALLS);

        showSlots(NUMBER_OF_SLOTS);
    }

    public static void showSlots(int number_of_slots) {

        for (int i = 0; i < number_of_slots; i++) {

            System.out.printf("%-3d",i + 1);

        }
    }

    public static void startBeanMachine(int[] array, int number) {

        int lOrR;

        StringBuilder dropPattern = new StringBuilder();

        for (int i = 0; i < number; i++) {

            dropPattern = new StringBuilder();

            for (int j = 0; j < array.length - 1; j++) {

                lOrR = (int) (Math.random() * 2);

                if (lOrR % 2 == 0) {

                    dropPattern.append('R');
                } else {

                    dropPattern.append('L');
                }
            }
            System.out.println(dropPattern);

            addBallsToSlots(array, dropPattern.toString());

        }
    }

    public static void addBallsToSlots(int[] slots, String str) {

        char[] dropPattern = str.toCharArray();

        int counterR = 0;

        for (char c : dropPattern) {

            if (c == 'R') {

                counterR++;
            }
        }
        slots[counterR]++;
    }

    public static void showResult(int[] slots, int ballNumber) {

        int maxSlot = findMaxSlot(slots);

        int counter = 0;

        while (counter < ballNumber) {

            for (int i = 0; i < slots.length; i++) {

                if (slots[i] == maxSlot) {

                    System.out.printf("%-3d", 0);

                    counter++;

                    slots[i]--;

                } else {

                    String s = " ";

                    System.out.printf("%-3s",s);
                }

            }
            System.out.println();
            maxSlot--;

        }
    }

    public static int findMaxSlot(int[] array) {

        int max = -1;

        for (int j : array) {

            if (j > max) {

                max = j;
            }
        }
        return max;
    }

}
