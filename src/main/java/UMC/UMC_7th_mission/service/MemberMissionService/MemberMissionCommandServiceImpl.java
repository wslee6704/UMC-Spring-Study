package UMC.UMC_7th_mission.service.MemberMissionService;

import UMC.UMC_7th_mission.Converter.MemberMissionConverter;
import UMC.UMC_7th_mission.Converter.ReviewConverter;
import UMC.UMC_7th_mission.domain.Member;
import UMC.UMC_7th_mission.domain.Mission;
import UMC.UMC_7th_mission.domain.Review;
import UMC.UMC_7th_mission.domain.Store;
import UMC.UMC_7th_mission.mapping.MemberMission;
import UMC.UMC_7th_mission.repository.MemberMissionRepository;
import UMC.UMC_7th_mission.repository.MemberRepository;
import UMC.UMC_7th_mission.repository.MissionRepository;
import UMC.UMC_7th_mission.repository.ReviewRepository;
import UMC.UMC_7th_mission.repository.StoreRepository.StoreRepository;
import UMC.UMC_7th_mission.web.dto.MemberMissionDTO.MemberMissionRequestDTO;
import UMC.UMC_7th_mission.web.dto.ReviewDTO.ReviewRequestDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberMissionCommandServiceImpl implements MemberMissionCommandService{

    private final MemberRepository memberRepository;
    private final MissionRepository missionRepository;
    private final MemberMissionRepository missionMissionRepository;

    @Override
    public MemberMission createMemberMission(Long memberId, Long missionId, MemberMissionRequestDTO.CreateMemberMissionDTO request) {
        Member getMember = memberRepository.findById(memberId).orElse(null);
        Mission getMission = missionRepository.findById(missionId).orElse(null);

        MemberMission newMemberMission = MemberMissionConverter.toMemberMission(request, getMember, getMission);

        return missionMissionRepository.save(newMemberMission);
    }
}
