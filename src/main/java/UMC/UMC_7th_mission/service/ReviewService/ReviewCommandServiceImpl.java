package UMC.UMC_7th_mission.service.ReviewService;

import UMC.UMC_7th_mission.Converter.ReviewConverter;
import UMC.UMC_7th_mission.domain.Member;
import UMC.UMC_7th_mission.domain.Review;
import UMC.UMC_7th_mission.domain.Store;
import UMC.UMC_7th_mission.repository.MemberRepository;
import UMC.UMC_7th_mission.repository.ReviewRepository;
import UMC.UMC_7th_mission.repository.StoreRepository.StoreRepository;
import UMC.UMC_7th_mission.web.dto.ReviewDTO.ReviewRequestDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ReviewCommandServiceImpl implements ReviewCommandService {

    private final MemberRepository memberRepository;
    private final StoreRepository storeRepository;
    private final ReviewRepository reviewRepository;

    @Override
    public Review createReview(Long memberId, Long storeId, ReviewRequestDTO.CreateReviewDTO request) {
        Member getMember = memberRepository.findById(memberId).orElse(null);
        Store getStore = storeRepository.findById(storeId).orElse(null);

        Review newReview = ReviewConverter.toReview(request, getMember, getStore);

        return reviewRepository.save(newReview);
    }
}
