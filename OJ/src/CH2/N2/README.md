# 문제 2. 삼각형 성립 조건 판별


요점: Scanner, 정수 입력, 덧셈, 관계 연산자, 논리 AND(&&), if-else

## 풀이 지침

아래 코드에서 `__1__`, `__2__`처럼 번호가 표시된 빈칸을 알맞은 코드로 바꾸시오. 빈칸 밖의 코드는 수정하지 않으며, 완성한 코드는 Main.java로 저장한다. 입력 안내 문구나 추가 설명은 출력하지 않는다. 모든 입력은 제시된 조건을 만족하며, 프로그램을 한 번 실행할 때 입력 한 건을 처리한다.

## 문제

세 변의 길이를 나타내는 양의 정수 a, b, c를 입력받아 삼각형을 만들 수 있는지 판별하시오. 삼각형을 만들려면 어떤 두 변의 길이의 합도 나머지 한 변의 길이보다 커야 한다. 합이 같은 경우에는 삼각형을 만들 수 없다.

## 입력

첫째 줄에 양의 정수 a, b, c가 공백으로 구분되어 주어진다.
입력 범위: 1 ≤ a, b, c ≤ 10,000

## 출력

삼각형을 만들 수 있으면 첫 번째 문장, 만들 수 없으면 두 번째 문장을 한 줄로 출력한다.

```text
A triangle can be formed.
A triangle cannot be formed.
```

출력의 대소문자, 띄어쓰기, 쉼표와 마침표를 정확히 지킨다. 출력 끝에는 줄바꿈을 한 번 넣는다.

## 입출력 예

### 입력 예

```text
3 4 5
```

### 출력 예

```text
A triangle can be formed.
```

## 빈칸 채우기

```java
// Date: 2026.09.07 | Problem: 2 (ch2)
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new __1__(System.in);
        int a = scanner.__2__();
        int b = scanner.__3__();
        int c = scanner.__4__();

        if ((a + b > c) __5__ (a + c > b)
                __6__ (b + c > a)) {
            System.out.println("A triangle can be formed.");
        } __7__ {
            System.out.println("A triangle cannot be formed.");
        }
        scanner.close();
    }
}
```