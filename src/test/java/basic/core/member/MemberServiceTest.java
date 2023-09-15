package basic.core.member;

import basic.core.AppConfig;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

public class MemberServiceTest {

//    private MemberService memberService = new MemberServiceImpl();
    private MemberService memberService;

    @BeforeEach
    void beforEach() {
        AppConfig appConfig = new AppConfig();
        this.memberService = appConfig.memberService();
    }
    @Test
    void join() {
        //given
        Member member = new Member(1L, "memberA", Grade.VIP);

        //when
        memberService.join(member);
        Member findMember = memberService.findMember(1L);

        //then
        assertThat(findMember).isEqualTo(member);
    }
}
