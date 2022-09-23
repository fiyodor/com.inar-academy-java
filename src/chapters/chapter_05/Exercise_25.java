package chapters.chapter_05;

public class Exercise_25 {
	
	public static void main(String[] args) {
	
		double pi = 0;
		
		for(int i = 1; i <= 100000; i++){
			
			pi += 4 * (Math.pow(-1, i + 1) / (2 * i - 1));
			
			if(i == 10000){
				
				System.out.println("Pi for value " + i + " : " + pi);
			}
			else if(i == 20000){
				
				System.out.println("Pi for value " + i + " : " + pi);
			}
			else if(i == 100000){
				
				System.out.println("Pi for value " + i + " : " + pi);
			}
		}
		
	}
}