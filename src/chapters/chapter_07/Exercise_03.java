package chapters.chapter_07;

public class Exercise_03 {

    public static void main(String[] args) {

        final int arrayLength = 100;

        int[] array = new int[arrayLength];

        int[] numbersUntil100 = new int[101];

        System.out.print("Enter the integers between 1 and 100: ");

        Exercise_02.fillArrayWithInputs(array);

        countOccurrences(array, numbersUntil100);

    }
    private static void countOccurrences(int[] array, int[] array2) {

        for (int i = 1; i < array2.length; i++) {

            for (int j = 0; j < array.length; j++) {

                if (array[j] == i) {

                    array2[i]++;
                }
            }
            if (array2[i] != 0){

                System.out.println(i + " occurs " + array2[i] +( array2[i] == 1 ?" time" : " times"));
            }


        }
    }

}
