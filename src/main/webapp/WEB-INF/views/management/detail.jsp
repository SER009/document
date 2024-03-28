<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<c:set var="contextPath" value="${pageContext.request.contextPath}" />

<%request.setCharacterEncoding("utf-8");%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상세 화면</title>
<link href="${contextPath}/resources/css/function/detail.css" rel="stylesheet" type="text/css">
</head>
<body>
	<div>
		상세정보
	</div>
	<form name="view" method="post" action="${contextPath}">
		<table>
			<tr>
				<td>문서 번호</td>
				<td>${views.type}</td>
				<td>문서타입</td>
				<td>${views.type}</td>
			</tr>
			<tr>
				<td>문서명</td>
				<td>${views.type}</td>
			</tr>
			<tr>
				<td>문서 내용</td>
				<td>${views.type}</td>
			</tr>
			<tr>
				<td>문서 등록일</td>
				<td>${views.type}</td>
				<td>문서 수정일</td>
				<td>${views.type}</td>
			</tr>
			<tr>
				<td>파일업로드</td>
				<td></td>
			</tr>
			<tr>
				<td>개정</td>
				<td>${views.type}</td>
			</tr>
			<tr>
				<td>
					<input type="hidden" value="수정반영하기" onclick="fn_modify_view(frmView)" id="i_hidden">
					<input type="button" value = "수정하기" onclick="fn_enable(this.form)">
					<input type="button" value ="삭제하기" onclick="fn_remove_view('${contextPath}/center/delete.do',${view.center_No})">
				</td>
			</tr>
			<tr>
			<td>
				<input type="button" value="리스트로 돌아가기" onclick="backToList(this.form)">
			</td>
		</tr>
		</table>
	</form>
</body>
</html>