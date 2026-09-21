배열의 크기(3보다 크고 10 작은)를 입력받아 최대값, 최소값을 출력하는 프로그램으로 요구사항과 입력 예와 출력 예를 참고하여 프로그램을 작성하시오.

### [요구사항]
입력 과정에서 발생할 수 있는 유효하지 않은 입력 값(범위 초과, 문자 입력 등)에 대해 적절한 예외(Exception) 처리를 적용하여 최대값, 최소값 출력

  Exception 처리하여 프로그램이 비정상적으로 종료되지 않음
   - InputMismatchException은 정수로 입력할 때 문자/실수 등 입력한 경우 예외
     - import java.util.InputMismatchException; 포함
   - 문자/실수의 경우 [error] Please enter an integer. 메시지를 출력하고 재입력을 요구
```
try  {
    Enter the size of the array.
    배열의 크기(3보다 크고 10 작은)입력
    범위 초과 시 [error] Out of range. 메시지를 출력하고 재입력을 요구
    }
catch {
    정수가 아닌 문자/실수 등 입력 할 경우
        [error] Please enter an integer.  메시지를 출력하고 재입력을 요구
}
```

#### 입력 예 1
```
a
11
4
-100
20
600
12
```
#### 출력 예 1
```
Enter the size of the array.
[error] Please enter an integer.

Enter the size of the array.
[error] Out of range.

Enter the size of the array.
Enter 4 Input value : [-100, 20, 600, 12]
Maximum value : 600
Minimum value : -100
```
#### 입력 예 2
```
5
2
100
3
55
3
```
#### 출력 예 2
```
Enter the size of the array.
Enter 5 Input value : [2, 100, 3, 55, 3]
Maximum value : 100
Minimum value : 2
```

#### 입력 예 3
```
6
1
-1
-1
0
1
2
```
#### 출력 예 3
```
Enter the size of the array.
Enter 6 Input value : [1, -1, -1, 0, 1, 2]
Maximum value : 2
Minimum value : -1
```
#### 입력 예 4
```
3
4
1
0
1
0
```
#### 출력 예 4
```
Enter the size of the array.
[error] Out of range.
Enter the size of the array.
Enter 4 Input value : [1, 0, 1, 0]
Maximum value : 1
Minimum value : 0
```