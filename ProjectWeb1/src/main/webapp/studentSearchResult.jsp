<%@page import="haksaProjectModel.HaksaVO_Student"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>학생검색성공</title>
</head>
<body>
<%
	HaksaVO_Student vo = (HaksaVO_Student)request.getAttribute("studentVO");
%>
<h2>학생검색결과</h2>
<table>
	<tr>
		<th>학생아이디</th>
		<th>비밀번호</th>
		<th>이름</th>
		<th>학번</th>
	</tr>
	<tr>
		<td><%= vo.getId() %></td>
		<td><%= vo.getPasswd() %></td>
		<td><%= vo.getName() %></td>
		<td><%= vo.getStudent_id() %></td>
	</tr>
</table>
</body>
</html>


