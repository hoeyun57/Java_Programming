package practice.n8;

import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("정수를 몇 개 저장하시겠습니까>>");
		int n = scanner.nextInt();
		
		int arr[] = new int[n];
		System.out.print("랜덤한 정수들...");
		
		int sum = 0;
		for(int i = 0; i < n; i++) {
			arr[i] = (int)(Math.random() * 100) + 1;
			System.out.print(arr[i] + " ");
			sum += arr[i];
		}
		System.out.println("\n평균은 " + (double)sum / n);
		
		scanner.close();
	}
}