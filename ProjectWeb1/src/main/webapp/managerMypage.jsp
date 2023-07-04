<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Document</title>
</head>
<body>
  <form action = "managerUserDelete.do" method = "post">
    <table border = "1">
      <tr>
        <td>관리자 아이디</td>
        <td><input type = "text" name = "id" value = "${managerList.id}" readonly></td>
      </tr>
      <tr>
        <td>관리자 비밀번호</td>
        <td><input type = "text" name = "pw" value = "${managerList.pw}"></td>
      </tr>
      <tr>
        <td>관리자 비밀번호확인</td>
        <td><input type = "text" name = "pwch" value = "${managerList.pwch}"></td>
      </tr>
      <tr>
        <td>관리자 이름</td>
        <td><input type = "text" name = "irum" value = "${managerList.irum}"></td>
      </tr>
      <tr>
        <td>관리자 닉네임</td>
        <td><input type = "text" name = "nickname" value = "${managerList.nickname}"></td>
      </tr>
      <tr>
        <td>관리자 이메일</td>
        <td><input type = "text" name = "Email" value = "${managerList.email}"></td>
      </tr>
      <tr>
        <td>관리자 이메일체크</td>
        <td><input type = "text" name = "Emailcheck" value = "${managerList.emailcheck}"></td>
      </tr>
      <tr>
        <td>관리자 SMS체크</td>
        <td><input type = "text" name = "SMScheck" value = "${managerList.SMScheck}"></td>
      </tr>
      <tr>
			<td colspan="2" align="right"><input type="submit" value="학생회원탈퇴"></td>
		</tr>
    </table>
    <hr>
    <a href = "index.jsp">메인페이지</a>
  </form>
</body>
</html>