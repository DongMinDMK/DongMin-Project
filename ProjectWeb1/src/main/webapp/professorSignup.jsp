<%@page import="loginProjectModel.LoginVO_Professor"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    	LoginVO_Professor professorVO = new LoginVO_Professor();
    %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>교수회원가입</title>
    <style>
        label{
          color:black;
        }
        form{
          border:1px solid black;
          margin-right: 600px;
        }
    
        #id{
            margin-left: 50px;
        }
        #pw{
            margin-left: 40px;
        }
        #name{
          margin-left: 33px;
        }
        #nickname{
          margin-left: 17px;
        }
        #email{
          margin-left: 16px;
        }
        #student_id{
          margin-left: 31px;
        }
        #btn1{
            width: 70px;
            height: 70px;
        }
        #reset{
          width: 70px;
          height: 70px;
        }
        
    </style>
</head>
<body>
    <h1>교수회원가입</h1>
    <form action = "professorSignup.do" method = "get" id = "professor">
        * 교수 ID : <input type = "text" name = "id" placeholder = "아이디입력..." id = "id" required = "required">
        <label>첫글자는 반드시 영소문자로, 그리고 숫자 포함하여 총 4~12자로 입력하시오.</label>
        <input type = "button" value = "아이디중복체크" id = "idCh" onclick="checkID()"><br>
        * 교수 PW : <input type = "password" name = "pw" placeholder="패스워드입력..." id = "pw" required = "required">
        <label>영문자,숫자,특수문자로 총 8자~15자로 입력하시오.</label><br>
        * 비밀번호 확인 : <input type = "password" name = "pwch" placeholder="같은패스워드입력..." id = "pwchInput" required>
        <label>위의 비밀번호와 일치하게 입력하시오.</label><br>
        * 교수 이름 : <input type = "text" name = "name" placeholder = "이름입력..."  id = "name" required = "required">
        <label>한글로만 이루어져야하며, 2글자 이상으로 입력하시오.</label><br>
        * 교수 닉네임 : <input type = "text" name = "nickname" placeholder = "닉네임입력..." id = "nickname" required>
        <label>한글,영어(대,소문자), 숫자 전부 가능합니다. (최대8글자)(특수문자 제외)</label><br>
        * 교수 이메일 : <input type = "email" name = "email" placeholder="이메일입력..." id = "email">
        <label>이메일 형식에 맞게 입력하시오.</label><br>
        * 이메일체크여부 : <input type = "text" name = "emailcheck" id = "emailCh" required = "required">
        <label>이메일 체크여부(YES/NO 선택)</label><br>
        * SMS체크여부 : <input type = "text" name = "SMScheck" id = "SMSch" required = "required">
        <label>이메일 체크여부(YES/NO 선택)</label><br>
        <input type = "submit" value = "회원가입" id = "btn1" onclick="return validate()">
        <input type = "reset" value = "취소" id = "reset">
    </form>
    <script>
      function validate(){
        var professorID = document.getElementById("id");
        var professorPW = document.getElementById("pw");
        var professorPWch = document.getElementById("pwchInput");
        var professorName = document.getElementById("name");
        var professorNickname = document.getElementById("nickname");
        var professorEmail = document.getElementById("email");

        //교수 아이디 검사
        var professorTest = /^[a-z][a-z\d]{4,12}$/; //무조건 영소문자로 시작하거나 숫자로 시작해서 4~12글자에서 무조건 끝나야 되는 정규표현식
        if(!professorTest.test(professorID.value)){ //여기서 .test()메소드는 정규표현식에서 제공하는 메소드임.
          alert("조건에 맞게 아이디를 입력해주세요.");
          return false;
        }
        // 교수 비밀번호 검사
        professorTest = /^[a-z\d@#$%^&*]{8,15}$/; //비밀번호는 무조건 영소문자로 시작해서 숫자가 포함이 되어야 하며, 특수문자도 무조건 포함을 시키면서 8자~15자 사이여야 함.
        if(!professorTest.test(professorPW.value)){ //사용자가 입력한 비밀번호가 유효성 검사에 충족을 못시킨다면
          alert("비밀번호 조건에 안맞습니다. 조건에 맞게 설정해주세요.");
          professorPW.value = ""; //입력했던 텍스트 데이터를 없애고 비운다.
          professorPW.focus(); //텍스트에 포커스를 지정시킨다.
          return false;
        }
        //교수 비밀번호 일치
        if(professorPW.value != professorPWch.value){
          alert("동일한 비밀번호를 입력해주세요. 둘 비밀번호가 일치하지 않습니다.");
          professorPWch.value = "";
          professorPWch.focus();
          return false;
        }
        //교수 이름
        professorTest = /^[가-힣]{2,}$/; //교수 이름이 무조건 2글자 이상이어야 하며 무조건 한글이어야 한다. 
        if(!professorTest.test(professorName.value)){
          alert("2글자 이상의 한글을 입력하세요.");
          professorName.value = "";
          professorName.focus();
          return false;
        }
        //교수 닉네임
        professorTest = /^[a-z\d가-힣][A-Z\d가-힣]{,8}$/; //교수 닉네임은 영어 대소문자, 숫자, 한글 다 가능하다(특수문자 제외)
        if(!professorTest.test(professorNickname.value)){
          alert("특수문자는 닉네임에 삽입될 수 없습니다.");
          professorNickname.value = "";
          professorNickname.focus();
          return false;
        }
        //교수 이메일
        professorTest = /^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/; //이메일 형식을 잘 맞춰야됨.
        if(!professorTest.test(professorEmail.value)){
          alert("이메일 조건에 안맞습니다. 조건에 맞게 다시 설정하세요.");
          professorEmail.value = "";
          professorEmail.focus();
          return false;
        }
     }

    </script>
    <script>
      function checkID(){
        var check = document.professor.idCh;
        if(check == <%= professorVO.getId() %>){
          alert("중복된 아이디입니다. 다른 아이디를 입력해주세요.");
        }
      }
    </script>
</body>
</html>
