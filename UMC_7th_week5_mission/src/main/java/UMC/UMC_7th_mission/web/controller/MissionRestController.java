package UMC.UMC_7th_mission.web.controller;

import UMC.UMC_7th_mission.Converter.MemberMissionConverter;
import UMC.UMC_7th_mission.Converter.MissionConverter;
import UMC.UMC_7th_mission.apiPayload.ApiResponse;
import UMC.UMC_7th_mission.domain.Mission;
import UMC.UMC_7th_mission.mapping.MemberMission;
import UMC.UMC_7th_mission.service.MemberMissionService.MemberMissionCommandService;
import UMC.UMC_7th_mission.service.MissionService.MissionCommandService;
import UMC.UMC_7th_mission.web.dto.Member.MemberResponseDTO;
import UMC.UMC_7th_mission.web.dto.MemberMissionDTO.MemberMissionRequestDTO;
import UMC.UMC_7th_mission.web.dto.MemberMissionDTO.MemberMissionResponseDTO;
import UMC.UMC_7th_mission.web.dto.MissionDTO.MissionRequestDTO;
import UMC.UMC_7th_mission.web.dto.MissionDTO.MissionResponseDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/mission")
public class MissionRestController {
    private final MissionCommandService missionCommandService;
    private final MemberMissionCommandService memberMissionCommandService;

    @PostMapping("/")
    public ApiResponse<MissionResponseDTO.CreateMissionResultDTO> createMission(
            @RequestParam Long storeId,
            @RequestBody MissionRequestDTO.CreateMissionDTO request
    ){
        Mission mission = missionCommandService.createMission(storeId, request);
        return ApiResponse.onSuccess(MissionConverter.toCreateResultDTO(mission));
    }

    @PostMapping("/challenge")
    public ApiResponse<MemberMissionResponseDTO.CreateMemberMissionResultDTO> createMemberMission(
            @RequestParam Long memberId,
            @RequestParam Long missionId,
            @RequestBody MemberMissionRequestDTO.CreateMemberMissionDTO request
    ){
        MemberMission memberMission = memberMissionCommandService.createMemberMission(memberId, missionId, request);
        return ApiResponse.onSuccess(MemberMissionConverter.toCreateMemberMissionResultDTO(memberMission));
    }
}
