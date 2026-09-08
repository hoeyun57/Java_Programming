package CH2.N3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();

        if (x > 0 && y > 0) {
            System.out.println("Quadrant 1");
        } 
        else if (x < 0 && y > 0) {
            System.out.println("Quadrant 2");
        } 
        else if (x < 0 && y < 0) {
            System.out.println("Quadrant 3");
        } 
        else {
            System.out.println("Quadrant 4");
        }
        scanner.close();
    }
}