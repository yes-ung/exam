package egovframework.example.faq.service.impl;

import java.util.List;

import egovframework.example.common.Criteria;

public interface FaqMapper {
	public List<?> selectFaqList(Criteria criteria);   // 전체 조회
	public int selectFaqListTotCnt(Criteria criteria); // 총 개수 구하기
}
