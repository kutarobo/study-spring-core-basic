package study.spring.core.basic.hello.member;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import study.spring.core.basic.hello.service.MemberService;
import study.spring.core.basic.hello.service.MemberServiceImpl;

public class MemberServiceTest {

    MemberService memberService = new MemberServiceImpl();

    @Test
    void join() {
        //given
        Member member = new Member(1L, "memberA", Grade.VIP);

        //when
        memberService.join(member);
        Member findMember = memberService.findMember(1L);

        //then
        Assertions.assertThat(member).isEqualTo(findMember);
    }
}
