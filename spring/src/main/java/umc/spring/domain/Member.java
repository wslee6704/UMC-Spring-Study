package umc.spring.domain;

    import jakarta.persistence.*;
    import lombok.*;
    import umc.spring.domain.common.BaseEntity;
    import umc.spring.domain.enums.Gender;
    import umc.spring.domain.enums.MemberStatus;
    import umc.spring.domain.enums.SocialType;
    import umc.spring.domain.mapping.MemberAgree;
    import umc.spring.domain.mapping.MemberMission;
    import umc.spring.domain.mapping.MemberPrefer;

    import java.time.LocalDate;
    import java.util.ArrayList;
    import java.util.List;


@Entity
    @Getter
    @Builder
    @NoArgsConstructor(access = AccessLevel.PROTECTED)
    @AllArgsConstructor
    public class Member extends BaseEntity {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @Column(nullable = false, length = 20)
        private String name;

        @Column(nullable = false, length = 40)
        private String address;

        @Column(nullable = false, length = 40)
        private String specAddress;

        @Enumerated(EnumType.STRING)
        @Column(columnDefinition = "VARCHAR(10)")
        private Gender gender;

        @Enumerated(EnumType.STRING)
        @Column(columnDefinition = "VARCHAR(15) DEFAULT 'ACTIVE'")
        private MemberStatus status;

        @Enumerated(EnumType.STRING)
        private SocialType socialType;

        private LocalDate inactiveDate;

        @Column(nullable = true, length = 50)
        private String email;

        @Column(columnDefinition = "INTEGER DEFAULT 0")
        private Integer point;

        @OneToMany(mappedBy = "member", cascade = CascadeType.ALL)
        private List<MemberAgree> memberAgreeList = new ArrayList<>();

        @OneToMany(mappedBy = "member", cascade = CascadeType.ALL)
        private List<MemberPrefer> memberPreferList = new ArrayList<>();

        @OneToMany(mappedBy = "member", cascade = CascadeType.ALL)
        private List<Review> reviewList = new ArrayList<>();

        @OneToMany(mappedBy = "member", cascade = CascadeType.ALL)
        private List<MemberMission> memberMissionList = new ArrayList<>();
    }

