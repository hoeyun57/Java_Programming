### [문제 설명]
다음 프로그램은 Person 클래스를 상속받는 Student 클래스를 이용하여 학생의 정보를 출력하는 프로그램이다.

주어진 코드의 (A), (B) 빈칸을 올바르게 채워 프로그램을 완성하시오.
- Student 클래스는 Person 클래스를 상속받는다.
- Student 생성자에서는 부모 클래스 Person의 생성자를 호출한다.
- 입력받은 이름, 나이, 전공을 출력한다.

```java
import java.util.Scanner;

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Student (A) Person {
    String major;

    Student(String name, int age, String major) {
        (B)(name, age);
        this.major = major;
    }

    void printInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Major: " + major);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = sc.next();
        int age = sc.nextInt();
        String major = sc.next();

        Student student = new Student(name, age, major);

        student.printInfo();
    }
}
```

### [입력]
첫 번째 줄에 학생의 이름이 주어진다.
두 번째 줄에 학생의 나이가 주어진다.
세 번째 줄에 학생의 전공이 주어진다.

이름과 전공은 공백이 없는 문자열로 주어진다.

### [출력]
학생의 이름, 나이, 전공을 다음 형식으로 출력한다.  
Name: 이름  
Age: 나이  
Major: 전공  

### [입력 및 출력 예시]

#### [입력 1]
```
Hong
20
Computer
```
#### [출력 1]
```
Name: Hong
Age: 20
Major: Computer
```