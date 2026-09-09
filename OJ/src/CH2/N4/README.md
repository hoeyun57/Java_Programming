# 문제 4. 윤년 판별

요점: Scanner, 정수 입력, 나머지 연산자(%), 논리 AND(&&)·OR(||)

## 풀이 지침

아래 코드에서 `__1__`, `__2__`처럼 번호가 표시된 빈칸을 알맞은 코드로 바꾸시오. 빈칸 밖의 코드는 수정하지 않으며, 완성한 코드는 Main.java로 저장한다. 입력 안내 문구나 추가 설명은 출력하지 않는다. 모든 입력은 제시된 조건을 만족하며, 프로그램을 한 번 실행할 때 입력 한 건을 처리한다.

## 문제

연도를 나타내는 정수 year를 입력받아 윤년인지 판별하시오. 연도가 4의 배수이면서 100의 배수가 아니거나, 400의 배수이면 윤년이다. 그 외의 연도는 평년이다. 나누어떨어지는지는 나머지 연산자(%)로 확인한다.

## 입력

첫째 줄에 정수 year가 주어진다.
입력 범위: 1 ≤ year ≤ 9,999

## 출력

윤년이면 첫 번째 문장, 평년이면 두 번째 문장을 한 줄로 출력한다.
문장의 year에는 입력받은 연도 값을 넣는다.

```text
year is a leap year.
year is not a leap year.
```

출력의 대소문자, 띄어쓰기, 쉼표와 마침표를 정확히 지킨다. 출력 끝에는 줄바꿈을 한 번 넣는다.

## 입출력 예

### 입력 예

```text
2024
```

### 출력 예

```text
2024 is a leap year.
```

## 빈칸 채우기

```java
// Date: 2026.09.07 | Problem: 4 (ch2)
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new __1__(System.in);
        int year = scanner.__2__();

        if ((year __3__ 4 == 0 && year __4__ 100 != 0)
                __5__ (year % 400 == 0)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
        scanner.close();
    }
}
```