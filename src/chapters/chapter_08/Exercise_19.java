package chapters.chapter_08;

import java.util.Scanner;

public class Exercise_19 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter row and column length: ");

        final int ROW = input.nextInt();
        final int COL = input.nextInt();

        int[][] array = new int[ROW][COL];

        System.out.println("Enter a " + ROW + " by " + COL + " matrix row by row:");

        fillArrayWithInputs(array);

        System.out.print("Matrix has " + (isConsecutiveFour(array) ? "" : "no") + " consecutive four numbers");


    }
    public static void fillArrayWithInputs(int[][] array){

        Scanner input = new Scanner(System.in);

        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array[i].length ; j++) {

                array[i][j] = input.nextInt();
            }
        }
    }

    public static boolean isConsecutiveFour(int[][] array){

        return (checkRows(array) || checkCols(array) || checkRightDia(array) || checkLeftDia(array));
    }

    public static boolean checkRows(int[][] array){

        int counter;

        for (int i = 0; i < array.length; i++) {

            counter = 1;

            for (int j = 0; j < array[i].length - 1; j++) {

                if (array[i][j] == array[i][j + 1]) {

                    counter++;
                }
                else {

                    counter = 1;
                }
                if (counter == 4) {

                    return true;
                }
            }
        }
        return false;
    }

    public static boolean checkCols(int[][] array){

        int counter;

        for (int col = 0; col < array[0].length; col++) {

            counter = 1;

            for (int row = 0; row < array.length - 1; row++) {

                if (array[row][col] == array[row + 1][col]) {

                    counter++;
                }
                else {

                    counter = 1;
                }
                if (counter == 4) {

                    return true;
                }
            }
        }
        return false;
    }

    public static boolean checkRightDia(int[][] array){

        int counter;

        for (int startsPoint = array.length - 4; startsPoint > 0; startsPoint--) {

            counter = 1;

            for (int i = 0, j = startsPoint; j < array.length - 1; i++, j++) {

                if (array[j][i] == array[j + 1][i + 1]) {

                    counter++;
                }
                else {

                    counter = 1;
                }
                if (counter == 4) {

                    return true;
                }
            }
        }

        for (int startPoint = 0; startPoint <= array.length - 4; startPoint++) {

            counter = 1;

            for (int i = 0, j = startPoint; j < array.length - 1; i++, j++) {

                if (array[i][j] == array[i + 1][j + 1]) {

                    counter++;
                }
                else {

                    counter = 1;
                }
                if (counter == 4) {

                    return true;
                }
            }
        }
        return false;
    }

    public static boolean checkLeftDia(int[][] array){

        int counter;

        for (int startsPoint = array.length - 4; startsPoint > 0; startsPoint--) {

            counter = 1;

            for (int i = startsPoint, j = array[startsPoint].length - 1; i < array.length - 1; i++, j--) {

                if (array[i][j] == array[i + 1][j - 1]) {

                    counter++;
                }
                else {

                    counter = 1;
                }
                if (counter == 4) {

                    return true;
                }
            }
        }

        for (int startPoint = array[1].length - 1; startPoint >= array[1].length - 4; startPoint--) {

            counter = 1;

            for (int i = 0, j = startPoint; i < array.length - i - 1 ; i++, j--) {

                if (array[i][j] == array[i + 1][j - 1]) {

                    counter++;
                }
                else {

                    counter = 1;
                }
                if (counter == 4) {

                    return true;
                }
            }
        }
        return false;
    }
}
