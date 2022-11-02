package chapters.chapter_09.Exercise_04;

import java.util.Random;

public class Exercise_04 {

    public static void main(String[] args) {

        Random randomObject = new Random();

        randomObject.setSeed(1000);

        for(int i = 0; i < 50; i++) {

            System.out.print(randomObject.nextInt(100) + " ");

        }
    }
}
