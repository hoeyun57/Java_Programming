다음은 입력으로 주어진 값에 따라 직사각형 객체 하나를 생성하고 넓이와 둘레를 출력하는 프로그램이다.

1. 프로그램 실행 후 두 개의 정수를 입력하면 해당 정수들을 각각 가로와 세로 길이로 가지는 직사각형의 넓이와 둘레 값을 순서대로 출력한다.
2. 이 때 생성자 Rectangle의 중괄호 내 코드를 완성하라.
3. 현재 상태에서 프로그램을 바로 실행하면 입력 정수 값에 상관없이 넓이와 둘레가 0으로 출력된다.

### 입출력 예시:

### 1.
#### 입력
```
3 5
```
#### 출력
```
15
16
```
### 2.
#### 입력
```
20 80
```
#### 출력
```
1600
200
```
### 3.
#### 입력
```
14 27
```
#### 출력
```
378
82
```

```java
import java.util.Scanner;

public class Rectangle {
    int width;
    int height;

    public Rectangle(int width, int height) {
    	// 여기에 코드 입력
    }

    public int getArea() {
    	return width * height;
    }

    public int getPerimeter() {
    	return 2 * width + 2 * height;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int width = scanner.nextInt();
        int height = scanner.nextInt();

        Rectangle rectangle = new Rectangle(width, height);

        System.out.println(rectangle.getArea());
        System.out.println(rectangle.getPerimeter());

        scanner.close();
    }
}
```