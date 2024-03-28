package com.document.management.vo;

import java.sql.Date;

public class FilesVO {
	private int docu_No; //문서번호
	private int file_No; //파일번호
	private String file_Name; //파일명
	private String server_Name; //서버명
	private String file_Path; //경로명
	private String ext; //파일유형
	private int size; //파일사이즈
	private Date reg_Date; //등록일

	public int getDocu_No() {
		return docu_No;
	}
	public void setDocu_No(int docu_No) {
		this.docu_No = docu_No;
	}
	public int getFile_No() {
		return file_No;
	}
	public void setFile_No(int file_No) {
		this.file_No = file_No;
	}
	public String getFile_Name() {
		return file_Name;
	}
	public void setFile_Name(String file_Name) {
		this.file_Name = file_Name;
	}
	public String getServer_Name() {
		return server_Name;
	}
	public void setServer_Name(String server_Name) {
		this.server_Name = server_Name;
	}
	public String getFile_Path() {
		return file_Path;
	}
	public void setFile_Path(String file_Path) {
		this.file_Path = file_Path;
	}
	public String getExt() {
		return ext;
	}
	public void setExt(String ext) {
		this.ext = ext;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public Date getReg_Date() {
		return reg_Date;
	}
	public void setReg_Date(Date reg_Date) {
		this.reg_Date = reg_Date;
	}
	
	@Override
	public String toString() {
		return "Files [file_No=" + file_No + ", file_Name=" + file_Name + ", ext=" + ext + ", size=" + size
				+ ", reg_Date=" + reg_Date + "]";
	}	
}
