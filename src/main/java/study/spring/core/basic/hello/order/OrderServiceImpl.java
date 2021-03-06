package study.spring.core.basic.hello.order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import study.spring.core.basic.hello.annotation.MainDiscountPolicy;
import study.spring.core.basic.hello.discount.DiscountPolicy;
import study.spring.core.basic.hello.member.Member;
import study.spring.core.basic.hello.member.MemberRepository;

@Component
public class OrderServiceImpl implements OrderService {

    private final MemberRepository memberRepository;
    private final DiscountPolicy discountPolicy;

    @Autowired
    public OrderServiceImpl(MemberRepository memberRepository, @MainDiscountPolicy DiscountPolicy discountPolicy) {
        this.memberRepository = memberRepository;
        this.discountPolicy = discountPolicy;
    }

    @Override
    public Order createOrder(Long memberId, String itemName, int itemPrice) {
        Member member = memberRepository.findById(memberId);
        int discountPrice = discountPolicy.discount(member, itemPrice);
        return new Order(memberId, itemName, itemPrice, discountPrice);
    }

    // 테스트 용도
    public MemberRepository getMemberRepository() {
        return memberRepository;
    }
}
