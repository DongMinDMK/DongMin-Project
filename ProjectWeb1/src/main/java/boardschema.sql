CREATE TABLE board
(
	no                   INTEGER NOT NULL auto_increment PRIMARY KEY,
	title                VARCHAR(100) NULL,
	content              VARCHAR(100) NULL,
	author               VARCHAR(100) NULL,
	nal                  DATETIME NULL,
	readCount            INTEGER NULL
);


insert into board(title, content, author, nal, readCount) values('제목1', '내용1', '김동민', '2017-1-1' , 0);

select * from board;