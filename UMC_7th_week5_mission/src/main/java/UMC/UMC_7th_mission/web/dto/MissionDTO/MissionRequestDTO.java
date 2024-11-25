package UMC.UMC_7th_mission.web.dto.MissionDTO;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;

import java.time.LocalDate;

public class MissionRequestDTO {
    @Getter
    public static class CreateMissionDTO {
        @NotBlank
        Integer reward;
        @NotBlank
        String missionSpec;
        @NotBlank
        LocalDate deadline;
    }
}
