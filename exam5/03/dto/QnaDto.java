package com.simplecoding.simpledms.exam.dto;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class QnaDto {
    private Long qno;
    private String questioner;
    private String question;
    private String answer;
    private String answerer;
}
