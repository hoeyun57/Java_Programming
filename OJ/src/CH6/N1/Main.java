package CH6.N1;

import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
		
		int len = s.length();
		
		if(len < 2 || s.charAt(0) != '$' || s.charAt(len - 1) != '#') {
			sc.close();
			return;
		}
		s = s.replace("$", "");
		s = s.replace("#", "");
		String[] res = s.split(",");
		for(String i : res) {
			System.out.println(i);
		}
		
		sc.close();
	}
}