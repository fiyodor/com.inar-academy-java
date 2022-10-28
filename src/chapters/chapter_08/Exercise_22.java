package chapters.chapter_08;

public class Exercise_22 {

    public static void main(String[] args) {

        final int ROW_AND_COL = 6;

        int[][] array = new int[ROW_AND_COL][ROW_AND_COL];

        fillArrayRandomly(array);

        displayArray(array);

        System.out.println();

        System.out.println("Every row and column of the array has" + (check(array) ? "" : "'nt") + " got even number of 1s");


    }
    public static void fillArrayRandomly(int[][] array){

        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array[i].length ; j++) {

                array[i][j] = (int)(Math.random() * 2);


            }

        }
    }

    public static boolean check(int[][] array){

        return rowCheck(array) && colCheck(array);
    }

    public static boolean rowCheck(int[][] array){

        for (int i = 0; i < array.length ; i++) {

            int counter = 0;

            for (int j = 0; j < array.length; j++) {

                if (array[i][j] == 1){

                    counter++;
                }
            }
            if (counter % 2 != 0 || counter == 0){

                return false;
            }
        }
        return true;
    }

    public static boolean colCheck(int[][] array){

        for (int i = 0; i < array.length ; i++) {

            int counter = 0;

            for (int j = 0; j < array.length; j++) {

                if (array[j][i] == 1){

                    counter++;
                }
            }
            if (counter % 2 != 0 || counter == 0){

                return false;
            }
        }
        return true;
    }

    public static void displayArray(int[][] array){

        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array[i].length; j++) {

                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
