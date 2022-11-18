package chapters.chapter_11.Exercises.Exercise_09;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise_09 {

    public static void main(String[] args) {

        ArrayList<Integer> row = new ArrayList<>();
        ArrayList<Integer> col = new ArrayList<>();

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the array size n: ");

        int n = input.nextInt();

        int[][] matrix = new int[n][n];

        fillRandomly(matrix);

        System.out.println("The random array is");

        displayMatrix(matrix);

        findMaxRow(row, matrix);
        findMaxCol(col, matrix);

        showResult(row, col);
    }

    public static void fillRandomly(int[][] matrix){

        for(int i = 0; i < matrix.length; i++) {

            for(int j = 0; j < matrix[i].length; j++) {

                matrix[i][j] = (int)(Math.random() * 2);
            }
        }
    }

    public static void displayMatrix(int[][] matrix){

        for(int i = 0; i < matrix.length; i++) {

            for(int j = 0; j < matrix[i].length; j++) {

                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void findMaxRow(ArrayList<Integer> row, int[][] matrix){

        int counter;
        int max = Integer.MIN_VALUE;

        for(int i = 0; i < matrix.length; i++) {

            counter = 0;

            for(int j = 0; j < matrix[i].length; j++) {

                if(matrix[i][j] == 1){

                    counter++;
                }
            }
            if(counter > max){

                max = counter;
            }
        }
        for(int i = 0; i < matrix.length; i++) {

            counter = 0;

            for(int j = 0; j < matrix[i].length; j++) {

                if(matrix[i][j] == 1){

                    counter++;
                }
            }
            if(counter == max){

                row.add(i);
            }
        }
    }

    public static void findMaxCol(ArrayList<Integer> col, int[][] matrix){

        int counter;
        int max = Integer.MIN_VALUE;

        for(int i = 0; i < matrix.length; i++) {

            counter = 0;

            for(int j = 0; j < matrix[i].length; j++) {

                if(matrix[j][i] == 1){

                    counter++;
                }
            }
            if(counter > max){

                max = counter;
            }
        }
        for(int i = 0; i < matrix.length; i++) {

            counter = 0;

            for(int j = 0; j < matrix[i].length; j++) {

                if(matrix[j][i] == 1){

                    counter++;
                }
            }
            if(counter == max){

                col.add(i);
            }
        }
    }

    public static void showResult(ArrayList<Integer> row, ArrayList<Integer> col){

        if(row.isEmpty()){

            System.out.println("No row with 1");
        }
        else {

            System.out.print("The largest row index" + ((row.size() == 1) ? ": " : "es: "));

            for(int i = 0; i < row.size(); i++) {

                System.out.print(row.get(i) + " ");
            }
            System.out.println();
        }


        if(col.isEmpty()){

            System.out.println("No column with 1");
        }
        else {

            System.out.print("The largest column index" + ((row.size() == 1) ? ": " : "es: "));

            for(int i = 0; i < col.size(); i++) {

                System.out.print(col.get(i) + " ");
            }
            System.out.println();
        }
    }
}
