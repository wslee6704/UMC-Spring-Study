package UMC.UMC_7th_mission.repository.StoreRepository;

import UMC.UMC_7th_mission.domain.QStore;
import UMC.UMC_7th_mission.domain.Store;
import com.querydsl.core.BooleanBuilder;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class StoreRepositoryImpl implements StoreRepositoryCustom{
    private final JPAQueryFactory jpaQueryFactory;
    private final QStore store = QStore.store;

    @Override
    public List<Store> dynamicQueryWithBooleanBuilder(String name, Float score) {
        BooleanBuilder predicate = new BooleanBuilder();

        if (name != null) {
            predicate.and(store.name.eq(name));
        }

        if (score != null) {
            predicate.and(store.score.goe(4.0f));
        }

        return jpaQueryFactory
                .selectFrom(store)
                .where(predicate)
                .fetch();
    }
}

//        1. **사용자가 파라미터를 넣지 않은 경우**
//        2. **사용자가 가게 이름으로 검색한 경우**
//        3. **사용자가 가게와 평점이 4.0 이상인 곳만 검색한 경우**

