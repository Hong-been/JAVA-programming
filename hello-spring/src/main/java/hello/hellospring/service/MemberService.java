package hello.hellospring.service;

import hello.hellospring.domain.Member;
import hello.hellospring.repository.MemberRepository;
import hello.hellospring.repository.MemoryMemberRepository;

import java.util.List;
import java.util.Optional;

public class MemberService {
    private final MemberRepository memberRepository;

    public MemberService(MemberRepository memberRepository){
        this.memberRepository=memberRepository;
    }

    /**
    * 회원가입
    * */
    public Long join(Member member){
        //같은이름을 가진 중복회원은 가입불가
        validateDuplicatedMember(member);
        memberRepository.save(member);
        return member.getId();
    }

    private void validateDuplicatedMember(Member member) {
        //Optional<Member> result = memberRepository.findByName(member.getName());
        memberRepository.findByName(member.getName())
                .ifPresent(m -> {
                    throw new IllegalStateException("This name has already existed here.");
                });
    }

    /**
     * 전체회원조회
     */
    public List<Member> findMembers(){
        return memberRepository.findAll();
    }

    /**
     * id로 회원 조회
     */

    public Optional<Member> findOne(Long memberId) {
        return memberRepository.findById(memberId);
    }


}
