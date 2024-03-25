package com.document.management.vo;

import java.sql.Date;

import org.springframework.stereotype.Component;

@Component("documentVO")
public class DocumentVO {
	private int no;
	private String type;
	private String fileName;
	private String content;
	private Date register;
	private Date modify;
	private float revision;
	private String files;
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getRegister() {
		return register;
	}
	public void setRegister(Date register) {
		this.register = register;
	}
	public Date getModify() {
		return modify;
	}
	public void setModify(Date modify) {
		this.modify = modify;
	}
	public float getRevision() {
		return revision;
	}
	public void setRevision(float revision) {
		this.revision = revision;
	}
	public String getFiles() {
		return files;
	}
	public void setFiles(String files) {
		this.files = files;
	}

	@Override
	public String toString() {
		return "DocumentVO [no=" + no + ", type=" + type + ", fileName=" + fileName + ", content=" + content
				+ ", register=" + register + ", modify=" + modify + ", revision=" + revision + ", files=" + files + "]";
	}

}
