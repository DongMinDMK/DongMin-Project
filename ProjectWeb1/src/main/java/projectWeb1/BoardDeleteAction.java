package projectWeb1;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import boardProjectModel.BoardProjectDAO;
import boardProjectModel.BoardVO;

public class BoardDeleteAction implements Action{

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		ActionForward forward = new ActionForward();
		BoardProjectDAO dao = new BoardProjectDAO();
		BoardVO vo = new BoardVO();
		
		String title = request.getParameter("title");
		
		vo.setTitle(title);
		
		if(dao.boardDelete(vo)) {
			forward.setPath("/index.jsp");
			forward.setRedirect(true);
		}else {
			System.out.println("글삭제중 오류발생");
		}
		
		return forward;
	}

	
}
