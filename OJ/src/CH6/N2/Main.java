package CH6.N2;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		String chk = sc.nextLine();
		
		if(str.contains(chk)) {
			str = str.replace(chk, chk.toUpperCase());
			System.out.println(str);
		}
		sc.close();
	}
}