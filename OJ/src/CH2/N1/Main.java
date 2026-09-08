package CH2.N1;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		
		if((x >= 10 && x <= 200) && (y >= 10 && y <= 300)) {
            System.out.println("The point (" + x + ", " + y + ") is inside the rectangle.");
		}
		else {
            System.out.println("The point (" + x + ", " + y + ") is outside the rectangle.");
		}
		scanner.close();
	}
}