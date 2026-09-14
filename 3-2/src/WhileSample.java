import java.util.Scanner;
public class WhileSample {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int sum = 0;
		
		System.out.print("횟수 n을 입력하세요: ");
		int n = scanner.nextInt();
		int i = 1;
		while(i <= n) {
			sum += i;
			System.out.print(i);
			if(i <= n - 1) {
				System.out.print("+");
			}
			else {
				System.out.print("=");
				System.out.print(sum);
			}
			i++;
		}
		scanner.close();
	}
}
