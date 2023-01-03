package hello.core.member;

public class MemberServiceImpl implements MemberService {  // 인터페이스의 구현체가 보통 하나밖에 없는 경우 관례상 네이밍 뒤에 Impl 을 붙인다.

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
