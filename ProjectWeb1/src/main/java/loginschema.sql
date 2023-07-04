CREATE TABLE member_Student
(
	id                    VARCHAR(100) NOT NULL PRIMARY KEY,
	pw                    VARCHAR(20) NULL,
	pwch                  VARCHAR(20) NULL,
	irum                  VARCHAR(100) NULL,
	nickname              VARCHAR(20) NULL,
	email                 VARCHAR(100) NULL,
	emailcheck            VARCHAR(10) NULL,
	SMScheck              VARCHAR(10) NULL
);

CREATE TABLE member_Professor
(
	id                    VARCHAR(100) NOT NULL PRIMARY KEY,
	pw                    VARCHAR(20) NULL,
	pwch                  VARCHAR(20) NULL,
	irum                  VARCHAR(100) NULL,
	nickname              VARCHAR(20) NULL,
	email                 VARCHAR(100) NULL,
	emailcheck            VARCHAR(10) NULL,
	SMScheck              VARCHAR(10) NULL
);


CREATE TABLE member_Manager
(
	id                    VARCHAR(100) NOT NULL PRIMARY KEY,
	pw                    VARCHAR(20) NULL,
	pwch                  VARCHAR(20) NULL,
	irum                  VARCHAR(100) NULL,
	nickname              VARCHAR(20) NULL,
	email                 VARCHAR(100) NULL,
	emailcheck            VARCHAR(10) NULL,
	SMScheck              VARCHAR(10) NULL
);

insert into member_Manager(Id, Pw, Pwch, irum, Nickname, Email, Emailcheck, SMScheck) values('kdm0908', '1111', '1111', '김동민', 'kim', 'syh6917@naver.com', 'YES', 'YES');
insert into member_Professor(Id, Pw, Pwch, irum, Nickname, Email, Emailcheck, SMScheck) values('kdm0908', '1111', '1111', '김동민', 'kim', 'syh6917@naver.com', 'YES', 'YES');
insert into member_Student(Id, Pw, Pwch, irum, Nickname, Email, Emailcheck, SMScheck) values('kdm0908', '1111', '1111', '김동민', 'kim', 'syh6917@naver.com', 'YES', 'YES');

select* from member_Manager;
select* from member_Professor;
select* from member_Student;