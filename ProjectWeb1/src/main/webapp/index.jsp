<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>메인페이지</title>
    <script src="js/jquery-1.10.2.js"></script>
    <style>
        @media screen and (max-width: 600px) {
            /* 화면 너비가 600px 이하일 때의 스타일 */
            header {
                width: 100%;
                padding: 1px;
            }

        #main {
            flex-direction: column;
        }

        section {
            width: 100%;
            margin-left: 0;
        }
        #aside1{
          width : 100%;
          margin-left: 100px;
        }
        #aside2{
          width : 100%;
          margin-left: 100px;
          margin-top: 10px;
        }
        #aside3{
          width : 100%;
          margin-left: 100px;
          margin-top: 10px;
        }
    }

    @media screen and (min-width: 601px) and (max-width: 1000px) {
        /* 화면 너비가 601px 이상 1000px 이하일 때의 스타일 */
        header {
            width: 91.7%;
            margin-left: 50px;
        }

        #main section {
            width: 44.5%;
            margin-left: 0px;
            
        }
        

        aside {
            width: 100%;
            margin-left: 0;
            margin-right: 5%;
        }

        #aside1 {
            width: 220px;
            padding: 20px;
            margin-left: 20px;
        }

        #aside2 {
            width: 200px;
            margin-left: 20px;
        }

        #aside3 {
            width: 210px;
            margin-right: -35px;
            margin-left: 20px;
        }

        footer {
            width: 91.7%;
            margin-left: 50px;
            display: block;
        }
    }

    @media screen and (min-width: 1001px) {
        /* 화면 너비가 1001px 이상일 때의 스타일 */
        #Navigation_Block2 li {
            margin-left: 10px;
        }
    }

    * {
        margin: 0;
        padding: 0;
        box-sizing: border-box;
    }

    a {
        text-decoration: none;
    }

    li {
        list-style: none;
    }

    img {
        display: block;
        border: none;
    }

    body {
        font-family: 'Times';
        font-size: 14px;
        color: black;
        line-height: 28px;
        margin-top: 40px;
    }

    header {
        width: 91.7%;
        height: 200px;
        margin-left: 65px;
        margin-top: 10px;
        border: 2px solid black;
        overflow: hidden;
        box-sizing: border-box;
    }

    #koreaLogo {
        width: 140px;
        height: 190px;
        padding: 5px;
        margin-left: 11px;
        background-color: azure;
    }

    header h1 {
        width: 200px;
        line-height: 100px;
        float: left;
        text-align: center;
        border-right: 2px solid black;
        padding: 0 10px;
        box-sizing: border-box;
    }

    nav {
        overflow: hidden;
        position: relative;
        height: 230px;
    }

    nav ul {
        overflow: hidden;
        padding: 20px;
        background-color: antiquewhite;
    }

    #Navigation_Block {
        box-sizing: border-box;
        height: 300px;
    }

    #Navigation_Block1 {
        height: 50px;
        text-align: center;
        font-size: 25px;
        overflow: hidden;
        margin-top: 20px;
        width: 100%
    }

    #Navigation_Block2 {
        border-top: 2px solid black;
        display: flex;
        justify-content: center;
        flex-wrap: wrap;

    }

    #Navigation_Block2 li {
        height: 50px;
        line-height: 30px;
        text-align: center;
        margin: 3px;
        flex: 1;
        width: 100%;
    }

    #main {
        width: 91.7%;
        overflow: hidden;
        margin: 10px auto;
        display: flex;
        justify-content: space-between;
    }

    #main section {
        flex: 100%;
        margin: 0;
    }

    #main section article {
        border: 2px solid black;
        width: 100%;
        height: 96%;
        padding: 38px;
		margin-top: 8px;
        margin-bottom: 10px;
        margin-left: 0px;
        box-sizing: border-box;
    }

    article>h2 {
        background-color: antiquewhite;
    }

    article>p {
        display: inline-block;
        width: 90px;
    }

	#id1{
		margin-left: 13px;
	}
	#id3{
		margin-left: 6px;
	}

	#passwd3{
		margin-left: -7.35px;
	}
	
    aside {
        width: 100%;
        margin-left: -52%;
        margin-right: 5%;
        padding: 20px;
        border: 2px solid black;
    }

    #aside1 {
        width: 100%;
        height: 100%;
        margin-left: 5px;
        padding: 20px;
        
        
    }

    #aside2 {
        width: 115%;
        height: 100%;
        margin-left: -13px;
		margin-top: -20.1px;
        padding:15px;
    }

    #aside3 {
        width: 90%;
        height: 100%;
        margin-left: 28px;
        margin-right: 40px;
    }
	
	fieldset{
		width: 300px;
		height: 200px;
		margin-left: 10px;
		line-height: 20px;
		text-align: center;
		background-color: #dbdbdb;
	}
	div.box{
		width: 500px;
		height: 50px;
		box-align: center middle;
		margin: 8px;
		padding: 10px;
		display: none;
	}
	#professor1Box{
		width: 200px;
		margin-top: 10px;
	}

    footer {
        width: 91.7%;
        height: 50px;
        line-height: 50px;
        margin: 10px auto;
        margin-left: 63px;
        border: 2px solid black;
        text-align: center;
        box-sizing: border-box;
        background-color: antiquewhite;

    }

    #haksaSlide {
        cursor: pointer;
    }

    #student,
    #professor,
    #manager {
        padding: 50px;
        display: none;
        overflow: visible;
    }

