### [문제 설명]
다음 프로그램은 Shape 클래스를 상속받는 Rectangle 클래스와 Triangle 클래스를 이용하여 두 도형의 넓이를 계산하는 프로그램이다.  
주어진 코드의 (A) ~ (H) 빈칸을 올바르게 채워 프로그램을 완성하시오.
- Rectangle과 Triangle 클래스는 Shape 클래스를 상속받는다.
- 각 자식 클래스의 생성자에서는 super()를 사용하여 부모 클래스의 생성자를 호출한다.
- 각 자식 클래스는 getArea() 메소드를 오버라이딩한다.
- Main에서는 부모 클래스 타입인 Shape으로 자식 객체를 참조한다.

```java
import java.util.Scanner;

class Shape {
    String name;

    Shape(String name) {
        this.name = name;
    }

    double getArea() {
        return 0.0;
    }
}

class Rectangle (A) Shape {
    double width;
    double height;

    Rectangle(double width, double height) {
        (B)("Rectangle");
        this.width = width;
        this.height = height;
    }

    (C)
    double getArea() {
        return (D);
    }
}

class Triangle (E) Shape {
    double width;
    double height;

    Triangle(double width, double height) {
        (F)("Triangle");
        this.width = width;
        this.height = height;
    }

    (G)
    double getArea() {
        return (H);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double width = sc.nextDouble();
        double height = sc.nextDouble();

        Shape shape1 = new Rectangle(width, height);
        Shape shape2 = new Triangle(width, height);

        System.out.printf("%s: %.1f%n",
                shape1.name, shape1.getArea());

        System.out.printf("%s: %.1f%n",
                shape2.name, shape2.getArea());
    }
}
```

### [입력]
첫 번째 줄에 가로 길이 width와 세로 길이 height가 공백으로 구분되어 주어진다.  
1 ≤ width ≤ 100  
1 ≤ height ≤ 100  

### [출력]
첫 번째 줄에는 직사각형의 넓이를 출력하고, 두 번째 줄에는 삼각형의 넓이를 출력한다.  
넓이는 소수점 첫째 자리까지 출력한다.  

#### [입력 예제]
```
10 5
```
#### [출력 예제]
```
Rectangle: 50.0
Triangle: 25.0
```