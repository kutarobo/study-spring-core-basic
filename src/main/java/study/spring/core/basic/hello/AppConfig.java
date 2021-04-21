package study.spring.core.basic.hello;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import study.spring.core.basic.hello.discount.DiscountPolicy;
import study.spring.core.basic.hello.discount.RateDiscountPolicy;
import study.spring.core.basic.hello.member.MemberService;
import study.spring.core.basic.hello.member.MemberServiceImpl;
import study.spring.core.basic.hello.member.MemoryMemberRepository;
import study.spring.core.basic.hello.order.OrderService;
import study.spring.core.basic.hello.order.OrderServiceImpl;

@Configuration
public class AppConfig {

    @Bean
    public MemberService memberService() {
        System.out.println("call AppConfig.memberService");
        return new MemberServiceImpl(memberRepository());
    }

    @Bean
    public MemoryMemberRepository memberRepository() {
        System.out.println("call AppConfig.memberRepository");
        return new MemoryMemberRepository();
    }

    @Bean
    public OrderService orderService() {
        System.out.println("call AppConfig.orderService");
        return new OrderServiceImpl(memberRepository(), discountPolicy() );
    }

    @Bean
    public DiscountPolicy discountPolicy() {
        return new RateDiscountPolicy();
    }
}
