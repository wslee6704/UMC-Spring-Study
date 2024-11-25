package UMC.UMC_7th_mission.repository;

import UMC.UMC_7th_mission.domain.Mission;
import UMC.UMC_7th_mission.mapping.MemberMission;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberMissionRepository extends JpaRepository<MemberMission, Long> {
}
