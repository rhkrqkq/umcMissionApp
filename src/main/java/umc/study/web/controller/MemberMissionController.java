package umc.study.web.controller;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;
import umc.study.apiPayload.ApiResponse;
import umc.study.domain.mapping.MemberMission;
import umc.study.service.memberMissionService.MemberMissionService;
import umc.study.web.dto.memberDTO.MemberResponseDTO;
import umc.study.web.dto.memberMissionDTO.MemberMissionRequestDTO;
import umc.study.web.dto.memberMissionDTO.MemberMissionResponseDTO;

@RestController
@RequiredArgsConstructor
@RequestMapping("/missions")
public class MemberMissionController {
    private final MemberMissionService memberMissionService;

    @PostMapping("/{memberId}/{missionId}")
    public ApiResponse<MemberMission> addMission(
            @PathVariable("missionId") Long missionId,
            @PathVariable("memberId") Long memberId,
            @RequestBody @Valid MemberMissionRequestDTO.addDTO request) {

        MemberMission memberMission = memberMissionService.addMission(request);
        return ApiResponse.onSuccess(memberMission);
    }

}
