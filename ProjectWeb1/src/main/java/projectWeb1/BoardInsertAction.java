package projectWeb1;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import boardProjectModel.BoardProjectDAO;
import boardProjectModel.BoardVO;

public class BoardInsertAction implements Action{

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
	     request.setCharacterEncoding("utf-8");
	     response.setCharacterEncoding("utf-8");
	     
	     BoardProjectDAO dao = new BoardProjectDAO();
	     BoardVO vo = new BoardVO();
	     ActionForward forward = new ActionForward();
	     
	     String title = request.getParameter("title");
	     String content = request.getParameter("content");
	     String author = request.getParameter("author");
	      /*String nal = request.getParameter("nal");*/
	     int readCount = Integer.parseInt(request.getParameter("readCount"));
	     
	     vo.setTitle(title);
	     vo.setContent(content);
	     vo.setAuthor(author);
	     vo.setReadCount(readCount);
	     
	     if(dao.boardInsert(vo)) {
	    	 forward.setPath("/loginSuccess.jsp");
	    	 forward.setRedirect(true);
	     }else {
	    	 System.out.println("게시판에 글등록하는도중 오류발생");
	     }
	     
	    return forward;
	}

	
}
