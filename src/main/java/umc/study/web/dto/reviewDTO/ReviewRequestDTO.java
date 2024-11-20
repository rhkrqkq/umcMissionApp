package umc.study.web.dto.reviewDTO;

import jakarta.validation.constraints.NotBlank;
import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class ReviewRequestDTO {

    @Getter
    @Builder
    public static class joinDTO {
        @NotBlank(message = "리뷰 내용은 필수입니다.")
        String body;

        @NotBlank(message = "평점은 필수입니다.")
        Float score;

        @NotBlank
        String storeId;

    }
}
