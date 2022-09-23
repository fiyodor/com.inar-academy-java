package chapters.chapter_05;

public class Exercise_07 {
	
	public static void main(String[] args) {
	
		int tuitionInTenthYear = 0;
		int tuition = 10000;
		int total = 0;
		
		for(int i = 1 ; i < 15 ; i++){
			
			tuition += tuition * 0.05;
		
			if(i > 10){
				
				total += tuition;
			}
			if(i == 10){
				
			 tuitionInTenthYear = tuition;
			}
		}
		
		System.out.println("Tuition in ten years: $" + tuitionInTenthYear);
		
		System.out.println("Total cost for four years' worth of tuition after the tenth year: $" + total);
		
	}
	

}
