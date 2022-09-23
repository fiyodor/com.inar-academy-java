package chapters.chapter_05;

public class Exercise_23 {
	
	public static void main(String[] args) {
		
		double sumLeftRight =0.0;
		
		for(double i = 1.0; i <= 5000.0; i++){
			
			sumLeftRight += 1 / i;
		}
		System.out.println("Summation of series left to right: " + sumLeftRight);
		
		double sumRightLeft = 0.0;
		
		for(double i = 5000.0; i >= 1.0; i--){
			
			sumRightLeft += 1 / i;
		}
		System.out.println("Summation of series right to left: " + sumRightLeft);
		
		System.out.println("Summation of series (right to left) - (left to right) = " + (sumRightLeft - sumLeftRight));
	}

}
