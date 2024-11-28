package umc.study.web.dto.reviewDTO;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class ReviewRequestDTO {

    @Getter
    @Builder
    public static class joinDTO {
        private Long memberId;

        @NotBlank(message = "리뷰 내용은 필수입니다.")
        String body;

        @NotNull(message = "평점은 필수입니다.")
        Float score;

        @NotNull
        String storeId;

    }
}
