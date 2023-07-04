package projectWeb1;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import boardProjectModel.BoardProjectDAO;
import boardProjectModel.BoardVO;

public class BoardUpdateAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		
		ActionForward forward = new ActionForward();
		BoardProjectDAO dao = new BoardProjectDAO();
		BoardVO vo = new BoardVO();
		
		String title = request.getParameter("title");
		String updateTitle = request.getParameter("updateTitle");
		String updateContent = request.getParameter("updateContent");
		
		vo.setTitle(updateTitle);
		vo.setContent(updateContent);
		
		if(dao.boardUpdate(vo, title)) {
			forward.setPath("/boardProtocol.jsp");
			forward.setRedirect(true);
		}else {
			System.out.println("게시글을 수정하는도중 오류가 발생하였습니다.");
		}
		
		return forward;
	}

	
}
