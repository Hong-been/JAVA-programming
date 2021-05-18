package hello.hellospring.service;

import hello.hellospring.domain.Member;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class MemberServiceTest {
    MemberService memberService = new MemberService();
    @Test
    void join() {
        //given
        Member member=new Member();
        member.setName("HongBeen");

        //when
        Long saveId= memberService.join(member);

        //then
        Member finder=memberService.findOne(member.getId()).get();
        assertThat(member.getName()).isEqualTo(finder.getName());

    }

    @Test
    void findMembers() {
    }

    @Test
    void findOne() {
    }
}