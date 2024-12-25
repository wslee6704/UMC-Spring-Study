package UMC.UMC_7th_mission.Converter;

import UMC.UMC_7th_mission.domain.Member;
import UMC.UMC_7th_mission.domain.Mission;
import UMC.UMC_7th_mission.domain.Store;
import UMC.UMC_7th_mission.mapping.MemberMission;
import UMC.UMC_7th_mission.web.dto.MemberMissionDTO.MemberMissionRequestDTO;
import UMC.UMC_7th_mission.web.dto.MemberMissionDTO.MemberMissionResponseDTO;
import UMC.UMC_7th_mission.web.dto.MissionDTO.MissionRequestDTO;
import UMC.UMC_7th_mission.web.dto.MissionDTO.MissionResponseDTO;

import java.time.LocalDateTime;

public class MemberMissionConverter {
    public static MemberMissionResponseDTO.CreateMemberMissionResultDTO toCreateMemberMissionResultDTO(MemberMission memberMission){
        return MemberMissionResponseDTO.CreateMemberMissionResultDTO.builder()
                .memberMissionId(memberMission.getId())
                .createdAt(LocalDateTime.now())
                .build();
    }

    public static MemberMission toMemberMission(MemberMissionRequestDTO.CreateMemberMissionDTO request, Member getMember, Mission getMission){
        return MemberMission.builder() // member entity에 나이 빠짐
                .member(getMember)
                .mission(getMission)
                .status(request.getStatus())
                .build();
    }
}
