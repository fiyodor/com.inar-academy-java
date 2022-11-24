package chapters.chapter_06.Exercises;

public class Exercise_30 {

    public static void main(String[] args) {

        int point = rollTwoDices();

        int result = getResult(point);

        if (isNaturalOrCraps(result)) {

            printWinOrLose(result);
        }
        else {

            System.out.println("point is " + point);

            rollUntilWinOrLose(result);
        }

    }
    public static int rollTwoDices() {

        int dice1 = rollDice();

        int dice2 = rollDice();

        int sum = sumDices(dice1, dice2);

        System.out.println("You rolled " + dice1 + " + " + dice2 + " = " + sum);

        return sum;
    }
    public static int rollDice() {

        return (int) (Math.random() * 5) + 1;
    }
    public static int sumDices(int x, int y) {

        return x + y;
    }

    public static void printWinOrLose(int x) {

        if (x == 0) {

            System.out.println("You lose");
        } else if (x == 1) {

            System.out.println("You win");
        }

    }

    public static int getResult(int x) {

        switch (x) {

            case 2:
            case 3:
            case 12: x = 0; break;
            case 7:  x = 1; break;
            case 11: x = 1; break;
        }
        return x;
    }

    public static boolean isNaturalOrCraps(int x) {
        return x == 0 || x == 1;
    }

    public static void rollUntilWinOrLose(int point) {

        int result;

        do {

            result = rollTwoDices();
        }
        while(result != point && result != 7);

        if (result == 7){

            printWinOrLose(0);
        }
        else{

            printWinOrLose(1);
        }
        }
    }


