package chapters.chapter_06;

import java.util.Scanner;

public class Exercise_07 {

    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);

        System.out.print("Enter investment amount: ");

        double investmentAmount = input.nextDouble();

        System.out.print("Enter annual interest rate in percentage: ");

        double monthlyInterestRate = input.nextDouble() / 1200 ;

        System.out.print("Enter number of years: ");

        int numberOfYears = input.nextInt();

        System.out.println("Accumulated value is " + futureInvestmentValue(investmentAmount, monthlyInterestRate, numberOfYears));

    }
    public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int years){

        double futureInvestmentvalue = investmentAmount * Math.pow ( 1 + monthlyInterestRate , years * 12);

        return futureInvestmentvalue;
    }
}
