package basic.core.order;

import basic.core.member.Grade;
import basic.core.member.Member;
import basic.core.member.MemberService;
import basic.core.member.MemberServiceImpl;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

public class OrderServiceTest {

    MemberService memberService = new MemberServiceImpl();
    OrderService orderService = new OrderSErviceImpl();

    @Test
    void createOrder() {
        Long memberId = 1L;
        Member member = new Member(memberId, "memberA", Grade.VIP);
        memberService.join(member);

        Order order = orderService.createorder(member.getId(), "itemA", 10000);
        assertThat(order.getDiscountPrice()).isEqualTo(1000);
    }
}
