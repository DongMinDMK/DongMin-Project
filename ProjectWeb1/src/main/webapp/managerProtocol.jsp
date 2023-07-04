<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>관리자프로토콜</title>
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
            margin: 35px;
        }
    </style>
</head>
  <body>
  <h2>관리자프로토콜</h2>
    <ul>
        <li><a href = "haksaManagerRegister.html">관리자등록</a></li>
        <li><a href = "haksaManagerSearch.html">관리자검색</a></li>
        <li><a href = "haksaManagerUpdate.html">관리자수정</a></li>
        <li><a href = "haksaManagerDelete.html">관리자삭제</a></li>
        <li><a href = "managerList.do">관리자전체목록</a></li>
      </ul>
  </body>
</html>