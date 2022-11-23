package chapters.chapter_12.Exercises.Exercise_04;

import java.util.Scanner;

public class Exercise_04Test {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter annual interest rate: ");
        double interestRate = input.nextDouble();

        System.out.print("Enter numbers of years: ");
        int numberOfYears = input.nextInt();

        System.out.print("Enter loan amount: ");
        double loanAmount = input.nextDouble();

        try{
            Exercise_04_Loan loan = new Exercise_04_Loan(interestRate, numberOfYears,loanAmount);
            System.out.println(loan.getTotalPayment());
        }
        catch (IllegalArgumentException ex){

            System.out.println(ex.getMessage());
        }
    }
    }
