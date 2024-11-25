package UMC.UMC_7th_mission.repository.StoreRepository;

import UMC.UMC_7th_mission.domain.Store;

import java.util.List;

public interface StoreRepositoryCustom {
    List<Store> dynamicQueryWithBooleanBuilder(String name, Float score);
}
