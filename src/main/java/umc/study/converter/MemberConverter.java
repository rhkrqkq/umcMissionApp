package umc.study.converter;

import org.springframework.data.domain.Page;
import umc.study.domain.Member;
import umc.study.domain.Review;
import umc.study.domain.enums.Gender;
import umc.study.web.dto.memberDTO.MemberRequestDTO;
import umc.study.web.dto.memberDTO.MemberResponseDTO;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;


public class MemberConverter {

    public static MemberResponseDTO.JoinResultDTO toJoinResultDTO(Member member){
        return MemberResponseDTO.JoinResultDTO.builder()
                .memberId(member.getId())
                .createdAt(LocalDateTime.now())
                .build();
    }

    public static MemberResponseDTO.ReviewListDetailDTO reviewListDetailDTO(Review review) {
        return MemberResponseDTO.ReviewListDetailDTO.builder()
                .name(review.getMember().getName()) // Member 객체의 이름
                .body(review.getBody())
                .score(review.getScore())
                .createdAt(review.getCreatedAt())
                .build();
    }

    public static MemberResponseDTO.ReviewListDTO reviewListDTO(Page<Review> reviewList) {
        List<MemberResponseDTO.ReviewListDetailDTO> reviewListDetailDTOList = reviewList.stream()
                .map(MemberConverter::reviewListDetailDTO)
                .toList();

        return MemberResponseDTO.ReviewListDTO.builder()
                .reviewListDTOS(reviewListDetailDTOList)
                .listSize(reviewList.getSize())
                .totalPage(reviewList.getTotalPages())
                .totalElements(reviewList.getTotalElements())
                .isFirst(reviewList.isFirst())
                .isLast(reviewList.isLast())
                .build();
    }

    public static Member toMember(MemberRequestDTO.JoinDto request){

        Gender gender = null;
        switch (request.getGender()) {
            case 1: gender = Gender.MALE; break;
            case 2: gender = Gender.FEMALE; break;
            case 3: gender = Gender.NONE; break;
        }

        assert gender != null;
        return Member.builder()
                .name(request.getName())
                .email(request.getEmail())
                .password(request.getPassword())
                .gender(gender.ordinal())
                .address(request.getAddress())
                .specAddress(request.getSpecAddress())
                .role(request.getRole())
                .memberPreferList(new ArrayList<>())
                .build();
    }
}