# 문제 1. 직사각형 내부의 점 판별

요점: Scanner, 정수 입력, 관계 연산자, 논리 AND(&&), if-else

## 풀이 지침

아래 코드에서 `__1__`, `__2__`처럼 번호가 표시된 빈칸을 알맞은 코드로 바꾸시오. 빈칸 밖의 코드는 수정하지 않으며, 완성한 코드는 Main.java로 저장한다. 입력 안내 문구나 추가 설명은 출력하지 않는다. 모든 입력은 제시된 조건을 만족하며, 프로그램을 한 번 실행할 때 입력 한 건을 처리한다.

## 문제

2차원 평면에 왼쪽 아래 꼭짓점이 (10, 10), 오른쪽 위 꼭짓점이 (200, 300)인 직사각형이 있다. 정수 좌표 (x, y)를 입력받아 점이 직사각형 내부에 있는지 판별하시오. 경계선과 꼭짓점에 있는 점도 내부에 포함한다.

## 입력

첫째 줄에 정수 x와 y가 공백으로 구분되어 주어진다.
입력 범위: -10,000 ≤ x, y ≤ 10,000

## 출력

내부이면 첫 번째 문장, 외부이면 두 번째 문장을 한 줄로 출력한다.
문장의 x와 y에는 입력받은 정수 값을 넣는다.

```text
The point (x, y) is inside the rectangle.
The point (x, y) is outside the rectangle.
```

출력의 대소문자, 띄어쓰기, 쉼표와 마침표를 정확히 지킨다. 출력 끝에는 줄바꿈을 한 번 넣는다.

## 입출력 예

### 입력 예

```text
50 50
```

### 출력 예

```text
The point (50, 50) is inside the rectangle.
```

## 빈칸 채우기

```java
// Date: 2026.09.07 | Problem: 1 (ch2)
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new __1__(System.in);
        int x = scanner.__2__();
        int y = scanner.__3__();

        if ((x >= 10 __4__ x <= 200)
                __5__ (y >= 10 __6__ y <= 300)) {
            System.out.println("The point (" + x + ", " + y
                    + ") is inside the rectangle.");
        } else {
            System.out.println("The point (" + x + ", " + y
                    + ") is outside the rectangle.");
        }
        scanner.close();
    }
}
```