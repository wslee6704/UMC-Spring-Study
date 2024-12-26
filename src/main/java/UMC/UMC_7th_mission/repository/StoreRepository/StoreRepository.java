package UMC.UMC_7th_mission.repository.StoreRepository;

import UMC.UMC_7th_mission.domain.Store;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StoreRepository extends JpaRepository<Store, Long>, StoreRepositoryCustom {
}
