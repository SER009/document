package com.document.management.service;

import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.document.management.dao.FilesDAO;

@Service("filesService")
public class FilesServiceImpl implements FilesService{
	
	@Autowired
	private FilesDAO filesDAO;
	
	@Autowired
	private ConfigurableEnvironment env;

	private final String UPLOAD_FILE_PATH = "C:\\document\\files";
	
	//파일 등록.업로드
	@Override
	public Map<String, Object> uploadFile(HttpServletRequest request, List<MultipartFile> multipartFile)
			throws Exception {
		Map<String, Object> result = new HashMap<String, Object>();
		
		//파일 리스트
		List<String> files_List = new ArrayList<String>();
		
		result.put("result", "FAIL");
		
		//"filePath"의 값을 문자열로 전환 null값이면 UPLOAD_FILE_PATH의 폴더만 생성, null값 아니면 filePath의 값+/의 폴더 생성
		String _filePath = String.valueOf(request.getParameter("filePath")).equals("null") ? env.getProperty(UPLOAD_FILE_PATH) : env.getProperty(UPLOAD_FILE_PATH)+String.valueOf(request.getParameter("filePath")+"/"); 
		
		try {
			//파일 있을 시 
			//MultipartFile의 용량이 > 0 보다 크고, MultipartFile의 첫번째 객체의 파일 이름이 ""이 아닐때
			if(multipartFile.size() > 0 && !multipartFile.get(0).getOriginalFilename().equals("")) {
				for(MultipartFile file : multipartFile) {//multipartFile라는 배열에서 처음부터 마지막까지의 값을 변수 file에 저장
					String originalFileName = file.getOriginalFilename();//오리지날 파일명 가져오기
					String extension = originalFileName.substring(originalFileName.lastIndexOf("."));//끝에서부터 시작하여 처음"."에서 잘라 끝부터 "."의 값을 넣음->파일 확장자
					//UUID : 고유성이 보장되는 식별자. 일반적으로 네트워크 상에서 유일한 식별자를 생성할 때 사용
					//UUID.randomUUID()는 매번 실행될 때마다 새로운 UUID를 생성하며, 그 결과를 문자열로 반환
					//파일이름을 생성할 때 고유성을 보장하고 중복을 피하기 위해 사용됩니다. 만약 파일을 업로드하거나 다운로드할 때 고유한 파일 이름이 필요한 경우에 유용
					String saveFileName = UUID.randomUUID() + extension;
					
					File targetFile = new File(_filePath + saveFileName);
					
					//파일 저장 후 db에 insert
					result.put("file_Path", _filePath);
					result.put("server_Name", saveFileName);
					result.put("file_Name", originalFileName);
					result.put("ext", extension);
					result.put("contextType", file.getContentType());
					result.put("size", file.getSize());
					
					insertFile(result);
					//log.info("file_No={}", result.get("file_No")); 로그 메세지 생성 
					
					//배열에 담기
					files_List.add(String.valueOf(result.get("file_No")));
					
					try{
						//fileStream을 사용하여 파일로부터 데이터를 읽는 작업 수행
						InputStream fileStream = file.getInputStream();
						
						//FileUtils : Apache Commons IO 라이브러리에서 제공되는 메서드
						//InputStream에서 데이터를 읽어들여 파일로 복사하는 데 사용
						FileUtils.copyInputStreamToFile(fileStream, targetFile); //파일 저장
					
					} catch(Exception e){
						//파일 삭제, 지정된 파일이나 디렉토리를 조용히(quietly) 삭제
						FileUtils.deleteQuietly(targetFile);
						e.printStackTrace();
						result.put("result", "delete_FAIL");
						break;
					}
				}//for문 끝
				result.put("fileIdxs", files_List.toString());
				result.put("result", "OK");
			}else {//if문 끝.	첨부파일이 없을 경우
				result.put("result", "NO_File/OK");
			}
		}catch(Exception e) { //처음 try-catch
			e.printStackTrace();
			result.put("result", "uploadFail");
		}
		return result;
	}
	
	//파일 db 저장
	@Override
	public int insertFile(Map<String, Object> params) throws Exception {
		return filesDAO.insertFile(params);
	}
	
	
	
}
