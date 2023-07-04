<%@page import="haksaProjectModel.HaksaVO_Student"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>학생전체목록</title>
</head>
<body>
<%
HaksaVO_Student vo = new HaksaVO_Student();
ArrayList<HaksaVO_Student> vos = (ArrayList<HaksaVO_Student>)request.getAttribute("ArrayListStd");
%>
<h2>학생전체목록</h2>
<table>
	<tr>
		<th>아이디</th>
		<th>비밀번호</th>
		<th>이름</th>
		<th>학번</th>
	</tr>
	<tr>
		<td><%
			for(int i=0; i<vos.size(); i++){
			vo = vos.get(i);
			out.print(vo.getId()+"<br>");}%>
		</td>
		<td><%
			for(int i=0; i<vos.size(); i++){
			vo = vos.get(i);
			out.print(vo.getPasswd()+"<br>");}%>
		</td>
		<td><%
			for(int i=0; i<vos.size(); i++){
			vo = vos.get(i);
			out.print(vo.getName()+"<br>");}%>
		</td>
		<td><%
			for(int i=0; i<vos.size(); i++){
			vo = vos.get(i);
			out.print(vo.getStudent_id()+"<br>");}%>
		</td>
	</tr>
</table>
</body>
</html>



		    