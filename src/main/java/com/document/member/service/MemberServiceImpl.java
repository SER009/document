package com.document.member.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.document.member.dao.MemberDAO;
import com.document.member.vo.MemberVO;

@Service("memberService")
@Transactional(propagation = Propagation.REQUIRED)
public class MemberServiceImpl implements MemberService{
	@Autowired
	private MemberDAO memberDAO;
	
	//로그인
	@Override
	public MemberVO login(MemberVO MemberVO) throws Exception {
		return memberDAO.login(MemberVO);
	}
	
	//회원추가
	@Override
	public void addMember(MemberVO memberVO) throws Exception{
		memberDAO.insertMember(memberVO);
	}
}
