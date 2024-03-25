package com.document.management.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.document.management.dao.DocumentDAO;

@Service("documentService")
@Transactional(propagation = Propagation.REQUIRED)
public class DocumentServiceImpl implements DocumentService{
	
	@Autowired
	private DocumentDAO documentDAO;
	
	//문서 목록
	@Override
	public List documentList() throws DataAccessException {
		List document = null;
		document = documentDAO.documentList();
		return document;
	}

}
