<%@page import="haksaProjectModel.HaksaVO_Manager"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>관리자전체목록</title>
</head>
<body>
<% HaksaVO_Manager vo = new HaksaVO_Manager();
	ArrayList<HaksaVO_Manager> vos = (ArrayList<HaksaVO_Manager>)request.getAttribute("ListManager");
%>
<h2>관리자전체목록</h2>
<table>
	<tr>
		<th>관리자아이디</th>
		<th>비밀번호</th>
		<th>이름</th>
		<th>부서</th>
	</tr>
	<tr>
		<td><% 
		for(int i=0; i<vos.size(); i++){
			vo = vos.get(i);
			out.print(vo.getId() + "<br>");}%>
		</td>
		<td><% 
		for(int i=0; i<vos.size(); i++){
			vo = vos.get(i);
			out.print(vo.getPasswd() + "<br>");}%>
		</td>
		<td><% 
		for(int i=0; i<vos.size(); i++){
			vo = vos.get(i);
			out.print(vo.getName() + "<br>");}%>
		</td>
		<td><% 
		for(int i=0; i<vos.size(); i++){
			vo = vos.get(i);
			out.print(vo.getDepartment() + "<br>");}%>
		</td>
		
</table>
</body>
</html>