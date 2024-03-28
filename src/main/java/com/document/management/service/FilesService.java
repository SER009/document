package com.document.management.service;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.multipart.MultipartFile;

public interface FilesService {
	//파일 등록
	public  Map<String,Object> uploadFile(HttpServletRequest request, List<MultipartFile> multipartFile) throws Exception;
	//파일 목록
	//파일 수정
	//파일 삭제
	//파일 db 저장
	public int insertFile(Map<String,Object> params) throws Exception;
	
}
