package CH4.N2;

import java.util.Scanner;

public class PointAccount {
    private int points;

    public PointAccount(int points) {
        this.points = points;
    }

    // amount만큼 포인트를 적립하는 메소드 선언
    public void add(int amount)
     { // 중괄호 앞에 위치할 메소드 선언부 채워넣기
    	points += amount;
    }

    // amount를 count번 적립하는 메소드 선언
    public void add(int amount, int count)
     { // 중괄호 앞에 위치할 메소드 선언부 채워넣기
    	points += amount * count;
    }

    public int getPoints() {
        return points;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int initialPoints = scanner.nextInt();
        PointAccount account = new PointAccount(initialPoints);

        int amount1 = scanner.nextInt();
        account.add(amount1);
        System.out.println(account.getPoints());

        int amount2 = scanner.nextInt();
        int count = scanner.nextInt();
        account.add(amount2, count);
        System.out.println(account.getPoints());

        scanner.close();
    }
}