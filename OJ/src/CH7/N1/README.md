임의의 타입 T를 요소로 가지는 배열에서, 주어진 두 인덱스의 요소를 안전하게 교환(Swap)하는 제네릭 메서드 swapElements를 작성하세요.

기능: array 내의 index1 위치 요소와 index2 위치 요소를 서로 교환해야 합니다.   
예외 처리: 두 인덱스가 배열 범위를 벗어날 경우(음수 또는 배열 길이 이상)에는 아무 작업도 수행하지 않아야 합니다.  
제공 코드 구조:
```java
import java.util.Scanner;

public class Main {
    // Write the generic method "swapElements" here

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
    	
        // Test 1
        Integer[] integerArray = {10, 20, 30, 40, 12, 89, 432, 123, 4598};
        int index1 = scanner.nextInt();
        int index2 = scanner.nextInt();
        swapElements(integerArray, index1, index2);
        System.out.println("Integer Array after swap: " + java.util.Arrays.toString(integerArray));        
    }
}
```
### 예시 1
#### 입력 
```
0 3
```
#### 출력
```
Integer Array after swap: [40, 20, 30, 10, 12, 89, 432, 123, 4598]
```
### 예시 2
#### 입력
```
0 100
```
#### 출력
```
Integer Array after swap: [10, 20, 30, 40, 12, 89, 432, 123, 4598]
```