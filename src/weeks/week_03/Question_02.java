package weeks.week_03;

import java.util.*;

public class Question_02 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Enter 3 ages");
		
		int age1 = input.nextInt();
		int age2 = input.nextInt();
		int age3 = input.nextInt();
		
		int oldest = age1;
		int youngest = age3;
		
		if (oldest < age2){
			
			oldest = age2;
		}
			
		if( oldest < age3){
				
			oldest = age3;
		}
		if (youngest > age1){
			
			youngest = age1;
		}	
		if ( youngest > age2 ){
			 
			youngest = age2;
		}
		System.out.println("The youngest is " + youngest + " years old");
		System.out.println("The oldest is " + oldest + " years old");
	}
		
}


