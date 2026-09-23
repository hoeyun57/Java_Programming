다음은 초기 포인트 설정 후 입력으로 적립 포인트 값을 받고 그 합을 출력하는 프로그램이다.

1. 입력 정수는 총 4개이다.  
a. 초기 포인트  
b. 첫번째 적립 포인트  
c. 두번째 적립 1회 당 포인트  
d. 두번째 적립의 반복 횟수  

2. 이에 대해 프로그램은 다음을 출력한다.  
e. a와 b 입력 후: 첫번째 적립 후 포인트 합계 (a + b)  
f. c와 d 입력 후: 모든 포인트 합계 (a + b + c * d)  

3. 이 때 포인트를 적립하는 함수를 제공하는 두 오버로딩된 메소드의 선언부를 작성하라.

4. 두 메소드 모두 접근 지정은 public, 반환형은 void로 작성할 것.

### 입출력 예시:

### 1.
#### 입력
```
1 2 3 4
```
#### 출력
```
3
15
```
### 2.
#### 입력
```
0 10 6 2
```
#### 출력
```
10
22
```
### 3.
#### 입력
```
138 15 31 8
```
#### 출력
```
153
401
```
```java
import java.util.Scanner;

public class PointAccount {
    private int points;

    public PointAccount(int points) {
        this.points = points;
    }

    // amount만큼 포인트를 적립하는 메소드 선언
     { // 중괄호 앞에 위치할 메소드 선언부 채워넣기
    	points += amount;
    }

    // amount를 count번 적립하는 메소드 선언
     { // 중괄호 앞에 위치할 메소드 선언부 채워넣기
    	points += amount * count;
    }

    public int getPoints() {
        return points;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int initialPoints = scanner.nextInt();
        PointAccount account = new PointAccount(initialPoints);

        int amount1 = scanner.nextInt();
        account.add(amount1);
        System.out.println(account.getPoints());

        int amount2 = scanner.nextInt();
        int count = scanner.nextInt();
        account.add(amount2, count);
        System.out.println(account.getPoints());

        scanner.close();
    }
}
```