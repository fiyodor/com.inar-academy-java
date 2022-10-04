package chapters.chapter_06;

public class Exercise_14 {

    public static void main(String[] args) {

        System.out.println("i        m(i)");
        System.out.println("---------------");

        for (int i = 1; i <= 901  ; i += 100) {

            System.out.printf("%-3d      %-6.4f\n", i , computePi(i));

        }


    }
    public static double computePi(int x){

        double sum = 0;
        for (int i = 1; i <= x ; i++) {

            sum += ((Math.pow(-1, i + 1)) / 2 * i - 1);
        }
        return 4 * sum;
    }
}

