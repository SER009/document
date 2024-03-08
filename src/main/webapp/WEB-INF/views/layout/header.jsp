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
		<a href="${contextPath}/home/home.do">
			<img class="home" src="${contextPath}/resources/images/home.png">	
		</a>
		<div class="text-filed">
			<input class="search-box" type="text" placeholder="검색어 입력">
			<img class="search-icon" src="${contextPath}/resources/images/search.png">
		</div>
	</div>
</body>
</html>