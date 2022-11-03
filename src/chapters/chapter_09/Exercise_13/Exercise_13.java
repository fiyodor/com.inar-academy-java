package chapters.chapter_09.Exercise_13;

import chapters.chapter_08.Exercise_01;

import java.util.Scanner;

public class Exercise_13 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of rows and columns in the array: ");

        final int ROW = input.nextInt();
        final int COL = input.nextInt();

        double[][] array = new double[ROW][COL];

        Exercise_01.fillArrayWithInputs(array);

        Location location = locateLargest(array);

        System.out.println(location);
    }
    public static Location locateLargest(double[][] array){

        int maxRow = -1;
        int maxCol = -1;
        double maxValue = Double.MIN_VALUE;

        for(int i = 0; i < array.length; i++) {

            for(int j = 0; j < array[i].length; j++) {

                if(array[i][j] > maxValue){

                    maxRow = i;
                    maxCol = j;
                    maxValue = array[i][j];
                }
            }
        }
        return new Location(maxRow, maxCol, maxValue);
    }
}
