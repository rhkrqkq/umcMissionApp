package umc.study.service.storeService;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import umc.study.domain.Store;
import umc.study.repository.StoreRepository.StoreRepository;
import umc.study.web.dto.storeDTO.StoreRequestDTO;

@Service
@Transactional
@RequiredArgsConstructor
public class StoreServiceImpl implements StoreService {
    private final StoreRepository storeRepository;

    @Override
    @Transactional
    public Store addStore(StoreRequestDTO.addDTO request) {
        return null;
    }
}
