package umc.study.web.controller;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import umc.study.apiPayload.ApiResponse;
import umc.study.service.MemberMissionService.MemberMissionService;
import umc.study.web.dto.memberMissionDTO.MemberMissionRequestDTO;
import umc.study.web.dto.memberMissionDTO.MemberMissionResponseDTO;

@RestController
@RequiredArgsConstructor
@RequestMapping("/missions")
public class MemberMissionController {
    private final MemberMissionService memberMissionService;

    @PostMapping("/{memberId}/{missionId}")
    public ApiResponse<MemberMissionResponseDTO> addedDTO(@PathVariable("missionId") Long missionId, @PathVariable("memberId") Long memberId
            , @RequestBody @Valid MemberMissionRequestDTO.addDTO request) {
        MemberMissionResponseDTO memberMissionResponseDTO = memberMissionService.addMission(memberId);

        return ApiResponse.onSuccess(memberMissionResponseDTO);
    }
}
