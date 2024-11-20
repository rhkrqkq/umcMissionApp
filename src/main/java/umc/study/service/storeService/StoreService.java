package umc.study.service.storeService;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import umc.study.domain.Store;
import umc.study.web.dto.storeDTO.StoreRequestDTO;

@Service
public interface StoreService {
    @Transactional
    Store addStore(StoreRequestDTO.addDTO request);
}
