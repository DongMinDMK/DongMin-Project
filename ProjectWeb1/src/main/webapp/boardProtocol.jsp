<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>게시판프로토콜</title>
    <style>
        *{
          background-color: beige;
        }
        body{
        border:1px solid black;
        margin-right: 400px;
        background-color: blanchedalmond;
        margin-left: 300px;
        text-align: center;
      }
      ul{
            border: 1px solid black;
            list-style: none;
      }
      li{
            float:left;
            margin: 20px;
            margin-top: 90px;
           
        }
    </style>
</head>
<body>
    <h2>게시판프로토콜</h2>
    <div id = "board">
      <ul>
          <li><a href = "boardInsert.jsp">게시판글작성(등록)</a></li>
          <li><a href = "boardSearch.jsp">게시판글검색</a></li>
          <li><a href = "boardDelete.jsp">게시판글삭제</a></li>
          <li><a href = "boardUpdate.jsp">게시판글수정</a></li>
          <li><a href = "boardList.do">게시판글전체목록</a></li>
      </ul>
  </div>
</body>
</html>