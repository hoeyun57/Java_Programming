package CH3.N4;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    public static void printArray(double arr[][]) {
    	System.out.println("The number of rows in the array: " + arr.length);
    	for(int i = 0; i < arr.length; i++) {
    		System.out.printf("arr[%d] ", i);
    		for(int j = 0; j < arr[i].length; j++) {
    			System.out.print(arr[i][j] + " ");
    		}
    		System.out.println();
    	}
    }
    
    public static double[][] run1(Scanner s) {
    	System.out.println("The number of rows in the real-number non-square array:");
    	int n = s.nextInt();
    	
    	double[][] res = new double[n][];
    	for(int i = 0; i < n; i++) {
    		res[i] = new double[i + 1];
    		System.out.println("Input " + (i + 1) + " real numbers in row " + (i + 1) +":");
    		for(int j = 0; j < res[i].length; j++) {
    			res[i][j] = s.nextDouble();
    		}
    	}
    	return res;
    }
    
    public static double[][] run2(Scanner s) {
    	double res[][];
    	
    	while(true) {
    		System.out.println("The number of rows in the real-number non-square array:");
    		try {
    			int n = s.nextInt();
    			
    			res = new double[n][];
    			break;
    		}
    		catch(NegativeArraySizeException e) {
    			System.out.println("Input a positive integer!");
    			s.nextLine();
    		}
    		catch(InputMismatchException e) {
    			System.out.println("Input an integer!");
    			s.nextLine();    			
    		}
    	}
    	
    	for(int i = 0; i < res.length; i++) {
    		while(true) {
    			try {
    				res[i] = new double[i + 1];
    				
    				System.out.println("Input " + (i + 1) + " real numbers in row " + (i + 1) + ":");
    				
    				for (int j = 0; j < res[i].length; j++) {
    					res[i][j] = s.nextDouble();
    				}	
    				
    				break;
    			}
    			catch(InputMismatchException e) {
    				System.out.println("Input an integer or a real number!");
    				s.nextLine();    			
    			}    			
    		}
    	}
    	
    	return res;
    }

    public static void main(String[] args) {
        double array[][] = { {0}, {1,2}, {3,4,5} };
        printArray(array);
        System.out.println();

        Scanner scanner = new Scanner(System.in);
        double dArr1[][] = run1(scanner);
        printArray(dArr1);
        System.out.println();
        
        double dArr2[][] = run2(scanner);
        printArray(dArr2);
        System.out.println();

        scanner.close();
        System.out.println("Exit.");
    }
}