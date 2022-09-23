package chapters.chapter_05;

public class Exercise_26 {
	
	public static void main(String[] args) {
	
		double e = 1;
		
		for(int i = 1; i <= 100000; i++){
			
			for(int j = i; j - 1 >= 1; j--){
			
				e += (1 / j * (j - 1));
			}
			
			if(i == 10000){
				
				System.out.println("e for value " + i + " : " + e);
			}
			else if(i == 20000){
				
				System.out.println("e for value " + i + " : " + e);
			}
			else if(i == 100000){
				
				System.out.println("e for value " + i + " : "  + e);
			}
		}
		
	}
}