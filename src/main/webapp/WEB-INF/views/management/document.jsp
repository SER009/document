<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<c:set var="contextPath" value="${pageContext.request.contextPath}" />

<%request.setCharacterEncoding("utf-8");%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>문서 분류 시스템</title>
<link href="${contextPath}/resources/css/management/document.css" rel="stylesheet" type="text/css">
</head>
<body>
	<div>
		<c:choose>
			<c:when test="${documentType == 'meeting'}">
				회의록			
			</c:when>
			<c:when test="${documentType == 'demand'}">
				요구사항			
			</c:when>
			<c:when test="${documentType == 'manual'}">
				매뉴얼			
			</c:when>
			<c:otherwise>
				전체 문서
			</c:otherwise>
		</c:choose>
	</div>
	<div>
		<c:choose>
			<c:when test="${not empty document}">
				<c:forEach var="document" items="${documentList}">
					<c:if test="${document.document_type == documentType}">
						총 "${document.count}"개
					</c:if>
				</c:forEach>
			</c:when>
			<c:otherwise>
				합계
			</c:otherwise>
		</c:choose>
	총 개
	</div>
	<table class= "main-table">
		<c:set var= "document-count" value="0" />
			<tr>
				<td>문서 번호</td>
				<td>문서 분류</td>
				<td>문서명</td>
				<td>문서 내용</td>
				<td>등록일</td>
				<td>수정일</td>
				<td>개정</td>
				<td>다운로드</td>
			</tr>
		<c:choose>
			<c:when test="${not empty document}">
				<c:forEach var="document" items="${documentList}">
					<c:if test="${document.document_type == documentType}">
						<tr>
							<td>${document.number}</td>
						</tr>
						<tr>
							<td>${document.number}</td>
						</tr>
						<tr>
							<td>${document.number}</td>
						</tr>
						<tr>
							<td>${document.number}</td>
						</tr>
						<tr>
							<td>${document.number}</td>
						</tr>
						<tr>
							<td>${document.number}</td>
						</tr>
						<tr>
							<td>${document.number}</td>
						</tr>
						<tr>
							<td>${document.number}</td>
						</tr>
					</c:if>
				</c:forEach>
			</c:when>
			<c:otherwise>
				<tr>
					<td colspan="8">
						<p><b><span>등록된 문서가 없습니다.</span></b>
					</td>
				</tr>
			</c:otherwise>
		</c:choose>
	</table>
</body>
</html>