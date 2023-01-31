package hello.core.member;

public class MemberServiceImpl implements MemberService{

    // MemberServiceImpl은 MemberRepository 와 MemoryMemberRepository 를 의존함
    // 추상화/구체화에 의존하므로 DIP를 위반
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
