package umc.study.web.dto.memberMissionDTO;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class MemberMissionRequestDTO {

    @Getter
    public static class addDTO {
        @NotBlank(message = "미션 ID는 필수입니다.")
        Long missionId;

        @NotBlank(message = "멤버 ID는 필수입니다.")
        Long memberId;
    }
}
