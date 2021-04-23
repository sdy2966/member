<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
</head>
<body>
	<div align="center">
		<div><h1>Login</h1></div>
		<div>
			<form id="frm" name="frm" action="memberLogin.do" method="post">
			<div>
				<table border="1">
					<tr>
						<th width="150">ID</th>
						<td width="200">
							<input type="text" id="memberId" name="memberId">	
						</td>
					</tr>
					<tr>
						<th width="150">PW</th>
						<td width="200">
							<input type="password" id="memberPassword" name="memberPassword">	
						</td>
					</tr>
				</table>
			</div><br/>
			<div>
				<input type="submit" value="로그인">
			</div>
			</form>
		</div>
	</div>
</body>
</html>