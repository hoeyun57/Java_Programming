package CH7.N1;

import java.util.Scanner;

public class Main {
    // Write the generic method "swapElements" here
	public static <T> void swapElements(T[] array, int idx1, int idx2) {
		if(idx1 < 0 || idx2 < 0 || idx1 >= array.length || idx2 >= array.length) {
			return;
		}
		
		T temp = array[idx1];
		array[idx1] = array[idx2];
		array[idx2] = temp;
	}
	
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
    	
        // Test 1
        Integer[] integerArray = {10, 20, 30, 40, 12, 89, 432, 123, 4598};
        int index1 = scanner.nextInt();
        int index2 = scanner.nextInt();
        swapElements(integerArray, index1, index2);
        System.out.println("Integer Array after swap: " + java.util.Arrays.toString(integerArray));
        
        scanner.close();
    }
}
