package study.spring.core.basic.hello.order;

public interface OrderService {
    Order createOrder(Long memberId, String itemName, int itemPrice);
}
