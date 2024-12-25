package UMC.UMC_7th_mission.web.dto.MemberMissionDTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

public class MemberMissionResponseDTO {
    @Builder
    @Getter
    @NoArgsConstructor
    @AllArgsConstructor
    public static class CreateMemberMissionResultDTO {
        Long memberMissionId;
        LocalDateTime createdAt;
    }
}
