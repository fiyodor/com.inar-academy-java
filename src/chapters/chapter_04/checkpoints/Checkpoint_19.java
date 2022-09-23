package chapters.chapter_04.checkpoints;

public class Checkpoint_19 {
	
	public static void main(String[] args) {
		
		System.out.println(1 + "Welcome " + 1 + 1);  			//1Welcome 11
		
		System.out.println(1 + "Welcome " + (1 + 1));			//1Welcome 2
		
		System.out.println(1 + "Welcome " + ('\u0001' + 1));	//1Welcome 2
		
		System.out.println(1 + "Welcome " + 'a' + 1);			//1Welcome a1
		
	}


}
