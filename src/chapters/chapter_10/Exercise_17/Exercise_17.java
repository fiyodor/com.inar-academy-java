package chapters.chapter_10.Exercise_17;

import java.math.BigInteger;

public class Exercise_17 {

    public static void main(String[] args) {

        System.out.println(Long.MAX_VALUE);

        long smallestPow = (long) Math.sqrt(Long.MAX_VALUE) ;

        BigInteger number = new BigInteger(smallestPow + "");

        int count = 0;

        do {

            BigInteger result = number.multiply(number);

            if (result.compareTo(new BigInteger(Long.MAX_VALUE + "")) > 0) {

                System.out.println(result);

                count++;
            }
            number = number.add(BigInteger.ONE);
        }
        while (count < 10);
    }
}
