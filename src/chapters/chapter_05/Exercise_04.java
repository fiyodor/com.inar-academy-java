package chapters.chapter_05;

public class Exercise_04 {

	public static void main(String[] args) {

		System.out.println("Miles    Kilometers");

		for (int i = 1; i < 11; i++) {

			double kilometer = (i * 1.609);
			
			System.out.println( i + "        " + (int)(kilometer * 1000) / 1000.0 );
		}
	}

}
