package umc.study.service.reviewService;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import umc.study.domain.Member;
import umc.study.domain.Review;
import umc.study.domain.Store;
import umc.study.repository.MemberRepository;
import umc.study.repository.ReviewRepository;
import umc.study.repository.StoreRepository.StoreRepository;
import umc.study.web.dto.reviewDTO.ReviewRequestDTO;

@Service
@Transactional
@RequiredArgsConstructor
public class ReviewServiceImpl implements ReviewService {
    private final ReviewRepository reviewRepository;
    private final MemberRepository memberRepository;
    private final StoreRepository storeRepository;

    @Override
    @Transactional
    public Review writeReview(ReviewRequestDTO.joinDTO request, Long storeId, Long memberId) {
        Member members = (Member) memberRepository.findById(memberId).orElse(null);
        Store stores = storeRepository.findById(Long.valueOf(request.getStoreId())).orElse(null);

        Review review = Review.builder()
                .body(request.getBody())
                .score(request.getScore())
                .member(members)
                .store(stores)
                .build();
        return reviewRepository.save(review);
    }

    @Override
    public Page<Review> getReviewList(Long StoreId, Integer page) {
        return null;
    }
}
