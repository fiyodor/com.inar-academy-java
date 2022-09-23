package chapters.chapter_05;

import java.util.Scanner;

public class Exercise_09 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter number of students: ");
		
		int numberOfStudents = input.nextInt();
		
		int theHighestScore = 0;
		String theBestStudent = "";
		
		int theSecondScore = 0;
		String theSecondStudent = "";
		
		for(int i = 1; i <= numberOfStudents; i++ ){
			
			input.nextLine();
			
			System.out.println("Enter student " + i + "'s name");
			
			String studentName = input.nextLine();
			
			System.out.println("Enter student " + i + "'s score");
			
			int studentScore = input.nextInt();
			
			System.out.println(studentName + " : " + studentScore);
			
			if(studentScore > theHighestScore){
				
				theSecondScore = theHighestScore;
				
				theHighestScore = studentScore;
				
				theSecondStudent = theBestStudent;
				
				theBestStudent = studentName;
				
				
				
				
			}
			else if(studentScore > theSecondScore){
				
				theSecondScore = studentScore;
				
				theSecondStudent = studentName;
			}
		}
		
		
		System.out.println("The name of the student with the highest score: " + theBestStudent + " and the score is: " + theHighestScore);
		
		System.out.println("The name of the student with the second highest score: " + theSecondStudent + " and the score is: " + theSecondScore);
		
	}
}