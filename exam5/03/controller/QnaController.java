package com.simplecoding.simpledms.exam.controller;

import com.simplecoding.simpledms.dept.dto.DeptDto;
import com.simplecoding.simpledms.dept.service.DeptService;
import com.simplecoding.simpledms.exam.dto.QnaDto;
import com.simplecoding.simpledms.exam.service.QnaService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Log4j2
@Controller
@RequiredArgsConstructor
public class QnaController {
    private final QnaService qnaService;

    @GetMapping("/qna")
    public String selectQnaList(
            @RequestParam(defaultValue = "") String searchKeyword,
            @PageableDefault(page = 0, size = 3) Pageable pageable,
            Model model){
        Page<QnaDto> page=qnaService.selectQnaList(searchKeyword, pageable);
        log.info(page.getContent());
        model.addAttribute("qna",page.getContent());
        model.addAttribute("page",page);
        return "qna/qna_all";
    }
}

