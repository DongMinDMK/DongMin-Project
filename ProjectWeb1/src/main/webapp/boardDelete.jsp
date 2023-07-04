<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>게시판글삭제</title>
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
  <h2>게시판글삭제</h2>
  <form action = "boardDelete.do" method = "post">
    삭제할 게시판 제목 : <input type = "text" name = "title" placeholder = "삭제할제목입력..." required = "required"><br>
		<input type = "submit" value = "삭제하기">
  </form>
</body>
</html>