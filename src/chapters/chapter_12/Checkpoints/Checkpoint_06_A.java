package chapters.chapter_12.Checkpoints;

public class Checkpoint_06_A {

    public static void main(String[] args) {
        for (int i = 0; i < 2; i++) {
            System.out.print(i + " ");
            try {
                System.out.println(1 / 0);
            }
            catch (Exception ex) {

                System.out.println("Exception found");
            }
        }
    }

    //0 1 because after for loop try-catch handle the exception
}
