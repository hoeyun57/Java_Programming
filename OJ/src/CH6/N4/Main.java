package CH6.N4;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double n = sc.nextDouble();
		
		double sum = 4800 + n * 1000;
		int res = (int)Math.round(sum / 100.0) * 100;
		System.out.println(res);
		
		sc.close();
	}
}