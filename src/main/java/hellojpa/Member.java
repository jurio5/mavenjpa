package hellojpa;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.Date;

@Entity
public class Member {

    @Id
    private Long id;

    @Column(name = "name")
    private String username;

    private int age;

    @Enumerated(EnumType.STRING)
    private RoleType roleType;

    @Temporal(TemporalType.TIMESTAMP) // 최신 하이버네이트는 LocalDateTime 을 사용
    private Date createdDate;

    @Temporal(TemporalType.TIMESTAMP)
    private Date lastModifiedDate;

    @Lob
    private String description;

    @Transient // DB에 저장 및 조회 X , 필드 매핑 X, 주로 메모리 상에서 임시로 어떤 값을 보관하고 싶을 때 사용
    private int temp;

    protected Member() {
    }
}
