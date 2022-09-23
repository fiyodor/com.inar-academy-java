package chapters.chapter_05;

public class Exercise_15 {
	
	public static void main(String[] args) {
		
		int charPerLine = 10;
		
		int counter = 1;
		
		for(int i = (int) '!'; i <= '~'; counter++ , i++){
			
			if(counter % 10 == 0){
				
				System.out.println((char)i);
			}
			else{
				
				System.out.print((char)i + " ");
			}
		}
	}

}
