package study.spring.core.basic.hello.service;

import study.spring.core.basic.hello.member.Member;

public interface MemberService {
    void join(Member member);

    Member findMember(Long memberId);
}
