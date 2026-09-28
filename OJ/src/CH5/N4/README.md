### [문제 설명]
다음 프로그램은 Employee 클래스를 상속받는 Manager와 Developer 클래스를 이용하여 직원의 최종 급여를 계산하는 프로그램이다.  
주어진 코드의 (A) ~ (L) 빈칸을 올바르게 채워 프로그램을 완성하시오.  

급여 계산 방법은 다음과 같다.
- 일반 직원의 급여: baseSalary
- Manager의 급여: baseSalary + bonus
- Developer의 급여: baseSalary + overtimeHours × overtimePay
- 또한 Manager와 Developer 객체를 부모 클래스인 Employee 타입의 배열에 저장하고, 오버라이딩된 메소드를 이용하여 직원 정보를 출력한다.

```java
import java.util.Scanner;

class Employee {
    String name;
    int baseSalary;

    Employee(String name, int baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    int calculateSalary() {
        return baseSalary;
    }

    String getRole() {
        return "Employee";
    }
}

class Manager (A) Employee {
    int bonus;

    Manager(String name, int baseSalary, int bonus) {
        (B)(name, baseSalary);
        this.bonus = bonus;
    }

    (C)
    int calculateSalary() {
        return (D) + bonus;
    }

    (E)
    String getRole() {
        return "Manager";
    }
}

class Developer (F) Employee {
    int overtimeHours;
    int overtimePay;

    Developer(String name, int baseSalary,
              int overtimeHours, int overtimePay) {

        (G)(name, baseSalary);
        this.overtimeHours = overtimeHours;
        this.overtimePay = overtimePay;
    }

    (H)
    int calculateSalary() {
        return (I) + overtimeHours * overtimePay;
    }

    (J)
    String getRole() {
        return "Developer";
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String managerName = sc.next();
        int managerSalary = sc.nextInt();
        int bonus = sc.nextInt();

        String developerName = sc.next();
        int developerSalary = sc.nextInt();
        int overtimeHours = sc.nextInt();
        int overtimePay = sc.nextInt();

        Employee[] employees = {
            new Manager(managerName, managerSalary, bonus),
            new Developer(developerName, developerSalary,
                          overtimeHours, overtimePay)
        };

        for ((K) employee : employees) {
            System.out.println(
                employee.getRole() + " " +
                employee.name + " " +
                (L)
            );
        }
    }
}
```
### [입력]
첫 번째 줄에 Manager의 이름, 기본 급여, 보너스가 주어진다.   
두 번째 줄에 Developer의 이름, 기본 급여, 추가 근무 시간, 시간당 추가 수당이 주어진다.  
이름 기본급여 보너스  
이름 기본급여 추가근무시간 시간당추가수당  

모든 급여와 수당은 정수로 주어진다.

### [출력]
Manager와 Developer의 직책, 이름, 최종 급여를 차례대로 출력한다.  
직책 이름 최종급여

#### [입력 예시]
```
Kim 3000000 500000
Lee 2800000 10 20000
```
#### [출력 예시]
```
Manager Kim 3500000
Developer Lee 3000000
```