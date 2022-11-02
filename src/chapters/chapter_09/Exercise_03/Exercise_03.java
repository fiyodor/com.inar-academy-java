package chapters.chapter_09.Exercise_03;

import java.util.Date;

public class Exercise_03 {

    public static void main(String[] args) {

        Date date = new Date();

        for(int i = 4; i < 12 ; i++) {

            date.setTime((long)(Math.pow(10,i)));

            System.out.printf("For  %-12d   %s\n", (long)(Math.pow(10,i)), date.toString());
            
        }
    }
}
