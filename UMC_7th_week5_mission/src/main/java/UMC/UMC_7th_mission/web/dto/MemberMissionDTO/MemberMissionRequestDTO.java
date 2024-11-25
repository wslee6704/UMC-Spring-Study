package UMC.UMC_7th_mission.web.dto.MemberMissionDTO;

import UMC.UMC_7th_mission.domain.enums.MissionStatus;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;

import java.time.LocalDate;

public class MemberMissionRequestDTO {
    @Getter
    public static class CreateMemberMissionDTO {
        @NotBlank
        MissionStatus status;
    }
}
