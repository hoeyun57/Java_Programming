package problem.n1;
import java.util.Scanner;
public class ForSample {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int sum = 0;
		
		System.out.print("횟수 n을 입력하세요: ");
		int n = scanner.nextInt();
		
		for(int i = 1; i <= n; i++) {
			sum += i;
			System.out.print(i);
			if(i <= n - 1) {
				System.out.print("+");
			}
			else {
				System.out.print("=");
				System.out.print(sum);
			}
		}
		scanner.close();
	}
}
