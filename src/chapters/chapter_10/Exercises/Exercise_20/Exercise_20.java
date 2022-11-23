package chapters.chapter_10.Exercises.Exercise_20;

import java.math.BigDecimal;

public class Exercise_20 {

    public static void main(String[] args) {

        BigDecimal a = BigDecimal.ONE;

        BigDecimal b = BigDecimal.ONE;

        for (int i = 100; i <= 1000 ; i+=100) {

            a = b ;

            for (int j = 1; j <= i ; j++) {

                a = a.add((new BigDecimal("1").divide(factorial(j) , 25 , BigDecimal.ROUND_UP))) ;
            }
            System.out.printf("e for i = %-4s => %s\n", i, a.divide(b, 25, BigDecimal.ROUND_UP));
        }
    }

    public static BigDecimal factorial(long n) {

        BigDecimal result = BigDecimal.ONE;

        for (int i = 1; i <= n ; i++) {

            result = result.multiply(new BigDecimal(i + "")) ;
        }
        return result ;
    }
}
