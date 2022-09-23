package chapters.chapter_05;

public class Exercise_19 {
	
	public static void main(String[] args) {
		
		int line = 8;
		
		for(int i = 1 ; i <= line ; i++) {
			
			for(int j = 1 ; j <= (line * 2) - (2 * i) ; j++ ) {
				
				System.out.print("   ");
			}
			
			for(int k = 0 ; k < i ; k++ ) {
				
				System.out.printf("%3d%s",(int)(Math.pow(2, k)),"   ");
			}
			
			for(int l = i-2; l >= 0 ; l -- ) {
					
				System.out.printf("%3d%s",(int)Math.pow(2, l),"   ");
			}
			
			System.out.println();
		}
	}

}