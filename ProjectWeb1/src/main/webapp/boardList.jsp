<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
  	<meta http-equiv="X-UA-Compatible" content="IE=edge">
  	<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>게시판전체목록</title>
</head>
<body>
	<h2>게시판전체목록</h2>
	<table border = "1">
		<tr>
			<th>게시글 번호 </th>
			<th>게시글 제목 </th>
			<th>게시글 내용 </th>
			<th>게시글 저자 </th>
			<th>게시글 등록날짜 </th>
			<th>게시글 조회수 </th>
		</tr>
		<c:forEach var = "a" items = "${boardData}">
		<tr>
			<td>${a.no}</td><td>${a.title}</td><td>${a.content}</td><td>${a.author}</td><td>${a.nal}</td><td>${a.readCount}</td>
		</tr>
		</c:forEach>
	</table>
	<hr>
	<a href = "index.jsp">메인페이지</a>
</body>
</html>