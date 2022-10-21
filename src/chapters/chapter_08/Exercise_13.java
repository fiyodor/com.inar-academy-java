package chapters.chapter_08;

import java.util.Scanner;

public class Exercise_13 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of rows and columns of the array: ");

        final int ROW = input.nextInt();

        final int COL = input.nextInt();

        System.out.println("Enter the array: ");

        double[][] array = new double[ROW][COL];

        fillArrayWithInputs(array);

        int[] largestElementIndex = locateLargest(array);

        System.out.println("The location of the largest element is at (" + largestElementIndex[0] + ", " + largestElementIndex[1] + ")");





    }
    public static int[] locateLargest(double[][] a){

        int[] largestElement = new int[2];

        double max = Double.MIN_VALUE;

        largestElement[0] = -1;

        largestElement[1] = -1;

        for (int i = 0; i < a.length; i++) {

            for (int j = 0; j < a[i].length; j++) {

                if (max <= a[i][j]){

                    max = a[i][j];

                    largestElement[0] = i;

                    largestElement[1] = j;
                }
            }
        }
        return largestElement;
    }

    public static void fillArrayWithInputs(double[][] array){

        Scanner input = new Scanner(System.in);

        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array[i].length ; j++) {

                array[i][j] = input.nextDouble();
            }
        }
    }
}
