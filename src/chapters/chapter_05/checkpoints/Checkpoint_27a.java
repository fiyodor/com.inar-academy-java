package chapters.chapter_05.checkpoints;

public class Checkpoint_27a {
	
	public static void main(String[] args) {
		
		for (int i = 1; i < 4; i++) {
			
			for (int j = 1; j < 4; j++) {
			
				if (i * j > 2)
			
					break;   // (i = 1 and j = 3) first syso output is 1 and 2
			
				System.out.println(i * j);
			}
			
			System.out.println(i); // after break the output is 1
			}
	}

}
