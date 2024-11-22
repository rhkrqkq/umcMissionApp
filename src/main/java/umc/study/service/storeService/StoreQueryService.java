package umc.study.service.storeService;

import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import umc.study.domain.Review;
import umc.study.domain.Store;

import java.util.List;
import java.util.Optional;


@Service
public interface StoreQueryService {

    Optional<Store> findStore(Long id);
    List<Store> findStoresByNameAndScore(String name, Float score);

    Page<Review> getReviewList(Long StoreId, Integer page);

}