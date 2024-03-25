package com.document.management.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.document.management.service.DocumentService;

@Controller("documentController")
public class DocumentControllerImpl implements DocumentController{
	@Autowired
	private DocumentService documentService;
	
	//문서 목록
	@Override
	@RequestMapping(value="/admin/listMembers.do", method= {RequestMethod.GET,RequestMethod.POST})
	public ModelAndView document(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
}
