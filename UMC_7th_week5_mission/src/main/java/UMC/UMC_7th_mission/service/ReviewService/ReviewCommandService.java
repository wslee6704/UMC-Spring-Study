package UMC.UMC_7th_mission.service.ReviewService;

import UMC.UMC_7th_mission.domain.Review;
import UMC.UMC_7th_mission.web.dto.ReviewDTO.ReviewRequestDTO;

public interface ReviewCommandService {
    Review createReview(Long memberId, Long storeId, ReviewRequestDTO.CreateReviewDTO request);
}
