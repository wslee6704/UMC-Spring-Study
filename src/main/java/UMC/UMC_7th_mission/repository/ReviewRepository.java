package UMC.UMC_7th_mission.repository;

import UMC.UMC_7th_mission.domain.Region;
import UMC.UMC_7th_mission.domain.Review;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReviewRepository extends JpaRepository<Review, Long> {
}
