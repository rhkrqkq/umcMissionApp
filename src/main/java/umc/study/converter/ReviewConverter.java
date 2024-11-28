package umc.study.converter;

import umc.study.domain.Review;
import umc.study.domain.Store;
import umc.study.web.dto.reviewDTO.ReviewRequestDTO;
import umc.study.web.dto.reviewDTO.ReviewResponseDTO;


public class ReviewConverter {

    public static Review toReview(ReviewRequestDTO reviewRequestDTO, Store store) {
        return Review.builder().build();
    }

    public static ReviewResponseDTO.writeReviewDTO towriteReviewDTO(Review review) {
        return ReviewResponseDTO.writeReviewDTO.builder()
                .reviewId(review.getId())
                .createdAt(review.getCreatedAt())
                .build();
    }

}
