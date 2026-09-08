package CH2.N2;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if ((a + b > c) && (a + c > b)
                && (b + c > a)) {
            System.out.println("A triangle can be formed.");
        } 
        else {
            System.out.println("A triangle cannot be formed.");
        }
        scanner.close();
    }
}