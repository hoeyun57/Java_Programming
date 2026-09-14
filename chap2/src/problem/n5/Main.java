package problem.n5;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String student1, student2;
		int late1, late2;
		int absence1, absence2;
		
		System.out.print("학생1>>");
		student1 = scanner.next();
		late1 = scanner.nextInt();
		absence1 = scanner.nextInt();

		System.out.print("학생2>>");
		student2 = scanner.next();
		late2 = scanner.nextInt();
		absence2 = scanner.nextInt();
		
		int res1 = late1 * 3 + absence1 * 8;
		int res2 = late2 * 3 + absence2 * 8;
		
		System.out.print(student1 + "의 감점은 " + res1 + ", ");
		System.out.println(student2 + "의 감점은 " + res2);
		
		if(res1 < res2) {
			System.out.print(student1 + "의 출석 점수가 더 높음. ");
			System.out.println(student1 + "출석 점수는 " + (100 - res1));
		}
		else if(res1 > res2) {
			System.out.print(student2 + "의 출석 점수가 더 높음. ");
			System.out.println(student2 + "출석 점수는 " + (100 - res2));
		}
		else {
			System.out.println("점수 동일");
		}
		scanner.close();
	}
}