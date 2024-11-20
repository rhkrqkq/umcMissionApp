package umc.study.service.memberMissionService;

import org.springframework.stereotype.Service;
import umc.study.domain.mapping.MemberMission;
import umc.study.web.dto.memberMissionDTO.MemberMissionRequestDTO;

@Service
public interface MemberMissionService {
    MemberMission addMission(MemberMissionRequestDTO.addDTO request);
}
