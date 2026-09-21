다음은 비정방형 배열 생성, 초기화, 출력, 예외 처리 과정으로 3개의 printArray(), run1(), run2()를 구현하는 프로그램이다.

```
******************************************************************************  
* 문제: 1
* 요점: 비정방형 배열 생성, 초기화, 출력하는 문제로 순서대로 연결하여 작성
* 실행 결과 1을 참고하여 printArray()를  함수를 완성하시오.
******************************************************************************  
새로운 프로젝트와 Ch3.java 소스파일을 만든 후 아래 코드를 복사하여 소스파일에 삽입하고,
printArray()는 행의 개수와 각 행의 모든 원소를 출력한다.
```
```java
public class Ch3 {
    public static void printArray(double arr[][]) {
    }

    public static void main(String[] args) {
        double array[][] = { {0}, {1,2}, {3,4,5} };
        printArray(array);
        System.out.println();
        System.out.println("Exit.");
    }
}
```

### 실행 결과 1

#### 출력 예 1
```
The number of rows in the array: 3
arr[0] 0.0 
arr[1] 1.0 2.0 
arr[2] 3.0 4.0 5.0 

Exit.
```
```
******************************************************************************
* 문제: 2
* 요점: 비정방형 배열 생성, 초기화, 정수 값 입력 받기(예제 2-4, 3-11, 3-12 참고)
* 실행 결과 2을 참고하여 run2()를  함수를 완성하시오.
******************************************************************************
기존 class Ch3 내에 아래와 같은 run1() 함수와 main() 함수에서 System.out.println()
아래 내용을 추가한다.
```
```java
    public static double[][] run1(Scanner s) {
    }

    public static void main(String[] args) {
        ...
        System.out.println();         // 이상은 기존(문제: 1)과 동일

        scanner 변수 생성 및 초기화;    // 내용 추가 및 필요한 파일 import시킬 것
        double dArr1[][] = run1(scanner);
        printArray(dArr1);
        System.out.println();

        scanner 닫기;
        System.out.println("Exit."); // 기존과 동일
    }
```
```
    아래 [실행 결과 2]를 참고하여 run1() 함수를 완성하시오.
    1. The number of rows in the real-number non-square array: 메시지를 출력
        비정방형 배열의 행의 개수를 입력 받고, 
    2. 비정방형 배열을 선언하고 이 배열을 위한 레퍼런스 배열을 할당받는다. 
    3. for문을 이용하여 각 행별로 필요한 레퍼런스 배열을 할당 받는다.
        이때 각 행의 길이는 그 행의 (인덱스+1) 값과 동일함. 즉 1행은 1개, 4행은 4개
        Input 1 real numbers in row 1: 메시지를 출력, 입력 예 1 참고
    4. 각 행의 길이만큼 키보드로부터 실수 값을 입력 받아 해당 배열 원소에 저장한다. 
        (키보드에서 실수 입력 s.nextDouble())
    5. 생성된 배열을 출력한다.
        The number of rows in the array: 4
        arr[0] 0.0 
        arr[1] 1.0 1.1 
        arr[2] 2.0 2.2 2.4 
        arr[3] 3.0 4.0 5.0 6.0 
```
### 실행 결과 2

... // 기존의 출력과 동일(실행 결과 1)

