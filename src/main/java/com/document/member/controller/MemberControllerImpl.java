package com.document.member.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.document.member.service.MemberService;
import com.document.member.vo.MemberVO;

@Controller("MemberController")
public class MemberControllerImpl implements MemberController{
	
	@Autowired
	private MemberService memberService;
	
	@Autowired
	private MemberVO memberVO;
	
	//로그인화면 이동
	@RequestMapping(value="/member/*Form.do", method=RequestMethod.GET)
	private ModelAndView form(@RequestParam(value="result", required=false) String result, @RequestParam(value="action",required=false) String action,HttpServletRequest request, HttpServletResponse response) throws Exception {
		String viewName = (String)request.getAttribute("viewName");
		
		HttpSession session = request.getSession();
		session.setAttribute("action", action);
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("result",result);
		mav.setViewName(viewName);
		return mav;
	}
	
	//로그인
	@Override
	@RequestMapping(value="/member/login.do", method=RequestMethod.POST)
	public ModelAndView login(MemberVO memberVO, RedirectAttributes rAttr, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		ModelAndView mav = new ModelAndView();
		
		memberVO = memberService.login(memberVO);
	
		if(memberVO != null) {
			HttpSession session = request.getSession();
			session.setAttribute("member", memberVO);
			session.setAttribute("isLogOn", true);
			session.setAttribute("UserId", memberVO.getMem_id());
			
			String action = (String)session.getAttribute("action");
			
			session.removeAttribute("action");
			
			if(action !=null) {
				mav.setViewName("redirect:" + action);
			}else {
				mav.setViewName("redirect:/management/document.do");
			}
		}else {
			rAttr.addAttribute("result", "loginFailed");
			mav.setViewName("redirect:/member/loginForm.do");
		}return mav;
	}

}
