package egovframework.example.faq.service;

import egovframework.example.common.Criteria;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode(callSuper = false)
public class FaqVO extends Criteria {
	private int fno; //관리번호 (기본키,시퀀스)
	private String title; //제목 
	private String content; //내용
}

	
