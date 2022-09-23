package chapters.chapter_05.checkpoints;

public class Checkpoint_17 {
	
	public static void main(String[] args) {
int counter = 0;
		for (int i = 0; i < 10; i++){
			for (int j = 0; j < i; j++){
			System.out.println(i * j);
			counter++;
			}
			
		}
		System.out.println(counter);
	}
}// println is executed 45 times