package UMC.UMC_7th_mission.repository;

import UMC.UMC_7th_mission.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {
}
