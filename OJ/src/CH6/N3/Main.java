package CH6.N3;

import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int n = sc.nextInt();
		
		System.out.println((x + n - 1) / n);
		
		sc.close();
	}
}