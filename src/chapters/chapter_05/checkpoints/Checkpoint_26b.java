package chapters.chapter_05.checkpoints;

public class Checkpoint_26b {

	public static void main(String[] args) {
		int sum = 0;
		int number = 0;

		while (number < 20) {
			number++;
			if(number != 10 && number != 11)
			sum += number;
		}

		System.out.println("The sum is " + sum);
	}
}
