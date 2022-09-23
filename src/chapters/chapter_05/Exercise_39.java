package chapters.chapter_05;

public class Exercise_39 {
	
	public static void main(String[] args) {

		double goalAmount = 30000;
		
		double salesAmount;
		
		double commission;
		
		double balance;
		
		salesAmount = 0;
		
		do{
			
			balance = commission = 0;
			
			salesAmount += 0.01;

			if(salesAmount > 10000){
				
				commission += (balance = salesAmount - 10000) * 0.12;
			}
			else if(salesAmount > 5000){
				
				commission += (balance -= balance - 5000) * 0.10;
			}
			else if(salesAmount > 0){
				
				commission += balance * 0.08;
			}
		}
		while(commission < goalAmount);

			System.out.printf("Minimum sales to earn $30,000: $%.0f\n", salesAmount);
	}
}