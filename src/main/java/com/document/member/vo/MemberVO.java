package com.document.member.vo;

import org.springframework.stereotype.Component;

@Component("memberVO")
public class MemberVO {
	private String mem_id;
	private String password;
	
	public String getMem_id() {
		return mem_id;
	}
	public void setMem_id(String mem_id) {
		this.mem_id = mem_id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

}
