package projectWeb1;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import loginProjectModel.LoginProjectDAO;
import loginProjectModel.LoginVO_Manager;
import loginProjectModel.LoginVO_Professor;

public class ManagerDeleteAction implements Action{

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		ActionForward forward = null;
		
		LoginVO_Manager managerVO = new LoginVO_Manager();
		LoginProjectDAO dao = new LoginProjectDAO();
		
		managerVO.setId(request.getParameter("id"));
		
		if(dao.userDelete(managerVO)) {
			HttpSession session = request.getSession(false); // request.getSession(false)는 기존에 있던 사용자를 탈퇴시키겠다라는 의미
			session.invalidate();
			forward = new ActionForward();
			forward.setPath("/index.jsp");
			forward.setRedirect(true);
			
		}else {
			System.out.println("회원탈퇴도중 에러발생(관리자)");
		}
		
		return forward;
		
	}
	

}
