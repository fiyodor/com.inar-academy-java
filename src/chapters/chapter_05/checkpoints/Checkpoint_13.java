package chapters.chapter_05.checkpoints;

public class Checkpoint_13 {

	public static void main(String[] args) {
		
		long sum = 0;
		for (int i = 0; i <= 1000; i++)
		sum = sum + i;
		System.out.println(sum);
		
		int j = 0;
		int summ = 0;
		
		while(j <= 1000){
			
			summ += j;
			
			j++;
		}
		System.out.println(summ);
		
		int k = 0;
		int summm = 0;
		
		do{
			summm += k;
			
			k++;
		
			}while(k <= 1000);
		
		System.out.println(summm);
		
	}
}
