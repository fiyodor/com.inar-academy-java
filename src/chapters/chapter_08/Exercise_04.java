package chapters.chapter_08;

public class Exercise_04 {

    public static void main(String[] args) {

        int[][] array = {
                {2,4,3,4,5,8,8},
                {7,3,4,3,3,4,4},
                {3,3,4,3,3,2,2},
                {9,3,4,7,3,4,1},
                {3,5,4,3,6,3,8},
                {3,4,4,6,3,4,4},
                {3,7,4,8,3,8,4},
                {6,3,5,9,2,7,9}};

        final int NUMBER_OF_EMPLOYEES = 8;

        int[][] totalHours = new int[NUMBER_OF_EMPLOYEES][2];

        sumHours(array, totalHours);

        sortHours(totalHours);

        printResult(totalHours);
    }
    public static void sumHours(int[][] array, int[][] rowSum){

        for (int i = 0; i < array.length; i++) {

            rowSum[i][0] = i;

            rowSum[i][1] = 0;

            for (int j = 0; j < array[i].length; j++) {

                rowSum[i][1] += array[i][j];
            }
        }
    }
    public static void sortHours(int[][] array){

        for (int i = 0; i < array.length; i++) {

            int max0 = array[i][0];

            int max1 = array[i][1];

            int maxIndex = i;

            for (int j = i + 1; j < array.length; j++) {

                if (max1 < array[j][1]){

                    max1 = array[j][1];

                    max0 = array[j][0];

                    maxIndex = j;
                }
            }
            if (i != maxIndex){

                array[maxIndex][0] = array[i][0];

                array[maxIndex][1] = array[i][1];

                array[i][0] = max0;

                array[i][1] = max1;
            }
        }
    }

    public static void printResult(int[][] array){

        System.out.println("Employee    Total hours in a week");

        for (int i = 0; i < array.length; i++) {

            System.out.printf("%4d%19d\n", array[i][0], array[i][1]);

        }
    }


}
