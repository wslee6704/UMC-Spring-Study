package UMC.UMC_7th_mission.service.MemberMissionService;

import UMC.UMC_7th_mission.mapping.MemberMission;
import UMC.UMC_7th_mission.web.dto.MemberMissionDTO.MemberMissionRequestDTO;

public interface MemberMissionCommandService {
    MemberMission createMemberMission(Long memberId, Long missionId, MemberMissionRequestDTO.CreateMemberMissionDTO request);
}
