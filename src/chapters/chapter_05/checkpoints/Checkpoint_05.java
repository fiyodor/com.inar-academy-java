package chapters.chapter_05.checkpoints;

public class Checkpoint_05 {
	
	public static void main(String[] args) {
		
		
		int x = 80000000;
		while (x > 0)
		x++;
		System.out.println("x is " + x);
	}

}
// x is -2147483648 because integer flows