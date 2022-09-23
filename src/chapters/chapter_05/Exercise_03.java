package chapters.chapter_05;

public class Exercise_03 {
	
	public static void main(String[] args) {
		
		int kilogram = 1 ;
		
		
		
		System.out.println("Kilograms   Pounds");
		
				for(kilogram = 1; kilogram < 200; kilogram += 2){
					
					double pound = (int)(kilogram * 2.2 * 10) / 10.0;
					
					System.out.println(kilogram+"              " + pound);
					
		}
	}

}
