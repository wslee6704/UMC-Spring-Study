package UMC.UMC_7th_mission.web.dto.StoreDTO;

import UMC.UMC_7th_mission.Validation.annotation.ExistCategories;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;

import java.util.List;

public class StoreRequestDTO {

    @Getter
    public static class CreateDTO{
        @NotBlank
        String name;
        @Size(min = 5, max = 12)
        String address;
        @NotNull
        Float score;
    }
}