</style>
</head>
<body>
    <header>
        <h1> <img src="images/logo.jpeg" alt="Logo" id="koreaLogo"> </h1>
        <nav>
            <div id="Navigation_Block">
                <div id="Navigation_Block1">
                    <h3>학사관리 시스템</h3>
                </div>
                <ul id="Navigation_Block2">
                    <li id="haksaSlide">학사관리</li>
                    <li id="student"><a href="studentProtocol.jsp">학생</a></li><br>
                    <li id="professor"><a href="professorProtocol.jsp">교수</a></li><br>
                    <li id="manager"><a href="managerProtocol.jsp">관리자</a></li><br>
                    <li><a href = "boardProtocol.jsp">게시판</a></li>
                </ul>
            </div>
        </nav>
    </header>

<div id="main">
    <section>
        <article>
            <h2>제목</h2>
            <p>
                입력...
            </p>
        </article>
    </section>
	<fieldset>
		<legend>로그인/회원가입할 항목을 선택하세요.</legend>
		<input type = "radio" name = "category" onclick="showDiv(this)" id = "student1"><label for = "student1">학생</label>&nbsp; &nbsp;
		<input type = "radio" name = "category" onclick="showDiv(this)" id = "professor1"><label for = "professor1">교수</label>&nbsp; &nbsp;
		<input type = "radio" name = "category" onclick="showDiv(this)" id = "manager1"><label for = "manager1">관리자</label>&nbsp; &nbsp;
	</fieldset>
	<hr>
	<div id = "student1Box" class = "box">
		<form action = "loginStudent.do" method = "post">
			<aside id="aside1">
			<h2>학생로그인</h2>
            아이디 : <input type="text" name="id" placeholder="아이디 입력..." id="id1" required="required"><br>
            비밀번호 : <input type="password" name="passwd" placeholder="비밀번호 입력..." id="passwd" required="required"><br>
            <input type="submit" value="학생로그인" id="btn1">
            <button><a href="studentSignup.jsp">학생회원가입</a></button>
			</aside>
		</form>
	</div>
	
	<div id = "professor1Box" class = "box">
		<form action = "loginProfessor.do" method = "post">
			<aside id="aside2">
			<h2>교수로그인</h2>
            아이디 : <input type="text" name="id" placeholder="아이디 입력..." id="id2" required="required"><br>
            비밀번호 : <input type="password" name="passwd" placeholder="비밀번호 입력..." id="passwd" required="required"><br>
            <input type="submit" value="교수로그인" id="btn2">
            <button><a href="professorSignup.jsp">교수회원가입</a></button>
			</aside>
		</form>
	</div>
	<div id = "manager1Box" class = "box">
		<form action = "loginManager.do" method = "post">
			<aside id="aside3">
			<h2>관리자로그인</h2>
			아이디 : <input type="text" name="id" placeholder="아이디 입력..." id="id3" required="required"><br>
            비밀번호 : <input type="password" name="passwd" placeholder="비밀번호 입력..." id="passwd3" required="required"><br>
            <input type="submit" value="관리자로그인" id="btn3">
            <button><a href="managerSignup.jsp">관리자회원가입</a></button>
			</aside>
		</form>
	</div>
</div>
<footer>
    <p>HTML COPYRIGHT</p>
</footer>

<script>
    document.getElementById('haksaSlide').addEventListener('click', function () {
        var student = document.getElementById('student');
        var professor = document.getElementById('professor');
        var manager = document.getElementById('manager');

        if (student.style.display === 'none') {
            student.style.display = 'block';
            professor.style.display = 'block';
            manager.style.display = 'block';
        } else {
            student.style.display = 'none';
            professor.style.display = 'none';
            manager.style.display = 'none';
        }
    });
</script>
<script>
	function showDiv(element){
		var tag = document.getElementsByClassName("box");

		for(var i=0; i<tag.length; i++){
			if(element.id + "Box" == tag[i].id)
				tag[i].style.display = "block";	
			else	
				tag[i].style.display = "none";
		}
	}
</script>
</body>
</html>