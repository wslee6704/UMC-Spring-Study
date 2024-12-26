package UMC.UMC_7th_mission.service.MemberService;

import UMC.UMC_7th_mission.Converter.MemberConverter;
import UMC.UMC_7th_mission.Converter.MemberPreferConverter;
import UMC.UMC_7th_mission.apiPayload.code.status.ErrorStatus;
import UMC.UMC_7th_mission.apiPayload.exception.handler.FoodCategoryHandler;
import UMC.UMC_7th_mission.domain.FoodCategory;
import UMC.UMC_7th_mission.domain.Member;
import UMC.UMC_7th_mission.mapping.MemberPrefer;
import UMC.UMC_7th_mission.repository.FoodCategoryRepository;
import UMC.UMC_7th_mission.repository.MemberRepository;
import UMC.UMC_7th_mission.web.dto.Member.MemberRequestDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class MemberCommandServiceImpl implements MemberCommandService {

    private final MemberRepository memberRepository;

    private final FoodCategoryRepository foodCategoryRepository;

    private final PasswordEncoder passwordEncoder;

    @Override
    @Transactional
    public Member joinMember(MemberRequestDTO.JoinDto request) {
        System.out.println("###");

        Member newMember = MemberConverter.toMember(request);

        newMember.encodePassword(passwordEncoder.encode(request.getPassword()));

        List<FoodCategory> foodCategoryList = request.getPreferCategory().stream()
                .map(category -> {
                    return foodCategoryRepository.findById(category).orElseThrow(() -> new FoodCategoryHandler(ErrorStatus.FOOD_CATEGORY_NOT_FOUND));
                }).collect(Collectors.toList());

        List<MemberPrefer> memberPreferList = MemberPreferConverter.toMemberPreferList(foodCategoryList);

        memberPreferList.forEach(memberPrefer -> {
            memberPrefer.setMember(newMember);
        });

        return memberRepository.save(newMember);
    }
}
