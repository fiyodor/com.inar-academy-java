package chapters.chapter_10.Exercises.Exercise_16;

import java.math.BigDecimal;

public class Exercise_16 {

    public static void main(String[] args) {

        BigDecimal number = new BigDecimal(Math.pow(10,49) + "");

        int count = 0 ;

        do {
            if (number.remainder(new BigDecimal("2")).equals(new BigDecimal("0")) || number.remainder(new BigDecimal("3")).equals(new BigDecimal("0")) ) {

                System.out.println(number);

                count++;
            }
            number = number.add(new BigDecimal(1));
        }
        while (count < 10 ) ;
    }
}