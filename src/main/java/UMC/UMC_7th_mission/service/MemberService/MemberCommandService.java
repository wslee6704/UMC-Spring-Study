package UMC.UMC_7th_mission.service.MemberService;

import UMC.UMC_7th_mission.domain.Member;
import UMC.UMC_7th_mission.web.dto.Member.MemberRequestDTO;

public interface MemberCommandService {
    Member joinMember(MemberRequestDTO.JoinDto request);
}
