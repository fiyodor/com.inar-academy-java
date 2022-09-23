package chapters.chapter_05;

import java.util.Scanner;

public class Exercise_48 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println(" Enter String: ");
		
		String str = input.nextLine() ;
		
		String result = "" ;
		
		for (int i= 0 ; i< str.length() ; i+=2) {
			
			result += str.charAt(i) + "";
		}
		System.out.println(result);
	}

}