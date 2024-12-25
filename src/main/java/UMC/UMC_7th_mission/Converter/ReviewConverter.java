package UMC.UMC_7th_mission.Converter;

import UMC.UMC_7th_mission.domain.Member;
import UMC.UMC_7th_mission.domain.Review;
import UMC.UMC_7th_mission.domain.Store;
import UMC.UMC_7th_mission.web.dto.ReviewDTO.ReviewRequestDTO;
import UMC.UMC_7th_mission.web.dto.ReviewDTO.ReviewResponseDTO;

import java.time.LocalDateTime;

public class ReviewConverter {
    public static ReviewResponseDTO.CreateReviewResultDTO toCreateResultDTO(Review review){
        return ReviewResponseDTO.CreateReviewResultDTO.builder()
                .reviewId(review.getId())
                .createdAt(LocalDateTime.now())
                .build();
    }

    public static Review toReview(ReviewRequestDTO.CreateReviewDTO request, Member getMember, Store getStore){
        return Review.builder() // member entity에 나이 빠짐
                .member(getMember)
                .store(getStore)
                .body(request.getBody())
                .score(request.getScore())
                .build();
    }
}
