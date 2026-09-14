package problem.n7;

import java.util.Scanner;
public class Main1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("월을 입력하세요(1~12)>>");
		int month = scanner.nextInt();
		
		if(3 <= month && month <= 5) {
			System.out.println("따뜻한 봄");
		}
		else if(6 <= month && month <= 8) {
			System.out.println("바다가 즐거운 여름");			
		}
		else if(9 <= month && month <= 11) {
			System.out.println("낙엽이 지는 아름다운 가을");						
		}
		else {
			System.out.println("눈 내리는 하얀 겨율");									
		}
		scanner.close();
	}
}