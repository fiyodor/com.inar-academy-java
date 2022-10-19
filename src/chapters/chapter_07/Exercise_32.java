package chapters.chapter_07;

import java.util.Scanner;

public class Exercise_32 {

    public static void main(String[] args) {

        System.out.print("Enter list: ");

        int[] array = fillArrayWithInputsAndReturn();

        int pivotIndex = partition(array);

        System.out.print("After the partition, the list is ");

        displayArray(array);
    }
    public static int[] fillArrayWithInputsAndReturn() {

        Scanner input = new Scanner(System.in);

        final int array_Length = input.nextInt();

        int[] array = new int[array_Length];

        for (int i = 0; i < array.length; i++) {

            array[i] = input.nextInt();
        }
        return array;
    }
    public static int partition(int[] list) {

        int pivot = list[0];

        int pivotIndex = 0;

        while(true){

            boolean partition = true;

            for (int i = 1; i < list.length; i++) {

                if (i == pivotIndex){

                    continue;
                }
                if (list[i] <= pivot){

                    if (i > pivotIndex){

                        partition = false;

                        int temp = list[i];

                        list[i] = pivot;

                        list[pivotIndex] = temp;

                        pivotIndex = i;
                    }
                } else if (list[i] > pivot) {

                    if (i < pivotIndex){

                        partition = false;

                        int temp = list[i];

                        list[i] = pivot;

                        list[pivotIndex] = temp;

                        pivotIndex = i;
                    }
                }
            }
            if (partition){

                break;
            }
        }
        return pivotIndex;
    }
    public static void displayArray(int[] array){

        for (int i : array) {

            System.out.print(i + " ");

        }
    }
}


