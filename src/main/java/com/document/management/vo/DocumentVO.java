package com.document.management.vo;

import java.sql.Date;

import org.springframework.stereotype.Component;

@Component("documentVO")
public class DocumentVO {
	private int docu_No; //문서번호
	private String docu_Type; //문서유형
	private String docu_Name; //문서이름
	private String content; //문서내용
	private Date reg_Date; //등록일
	private Date mod_Date; //수정일
	private float revision; //개정번호
	private int file_No; //파일번호
	private int docu_Count; //문서수
		
	public int getDocu_No() {
		return docu_No;
	}


	public void setDocu_No(int docu_No) {
		this.docu_No = docu_No;
	}


	public String getDocu_Type() {
		return docu_Type;
	}


	public void setDocu_Type(String docu_Type) {
		this.docu_Type = docu_Type;
	}


	public String getDocu_Name() {
		return docu_Name;
	}


	public void setDocu_Name(String docu_Name) {
		this.docu_Name = docu_Name;
	}


	public String getContent() {
		return content;
	}


	public void setContent(String content) {
		this.content = content;
	}


	public Date getReg_Date() {
		return reg_Date;
	}


	public void setReg_Date(Date reg_Date) {
		this.reg_Date = reg_Date;
	}


	public Date getMod_Date() {
		return mod_Date;
	}


	public void setMod_Date(Date mod_Date) {
		this.mod_Date = mod_Date;
	}


	public float getRevision() {
		return revision;
	}


	public void setRevision(float revision) {
		this.revision = revision;
	}


	public int getFile_No() {
		return file_No;
	}


	public void setFile_No(int file_No) {
		this.file_No = file_No;
	}


	public int getDocu_Count() {
		return docu_Count;
	}


	public void setDocu_Count(int docu_Count) {
		this.docu_Count = docu_Count;
	}

	@Override
	public String toString() {
		return "DocumentVO [docu_No=" + docu_No + ", docu_Type=" + docu_Type + ", docu_Name=" + docu_Name + ", content="
				+ content + ", reg_Date=" + reg_Date + ", mod_Date=" + mod_Date + ", revision=" + revision
				+ ", file_No=" + file_No + ", docu_Count=" + docu_Count + "]";
	}
	
}
