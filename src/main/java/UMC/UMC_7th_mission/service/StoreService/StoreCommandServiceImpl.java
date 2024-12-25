package UMC.UMC_7th_mission.service.StoreService;

import UMC.UMC_7th_mission.Converter.MemberConverter;
import UMC.UMC_7th_mission.Converter.MemberPreferConverter;
import UMC.UMC_7th_mission.Converter.StoreConverter;
import UMC.UMC_7th_mission.apiPayload.code.status.ErrorStatus;
import UMC.UMC_7th_mission.apiPayload.exception.handler.FoodCategoryHandler;
import UMC.UMC_7th_mission.domain.FoodCategory;
import UMC.UMC_7th_mission.domain.Member;
import UMC.UMC_7th_mission.domain.Region;
import UMC.UMC_7th_mission.domain.Store;
import UMC.UMC_7th_mission.mapping.MemberPrefer;
import UMC.UMC_7th_mission.repository.RegionRepository;
import UMC.UMC_7th_mission.repository.StoreRepository.StoreRepository;
import UMC.UMC_7th_mission.web.dto.Member.MemberRequestDTO;
import UMC.UMC_7th_mission.web.dto.StoreDTO.StoreRequestDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class StoreCommandServiceImpl implements StoreCommandService {

    private final StoreRepository storeRepository;
    private final RegionRepository regionRepository;

    @Override
    public Store createStore(Long regionId, StoreRequestDTO.CreateDTO request) {
        Region getRegion = regionRepository.findById(regionId).orElse(null);

        Store newStore = StoreConverter.toStore(request, getRegion);

        return storeRepository.save(newStore);
    }
}
