package UMC.UMC_7th_mission.repository;

import UMC.UMC_7th_mission.domain.Mission;
import UMC.UMC_7th_mission.domain.Region;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MissionRepository extends JpaRepository<Mission, Long> {
}
