package UMC.UMC_7th_mission.StoreService;

import UMC.UMC_7th_mission.domain.Store;

import java.util.List;
import java.util.Optional;

public interface StoreQueryService {

    Optional<Store> findStore(Long id);
    List<Store> findStoresByNameAndScore(String name, Float score);
}
