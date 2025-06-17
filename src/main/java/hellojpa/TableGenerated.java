package hellojpa;

import jakarta.persistence.*;

@Entity
@TableGenerator(
        name = "MEMBER_SEQ_GENERATOR",
        table = "MY_SEQUENCES",
        pkColumnValue = "MEMBER_SEQ",
        allocationSize = 1
)
@Table(name = "MemberTable")
public class TableGenerated {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "MEMBER_SEQ_GENERATOR")
    private Long id;
}
