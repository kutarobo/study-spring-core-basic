package study.spring.core.basic.hello.order;

import study.spring.core.basic.hello.discount.DiscountPolicy;
import study.spring.core.basic.hello.discount.FixDiscountPolicy;
import study.spring.core.basic.hello.member.Member;
import study.spring.core.basic.hello.member.MemberRepository;
import study.spring.core.basic.hello.member.MemoryMemberRepository;

public class OrderServiceImpl implements OrderService {

    private final MemberRepository memberRepository = new MemoryMemberRepository();
    private final DiscountPolicy discountPolicy = new FixDiscountPolicy();

    @Override
    public Order createOrder(Long memberId, String itemName, int itemPrice) {
        Member member = memberRepository.findById(memberId);
        int discountPrice = discountPolicy.discount(member, itemPrice);
        return new Order(memberId, itemName, itemPrice, discountPrice);
    }
}
