package umc.spring.service.MemberService;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import umc.spring.apiPayLoad.code.status.ErrorStatus;
import umc.spring.apiPayLoad.exception.handler.FoodCategoryHandler;
import umc.spring.converter.MemberConverter;
import umc.spring.converter.MemberPreferConverter;
import umc.spring.domain.FoodCategory;
import umc.spring.domain.Member;
import umc.spring.domain.mapping.MemberPrefer;
import umc.spring.repository.FoodCategoryRepository.FoodCategoryRepository;
import umc.spring.repository.MemberRepository.MemberRepository;
import umc.spring.web.dto.MemberRequestDTO;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class MemberCommandServiceImpl implements MemberCommandService {

    private final MemberRepository memberRepository;
    private final FoodCategoryRepository foodCategoryRepository;

    @Override
    @Transactional
    public Member joinMember(MemberRequestDTO.JoinDto request) {

        //member를 받아왔으니 repository로 사용하겟군..? 데베로 넣겠군?
        Member newMember = MemberConverter.toMember(request);

        List<FoodCategory> foodCategoryList = request.getPreferCategory().stream()
                .map(category -> {//다만 엔티티에 관한 에러 핸들러는 항상 있어야한다
                    return foodCategoryRepository.findById(category).orElseThrow(() -> new FoodCategoryHandler(ErrorStatus.FOOD_CATEGORY_NOT_FOUND));
                }).collect(Collectors.toList());

        //1:N의 테이블로 만들기 위해 foodcategory라는 entity의 리스트를 사용
        List<MemberPrefer> memberPreferList = MemberPreferConverter.toMemberPreferList(foodCategoryList);

        //새로 회원가입한 멤버의 선호 음식과 유저간의 매핑테이블을 세팅해준 것
        memberPreferList.forEach(memberPrefer -> {memberPrefer.setMember(newMember);});

        return memberRepository.save(newMember);
    }
}
