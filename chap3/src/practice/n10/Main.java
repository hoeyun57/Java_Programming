package practice.n10;

import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n[][] = new int[4][4];
		
		System.out.println("4x4 배열에 랜덤한 값을 저장한 후 출력합니다.");
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 4; j++) {
				n[i][j] = (int)(Math.random() * 256);
				System.out.print(n[i][j] + "\t");
			}
			System.out.println();
		}
		
		System.out.print("임계값 입력>>");
		int num = scanner.nextInt();
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 4; j++) {
				if(n[i][j] > num) {
					System.out.print(255 + "\t");					
				}
				else {					
					System.out.print(0 + "\t");					
				}
			}
			System.out.println();
		}
		
				
		scanner.close();
	}
}