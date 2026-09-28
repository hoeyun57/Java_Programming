### 문제 설명
다음 프로그램은 Vehicle 클래스를 상속받는 Car 클래스를 이용하여 자동차의 최종 속도를 계산하는 프로그램이다.

주어진 코드의 A~D 빈칸을 올바르게 채워 프로그램을 완성하시오.
- Car 클래스는 Vehicle 클래스를 상속받는다.
- Car 생성자에서는 부모 클래스의 생성자를 호출한다.
- getSpeed() 메소드를 오버라이딩한다.
- 자동차의 최종 속도는 기본 속도에 추가 속도 boost를 더한 값이다.

```java
import java.util.Scanner;

class Vehicle {
    int speed;

    Vehicle(int speed) {
        this.speed = speed;
    }

    int getSpeed() {
        return speed;
    }
}

class Car (A) Vehicle {
    int boost;

    Car(int speed, int boost) {
        (B)(speed);
        this.boost = boost;
    }

    (C)
    int getSpeed() {
        return (D);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int speed = sc.nextInt();
        int boost = sc.nextInt();

        Vehicle vehicle = new Car(speed, boost);

        System.out.println("Speed: " + vehicle.getSpeed());
    }
}
```

### [입력]
첫 번째 줄에 기본 속도 speed와 추가 속도 boost가 공백으로 구분되어 주어진다.  
0 <= speed <= 200  
0 <= boost <= 100  

### [출력]
최종 속도를 다음 형식으로 출력한다.  
Speed: 최종속도  

#### [입력 1]
```
80 20
```
#### [출력 1]
```
Speed: 100
```