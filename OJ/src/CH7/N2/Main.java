package CH7.N2;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		Map<String, Integer> scores = new LinkedHashMap<>();
		
		double sum = 0;
		
		for(int i = 0; i < n; i++) {
			String name = sc.next();
			int score = sc.nextInt();
			
			scores.put(name, score);
			sum += score;
		}
		
		double avg = sum / n;
		
		System.out.printf("Average: %.2f\n", avg);
		
		boolean t = true;
		System.out.print("Students: ");
		for(Map.Entry<String, Integer> entry : scores.entrySet()) {
			if(entry.getValue() >= avg) {
				if(!t) {
					System.out.print(", ");
				}
				
				System.out.print(entry.getKey());
				t = false;
			}
		}
		System.out.println();
		sc.close();
	}
}