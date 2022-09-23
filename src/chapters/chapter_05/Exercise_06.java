package chapters.chapter_05;

public class Exercise_06 {

	public static void main(String[] args) {

		System.out.println("Miles    Kilometers    |      Kilometers       Miles");

		for (int m = 1, k = 20; m < 11 && k <= 65 ; m ++, k += 5) {

			double km = (int) (m * 1.609 * 1000) / 1000.0;
			double mile = (int) (k / 1.609 * 10000) / 10000.0;

			System.out.println(m + "        " + km + "       |        " + k + "               " + mile);

		}
	}

}
