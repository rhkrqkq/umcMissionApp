package umc.study.service.memberService;

import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import umc.study.domain.Member;
import umc.study.domain.mapping.MemberMission;
import umc.study.web.dto.memberDTO.MemberRequestDTO;
import umc.study.web.dto.memberMissionDTO.MemberMissionRequestDTO;

@Service
public interface MemberCommandService {
    Member joinMember(MemberRequestDTO.JoinDto request);
}
