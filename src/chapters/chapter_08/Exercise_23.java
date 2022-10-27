package chapters.chapter_08;

import java.util.Arrays;

import java.util.Scanner;

public class Exercise_23 {

    public static void main(String[] args) {

        final int ROW_COL = 6;

        int[][] array = new int[ROW_COL][ROW_COL];

        System.out.println("Enter a " + ROW_COL + "-by-" + ROW_COL + " matrix row by row:");

        fillArrayWithInputs(array);

        System.out.println();

        displayArray(array);

        System.out.println();

        flipCell(array);

        int[] flipped = findFlipped(array);

        System.out.println();

        System.out.println("Flipped cell is " + Arrays.toString(flipped));



    }
    public static void fillArrayWithInputs(int[][] array){

        Scanner input = new Scanner(System.in);

        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array[i].length ; j++) {

                array[i][j] = input.nextInt();
            }
        }
    }
    public static void flipCell(int[][] array){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the row and column you want to flip: ");

        int row = input.nextInt();

        int col = input.nextInt();

        array[row][col] = (array[row][col] == 0 ? 1 : 0);

        displayArray(array);
    }

    public static int[] findFlipped(int[][] array){

        int[] indexOfCell = new int[2];

        for (int i = 0; i < array.length; i++) {

            int counter = 0;

            for (int j = 0; j < array[i].length; j++) {

                if (array[i][j] == 1){

                    counter++;
                }
            }
            if (counter % 2 != 0){

                indexOfCell[0] = i;

                break;
            }
        }
        for (int i = 0; i < array.length; i++) {

            int counter = 0;

            for (int j = 0; j < array[i].length; j++) {

                if (array[j][i] == 1){

                    counter++;
                }
                if (counter % 2 != 0){

                    indexOfCell[1] = i;

                    break;
                }
            }

        }
        return indexOfCell;
    }

    public static void displayArray(int[][] array){

        for (int[] ints : array) {

            System.out.println(Arrays.toString(ints));
        }
    }
    }
