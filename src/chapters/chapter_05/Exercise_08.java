package chapters.chapter_05;

import java.util.Scanner;

public class Exercise_08 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter number of students: ");
		
		int numberOfStudents = input.nextInt();
		
		int theHighestScore = 0;
		String theBestStudent = "";
		
		for(int i = 1; i <= numberOfStudents; i++ ){
			
			System.out.println("Enter student " + i + "'s name");
			
			String studentName = input.next();
			
			System.out.println("Enter student " + i + "'s score");
			
			int studentScore = input.nextInt();
			
			if(studentScore > theHighestScore){
				
				theHighestScore = studentScore;
				
				theBestStudent = studentName;
			}
		}
		System.out.println("The name of the student with the highest score: " + theBestStudent);
		
	}
}