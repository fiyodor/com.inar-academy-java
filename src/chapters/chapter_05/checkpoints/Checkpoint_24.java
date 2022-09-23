package chapters.chapter_05.checkpoints;

public class Checkpoint_24 {
	
	public static void main(String[] args) {
		
		int balance = 10;
		while (true) {
		if (balance < 9)
		break;
		balance = balance - 9;  // because of break it terminates  output is 1
		}
		System.out.println("Balance is " 
		+ balance);
		
		
		int balancee = 10;
		while (true) {
		if (balancee < 9)
		continue;
		balancee = balancee - 9;  // because of continue it doesnt count 2nd iteration
		
		System.out.println("Balance is  " + balancee);
	}

}
}
