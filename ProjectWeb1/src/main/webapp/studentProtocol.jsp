<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>학생프로토콜</title>
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
    <h2>학생프로토콜</h2>
    <div id = "student">
      <ul>
          <li><a href = "haksaStudentRegister.html">학생등록</a></li>
          <li><a href = "haksaStudentSearch.html">학생검색</a></li>
          <li><a href = "haksaStudentUpdate.html">학생수정</a></li>
          <li><a href = "haksaStudentDelete.html">학생삭제</a></li>
          <li><a href = "studentList.do">학생전체목록</a></li>
      </ul>
  </div>
</body>
</html>