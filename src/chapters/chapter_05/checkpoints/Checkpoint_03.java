package chapters.chapter_05.checkpoints;

public class Checkpoint_03 {
	
	public static void main(String[] args) {
		
		int i = 1;
		while (i < 10)
		if (i % 2 == 0)
		System.out.println(i); //infinite because i is not increasing, always 1
		
		int ii = 1;
		while (ii < 10)
		if (ii % 2 == 0)
		System.out.println(ii++);  //infinite because i is always the same
		
		
		
		int iii = 1;
		while (iii < 10)
		if ((iii++) % 2 == 0)
		System.out.println(iii); // 3 5 7 9

}
}
