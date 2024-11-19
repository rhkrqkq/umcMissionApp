package umc.study.service.MemberMissionService;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import umc.study.domain.mapping.MemberMission;
import umc.study.web.dto.memberMissionDTO.MemberMissionRequestDTO;
import umc.study.web.dto.memberMissionDTO.MemberMissionResponseDTO;

@Service
public interface MemberMissionService {
    @Transactional
    MemberMission addMission(MemberMissionRequestDTO.addDTO request);

    MemberMissionResponseDTO addMission(Long missionId, Long memberId);
}
