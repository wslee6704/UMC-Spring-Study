package umc.spring.repository.MissionReporsitory;

import com.querydsl.core.BooleanBuilder;
import com.querydsl.jpa.JPAExpressions;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import umc.spring.domain.Mission;
import umc.spring.domain.QMission;
import umc.spring.domain.QStore;
import umc.spring.domain.mapping.QMemberMission;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class MissionRepositoryImpl implements MissionRepositoryCustom {
    private final JPAQueryFactory jpaQueryFactory;
    private final QMission mission = QMission.mission;
    private final QMemberMission memberMission = QMemberMission.memberMission;
    private final QStore store = QStore.store;
    @Override
    public List<Mission> dynamicQueryUserMission(Long userId){
        return jpaQueryFactory.selectFrom(mission).join(memberMission)
                .on(mission.id.eq(memberMission.mission.id)).where(memberMission.member.id.eq(userId)).fetch();
    }


    @Override
    public List<Mission> enableMission(Long userId, String regionName){//필요한 미션에 대해서 출력
        //이게 진자 맞는건가
        return jpaQueryFactory.selectFrom(mission)
                .join(store).on(mission.store.id.eq(store.id))
                .where(store.region.name.eq(regionName)
                .and(mission.id.notIn(JPAExpressions.select(memberMission.mission.id)//멤버가 진행중인 미션은 뜨지 않게
                .from(memberMission).where(memberMission.member.id.eq(userId))))
                ).orderBy().fetch();

    }


}
