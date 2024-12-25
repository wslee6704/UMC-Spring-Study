package UMC.UMC_7th_mission.Converter;

import UMC.UMC_7th_mission.domain.Member;
import UMC.UMC_7th_mission.domain.Region;
import UMC.UMC_7th_mission.domain.Store;
import UMC.UMC_7th_mission.domain.enums.Gender;
import UMC.UMC_7th_mission.web.dto.Member.MemberRequestDTO;
import UMC.UMC_7th_mission.web.dto.Member.MemberResponseDTO;
import UMC.UMC_7th_mission.web.dto.StoreDTO.StoreRequestDTO;
import UMC.UMC_7th_mission.web.dto.StoreDTO.StoreResponseDTO;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class StoreConverter {
    public static StoreResponseDTO.CreateResultDTO toCreateResultDTO(Store store){
        return StoreResponseDTO.CreateResultDTO.builder()
                .storeId(store.getId())
                .createdAt(LocalDateTime.now())
                .build();
    }

    public static Store toStore(StoreRequestDTO.CreateDTO request, Region getRegion){
        return Store.builder() // member entity에 나이 빠짐
                .region(getRegion)
                .name(request.getName())
                .address(request.getAddress())
                .score(request.getScore())
                .build();
    }
}
