<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<c:set var="contextPath" value="${pageContext.request.contextPath}" />

<%request.setCharacterEncoding("utf-8");%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>side</title>
<link href="${contextPath}/resources/css/layout/side.css" rel="stylesheet" type="text/css">
<script>
	function collapse(element) {
	    var before = document.getElementsByClassName("active")[0]               // 기존에 활성화된 버튼
	    if (before && document.getElementsByClassName("active")[0] != element) {  // 자신 이외에 이미 활성화된 버튼이 있으면
	        before.nextElementSibling.style.maxHeight = null;   // 기존에 펼쳐진 내용 접고
	        before.classList.remove("active");                  // 버튼 비활성화
	    }
	    element.classList.toggle("active");         // 활성화 여부 toggle
	
	    var content = element.nextElementSibling;
	    if (content.style.maxHeight != 0) {         // 버튼 다음 요소가 펼쳐져 있으면
	        content.style.maxHeight = null;         // 접기
	    } else {
	        content.style.maxHeight = content.scrollHeight + "px";  // 접혀있는 경우 펼치기
	    }
	}
    </script>
</head>
<body>
	<div class="side">
		<span><img class="side-icon" src="${contextPath}/resources/images/home.png"></span>
		<a class="side-link" href="${contextPath}/management/document.do">
			<span class="side-font">Home</span>
		</a>
	</div>
	<div>
		<button type="button" class="accordion" onclick="collapse(this);">
		<span><img class="side-icon" src="${contextPath}/resources/images/document.png"></span>
		문서
		</button>
			<div class="content">
				<div class="side">
					<span><img class="side-icon" src="${contextPath}/resources/images/document.png"></span>
					<a class="side-link" href="${contextPath}/management/document.do">
						<span class="side-font">회의록</span>
					</a>
				</div>
				<div class="side">
					<span><img class="side-icon" src="${contextPath}/resources/images/document.png"></span>
					<a class="side-link" href="${contextPath}/management/document.do">
						<span class="side-font">요구사항</span>
					</a>	
				</div>
				<div class="side">
					<span><img class="side-icon" src="${contextPath}/resources/images/document.png"></span>
					<a class="side-link" href="${contextPath}/management/document.do">	
						<span class="side-font">매뉴얼</span>
					</a>
				</div>
			</div>
	</div>
</body>
</html>