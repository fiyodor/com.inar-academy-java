package chapters.chapter_05;

public class Exercise_10 {
	
	public static void main(String[] args) {
		
		String numbers = "";
		
		int count = 0;
		int numberOfLine = 10 ;
		
		for(int i = 100; i < 1001; i++ ){
			
			if( i %5 == 0 && i %6 == 0){
				
				count++;
				
				if(count % numberOfLine == 0){
					
					System.out.println(i);
				}
				else{
					
					System.out.print(i + " ");
				}
			}
		}
			
	}

}
