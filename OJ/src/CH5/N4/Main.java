package CH5.N4;

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

class Manager extends Employee {
    int bonus;

    Manager(String name, int baseSalary, int bonus) {
        super(name, baseSalary);
        this.bonus = bonus;
    }

    @Override
    int calculateSalary() {
        return baseSalary + bonus;
    }

    @Override
    String getRole() {
        return "Manager";
    }
}

class Developer extends Employee {
    int overtimeHours;
    int overtimePay;

    Developer(String name, int baseSalary,
              int overtimeHours, int overtimePay) {

        super(name, baseSalary);
        this.overtimeHours = overtimeHours;
        this.overtimePay = overtimePay;
    }

    @Override
    int calculateSalary() {
        return baseSalary + overtimeHours * overtimePay;
    }

    @Override
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

        for (Employee employee : employees) {
            System.out.println(
                employee.getRole() + " " +
                employee.name + " " +
                employee.calculateSalary()
            );
        }
        
        sc.close();
    }
}