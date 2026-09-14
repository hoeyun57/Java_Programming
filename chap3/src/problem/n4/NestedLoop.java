package problem.n4;
import java.util.Scanner;
public class NestedLoop {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("몇단 까지 출력하는지? ");
		int n = scanner.nextInt();
		
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= 9; j++) {
				System.out.print(i + "*" + j + "=" + i * j);
				System.out.print("\t");
			}
			System.out.println();
		}
		scanner.close();
	}
}