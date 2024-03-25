package com.document.member.service;

import com.document.member.vo.MemberVO;

public interface MemberService {
	//로그인
	public MemberVO login(MemberVO MemberVO) throws Exception;
	//회원 추가
	public void addMember(MemberVO memberVO) throws Exception;
}
