package UMC.UMC_7th_mission.Converter;

import UMC.UMC_7th_mission.domain.Mission;
import UMC.UMC_7th_mission.domain.Store;
import UMC.UMC_7th_mission.web.dto.MissionDTO.MissionRequestDTO;
import UMC.UMC_7th_mission.web.dto.MissionDTO.MissionResponseDTO;

import java.time.LocalDateTime;

public class MissionConverter {
    public static MissionResponseDTO.CreateMissionResultDTO toCreateResultDTO(Mission mission){
        return MissionResponseDTO.CreateMissionResultDTO.builder()
                .missionId(mission.getId())
                .createdAt(LocalDateTime.now())
                .build();
    }

    public static Mission toMission(MissionRequestDTO.CreateMissionDTO request, Store getStore){
        return Mission.builder() // member entity에 나이 빠짐
                .store(getStore)
                .reward(request.getReward())
                .deadline(request.getDeadline())
                .missionSpec(request.getMissionSpec())
                .build();
    }
}
