package CH5.N3;

import java.util.Scanner;

class Shape {
    String name;

    Shape(String name) {
        this.name = name;
    }

    double getArea() {
        return 0.0;
    }
}

class Rectangle extends Shape {
    double width;
    double height;

    Rectangle(double width, double height) {
        super("Rectangle");
        this.width = width;
        this.height = height;
    }

    @Override
    double getArea() {
        return width * height;
    }
}

class Triangle extends Shape {
    double width;
    double height;

    Triangle(double width, double height) {
        super("Triangle");
        this.width = width;
        this.height = height;
    }

    @Override
    double getArea() {
        return width * height / 2;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double width = sc.nextDouble();
        double height = sc.nextDouble();

        Shape shape1 = new Rectangle(width, height);
        Shape shape2 = new Triangle(width, height);

        System.out.printf("%s: %.1f%n",
                shape1.name, shape1.getArea());

        System.out.printf("%s: %.1f%n",
                shape2.name, shape2.getArea());
        
        sc.close();
    }
}