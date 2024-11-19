package umc.study.web.dto.storeDTO;

import jakarta.validation.constraints.NotBlank;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class StoreRequestDTO {

    @Getter
    @Builder
    public static class addDTO {

        @NotBlank(message = "가게 이름은 필수입니다.")
        String name;

        @NotBlank(message = "주소는 필수입니다.")
        String address;

        @NotBlank(message = "지역 ID는 필수입니다.")
        Long regionId;
    }
}
