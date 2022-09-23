package chapters.chapter_05;

public class Exercise_18c {
	
	public static void main(String[] args) {
		
		int line = 6;
		
		for(int i = 1; i <= line; i++){
			
			for(int j = line - i; j >= 1; j--){
				
				System.out.print("  ");
			}
			for(int k = i; k >= 1; k--){
				
				System.out.print(k + " ");
			}
			System.out.println();
		}
		
	}

}
