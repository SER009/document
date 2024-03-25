<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 등록</title>
</head>
<body>
	<div class="d1">
		<form name="form" method="post" action="${contextPath}/member/addMember.do">
			<br>
			<h2 class="h2">회원 가입</h2>
			<br>
			<table align="center">
				<tr class="member2">
					<td class="member2">아이디</td>
					<td class="member4"><input class="member3" type="text" name="mem_id"></td>
				</tr>
				<tr class="member2">
					<td class="member2">비밀번호</td>
					<td class="member4"><input class="member3" type="password" name="password"></td>
				</tr>
				<tr class="member2">
					<td class="member7" colspan="2">
						<input class="member5" type="submit" value="가입하기">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
						<input class="member5" type="reset" value="다시입력">
					</td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>