package chapters.chapter_08;

import java.util.Scanner;

public class Exercise_12 {

    public static void main(String[] args) {

        double[] statusAndTaxableIncome = new double[2];

        fillArrayWithInputs(statusAndTaxableIncome);

        double tax = getTax(statusAndTaxableIncome);

        showResult(tax);
    }

    public static void fillArrayWithInputs(double[] array){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your status (0 - Single filer, 1-Married jointly or qualifying widow(er), 2-Married separately, 3-Head of household) and your income: ");

        array[0] = input.nextDouble();

        array[1] = input.nextDouble();
    }

    public static double getTax(double[] statusAndIncome){

        int[][] brackets = {
                {8350, 33950, 82250, 171550, 372950}, // Single filer
                {16700, 67900, 137050, 20885, 372950}, // Married jointly or qualifying widow(er)
                {8350, 33950, 68525, 104425, 186475}, // Married separately
                {11950, 45500, 117450, 190200, 372950} // Head of household
        };

        double[] rates = {0.10, 0.15, 0.25, 0.28, 0.33, 0.35};

        double tax = 0;

        int incomeIndex = -1;

        for(int i = 0; i < brackets[0].length; i++) {

            if(statusAndIncome[1] > brackets[(int)(statusAndIncome[0])][i]){

                    incomeIndex = i;
            }
            else{

                break;
            }
        }
        if(incomeIndex != -1){

            tax += (statusAndIncome[1] - brackets[(int)(statusAndIncome[0])][incomeIndex]) * rates[incomeIndex +1];
        }
        else {

            return statusAndIncome[1] * rates[0];
        }
        for(int i = incomeIndex; i > 0 ; i--) {

            tax += (brackets[(int)(statusAndIncome[0])][i] - brackets[(int)(statusAndIncome[0])][i - 1]) * rates[i];
        }
        tax += (brackets[(int)(statusAndIncome[0])][0]  * rates[0]);

        return tax;
    }
    public static void showResult(double tax){

        System.out.println("Tax is " + tax);
    }
}
