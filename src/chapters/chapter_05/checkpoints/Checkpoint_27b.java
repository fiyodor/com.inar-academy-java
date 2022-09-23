package chapters.chapter_05.checkpoints;

public class Checkpoint_27b {

	public static void main(String[] args) {

		for (int i = 1; i < 4; i++) {
			
			for (int j = 1; j < 4; j++) {
				
				if (i * j > 2)
					continue;      
				System.out.println(i * j);
			}
			System.out.println(i);
		}

	}	/* (i = 1 and j = 3) first continue executes. 1 and 2. syso i = 1
	    (i = 2 and j = 2) second continue executes. 2. syso i = 2
	    (i = 3 and j = 1) third continue executes syso i = 3 */

}
