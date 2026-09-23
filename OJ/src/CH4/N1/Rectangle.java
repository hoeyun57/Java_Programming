package CH4.N1;

import java.util.Scanner;

public class Rectangle {
    int width;
    int height;

    public Rectangle(int width, int height) {
    	// 여기에 코드 입력
    	this.width = width;
    	this.height = height;
    }

    public int getArea() {
    	return width * height;
    }

    public int getPerimeter() {
    	return 2 * width + 2 * height;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int width = scanner.nextInt();
        int height = scanner.nextInt();

        Rectangle rectangle = new Rectangle(width, height);

        System.out.println(rectangle.getArea());
        System.out.println(rectangle.getPerimeter());

        scanner.close();
    }
}