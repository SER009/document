package com.document.member.service;

import com.document.member.vo.MemberVO;

public interface MemberService {
	//로그인
	public MemberVO login(MemberVO MemberVO) throws Exception;

}
