package study.spring.core.basic.hello;

import study.spring.core.basic.hello.member.Grade;
import study.spring.core.basic.hello.member.Member;
import study.spring.core.basic.hello.member.MemberService;
import study.spring.core.basic.hello.order.Order;
import study.spring.core.basic.hello.order.OrderService;

public class OrderApp {
    public static void main(String[] args) {
        AppConfig appConfig = new AppConfig();
        MemberService memberService = appConfig.memberService();
        OrderService orderService = appConfig.orderService();

        Long memberId = 1L;
        Member member = new Member(memberId, "memberA", Grade.VIP);
        memberService.join(member);

        Order order = orderService.createOrder(memberId, "itemA", 20000);

        System.out.println("order = " + order);
    }
}
