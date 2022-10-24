package chapters.chapter_08;

import java.util.Scanner;

public class Exercise_36 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number n: ");

        final int ROW_AND_COL = input.nextInt();

        char[][] array = new char[ROW_AND_COL][ROW_AND_COL];

        System.out.println("Enter " + ROW_AND_COL + " rows of letters seperated by spaces:");

        fillArrayWithInputs(array);

        System.out.println("The input array is " + (isLatinNumber(array) ? "" : "not ") + "a Latin square");


    }

    private static boolean isLatinNumber(char[][] array) {

        return isUniqueRow(array) && isUniqueCol(array);
    }
    private static boolean isUniqueRow(char[][] array) {

        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array[i].length - 1; j++) {

                if (array[i][j] == array[i][j + 1]){

                    return false;
                }
            }
        }
        return true;
    }
    private static boolean isUniqueCol(char[][] array) {

        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array[i].length - 1; j++) {

                if (array[j][i] == array[j + 1][i]){

                    return false;
                }
            }
        }
        return true;
    }

    public static void fillArrayWithInputs(char[][] array){

        Scanner input = new Scanner(System.in);

        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array[i].length ; j++) {

                String str = input.next();

                char c = str.toUpperCase().charAt(0);

                if (c >= 'A' && c < (char) ('A' + array.length)){

                    array[i][j] = c;
                }
                else{

                    System.out.println("Wrong input: the letters must be from A to " + (char)('A' + array.length - 1));

                    break;
                }
            }
        }
    }


}
