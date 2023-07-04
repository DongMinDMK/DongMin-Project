package projectWeb1;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import boardProjectModel.BoardProjectDAO;
import boardProjectModel.BoardVO;

public class BoardSearchAction implements Action{

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		
		BoardProjectDAO dao = new BoardProjectDAO();
		BoardVO vo = new BoardVO();
		ActionForward forward = new ActionForward();
		
		String title = request.getParameter("title");
		vo.setTitle(title);
		
		
		vo = dao.boardSearch(vo);
		
		if(vo == null) {
			System.out.println("게시글 제목이 없는 것을 검색하려고 시도함.");
			forward.setPath("/index.jsp");
			forward.setRedirect(true);
		}else {
			request.setAttribute("boardData", vo);
			forward.setPath("/boardSearchSuccess.jsp");
			forward.setRedirect(false);
		}
		
		return forward;
	}

	
}
