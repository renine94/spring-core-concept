package hello.core.order;

import hello.core.AppConfig;
import hello.core.member.Grade;
import hello.core.member.Member;
import hello.core.member.MemberService;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class OrderServiceTest {

    MemberService memberService;
    OrderService orderService;

    @BeforeEach
    public void beforeEach() {
        AppConfig appConfig = new AppConfig();
        memberService = appConfig.memberService();
        orderService = appConfig.orderService();
    }

    @Test
    void createOrder() {
        // given
        Long memberId = 1L;  // primitive(원시형) long 자료는 null 을 넣을수없다.
        Member member = new Member(memberId, "memberA", Grade.VIP);
        // when
        memberService.join(member);
        Order order = orderService.createOrder(memberId, "itemA", 10_000);
        // then
        Assertions.assertThat(order.getDiscountPrice()).isEqualTo(1_000);
    }
}
