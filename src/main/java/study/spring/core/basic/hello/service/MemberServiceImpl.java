package study.spring.core.basic.hello.service;

import study.spring.core.basic.hello.member.Member;
import study.spring.core.basic.hello.member.MemberRepository;
import study.spring.core.basic.hello.member.MemoryMemberRepository;

public class MemberServiceImpl implements MemberService{

    private final MemberRepository memberRepository = new MemoryMemberRepository();

    @Override
    public void join(Member member) {
        memberRepository.save(member);
    }

    @Override
    public Member findMember(Long memberId) {
        return memberRepository.findById(memberId);
    }
}
