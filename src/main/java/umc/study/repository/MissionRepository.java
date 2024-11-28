package umc.study.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import umc.study.domain.Mission;
import umc.study.web.dto.memberMissionDTO.MemberMissionRequestDTO;

import java.util.Optional;

public interface MissionRepository extends JpaRepository<Mission, Long> {
}
