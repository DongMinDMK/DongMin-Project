<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시글검색</title>
<style>
  body{
    border: 1px solid black;
    width : 700px;
  }
  h2{
    background-color: bisque;
    width : 500px;
  }
  

</style>
</head>
<body>
	<h2>게시글검색</h2>
	<form action = "boardSearch.do" method = "post">
 	검색할 게시판 제목 : <input type = "text" name = "title" placeholder = "검색할제목입력..." required = "required"><br>
		<input type = "submit" value = "검색하기">
	</form>
</body>
</html>