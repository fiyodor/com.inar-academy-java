package chapters.chapter_08;

public class Exercise_03 {

    public static void main(String[] args) {

        char[][] answers = {
                {'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
                {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
                {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
                {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}};


        char[] keys = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};

        int[][] correctAnswer = new int[answers.length][2];

        for (int i = 0; i < answers.length; i++) {

            for (int j = 0; j < answers[i].length; j++) {

                if (answers[i][j] == keys[j]) {

                    correctAnswer[i][0] = i;

                    correctAnswer[i][1]++;
                }
            }
        }
        sortForCorrectCount(correctAnswer);

        System.out.println();

        System.out.println("INCREASING ORDER");

        //System.out.println();

        displayResult(correctAnswer);

        sortForCorrectCountDecreasing(correctAnswer);

        System.out.println("-------------------------------------------");

        System.out.println("DECREASING ORDER");

        //System.out.println();

        displayResult(correctAnswer);
    }

    public static void sortForCorrectCount(int[][] array) {

        for (int i = 0; i < array.length; i++) {

            int minCol0 = array[i][0];

            int minCol1 = array[i][1];

            int minIndex = i;

            for (int j = i + 1; j < array.length; j++) {

                if (minCol1 > array[j][1]) {

                    minCol1 = array[j][1];

                    minCol0 = array[j][0];

                    minIndex = j;
                }
            }
            if (minIndex != i) {

                array[minIndex][1] = array[i][1];

                array[minIndex][0] = array[i][0];

                array[i][1] = minCol1;

                array[i][0] = minCol0;
            }
        }
    }

    public static void sortForCorrectCountDecreasing(int[][] array) {

        for (int i = 0; i < array.length; i++) {

            int minCol0 = array[i][0];

            int minCol1 = array[i][1];

            int minIndex = i;

            for (int j = i + 1; j < array.length; j++) {

                if (minCol1 < array[j][1]) {

                    minCol1 = array[j][1];

                    minCol0 = array[j][0];

                    minIndex = j;
                }
            }
            if (minIndex != i) {

                array[minIndex][1] = array[i][1];

                array[minIndex][0] = array[i][0];

                array[i][1] = minCol1;

                array[i][0] = minCol0;
            }
        }
    }

    public static void displayResult(int[][] array){

        for (int i = 0; i < array.length; i++) {

            System.out.println("Student " + array[i][0] + "'s number of correct answers is: " + array[i][1]);
        }
    }

}