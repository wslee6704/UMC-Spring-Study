package UMC.UMC_7th_mission.service.MissionService;

import UMC.UMC_7th_mission.domain.Mission;
import UMC.UMC_7th_mission.web.dto.MissionDTO.MissionRequestDTO;

public interface MissionCommandService {
    Mission createMission(Long storeId, MissionRequestDTO.CreateMissionDTO request);
}
