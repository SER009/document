<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:set var="contextPath" value = "${pageContext.request.contextPath}"/>

<% request.setCharacterEncoding("utf-8"); %>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
<link href="${contextPath}/resources/css/member/loginForm.css" rel="stylesheet" type="text/css">
</head>
<body>
	<form name="frmLogin" method="post" action="${contextPath}/member/login.do">
		<table class="loginTable" align="center">
			<tr class="login" align="center">
				<td class="loginID">아이디</td>
				<td class="loginPwd">비밀번호</td>
			</tr>
			<tr class="login" align="center">
				<td class="login"><input class="loginInput" type="text" name="mem_id" size="20"></td>
				<td class="login"><input class="loginInput" type="password" name="password" size="20"></td>
			</tr>
			<tr class="login" align="center">
				<td class="login" colspan="2">
				   <input class="loginButton" type="submit" value="로그인"> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				   <input class="loginButton" type="reset" value="다시입력">
				</td>
			</tr>
		</table>
	</form>
</body>
</html>