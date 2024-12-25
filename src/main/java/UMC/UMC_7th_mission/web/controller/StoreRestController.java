package UMC.UMC_7th_mission.web.controller;

import UMC.UMC_7th_mission.Converter.MemberConverter;
import UMC.UMC_7th_mission.Converter.StoreConverter;
import UMC.UMC_7th_mission.apiPayload.ApiResponse;
import UMC.UMC_7th_mission.domain.Member;
import UMC.UMC_7th_mission.domain.Store;
import UMC.UMC_7th_mission.service.StoreService.StoreCommandService;
import UMC.UMC_7th_mission.web.dto.Member.MemberRequestDTO;
import UMC.UMC_7th_mission.web.dto.Member.MemberResponseDTO;
import UMC.UMC_7th_mission.web.dto.StoreDTO.StoreRequestDTO;
import UMC.UMC_7th_mission.web.dto.StoreDTO.StoreResponseDTO;
import io.swagger.v3.oas.annotations.Parameter;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/store")
public class StoreRestController {
    private final StoreCommandService storeCommandService;

    @PostMapping("/")
    public ApiResponse<StoreResponseDTO.CreateResultDTO> join(
            @RequestParam Long regionId,
            @RequestBody StoreRequestDTO.CreateDTO request
    ){
        Store store = storeCommandService.createStore(regionId, request);
        return ApiResponse.onSuccess(StoreConverter.toCreateResultDTO(store));
    }
}