#### 입력 예
```
4
0
1 1.1
2 2.2 2.4
3 4 5 6
```
#### 출력 예 1
```
The number of rows in the real-number non-square array:
Input 1 real numbers in row 1: 
Input 2 real numbers in row 2: 
Input 3 real numbers in row 3: 
Input 4 real numbers in row 4: 
The number of rows in the array: 4
arr[0] 0.0 
arr[1] 1.0 1.1 
arr[2] 2.0 2.2 2.4 
arr[3] 3.0 4.0 5.0 6.0 

Exit.
```
```
******************************************************************************
* 문제: 3
* 요점: 예외 처리입력 과정에서 발생할 수 있는 유효하지 않은 입력 값에 대해 예외 처리
* 배열의 크기에 대한 예외처리, 배열 크기 만큼 입력에 대한 예외처리를 run2()에 구현한다.
* run2()에서 배열의 크기에 대한 예외 처리 3-1, 3-2, 3-3, 3-4, 3-5 실행 결과를 참고
* [실행 결과 3]을 참고하여 run2()를  함수를 완성하시오.
******************************************************************************
main() 함수에 아래 코드를 추가하고 run1() 함수를 복사하여 run2()로 만들어라.
```
```java
    public static double[][] run2(Scanner s) {
       // 배열의 크기에 대한 예외처리
       // 배열 크기 만큼 입력에 대한 예외처리
    }

    public static void main(String[] args) {
        ...
	printArray(dArr1);
        System.out.println(); // 이상은 기존(문제: 2)과 동일

        double dArr2[][] = run2(scanner);
        printArray(dArr2);
        System.out.println();
        scanner 닫기 ... // 이후 기존 코드
```
```
    아래 [실행 결과 3-1, 3-2, 3-3]은 배열의 크기에 대한 예외처리로
    "The number of rows in the real-number non-square array: "를 잘못 입력했을 때 발생하는 예외 에러이다.

    이 두 Exception을 처리하여 프로그램이 비정상적으로 종료되지 않고 
    [실행 결과 3-4]처럼 출력되도록 run2() 함수를 수정하라. (예제 3-15, 3-17 참고)
    ①  NegativeArraySizeException은 배열의 크기를 음수로 지정 할 경우 예외로
        배열에서 4.5, -3의 경우 Input a positive integer! 메시지를 출력하고 재입력을 요구
    ② InputMismatchException은 정수로 입력할 때 문자를 입력한 경우 예외
    - 문자 abc의 경우 Input an integer! 메시지를 출력하고 재입력을 요구
    - 배열 크기 만큼 정수 입력에서 b, 4a의 경우 Input an integer or a real number! 
        메시지를 출력하고 재입력을 요구

    두 Exception(NegativeArraySizeException와 InputMismatchException)은 
    while() {
        try { }
        catch() { }
        catch() { }
    }
    형식으로 run2()의 [실행 결과 3]을 참고하여 작성해야 한다.
    그리고 import java.util.InputMismatchException; 포함

    아래 [실행 결과 3-5]는 실수나 문자열을 입력했을 경우
    입력된 실수나 문자열은 계속 입력 스트림 버퍼에 남아 있기 때문에 
    이를 버퍼에서 제거하지 않으면 계속해서 같은 실수 또는 문자열이 읽혀지기 때문에 무한루프가 발생한다.
    프로그램이 계속 무한 루프 돌 때는 이클립스의 Console(콘손) 창의 오른쪽 위의 X 버튼 옆의 
    [빨간 사각형 박스]를 누르면 프로그램을 강제로 종료시킬 수 있다.

    이러한 무한루프가 발생하지 않도록 하기 위해서는
    예제 3-17을 참조하여 "현재 입력 스트림에 남아 있는 토큰을 지워 주어야 한다."


    run2()의 결과는 실행 결과 3이다.
```
### 실행 결과 3-1
행의 개수를 입력할 때 양의 정수를 입력하지 않은 경우
```
... // 기존의 출력과 동일
The number of rows in the real-number non-square array: -3
Exception in thread "main" java.lang.NegativeArraySizeException
	at Ch3.run2(Ch3.java:21)   //  21은 행의 번호인데 달라도 됨
	at Ch3.main(Ch3.java:123)   // 123은 행의 번호인데 달라도 됨
```

### 실행 결과 3-2
문자열을 입력한 경우
```
... // 기존의 출력과 동일
The number of rows in the real-number non-square array: abc
Exception in thread "main" java.util.InputMismatchException
	at java.base/java.util.Scanner.throwFor(Scanner.java:939)
	at java.base/java.util.Scanner.next(Scanner.java:1594)
	at java.base/java.util.Scanner.nextInt(Scanner.java:2258)
	at java.base/java.util.Scanner.nextInt(Scanner.java:2212)
	at Ch3.run2(Ch3.java:21)
	at Ch3.main(Ch3.java:123)
```

### 실행 결과 3-3
실수 값을 입력한 경우
```
... // 기존의 출력과 동일
The number of rows in the real-number non-square array: 24.5
Exception in thread "main" java.util.InputMismatchException
	at java.base/java.util.Scanner.throwFor(Scanner.java:939)
	at java.base/java.util.Scanner.next(Scanner.java:1594)
	at java.base/java.util.Scanner.nextInt(Scanner.java:2258)
	at java.base/java.util.Scanner.nextInt(Scanner.java:2212)
	at Ch3.run2(Ch3.java:21)
	at Ch3.main(Ch3.java:123)
```

### 실행 결과 3-4
```
...
The number of rows in the real-number non-square array: -3
Input a positive integer!
The number of rows in the real-number non-square array: 4.5
Input an integer!
The number of rows in the real-number non-square array: abc
Input an integer!
The number of rows in the real-number non-square array: 3
Input 1 real numbers in row 1:

...  배열 크기 만큼 입력에 대한 예외처리 실행 결과
Input 1 real numbers in row 1: a
Input an integer or a real number!
Input 2 real numbers in row 2: 2 b
Input an integer or a real number!
```
### 실행 결과 3-5
```
...
The number of rows in the real-number non-square array: 4.5
Input an integer!
The number of rows in the real-number non-square array: Input an integer!
The number of rows in the real-number non-square array: Input an integer!
... // 동일한 메시지 계속 출력하면서 무한 루프
```
### 실행 결과 3
... // 기존의 출력과 동일(실행 결과 2)

#### 입력 예 1
```
-3
4.5
abc
3 
a 
1
2 b
b b
2 3
c 4 5
4a 50 60
4 5 6
```
#### 출력 예 1
```
The number of rows in the real-number non-square array:
Input a positive integer!
The number of rows in the real-number non-square array:
Input an integer!
The number of rows in the real-number non-square array:
Input an integer!
The number of rows in the real-number non-square array:
Input 1 real numbers in row 1:
Input an integer or a real number!
Input 1 real numbers in row 1:
Input 2 real numbers in row 2:
Input an integer or a real number!
Input 2 real numbers in row 2:
Input an integer or a real number!
Input 2 real numbers in row 2:
Input 3 real numbers in row 3:
Input an integer or a real number!
Input 3 real numbers in row 3:
Input an integer or a real number!
Input 3 real numbers in row 3:
The number of rows in the array: 3     // 3번 실행 결과
arr[0] 1.0 
arr[1] 2.0 3.0 
arr[2] 4.0 5.0 6.0 

Exit.
```