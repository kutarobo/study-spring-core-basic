package study.spring.core.basic.hello.order;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import study.spring.core.basic.hello.member.Grade;
import study.spring.core.basic.hello.member.Member;
import study.spring.core.basic.hello.service.MemberService;
import study.spring.core.basic.hello.service.MemberServiceImpl;

public class OrderServiceTest {

    MemberService memberService = new MemberServiceImpl();
    OrderService orderService = new OrderServiceImpl();

    @Test
    void createOrder() {
        Long memberId = 1L;
        Member member = new Member(memberId, "memberA", Grade.VIP);
        memberService.join(member);

        Order order = orderService.createOrder(memberId, "itemA", 10000);
        Assertions.assertThat(order.getDiscountPrice()).isEqualTo(1000);
    }
}
