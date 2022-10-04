package chapters.chapter_06;

public class Exercise_29 {

    public static void main(String[] args) {



        for (int i = 2; i < 1000 ; i++) {

            if (Exercise_27.isPrime(i) && Exercise_27.isPrime(i + 2)){

                System.out.println("(" + i + ", " + (i + 2) + ")");

            }
        }
    }

}
