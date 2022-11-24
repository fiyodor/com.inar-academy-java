package chapters.chapter_06.Exercises;

import static chapters.chapter_06.Exercises.Exercise_30.*;

public class Exercise_32 {

    public static void main(String[] args) {

        int counterOfWinnings = 0;

        int numberOfPlaying = 10000;

        for (int i = 1; i < numberOfPlaying ; i++) {


            int point = rollTwoDices();

            int result = getResult(point);

            if (isNaturalOrCraps(result)) {

                if (getResult(point) == 1);{

                    counterOfWinnings++;
                }

                printWinOrLose(result);
            } else {

                System.out.println("point is " + point);

                rollUntilWinOrLose(result);


            }
            System.out.println("--------------------");
        }
        System.out.println("You won " +counterOfWinnings + " times");

    }

}
