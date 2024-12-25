package UMC.UMC_7th_mission.web.controller;

import UMC.UMC_7th_mission.Converter.ReviewConverter;
import UMC.UMC_7th_mission.apiPayload.ApiResponse;
import UMC.UMC_7th_mission.domain.Review;
import UMC.UMC_7th_mission.service.ReviewService.ReviewCommandService;
import UMC.UMC_7th_mission.web.dto.ReviewDTO.ReviewRequestDTO;
import UMC.UMC_7th_mission.web.dto.ReviewDTO.ReviewResponseDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/review")
public class ReviewRestController {
    private final ReviewCommandService reviewCommandService;

    @PostMapping("/")
    public ApiResponse<ReviewResponseDTO.CreateReviewResultDTO> join(
            @RequestParam Long memberId,
            @RequestParam Long storeId,
            @RequestBody ReviewRequestDTO.CreateReviewDTO request
    ){
        Review review = reviewCommandService.createReview(memberId, storeId, request);
        return ApiResponse.onSuccess(ReviewConverter.toCreateResultDTO(review));
    }
}
