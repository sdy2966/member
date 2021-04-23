<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>LoginFail</title>
</head>
<body>
	<div align="center">
		<h1>${member.memberId }는 존재하지 않거나 틀린 패스워드.</h1>
		<a href="memberLoginForm.do">로그인 다시시도</a> <br />
		<a href="main.do">홈으로 돌아가기</a>
	</div>
</body>
</html>