package umc.study.service.reviewService;

import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import umc.study.domain.Review;
import umc.study.web.dto.reviewDTO.ReviewRequestDTO;

@Service
public interface ReviewService {

    @Transactional
    Review writeReview(ReviewRequestDTO.joinDTO request, Long storeId, Long memberId);

    Page<Review> getReviewList(Long StoreId, Integer page);
}
