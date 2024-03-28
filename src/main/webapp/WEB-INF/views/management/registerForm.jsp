<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<c:set var="contextPath" value="${pageContext.request.contextPath}" />

<%request.setCharacterEncoding("utf-8");%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>등록 화면</title>
<link href="${contextPath}/resources/css/function/detail.css" rel="stylesheet" type="text/css">
</head>
<body>
	<div>
		파일 등록
	</div>
	<form name="register" method="post" action="${contextPath}/" enctype= "multipart/form-data">
		<table>
			<tr>
				<td>문서타입</td>
				<td class="td2">
					<select name="docu_Type">
						<option value="meeting">회의록</option>
						<option value="demand">요구사항</option>
						<option value="manual">매뉴얼</option>
					</select>
			</tr>
			<tr>
				<td>문서명</td>
				<td>${add.type}</td>
			</tr>
			<tr>
				<td>문서 내용</td>
				<td>${add.type}</td>
			</tr>
			<tr>
				<td>파일업로드</td>
				<td>
					<input type="file" name="imageFileName" onchange ="readURL(this);" />
				</td>
			</tr>
			<tr>
				<td colspan="2" class="td3">
					<input type="button" value="등록" onclick="addList(this.form)" />
					<input type="button" value="돌아가기" onclick="backToList(this.form)" />
				</td>
			</tr>
		</table>
		<input type="hidden" name="order_No" value="${review.order_No }" readonly>		
		<input type="hidden" name="goods_id" value="${review.goods_id }" readonly>
	</form>
</body>
</html>