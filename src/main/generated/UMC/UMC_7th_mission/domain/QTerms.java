package UMC.UMC_7th_mission.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QTerms is a Querydsl query type for Terms
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QTerms extends EntityPathBase<Terms> {

    private static final long serialVersionUID = 1104891690L;

    public static final QTerms terms = new QTerms("terms");

    public final UMC.UMC_7th_mission.domain.common.QBaseEntity _super = new UMC.UMC_7th_mission.domain.common.QBaseEntity(this);

    public final StringPath body = createString("body");

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final ListPath<UMC.UMC_7th_mission.mapping.MemberAgree, UMC.UMC_7th_mission.mapping.QMemberAgree> memberAgreeList = this.<UMC.UMC_7th_mission.mapping.MemberAgree, UMC.UMC_7th_mission.mapping.QMemberAgree>createList("memberAgreeList", UMC.UMC_7th_mission.mapping.MemberAgree.class, UMC.UMC_7th_mission.mapping.QMemberAgree.class, PathInits.DIRECT2);

    public final BooleanPath optional = createBoolean("optional");

    public final StringPath title = createString("title");

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QTerms(String variable) {
        super(Terms.class, forVariable(variable));
    }

    public QTerms(Path<? extends Terms> path) {
        super(path.getType(), path.getMetadata());
    }

    public QTerms(PathMetadata metadata) {
        super(Terms.class, metadata);
    }

}

