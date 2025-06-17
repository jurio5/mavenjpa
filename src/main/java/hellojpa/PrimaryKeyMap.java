package hellojpa;

import jakarta.persistence.*;

@Entity
@Table(name = "MemberPK")
@SequenceGenerator(name = "member_seq_generator", sequenceName = "member_seq")
public class PrimaryKeyMap {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "member_seq_generator")
    private Long id;

    @Column(name = "name", nullable = false)
    private String username;

    protected PrimaryKeyMap() {
    }
}
