package com.document.management.service;

import java.util.List;

import org.springframework.dao.DataAccessException;;

public interface DocumentService {
	//문서 목록
	public List documentList() throws DataAccessException;
}
