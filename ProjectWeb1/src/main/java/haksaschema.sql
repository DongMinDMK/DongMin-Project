select* from student;

delete from student where no = 3;



CREATE TABLE manager
(
	id                   VARCHAR(100) NOT NULL PRIMARY KEY,
	passwd               VARCHAR(100) NULL,
	name                 VARCHAR(100) NULL,
	department           VARCHAR(100) NULL
);



CREATE TABLE professor
(
	id                   VARCHAR(100) NOT NULL PRIMARY KEY,
	passwd               VARCHAR(100) NULL,
	name                 VARCHAR(100) NULL,
	subject              VARCHAR(100) NULL
);



CREATE TABLE student
(
	id                   VARCHAR(100) NOT NULL PRIMARY KEY,
	passwd               VARCHAR(100) NULL,
	name                 VARCHAR(100) NULL,
	student_id           VARCHAR(100) NULL
);

insert into student(id, passwd, name, student_id) values('kdm1111', '1234', '김동민', 'dmk');
insert into professor(id, passwd, name, subject) values('kdm1111', '1234', '김동민', '컴퓨터');
insert into manager(id, passwd, name, department) values('kdm1111', '1234', '김동민', '컴퓨터학부');

select* from student;
select* from professor;
select* from manager;

drop table student;
drop table professor;
drop table manager;

drop table board;






