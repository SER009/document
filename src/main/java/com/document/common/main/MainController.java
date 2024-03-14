package com.document.common.main;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller("mainController")
public class MainController {
		
	@RequestMapping(value={"/management/document.do"}, method={RequestMethod.GET,RequestMethod.POST})
	 private ModelAndView main(HttpServletRequest req,HttpServletResponse resp) throws Exception {
		HttpSession session;
		session=req.getSession();
		System.out.println("main : "+session);

		ModelAndView mav=new ModelAndView();
		
		String viewName=(String)req.getAttribute("viewName");
		
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