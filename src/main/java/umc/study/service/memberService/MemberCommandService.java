package umc.study.service.memberService;

import umc.study.domain.Member;
import umc.study.web.dto.memberDTO.MemberRequestDTO;

public interface MemberCommandService {
    Member joinMember(MemberRequestDTO.JoinDto request);
}
