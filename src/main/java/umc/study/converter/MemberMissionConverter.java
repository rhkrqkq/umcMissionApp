package umc.study.converter;

import umc.study.domain.enums.MissionStatus;
import umc.study.domain.mapping.MemberMission;
import umc.study.web.dto.memberMissionDTO.MemberMissionRequestDTO;
import umc.study.web.dto.memberMissionDTO.MemberMissionResponseDTO;

public class MemberMissionConverter {

    public static MemberMission tomemberMission(MemberMissionRequestDTO.addDTO request) {
        return MemberMission.builder()
                .status(MissionStatus.CHALLENGING)
                .build();
    }

    public static MemberMissionResponseDTO.addedDTO toaddedDTO(MemberMission memberMission) {
        return MemberMissionResponseDTO.addedDTO.builder()
                .status(String.valueOf(memberMission.getStatus()))
                .missionId(memberMission.getMission().getId())
                .createdAt(memberMission.getCreatedAt())
                .build();
    }
}
