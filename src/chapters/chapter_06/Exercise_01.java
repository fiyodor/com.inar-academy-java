package chapters.chapter_06;

public class Exercise_01 {

    public static void main(String[] args) {

        int counter = 1;

        for (int i = 1 ; i <= 100; i++) {

            System.out.print(getPentagonalNumber(i) + " ");

            if (counter % 10 == 0){

                System.out.println();
            }


            counter++;

        }
    }

    public static int getPentagonalNumber(int n){

        return n * ((3 * n) - 1) / 2;
    }
}
