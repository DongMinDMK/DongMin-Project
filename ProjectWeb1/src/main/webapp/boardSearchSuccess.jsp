<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>게시글검색</title>
</head>
<body>
  <h2>게시글검색</h2>
  <form>
    <table border = "1">
      <tr>
        <td>게시글번호 : </td>
        <td><input type = "text" name = "no" value = "${boardData.no}"></td>
      </tr>
      <tr>
        <td>게시글 제목 : </td>
        <td><input type = "text" name = "title" value = "${boardData.title}"></td>
      </tr>
      <tr>
        <td>게시글 내용 : </td>
        <td><input type = "text" name = "content" value = "${boardData.content}"></td>
      </tr>
      <tr>
        <td>게시글 저자 : </td>
        <td><input type = "text" name = "author" value = "${boardData.author}"></td>
      </tr>
      <tr>
        <td>게시글 등록날짜 : </td>
        <td><input type = "text" name = "nal" value = "${boardData.nal}"></td>
      </tr>
      <tr>
        <td>게시글 조회수 : </td>
        <td><input type = "text" name = "readCount" value = "${boardData.readCount}"></td>
      </tr>
     </table>
  </form>
  <a href = "boardProtocol.jsp">게시판프로토콜</a><br>
  <a href = "index.jsp">메인페이지</a>
</body>
</html>