<%@page import="haksaProjectModel.HaksaVO_Professor"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>교수전체목록결과</title>
</head>
<body>
<%
HaksaVO_Professor vo = new HaksaVO_Professor();
ArrayList<HaksaVO_Professor> vos = (ArrayList<HaksaVO_Professor>)request.getAttribute("professorListPfs");
%>
<h2>교수전체목록</h2>
<table>
	<tr>
		<th>교수아이디</th>
		<th>비밀번호</th>
		<th>이름</th>
		<th>과목</th>
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
			out.print(vo.getSubject() + "<br>");}%>
		</td>
	</tr>
</table>
</body>
</html>


