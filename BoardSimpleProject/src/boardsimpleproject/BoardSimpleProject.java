package boardsimpleproject;
import java.util.*;

class Board{
	String boardTitle;
	String boardContent;
	String boardAuthor;
	
	public Board() {
		
	}

	public String getBoardTitle() {
		return boardTitle;
	}

	public void setBoardTitle(String boardTitle) {
		this.boardTitle = boardTitle;
	}

	public String getBoardContent() {
		return boardContent;
	}

	public void setBoardContent(String boardContent) {
		this.boardContent = boardContent;
	}

	public String getBoardAuthor() {
		return boardAuthor;
	}

	public void setBoardAuthor(String boardAuthor) {
		this.boardAuthor = boardAuthor;
	}
	
	
}

public class BoardSimpleProject {

	public static void main(String[] args) {
		
		//사용자에게 직접 게시판글,내용,저자를 입력을 받고 배열에 저장한 다음, 저장한 배열에서 꺼내서 출력하는 간단한 코드 작성하기.
		
		Scanner scanner = new Scanner(System.in);
		
		Board board = new Board();
		
		System.out.print("게시판 글 제목을 입력하세요 : ");
		String boardTitle = scanner.next();
		
		board.setBoardTitle(boardTitle);
		
		
		
		System.out.print("게시판 글 내용을 입력하세요(간단하게 최대 1줄작성) : ");
		String boardContent = scanner.next();
		
		board.setBoardContent(boardContent);
		
		System.out.print("게시판 글 저자를 입력하세요 : ");
		String boardAuthor = scanner.next();
		
		board.setBoardAuthor(boardAuthor);
		
		List<Board> boardList = new ArrayList<Board>();
		
		boardList.add(board);
		
		for(int i=0; i<boardList.size(); i++) {
			board = boardList.get(i);
			
			System.out.println(board.getBoardTitle());
			System.out.println(board.getBoardContent());
			System.out.println(board.getBoardAuthor());
		}
		
		

	}

}
