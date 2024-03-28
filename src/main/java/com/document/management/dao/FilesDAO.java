package com.document.management.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import com.document.management.vo.FilesVO;

@Mapper
@Repository("filesDAO")
public interface FilesDAO {
	//파일 등록
	public int insertFile(Map<String,Object> file) throws DataAccessException;
	//파일 조회
	public Map<String,Object> selectFile(int file_No) throws DataAccessException;
	//파일 수정
	public void updateFile(List<FilesVO> files) throws DataAccessException;
	//파일 삭제
	public int deleteFile(int file_No) throws DataAccessException;
}
