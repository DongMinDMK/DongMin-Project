<%@page import="haksaProjectModel.HaksaVO_Manager"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>관리자검색성공</title>
</head>
<body>
<% HaksaVO_Manager vo = (HaksaVO_Manager)request.getAttribute("managerVO"); %>
<h2>관리자검색결과</h2>
<table>
	<tr>
		<th>관리자아이디</th>
		<th>비밀번호</th>
		<th>이름</th>
		<th>부서</th>
	</tr>
	<tr>
		<td><%= vo.getId() %></td>
		<td><%= vo.getPasswd() %></td>
		<td><%= vo.getName() %></td>
		<td><%= vo.getDepartment() %></td>
	</tr>
</table>
</body>
</html>