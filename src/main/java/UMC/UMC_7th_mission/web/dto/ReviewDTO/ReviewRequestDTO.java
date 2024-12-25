package UMC.UMC_7th_mission.web.dto.ReviewDTO;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;

public class ReviewRequestDTO {

    @Getter
    public static class CreateReviewDTO {
        @NotBlank
        String body;
        @NotNull
        Float score;
    }
}
