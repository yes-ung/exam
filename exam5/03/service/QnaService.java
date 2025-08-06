package com.simplecoding.simpledms.exam.service;

import com.simplecoding.simpledms.dept.service.DeptService;
import com.simplecoding.simpledms.exam.common.MapStruct;
import com.simplecoding.simpledms.exam.dto.QnaDto;
import com.simplecoding.simpledms.exam.entity.Qna;
import com.simplecoding.simpledms.exam.repository.QnaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class QnaService {
    private final QnaRepository qnaRepository;
    private final MapStruct mapStruct;

//    전체조회
    public Page<QnaDto> selectQnaList(String searchKeyword, Pageable pageable) {
        Page<Qna> page = qnaRepository.selectQnaList(searchKeyword, pageable);
        return page.map(data -> mapStruct.toDto(data));
    }
}
