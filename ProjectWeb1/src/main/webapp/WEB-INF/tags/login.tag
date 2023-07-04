<%@tag language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<c:choose>
	<c:when test="${studentList.irum != null}">
		<h1>${studentList.irum}님, 로그인되었습니다. 환영합니다!</h1>
		<h3><a href = "studentMypage.jsp">마이페이지</a></h3><br>
		<h3><a href = "logout.do">로그아웃</a></h3><br>
	</c:when>
	<c:when test="${professorList.irum != null}">
		<h1>${professorList.irum}님, 로그인되었습니다. 환영합니다!</h1>
		<h3><a href = "professorMypage.jsp">마이페이지</a></h3><br>
		<h3><a href = "logout.do">로그아웃</a></h3><br>
	</c:when>
	<c:when test="${managerList.irum != null}">
		<h1>${managerList.irum}님, 로그인되었습니다. 환영합니다!</h1>
		<h3><a href = "managerMypage.jsp">마이페이지</a></h3><br>
		<h3><a href = "logout.do">로그아웃</a></h3><br>
	</c:when>
	<c:otherwise>
		<h1>※게시글작성은 로그인 후에 이용해주세요※</h1>
	</c:otherwise>	
</c:choose>