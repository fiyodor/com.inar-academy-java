package chapters.chapter_04;

import java.util.Scanner;

public class Exercise_23 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter employee's name(e.g., Smith): ");
		
		String employeeName = input.next();
		
		System.out.print("Enter number of hours worked in a week(e.g., 10): ");
		
		double hoursWorked = input.nextDouble();
		
		System.out.print("Enter hourly pay rate(e.g., 9.75): ");
		
		double hourlyPayRate = input.nextDouble();
		
		System.out.print("Enter federal tax withholding rate(e.g., 20%): ");
		
		double federalTaxWithholdingRate = input.nextDouble();
		
		System.out.print("Enter state tax withholding rate(e.g., 9%): ");
		
		double stateTaxWithholdingRate = input.nextDouble();
		
		double grossPay;
		double federal;
		double state;
		double totalDeduction;
		
		System.out.print("Employee Name: " + employeeName + 
				"\nHours Worked: " + hoursWorked +
				"\nPay Rate: $" + hourlyPayRate +
				"\nGross Pay: $" + (grossPay = hoursWorked * hourlyPayRate) +
				"\nDeductions:\n   Federal Witholding ( %" + federalTaxWithholdingRate + "): $" +
				(federal = grossPay * federalTaxWithholdingRate) +
				"\n   State Witholding (9.0%): $" + (state = grossPay * stateTaxWithholdingRate) +
				"\n   Total Deduction: $" + (totalDeduction = federal + state) +
				"\nNet Pay: $" + (grossPay - totalDeduction)
				);;
		
	}

}
