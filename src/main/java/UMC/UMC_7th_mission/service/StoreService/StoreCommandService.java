package UMC.UMC_7th_mission.service.StoreService;

import UMC.UMC_7th_mission.domain.Store;
import UMC.UMC_7th_mission.web.dto.StoreDTO.StoreRequestDTO;

public interface StoreCommandService {
    Store createStore(Long regionId, StoreRequestDTO.CreateDTO request);
}
