package problem.n3;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int a, b, c; // a = 떡볶이, b = 김말이, c = 쫄면
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("**** 자바 분식입니다. 주문하면 금액을 알려드립니다. ****");
		
		System.out.print("떡볶이 몇 인분>>");
		a = scanner.nextInt();
		System.out.print("김말이 몇 인분>>");
		b = scanner.nextInt();
		System.out.print("쫄면 몇 인분>>");
		c = scanner.nextInt();
		
		int res = a * 2000 + b * 1000 + c * 3000;
		System.out.println("전체 금액은 " + res + "원입니다.");
		
		scanner.close();
	}
}