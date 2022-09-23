package chapters.chapter_05;

public class Exercise_05 {
	
	public static void main(String[] args) {
		
		System.out.println("Kilograms Pounds       |      Pounds       Kilograms");
		
		for(int kg = 1, p = 20 ; kg < 200 && p <= 515 ; kg += 2, p += 5){
			
			double pound = (int)(kg * 2.2 * 10) / 10.0; 
			double kilogram = (int)(pound / 2.2 * 10) / 10.0;

			System.out.println( kg + "            " + pound + "       |      " + p + "                 " + kilogram);
			
		}
	}

}
