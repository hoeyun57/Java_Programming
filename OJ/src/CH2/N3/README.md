# 문제 3. 점이 속한 사분면 판별

요점: Scanner, 실수 입력(double), 관계 연산자, if-else if-else

## 풀이 지침

아래 코드에서 `__1__`, `__2__`처럼 번호가 표시된 빈칸을 알맞은 코드로 바꾸시오. 빈칸 밖의 코드는 수정하지 않으며, 완성한 코드는 Main.java로 저장한다. 입력 안내 문구나 추가 설명은 출력하지 않는다. 모든 입력은 제시된 조건을 만족하며, 프로그램을 한 번 실행할 때 입력 한 건을 처리한다.

## 문제

2차원 평면 위의 점 (x, y)를 실수형(double)으로 입력받아 점이 속한 사분면을 판별하시오. x와 y가 모두 양수이면 제1사분면, x가 음수이고 y가 양수이면 제2사분면, 모두 음수이면 제3사분면, x가 양수이고 y가 음수이면 제4사분면이다.

## 입력

첫째 줄에 실수 x와 y가 공백으로 구분되어 주어진다. 소수점은 점(.)으로 표기한다.
입력 범위: -10,000 ≤ x, y ≤ 10,000, 소수점 이하 최대 4자리
x와 y는 모두 0이 아니며, 축 위의 점과 원점은 입력되지 않는다.

## 출력

점이 속한 사분면에 따라 Quadrant 1, Quadrant 2, Quadrant 3, Quadrant 4 중 하나를 한 줄로 출력한다.

대문자 Q로 시작하고 단어와 숫자 사이에 공백 한 칸을 둔다. 마침표는 붙이지 않는다. 출력 끝에는 줄바꿈을 한 번 넣는다.

## 입출력 예

### 입력 예

```text
-3.2 7.1
```

### 출력 예

```text
Quadrant 2
```

## 빈칸 채우기

```java
// Date: 2026.09.07 | Problem: 3 (ch2)
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new __1__(System.in);
        double x = scanner.__2__();
        double y = scanner.__3__();

        if (x > 0 && y > 0) {
            System.out.println("Quadrant 1");
        } __4__ (x < 0 && y > 0) {
            System.out.println("Quadrant 2");
        } __5__ (__6__) {
            System.out.println("Quadrant 3");
        } else {
            System.out.println("Quadrant 4");
        }
        scanner.close();
    }
}
```