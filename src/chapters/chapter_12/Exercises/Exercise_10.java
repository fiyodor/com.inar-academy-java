package chapters.chapter_12.Exercises;

public class Exercise_10 {

    public static void main(String[] args) {

        try {

            int[] array1 = new int[Integer.MAX_VALUE];
        }
        catch (OutOfMemoryError outOfMemoryError){

            System.out.println("OutOfMemory Error");

            outOfMemoryError.printStackTrace();
        }
    }
}
