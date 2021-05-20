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
    public void 중복_회원_예외(){
        //given
        Member member1=new Member();
        member1.setName("Spring");

        Member member2=new Member();
        member2.setName("Spring");

        //when
        memberService.join(member1);
        try{
            memberService.join(member2);
            fail();
        }catch(IllegalStateException e) {
            assertThat(e.getMessage()).isEqualTo("This name has already existed here.");
        }

        //then
    }

    @Test
    void findMembers() {
    }

    @Test
    void findOne() {
    }
}