package chapters.chapter_05;

import java.util.Scanner;

public class Exercise_51 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the first string: ");
		
		String str1 = input.nextLine();
		
		System.out.println("Enter the second string: ");
		
		String str2 = input.nextLine();
		
		int i = 0;
		
		String common = "";
		
		while(str1.charAt(i) == str2.charAt(i)){
			
			common += str1.charAt(i);
			
			i++;
		}
		if(common.length() > 0){
			
			System.out.println("The commmon prefix is " + common);
		}
		else{
			
			System.out.println(str1 + " and " + str2 + " have no common prefix");
		}
		
		
			
		}
	}


