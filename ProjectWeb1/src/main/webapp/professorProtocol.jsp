<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>교수프로토콜</title>
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
            margin: 40px;
        }
    </style>
</head>
  <body>
  	<h2>교수프로토콜</h2>
    <ul>
        <li><a href = "haksaProfessorRegister.html">교수등록</a></li>
        <li><a href = "haksaProfessorSearch.html">교수검색</a></li>
        <li><a href = "haksaProfessorUpdate.html">교수수정</a></li>
        <li><a href = "haksaProfessorDelete.html">교수삭제</a></li>
        <li><a href = "professorList.do">교수전체목록</a></li>
      </ul>
  </body>
</html>
