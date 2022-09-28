package chapters.chapter_06;

import java.util.Scanner;

public class Exercise_07 {

    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);

        System.out.print("Enter investment amount: ");

        double investmentAmount = input.nextDouble();

        System.out.print("Enter annual interest rate in percentage: ");

        double monthlyInterestRate = input.nextDouble() / 1200 ;

        System.out.println("Years       Future Value");

        for (int i = 1; i <= 30 ; i++) {

            //System.out.printf("%-2d           %-8.10f\n", i, futureInvestmentValue(investmentAmount, monthlyInterestRate, i));
            System.out.printf("%-12d", i);
            System.out.printf("%-11.2f\n",futureInvestmentValue(investmentAmount, monthlyInterestRate, i));
        }

    }
    public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int years){

        double futureInvestmentvalue = investmentAmount * Math.pow ( 1 + monthlyInterestRate , years * 12);

        return futureInvestmentvalue;
    }
}
