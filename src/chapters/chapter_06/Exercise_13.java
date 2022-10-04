package chapters.chapter_06;

public class Exercise_13 {

    public static void main(String[] args) {

        System.out.println("i       m(i)");
        System.out.println("------------");

        for (int i = 1; i <= 20  ; i++) {

            System.out.printf("%-2d      %-2.4f\n", i , computeSeries(i));

        }


    }
    public static double computeSeries(int x){

        double sum = 0;
        for (int i = 1; i <= x ; i++) {

            sum += (double)i / (i + 1);
        }
        return sum;
    }
    }

