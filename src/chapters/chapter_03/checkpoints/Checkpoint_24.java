package chapters.chapter_03.checkpoints;

public class Checkpoint_24 {
	public static void main(String[] args) {
		
		java.util.Scanner input = new java.util.Scanner(System.in);
		double x = input.nextDouble();
		double y = input.nextDouble();
		double z = input.nextDouble();
		System.out.println("(x < y && y < z) is " + (x < y && y < z));
		System.out.println("(x < y || y < z) is " + (x < y || y < z));
		System.out.println("!(x < y) is " + !(x < y));
		System.out.println("(x + y < z) is " + (x + y < z));
		System.out.println("(x + y > z) is " + (x + y > z));
		
		
	}
	
	/*result is 
	 * 
	 * (x < y && y < z) is true
		(x < y || y < z) is true
		!(x < y) is false
		(x + y < z) is true
		(x + y > z) is false
	 */

}