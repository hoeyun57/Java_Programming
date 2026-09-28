package CH5.N1;

import java.util.Scanner;

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Student extends Person {
    String major;

    Student(String name, int age, String major) {
        super(name, age);
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
        
        sc.close();
    }
}