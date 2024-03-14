<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:set var="contextPath" value = "${pageContext.request.contextPath}"/>

<% request.setCharacterEncoding("utf-8"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>header</title>
<link href="${contextPath}/resources/css/layout/header.css" rel="stylesheet" type="text/css">
</head>
<body>
	<div class="home-header">
		<a href="${contextPath}/management/document.do">
			<img class="home" src="${contextPath}/resources/images/home.png">	
		</a>
		<div class="text-filed">
			<form name="search" action="${contextPath}">
				<input class="search-box" type="text" placeholder="검색할 단어를 입력하시오.">
				<button class="search-btn" type="submit" onclick="">
					<img class="search-icon" src="${contextPath}/resources/images/search.png">
				</button>
			</form>
		</div>
		<div>
			<button type="button" class="register-btn" onclick="location.href='${contextPath}/management/document.do'">등록하기</button>
		</div>
	</div>
</body>
</html>