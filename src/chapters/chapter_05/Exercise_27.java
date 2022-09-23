package chapters.chapter_05;

public class Exercise_27 {
	
	public static void main(String[] args) {
		
		int counter = 0;
	
		for(int i = 101; i <= 2100; i++){
			
			if( (i % 4 == 0 && i % 100 != 0) || (i % 400 == 0)){
				
				counter++;
				
				if(counter % 10 == 0){
				
					System.out.println(i);
				}
				else{
				
					System.out.print(i + " ");
				}
		
			}
		}
		System.out.println();
		
		System.out.println("There are " + counter + " leap years from 101 to 2100");
	}
}


