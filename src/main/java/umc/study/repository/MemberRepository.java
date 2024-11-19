package umc.study.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import umc.study.domain.Member;
import umc.study.web.dto.reviewDTO.ReviewRequestDTO;

import java.util.Optional;

public interface MemberRepository extends JpaRepository<Member, Long> {
    Optional<Object> findById(ReviewRequestDTO.joinDTO memberId);
}