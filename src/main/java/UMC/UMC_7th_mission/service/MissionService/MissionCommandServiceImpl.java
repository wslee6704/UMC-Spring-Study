package UMC.UMC_7th_mission.service.MissionService;

import UMC.UMC_7th_mission.Converter.MissionConverter;
import UMC.UMC_7th_mission.domain.Mission;
import UMC.UMC_7th_mission.domain.Store;
import UMC.UMC_7th_mission.repository.MissionRepository;
import UMC.UMC_7th_mission.repository.StoreRepository.StoreRepository;
import UMC.UMC_7th_mission.web.dto.MissionDTO.MissionRequestDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MissionCommandServiceImpl implements MissionCommandService{

    private final StoreRepository storeRepository;
    private final MissionRepository missionRepository;

    @Override
    public Mission createMission(Long storeId, MissionRequestDTO.CreateMissionDTO request) {
        Store getStore = storeRepository.findById(storeId).orElse(null);

        Mission newMission = MissionConverter.toMission(request, getStore);

        return missionRepository.save(newMission);
    }
}
