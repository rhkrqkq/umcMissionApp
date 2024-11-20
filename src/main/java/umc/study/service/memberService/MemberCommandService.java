package umc.study.service.memberService;

import org.springframework.stereotype.Service;
import umc.study.domain.Member;
import umc.study.web.dto.memberDTO.MemberRequestDTO;

@Service
public interface MemberCommandService {
    Member joinMember(MemberRequestDTO.JoinDto request);
}
