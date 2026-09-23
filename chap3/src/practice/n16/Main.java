package practice.n16;

import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("양의 정수를 입력하세요. -1은 입력 끝>>");
		int sum = 0;
		int cnt = 0;
		while(true) {
			String s = scanner.next();
			try {
				int n = Integer.parseInt(s);
				if(n == -1) {
					break;
				}
				if(n > 0) {
					sum += n;
					cnt++;					
				}
				else {					
					System.out.println(s + " 제외");
				}
			}
			catch(NumberFormatException e) {
				System.out.println(s + " 제외");
			}
		}
		
		System.out.println("평균은 " + (double)sum / cnt);
		scanner.close();
	}
}