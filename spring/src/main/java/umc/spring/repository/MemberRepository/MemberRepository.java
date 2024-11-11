package umc.spring.repository.MemberRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import umc.spring.domain.Member;
import umc.spring.domain.Mission;

public interface MemberRepository extends JpaRepository<Member, Long> {
    Member findById(long id);
}

