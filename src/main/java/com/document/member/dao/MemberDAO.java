package com.document.member.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import com.document.member.vo.MemberVO;

@Mapper
@Repository("memberDAO")
public interface MemberDAO {
	//로그인
	public MemberVO login(MemberVO memberVO) throws DataAccessException;
	//회원 추가
	public void insertMember(MemberVO memberVO) throws DataAccessException;
}
