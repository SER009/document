package com.document.management.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

@Mapper
@Repository("documentDAO")
public interface DocumentDAO {
	//문서 목록
	public List documentList() throws DataAccessException;
}
