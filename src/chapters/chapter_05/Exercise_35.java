package chapters.chapter_05;

public class Exercise_35 {

	public static void main(String[] args) {
		
		double sum = 1 / (1 + Math.pow(2, 1 / 2));
		
		for(int i = 2; i <= 624; i++){
		
			sum += 1 / (Math.pow(i, 1 / 2) + Math.pow(i + 1, 1 / 2)); 
			
		}
		System.out.println(sum);
	}
}
