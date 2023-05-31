package idusw.springboot.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "jsj_board")

@ToString(exclude = "writer")   // lombok 라이브러리 사용
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
//@Data // ==@ Tostring , @EqualsAndHashCode, @Getter @Setter @RequiredArgsConstructor
// JPA Auditing 을 활용하여서 생성한 사람 , 생성일자, 수정한사람, 수정일자 등을 선택하여서 감사
public class BoardEntity extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "board_201812057_seq_gen")
    // Oracle : GenerationType.SEQUENCE, Mysql/MariaDB : GenerationType.IDENTITY, auto_increment
    @SequenceGenerator(sequenceName = "board_201812057_seq", name = "board_201812057_seq_gen", initialValue = 1, allocationSize = 1)
    private Long bno; // 유일성 있음

    @Column(length = 20, nullable = false)
    private String title;

    @Column(length = 1000, nullable = false)
    private String content;

    @Column(length = 20, nullable = false)
    private String email;

    @Column(length = 30, nullable = false)
    private String name;

    @Column(length = 20, nullable = false)
    private String pw;


    @ManyToOne
    // @JoinColumn(name = "seq")
    private MemberEntity writer; // BoardEntity : MemberEntity = N : 1

}

