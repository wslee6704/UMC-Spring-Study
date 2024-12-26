package UMC.UMC_7th_mission.repository;

import UMC.UMC_7th_mission.domain.Member;
import UMC.UMC_7th_mission.domain.Region;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RegionRepository extends JpaRepository<Region, Long> {
}
