package study.spring.core.basic.hello;

import study.spring.core.basic.hello.service.MemberService;
import study.spring.core.basic.hello.service.MemberServiceImpl;
import study.spring.core.basic.hello.member.Grade;
import study.spring.core.basic.hello.member.Member;

public class MemberApp {

    public static void main(String[] args) {
        MemberService memberService = new MemberServiceImpl();
        Member member = new Member(1L, "memberA", Grade.VIP);
        memberService.join(member);

        Member findMember = memberService.findMember(1L);
        System.out.println("new member = " + member.getName());
        System.out.println("find Member = " + findMember.getName());
    }

}
