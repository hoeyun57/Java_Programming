package CH4.N4;

import java.util.Scanner;

public class Order {
    private int amount;

    // 모든 주문 객체가 공유하는 배송비 필드 선언 코드 채워넣기
    private static int deliveryFee;
    
    public Order(int amount) {
        this.amount = amount;
    }


    public static void setDeliveryFee(int fee) { // 중괄호 앞에 위치하는 메소드 선언부 코드 채워넣기
        deliveryFee = fee;
    }

    public int getTotal() {
        return amount + deliveryFee;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int amount1 = scanner.nextInt();
        int amount2 = scanner.nextInt();
        int fee1 = scanner.nextInt();
        int fee2 = scanner.nextInt();

        Order.setDeliveryFee(fee1);

        Order order1 = new Order(amount1);
        Order order2 = new Order(amount2);

        System.out.println(
            order1.getTotal() + " " + order2.getTotal()
        );

        Order.setDeliveryFee(fee2);

        System.out.println(
            order1.getTotal() + " " + order2.getTotal()
        );

        scanner.close();
    }
}