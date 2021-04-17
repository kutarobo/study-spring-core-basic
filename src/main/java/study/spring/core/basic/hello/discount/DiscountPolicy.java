package study.spring.core.basic.hello.discount;

import study.spring.core.basic.hello.member.Member;

public interface DiscountPolicy {

    /**
     * 할인대상금액
     * @param member
     * @param price
     * @return
     */
    int discount(Member member, int price);
}
