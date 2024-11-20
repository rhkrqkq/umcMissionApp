package umc.study.web.controller;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.Value;
import org.springframework.web.bind.annotation.*;
import umc.study.apiPayload.ApiResponse;
import umc.study.converter.ReviewConverter;
import umc.study.domain.Review;
import umc.study.service.reviewService.ReviewService;
import umc.study.web.dto.reviewDTO.ReviewRequestDTO;
import umc.study.web.dto.reviewDTO.ReviewResponseDTO;

@RestController
@RequiredArgsConstructor
@RequestMapping("/review")
public class ReviewRestController {

    private final ReviewService reviewService;

    @PostMapping("/{memberId}/{storeId}")
    public ApiResponse<ReviewResponseDTO.writeReviewDTO> writeReview(@PathVariable("memberId") ReviewRequestDTO.joinDTO memberId
            , @PathVariable("storeId") Long storeId, @RequestBody @Valid ReviewRequestDTO.joinDTO request) {
        Review review = reviewService.writeReview(request, storeId, memberId);
        return ApiResponse.onSuccess(ReviewConverter.towriteReviewDTO(review));
            }
    }
