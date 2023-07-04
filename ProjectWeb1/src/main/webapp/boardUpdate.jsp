<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시글수정</title>
</head>
<body>
	<h2>게시글수정</h2>
	<form action = "boardUpdate.do" method = "post">
		<table border = "1">
			<tr>
				<td>기존의 게시글 제목 : </td>
				<td><input type = "text" name = "title" placeholder = "기존게시글제목입력..." required = "required"> 
			</tr>
			<tr>
				<td>수정할 게시글 제목 : </td>
				<td><input type = "text" name = "updateTitle" placeholder = "수정할게시글제목입력..." required = "required">
			</tr>
			<tr>
				<td>수정할 게시글 내용 : </td>
				<td><input type = "text" name = "updateContent" placeholder = "수정할게시글비밀번호입력..." required = "required">
			</tr>
			<tr>
				<td colspan = "2" align = "right"><input type = "submit" value = "글수정하기"></td>
			</tr>
		</table>
	</form>
</body>
</html>