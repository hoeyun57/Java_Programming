package CH4.N1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int cnt = 0;

        System.out.println("Enter integers followed by -1 at the end.");

        int n = scanner.nextInt();

        while (n != -1) {
            if (n < 0) {
                System.out.println(n + " Excluding");
            } 
            else {
                sum += n;
                cnt++;
            }

            n = scanner.nextInt();
        }

        if (cnt == 0) {
        	System.out.println("-1 Excluding");
            System.out.println("No number entered.");
        } 
        else {
            double avg = (double) sum / cnt;

            System.out.println("The number of integers is " + cnt + ",The average is " + avg);
        }

        scanner.close();
    }
}