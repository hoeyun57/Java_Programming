package practice.n13;

import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String course[] = {"C", "C++", "Python", "Java", "HTML5"};
		String grade[] = {"A", "B+", "B", "A+", "D"};
		
		while(true) {
			System.out.print("과목>>");
			String s = scanner.nextLine();
			if(s.equals("그만")) {
				break;
			}
			int i = 0;
			for(i = 0; i < course.length; i++) {
				if(s.equals(course[i])) {
					System.out.println(course[i] + " 학점은 " + grade[i]);
					break;
				}
			}
			if(i == course.length) {
				System.out.println(s + "는 없는 과목입니다.");									
			}
		}
		
		scanner.close();
	}
}