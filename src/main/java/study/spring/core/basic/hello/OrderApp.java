package study.spring.core.basic.hello;

import study.spring.core.basic.hello.member.Grade;
import study.spring.core.basic.hello.member.Member;
import study.spring.core.basic.hello.order.Order;
import study.spring.core.basic.hello.order.OrderService;
import study.spring.core.basic.hello.order.OrderServiceImpl;
import study.spring.core.basic.hello.service.MemberService;
import study.spring.core.basic.hello.service.MemberServiceImpl;

public class OrderApp {
    public static void main(String[] args) {
        MemberService memberService = new MemberServiceImpl();
        OrderService orderService = new OrderServiceImpl();

        Long memberId = 1L;
        Member member = new Member(memberId, "memberA", Grade.VIP);
        memberService.join(member);

        Order order = orderService.createOrder(memberId, "itemA", 10000);

        System.out.println("order = " + order);
    }
}
