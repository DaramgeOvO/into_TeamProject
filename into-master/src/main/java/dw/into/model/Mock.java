package dw.into.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "mock")
public class Mock {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int mockId;

    @Column
    private String mockImg;

    private String title;
    private String description;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    // 문제와 시험의 일대다 관계
    @OneToMany(mappedBy = "mock")
    private List<MockQuestion> questions;

}
