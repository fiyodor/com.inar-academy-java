package chapters.chapter_06.Exercises;

public class Exercise_28 {

    public static void main(String[] args) {

        System.out.println("p           2^p-1");

        System.out.println("-----------------");

        for (int p = 2; p <= 31; p++){

            if (Exercise_27.isPrime(p)){

                System.out.printf("%-2d          %-4d\n",p, getMersenne(p));
            }
        }
    }
    public static int getMersenne(int x){

            return (int)(Math.pow(2,x) - 1);


        }

}
