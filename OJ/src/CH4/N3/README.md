다음은 학생들의 이름과 점수를 입력 받아 객체 배열에 저장하고 모든 학생에게 동일한 가산점을 부여하는 프로그램이다. 

1. 입력값  
a. 학생 수(정수)  
b. 가산점(정수)  
c. a의 값 만큼의 학생 이름(문자열)과 점수(정수)  

2. 이에 프로그램은 입력된 순서대로 학생 이름과 보정된 점수를 출력하며, 보정 점수가 100을 초과하면 100을 출력한다.

3. 이 때 학생 객체를 저장하는 배열을 생성하는 코드와 학생 객체를 생성하여 배열의 i번째 인덱스에 저장하는 코드를 각각 작성하라.

### 입출력 예시:

### 1.
#### 입력
```
3
20
john 60
mina 86
mark 93
```
#### 출력
```
john 80
mina 100
mark 100
```
### 2.
#### 입력
```
5
13
kim 96
lee 42
oh 74
cha 85
seo 19
```
#### 출력
```
kim 100
lee 55
oh 87
cha 98
seo 32
```
### 3.
#### 입력
```
4
50
andy 49
tom 50
sarah 51
jay 52
```
#### 출력
```
andy 99
tom 100
sarah 100
jay 100
```
```java
import java.util.Scanner;

public class Student {
    private String name;
    private int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public void addBonus(int bonus) {
        score += bonus;

        if (score > 100) {
            score = 100;
        }
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public static void applyBonus(Student[] students, int bonus) {
        for (int i = 0; i < students.length; i++) {
            students[i].addBonus(bonus);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int bonus = scanner.nextInt();

        Student[] students;

        // 학생 n명의 객체를 저장할 배열을 생성하는 코드 채워넣기

        for (int i = 0; i < students.length; i++) {
            String name = scanner.next();
            int score = scanner.nextInt();
            //  학생 객체를 생성하여 배열의 i번째 인덱스에 저장하는 코드 채워넣기
        }

        applyBonus(students, bonus);

        int topIndex = 0;

        for (int i = 0; i < students.length; i++) {
            System.out.println(
                students[i].getName() + " " + students[i].getScore()
            );

            if (students[i].getScore() > students[topIndex].getScore()) {
                topIndex = i;
            }
        }

        scanner.close();
    }
}
```