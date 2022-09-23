package chapters.chapter_04;

public class Exercise_25 {
	
	public static void main(String[] args) {
		
		int upperCaseLetter1 = 65 + (int)(Math.random() * (90 - 65));
		int upperCaseLetter2 = 65 + (int)(Math.random() * (90 - 65));
		int upperCaseLetter3 = 65 + (int)(Math.random() * (90 - 65));	
		
		int number1 = (int)(Math.random() * 10);
		int number2 = (int)(Math.random() * 10);
		int number3 = (int)(Math.random() * 10);
		int number4 = (int)(Math.random() * 10);
		
		System.out.println("" + (char)(upperCaseLetter1) + (char)(upperCaseLetter2) + (char)(upperCaseLetter3) + number1 + number2 + number3 + number4);
	}

}
