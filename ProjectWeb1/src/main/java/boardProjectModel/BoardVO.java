package boardProjectModel;

import java.sql.Date;

public class BoardVO {
	private int no;
	private String title;
	private String content;
	private String author;
	private Date nal;
	private int readCount;
	
	public BoardVO() {
		
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Date getNal() {
		return nal;
	}

	public void setNal(Date nal) {
		this.nal = nal;
	}

	public int getReadCount() {
		return readCount;
	}

	public void setReadCount(int readCount) {
		this.readCount = readCount;
	}
}
