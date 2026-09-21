package CH3.N3;

import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n = 0;
		while(true) {
			System.out.println("Enter the size of the array.");
			try {
				n = scanner.nextInt();
				if(n <= 3 || n >= 10) {
					System.out.println("[error] Out of range.");
					continue;
				}
				break;
			}
			catch(InputMismatchException e){
				System.out.println("[error] Please enter an integer.");
				scanner.nextLine();
			}			
		}
		
		int arr[] = new int[n];
		int i = 0;
		while(i < n) {
			try {
				arr[i] = scanner.nextInt();
				i++;
			}
			catch(InputMismatchException e){
				System.out.println("[error] Please enter an integer.");
                scanner.nextLine();
			}
		}
		int max = arr[0], min = arr[0];
		for(i = 0; i < n; i++) {
			if(max < arr[i]) {
				max = arr[i];
			}
			if(min > arr[i]) {
				min = arr[i];
			}
		}

		System.out.println("Enter " + n + " Input value : " + Arrays.toString(arr));
		System.out.println("Maximum value : " + max);
		System.out.println("Minimum value : " + min);
		
		scanner.close();
	}
}
