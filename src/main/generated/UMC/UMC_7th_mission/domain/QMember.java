package UMC.UMC_7th_mission.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QMember is a Querydsl query type for Member
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QMember extends EntityPathBase<Member> {

    private static final long serialVersionUID = -308659881L;

    public static final QMember member = new QMember("member1");

    public final UMC.UMC_7th_mission.domain.common.QBaseEntity _super = new UMC.UMC_7th_mission.domain.common.QBaseEntity(this);

    public final StringPath address = createString("address");

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final StringPath email = createString("email");

    public final EnumPath<UMC.UMC_7th_mission.domain.enums.Gender> gender = createEnum("gender", UMC.UMC_7th_mission.domain.enums.Gender.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final DatePath<java.time.LocalDate> inactiveDate = createDate("inactiveDate", java.time.LocalDate.class);

    public final ListPath<UMC.UMC_7th_mission.mapping.MemberAgree, UMC.UMC_7th_mission.mapping.QMemberAgree> memberAgreeList = this.<UMC.UMC_7th_mission.mapping.MemberAgree, UMC.UMC_7th_mission.mapping.QMemberAgree>createList("memberAgreeList", UMC.UMC_7th_mission.mapping.MemberAgree.class, UMC.UMC_7th_mission.mapping.QMemberAgree.class, PathInits.DIRECT2);

    public final ListPath<UMC.UMC_7th_mission.mapping.MemberMission, UMC.UMC_7th_mission.mapping.QMemberMission> memberMissionList = this.<UMC.UMC_7th_mission.mapping.MemberMission, UMC.UMC_7th_mission.mapping.QMemberMission>createList("memberMissionList", UMC.UMC_7th_mission.mapping.MemberMission.class, UMC.UMC_7th_mission.mapping.QMemberMission.class, PathInits.DIRECT2);

    public final ListPath<UMC.UMC_7th_mission.mapping.MemberPrefer, UMC.UMC_7th_mission.mapping.QMemberPrefer> memberPreferList = this.<UMC.UMC_7th_mission.mapping.MemberPrefer, UMC.UMC_7th_mission.mapping.QMemberPrefer>createList("memberPreferList", UMC.UMC_7th_mission.mapping.MemberPrefer.class, UMC.UMC_7th_mission.mapping.QMemberPrefer.class, PathInits.DIRECT2);

    public final StringPath name = createString("name");

    public final StringPath password = createString("password");

    public final NumberPath<Integer> point = createNumber("point", Integer.class);

    public final ListPath<Review, QReview> reviewList = this.<Review, QReview>createList("reviewList", Review.class, QReview.class, PathInits.DIRECT2);

    public final EnumPath<UMC.UMC_7th_mission.domain.enums.Role> role = createEnum("role", UMC.UMC_7th_mission.domain.enums.Role.class);

    public final EnumPath<UMC.UMC_7th_mission.domain.enums.SocialType> socialType = createEnum("socialType", UMC.UMC_7th_mission.domain.enums.SocialType.class);

    public final StringPath specAddress = createString("specAddress");

    public final EnumPath<UMC.UMC_7th_mission.domain.enums.MemberStatus> status = createEnum("status", UMC.UMC_7th_mission.domain.enums.MemberStatus.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QMember(String variable) {
        super(Member.class, forVariable(variable));
    }

    public QMember(Path<? extends Member> path) {
        super(path.getType(), path.getMetadata());
    }

    public QMember(PathMetadata metadata) {
        super(Member.class, metadata);
    }

}

