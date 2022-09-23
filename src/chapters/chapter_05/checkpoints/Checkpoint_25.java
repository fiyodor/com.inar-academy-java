package chapters.chapter_05.checkpoints;

public class Checkpoint_25 {
	public static void main(String[] args) {
		
		int sum = 0;
		for (int i = 0; i < 4; i++) {
			if (i % 3 == 0) continue;
				sum += i;
			}
		System.out.println(sum);
		
		int j = 0 ; 
		int result = 0;
		while (j < 4) {
		if (j % 3 == 0){
			j++;
			continue;   // we cant reach command j++ because of continue. it is an infite loop in if statement we can add j++
		}
		result += j;
		j++;
		}
		System.out.println(result);
		}
	}

