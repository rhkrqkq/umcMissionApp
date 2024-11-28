package umc.study.service.reviewService;

import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import umc.study.domain.Review;
import umc.study.web.dto.reviewDTO.ReviewRequestDTO;
import umc.study.web.dto.reviewDTO.ReviewResponseDTO;
import umc.study.web.dto.storeDTO.StoreResponseDTO;

@Service
public interface ReviewService {

    @Transactional
    Review writeReview(ReviewRequestDTO.joinDTO request, Long storeId, Long memberId);

    StoreResponseDTO.ReviewPreviewDTO getReviewList(Long storeId, Integer page);


    StoreResponseDTO.ReviewPreviewListDTO getUserReviewList(Long memberId, Integer page);

    Page<Review> getReviews(Long memberId, Integer page);
}
