package chapters.chapter_08;

import java.util.Scanner;

public class Exercise_06 {

    public static void main(String[] args) {
        final int ROW = 3;

        final int COL = 3;

        double[][] array1 = new double[ROW][COL];

        double[][] array2 = new double[ROW][COL];

        System.out.print("Enter matrix1: ");

        fillArrayWithInputs(array1);

        System.out.print("Enter matrix2: ");

        fillArrayWithInputs(array2);

        double[][] result = multiplyMatrix(array1, array2);

        showResult(array1, array2, result);
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

            System.out.printf("%4.1f ",array[row][i]);
        }

    }

    public static void showResult(double[][] array1, double[][] array2, double[][] array3){

        for (int i = 0; i < array1.length; i++) {

            displayArrayRows(array1, i);

            if (i == 1){

                System.out.print("  *  ");
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

    public static double[][] multiplyMatrix(double[][] a, double[][] b){

        double[][] product = new double[a.length][a[0].length];

        for (int i = 0; i < product.length; i++) {

            for (int j = 0; j < product[i].length; j++) {

                product[i][j] = (a[i][0] * b[0][j]) + (a[i][1] * b[1][j]) + (a[i][2] * b[2][j]);

            }
        }
        return product;
    }
}
