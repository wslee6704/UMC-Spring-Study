package umc.spring.domain.mapping;

import jakarta.persistence.*;
import jdk.jfr.Category;
import lombok.*;
import umc.spring.domain.FoodCategory;
import umc.spring.domain.Member;
import umc.spring.domain.common.BaseEntity;

@Entity
@Builder
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class MemberPrefer extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "member_id")
    private Member member;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "category_id")
    private FoodCategory foodCategory;

    public void setMember(Member member){
        if(this.member != null)
            member.getMemberPreferList().remove(this);
        this.member = member;
        member.getMemberPreferList().add(this);
    }


}
