다음은 주문의 상품 금액과 배송비를 입력 받아 결제 금액을 출력하는 프로그램이다.

1. 입력값   
a. 첫번째 주문의 상품 금액(정수)  
b. 두번째 주문의 상품 금액(정수)  
c. 최초 배송비(정수)  
d. 변경된 배송비(정수)  

2. 출력값  
a. 최초 배송비를 적용한 두 주문의 결제 금액 (공백으로 구분)  
b. 변경된 배송비를 적용한 두 주문의 결제 금액 (공백으로 구분)  

3. 이 때 다음을 구현하는 코드를 각각 작성하라.  
a. 모든 주문 객체가 공유하는 정수형 배송비 필드 선언 (접근 지정자는 private으로 작성)  
b. 배송비를 설정하는 메소드의 선언부 (접근 지정자는 public, 반환형은 void로 작성)  

※ 특히 b의 경우 객체를 생성하지 않고도 클래스 이름으로 호출할 수 있어야 한다는 점에 유의할 것

### 입출력 예시:

### 1.
#### 입력
```
10000 20000
3000 5000
```
#### 출력
```
13000 23000
15000 25000
```
### 2.
#### 입력
```
32500 29900
3500 0
```
#### 출력
```
36000 33400
32500 29900
```
### 3.
#### 입력
```
1665300 3129800
0 1082
```
#### 출력
```
1665300 3129800
1666382 3130882
```
```java
import java.util.Scanner;

public class Order {
    private int amount;

    // 모든 주문 객체가 공유하는 배송비 필드 선언 코드 채워넣기

    public Order(int amount) {
        this.amount = amount;
    }


     { // 중괄호 앞에 위치하는 메소드 선언부 코드 채워넣기
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
```