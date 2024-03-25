package com.document.management.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;

public interface DocumentController {
	//문서 목록
	public ModelAndView document(HttpServletRequest request, HttpServletResponse response) throws Exception;

}
