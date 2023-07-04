<%@page import="haksaProjectModel.HaksaVO_Professor"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>교수검색성공</title>
</head>
<body>
<%
	HaksaVO_Professor vo = (HaksaVO_Professor)request.getAttribute("professorVO");
%>
</body>
<h2>교수검색결과</h2>
<table>
	<tr>
		<th>교수아이디</th>
		<th>비밀번호</th>
		<th>이름</th>
		<th>과목</th>
	</tr>
	<tr>
		<td><%= vo.getId() %></td>
		<td><%= vo.getPasswd() %></td>
		<td><%= vo.getName() %></td>
		<td><%= vo.getSubject() %></td>
	</tr>
</table>
</html>

