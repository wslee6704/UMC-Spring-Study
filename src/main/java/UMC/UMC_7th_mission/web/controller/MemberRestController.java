package UMC.UMC_7th_mission.web.controller;

import UMC.UMC_7th_mission.Converter.MemberConverter;
import UMC.UMC_7th_mission.apiPayload.ApiResponse;
import UMC.UMC_7th_mission.domain.Member;
import UMC.UMC_7th_mission.service.MemberService.MemberCommandService;
import UMC.UMC_7th_mission.web.dto.Member.MemberRequestDTO;
import UMC.UMC_7th_mission.web.dto.Member.MemberResponseDTO;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/members")
public class MemberRestController {

    private final MemberCommandService memberCommandService;

    @PostMapping("/")
    public ApiResponse<MemberResponseDTO.JoinResultDTO> join(@RequestBody @Valid MemberRequestDTO.JoinDto request){
        Member member = memberCommandService.joinMember(request);
        return ApiResponse.onSuccess(MemberConverter.toJoinResultDTO(member));
    }
}
