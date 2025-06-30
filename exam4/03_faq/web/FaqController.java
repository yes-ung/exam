package egovframework.example.faq.web;

import java.util.List;

import org.egovframe.rte.ptl.mvc.tags.ui.pagination.PaginationInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;

import egovframework.example.common.Criteria;
import egovframework.example.faq.service.FaqService;
import lombok.extern.log4j.Log4j2;

@Log4j2
@Controller
public class FaqController {

	@Autowired
	FaqService faqService;
	
	// 전체 조회
	@GetMapping("/faq/faq.do")
	public String name(@ModelAttribute Criteria criteria,
			Model model,@RequestParam(defaultValue = "") String searchKeyword) {
//       개인적으로 추가  
		 model.addAttribute("searchKeyword", searchKeyword); 	
		
//		1) 등차자동계산 클래스 : PaginationInfo
//           -필요정보: (1) 현재페이지번호(pageIndex),
//		(2)보일 개수(pageUnit) : 3
		PaginationInfo paginationInfo = new PaginationInfo();
		paginationInfo.setCurrentPageNo(criteria.getPageIndex());
		paginationInfo.setRecordCountPerPage(criteria.getPageUnit());
//		등차를 자동 계산 :  FirstRecordIndex 필드에 있음
		criteria.setFirstIndex(paginationInfo.getFirstRecordIndex());
		
		
// 전체 조회 서비스 메소드 실행
		List<?> faqs= faqService.selectFaqList(criteria);
		log.info("테스트:"+faqs);
		model.addAttribute("faqs",faqs);
		
//      페이지 번호 그리기 : 페이지 플러그인(전체테이블 행 갯수 필요)	
		int totCnt=faqService.selectFaqListTotCnt(criteria);
		paginationInfo.setTotalRecordCount(totCnt);
		log.info("테스트 : "+totCnt);
//		페이지 모든 정보 : paginationInfo
		model.addAttribute("paginationInfo",paginationInfo);
		
		
		return "faq/faq_all";
	}
}
