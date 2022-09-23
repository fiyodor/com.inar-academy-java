package chapters.chapter_05;

public class Exercise_18d{
	
	public static void main(String[] args){
		
		for (int i = 0; i < 6; i++){			
			
			for (int j = 0; j < i; j++){				
				
				System.out.print("  ");
			}
			
			for (int k = 0; k < 6 - i; k++){	
				
				System.out.print((k + 1) + " ");
			}
			
			System.out.println();								
		}
	}
}