<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>게시판글작성</title>
</head>
<body>
	<h2>게시판글작성</h2>	
  <form action = "boardInsert.do" method = "post">
    <table border = "1">
      <tr>
        <td>게시글 제목 : </td>
        <td><input type = "text" name = "title" placeholder="게시글제목작성"></td>
      </tr>
      <tr>
        <td>게시글 내용 : </td>
        <td><input type = "text" name = "content" placeholder="게시판에적을내용입력..."></td>
      </tr>
      <tr>
        <td>게시글 작성자 : </td>
        <td><input type = "text" name = "author" placeholder="작성자이름입력..."></td>
      </tr>
      <tr>
        <td>게시글 날짜 : </td>
        <td><input type = "text" name = "nal" value = "현재날짜자동으로입력..." disabled></td>
      </tr>
      <tr>
        <td>게시글 조회수 : </td>
        <td><input type = "text" name = "readCount"  placeholder="조회수입력..." ></td>
      </tr>
      <tr>
        <td colspan="2" align = "right"><input type = "submit" value = "게시판글등록하기"></td>
      </tr>
    </table>
  </form>
</body>
</html>