package CH5.N2;

import java.util.Scanner;

class Vehicle {
    int speed;

    Vehicle(int speed) {
        this.speed = speed;
    }

    int getSpeed() {
        return speed;
    }
}

class Car extends Vehicle {
    int boost;

    Car(int speed, int boost) {
        super(speed);
        this.boost = boost;
    }

    @Override
    int getSpeed() {
        return this.speed + boost;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int speed = sc.nextInt();
        int boost = sc.nextInt();

        Vehicle vehicle = new Car(speed, boost);

        System.out.println("Speed: " + vehicle.getSpeed());
        
        sc.close();
    }
}