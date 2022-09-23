package chapters.chapter_04;

import java.util.Scanner;

public class Exercise_18 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.print("Enter two characters (M, C, I): ");
		
		String str = input.nextLine();
		
		char major = Character.toUpperCase(str.charAt(0));
		
		char status =str.charAt(1);
		
		if (( major == 'M' || major == 'C' || major == 'I') && (status == '1' || status == '2' || status == '3' || status == '4')){
			
			switch(major){
			case 'M' : System.out.print("Mathematics "); break;
			case 'C' : System.out.print("Computer Science "); break;
			case 'I' : System.out.print("Information Technology"); break;
			}
			
			switch(status){
			case '1' : System.out.println("Freshman"); break;
			case '2' : System.out.println("Sophomore"); break;
			case '3' : System.out.println("Junior"); break;
			case '4' : System.out.println("Senior"); break;
			}
		
		}else System.out.println("Invalid input");
		
		}

}
