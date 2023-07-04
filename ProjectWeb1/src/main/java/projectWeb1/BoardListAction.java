package projectWeb1;

import java.sql.Date;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import boardProjectModel.BoardProjectDAO;
import boardProjectModel.BoardVO;

public class BoardListAction implements Action{

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		
		BoardProjectDAO dao = new BoardProjectDAO();
		BoardVO vo = new BoardVO();
		ArrayList<BoardVO> dd = new ArrayList<BoardVO>();
		
		ActionForward forward = new ActionForward();
		forward.setPath("/boardList.jsp");
		forward.setRedirect(false);
		
		
		/*
		int no = Integer.parseInt(request.getParameter("no"));
		vo.setNo(no);
		int readCount = Integer.parseInt(request.getParameter("readCount"));
		vo.setReadCount(readCount);
		String title = request.getParameter("title");
		String content = request.getParameter("content");
		String author = request.getParameter("author");
	    String nal = request.getParameter("nal");
		
		
		
		
		vo.setTitle(title);
		vo.setContent(content);
		vo.setAuthor(author);
		
		
		*/
		
		dd = dao.boardList();
		
		request.setAttribute("boardData", dd);
		
		return forward;
	}

	
}
