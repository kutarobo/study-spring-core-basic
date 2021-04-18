package study.spring.core.basic.hello;

import study.spring.core.basic.hello.discount.DiscountPolicy;
import study.spring.core.basic.hello.discount.RateDiscountPolicy;
import study.spring.core.basic.hello.member.MemberService;
import study.spring.core.basic.hello.member.MemberServiceImpl;
import study.spring.core.basic.hello.member.MemoryMemberRepository;
import study.spring.core.basic.hello.order.OrderService;
import study.spring.core.basic.hello.order.OrderServiceImpl;

public class AppConfig {
    public MemberService memberService() {
        return new MemberServiceImpl(memberRepository());
    }

    private MemoryMemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }

    public OrderService orderService() {
        return new OrderServiceImpl(memberRepository(), discountPolicy() );
    }

    public DiscountPolicy discountPolicy() {
        return new RateDiscountPolicy();
    }
}
