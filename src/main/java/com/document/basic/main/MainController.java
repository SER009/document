package com.document.basic.main;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.document.management.service.DocumentService;

@Controller("mainController")
public class MainController {
	
	@Autowired
	private DocumentService documentService;
	
	@RequestMapping(value={"/management/document.do"}, method={RequestMethod.GET,RequestMethod.POST})
	 private ModelAndView main(HttpServletRequest req,HttpServletResponse resp) throws Exception { //5
		ModelAndView mav=new ModelAndView();
		
		String viewName=(String)req.getAttribute("viewName");
		
		List documentLsit = documentService.documentList();
		
		mav.addObject("documentList", documentLsit);
		mav.setViewName(viewName);
		
		return mav;
	}
	
	//Form 화면 이동
	@RequestMapping(value="/*/*Form.do", method=RequestMethod.GET)
	private ModelAndView form(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String viewName = (String)request.getAttribute("viewName");		
		
		ModelAndView mav = new ModelAndView();
		
		mav.setViewName(viewName);

		return mav;
	}

     //검색 결과 창
     @RequestMapping(value={"/search.do"}, method={RequestMethod.GET,RequestMethod.POST})
     private ModelAndView mainsearch(HttpServletRequest req, HttpServletResponse resp) throws Exception {
    	 String viewName = (String)req.getAttribute("viewName");
    	 
    	 ModelAndView mav = new ModelAndView();
		
    	 mav.setViewName(viewName);
    	 
    	 return mav;
     }
}