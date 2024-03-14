<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>

<c:set var="contextPath" value = "${pageContext.request.contextPath}"/>

<%request.setCharacterEncoding("utf-8");%>

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<link href="${contextPath}/resources/css/layout/layout.css" rel="stylesheet" type="text/css">
	<title><tiles:insertAttribute name="title" /></title>
</head>
<body>
	<div id="container">
		<div id="header">
			<tiles:insertAttribute name="header" />
		</div>
		<div id="sidebar-left">
			<tiles:insertAttribute name="side" />
		</div>
		<div id="content">
			<tiles:insertAttribute name="body" />
		</div>
	</div>
</body>
</html>