package com.simplecoding.simpledms.exam.entity;


import com.simplecoding.simpledms.common.BaseTimeEntity;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "TB_QNA")
@SequenceGenerator(
        name = "SQ_QNA_JPA",
        sequenceName = "SQ_QNA",
        allocationSize = 1
)
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "qno", callSuper = false)
public class Qna extends BaseTimeEntity {
//    QNO	NUMBER
//    QUESTIONER	VARCHAR2(255 BYTE)
//    QUESTION	VARCHAR2(4000 BYTE)
//    ANSWER	VARCHAR2(4000 BYTE)
//    ANSWERER	VARCHAR2(255 BYTE)
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE
            ,generator = "SQ_QNA_JPA")
    private Long qno;
    private String questioner;
    private String question;
    private String answer;
    private String answerer;
}
