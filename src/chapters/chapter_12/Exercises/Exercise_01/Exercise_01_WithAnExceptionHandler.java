package chapters.chapter_12.Exercises.Exercise_01;

public class Exercise_01_WithAnExceptionHandler {

    public static void main(String[] args) {

        // Check number of strings passed
        if (args.length != 3) {
            System.out.println(
                    "Usage: java Calculator operand1 operator operand2");
            System.exit(0);
        }
        try {
            Integer.parseInt(args[0]);
        }
        catch (NumberFormatException numberFormatException){

            System.out.println("Wrong input: (" + args[0] + ") Please enter a number");
            System.exit(1);
        }

        try {
            Integer.parseInt(args[2]);
        }
        catch (NumberFormatException numberFormatException){

            System.out.println("Wrong input: (" + args[2] + ") Please enter a number");
            System.exit(2);
        }

        // The result of the operation
        int result = 0;

        // Determine the operator
        switch (args[1].charAt(0)) {
            case '+': result = Integer.parseInt(args[0]) +
                    Integer.parseInt(args[2]);
                break;
            case '-': result = Integer.parseInt(args[0]) -
                    Integer.parseInt(args[2]);
                break;
            case '.': result = Integer.parseInt(args[0]) *
                    Integer.parseInt(args[2]);
                break;
            case 'd': result = Integer.parseInt(args[0]) /
                    Integer.parseInt(args[2]);
                break;
        }

        // Display result
        System.out.println(args[0] + ' ' + args[1] + ' ' + args[2] + " = " + result);
    }
}
