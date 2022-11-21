package chapters.chapter_12.Checkpoints;

public class Checkpoint_06_B {

    public static void main(String[] args) {
        try {
            for (int i = 0; i < 2; i++) {
                System.out.print(i + " ");
                System.out.println(1 / 0);
            }
        }
        catch (Exception ex) {

            System.out.println("Exception found");
        }
    }

    // 0 because in for loop there is a statement which throws an exception. and in the same loop there is a try-catch statement that deals with the exception
}
