package chapters.chapter_08;

import java.util.Scanner;

public class Exercise_05 {

    public static void main(String[] args) {

        final int ROW = 3;

        final int COL = 3;

        double[][] array1 = new double[ROW][COL];

        double[][] array2 = new double[ROW][COL];

        System.out.print("Enter matrix1: ");

        fillArrayWithInputs(array1);

        System.out.print("Enter matrix2: ");

        fillArrayWithInputs(array2);

        double[][] result = addMatrix(array1, array2);

        showResult(array1, array2, result);
    }
    public static double[][] addMatrix(double[][] a, double[][] b){

        double[][] sum = new double[a.length][a[0].length];

        for (int i = 0; i < sum.length; i++) {

            for (int j = 0; j < sum[i].length; j++) {

                sum[i][j] = a[i][j] + b[i][j];
            }
        }
        return sum;
    }

    public static void fillArrayWithInputs(double[][] array){

        Scanner input = new Scanner(System.in);

        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array[i].length ; j++) {

                array[i][j] = input.nextDouble();
            }
        }
    }
    public static void displayArrayRows(double[][] array, int row){

        for (int i = 0; i < array.length; i++) {

            System.out.print(array[row][i] + " ");
        }

    }
    public static void showResult(double[][] array1, double[][] array2, double[][] array3){

        for (int i = 0; i < array1.length; i++) {

            displayArrayRows(array1, i);

            if (i == 1){

                System.out.print("  +  ");
            }
            else{

                System.out.print("     ");
            }
            displayArrayRows(array2, i);

            if (i == 1){

                System.out.print("  =   ");
            }
            else{

                System.out.print("      ");
            }
            displayArrayRows(array3, i);

            System.out.println();
        }


        }


}
