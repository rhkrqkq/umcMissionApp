package umc.study.service.reviewService;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import umc.study.domain.Member;
import umc.study.domain.Review;
import umc.study.domain.Store;
import umc.study.repository.MemberRepository;
import umc.study.repository.ReviewRepository;
import umc.study.repository.StoreRepository.StoreRepository;
import umc.study.web.dto.reviewDTO.ReviewRequestDTO;
import umc.study.web.dto.storeDTO.StoreResponseDTO;

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
    public StoreResponseDTO.ReviewPreviewDTO getReviewList(Long storeId, Integer page) {
        if (page == 1) {
            page = 0;
        }

        Pageable pageable = PageRequest.of(page, 10);
        return (StoreResponseDTO.ReviewPreviewDTO) reviewRepository.findByStoreId(storeId, pageable);
    }

    @Override
    public StoreResponseDTO.ReviewPreviewListDTO getUserReviewList(Long memberId, Integer page) {
        return null;
    }

    @Override
    public Page<Review> getReviews(Long memberId, Integer page) {
        Member member = memberRepository.findById(memberId)
                .orElseThrow(() -> new IllegalArgumentException("존재하지 않는 회원입니다."));

        if (page == 1) {
            page = 0;
        }

        Pageable pageable = PageRequest.of(page, 10);
        return reviewRepository.findAllByMember(member, pageable);
    }
}
