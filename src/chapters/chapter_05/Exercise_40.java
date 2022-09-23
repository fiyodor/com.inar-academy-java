package chapters.chapter_05;

public class Exercise_40 {
	
	public static void main(String[] args) {
		
		int counterForHead = 0;
		int counterForTail = 0;
		
		double headTail;
		
		for(int i = 1; i <= 1000000; i++){
			
			headTail = (int)(Math.random() * 2);
			
			if(headTail == 0){
				
				counterForTail++;
			}
			else{
				
				counterForHead++;
			}
		}
		System.out.println("Number of heads: " + counterForHead);
		
		System.out.println("Number of tails: " + counterForTail);
		
	}

}
