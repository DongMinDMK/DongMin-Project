package projectWeb1;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import loginProjectModel.LoginProjectDAO;
import loginProjectModel.LoginVO_Manager;
import loginProjectModel.LoginVO_Professor;
import loginProjectModel.LoginVO_Student;

public class LoginAction implements Action{
	
	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		
		ActionForward forward = new ActionForward();
		LoginProjectDAO dao = new LoginProjectDAO();
		LoginVO_Student studentVO = new LoginVO_Student();
		LoginVO_Professor professorVO = new LoginVO_Professor();
		LoginVO_Manager managerVO = new LoginVO_Manager();
		
		String id = request.getParameter("id");
		String passwd = request.getParameter("passwd");
		
		if(id.equals(studentVO.getId()) && passwd.equals(studentVO.getPw())) {
			
			studentVO.setId(id);
			studentVO.setPw(passwd);
			studentVO = dao.userSearch(studentVO);
			
			if(studentVO == null) { //쿼리문을 실행하지 못하면
				System.out.println("학생 로그인 실패");
				forward.setPath("/index.jsp");
				forward.setRedirect(true);
				
			
			}else { //쿼리문을 정상적으로 실행을 했다면
				HttpSession session = request.getSession(); //세션은 로그인한 아이디를 계속해서 유지시키기 위한 것.
				session.setAttribute("studentList", studentVO);
				forward.setPath("/loginSuccess.jsp");
				forward.setRedirect(true);
			}
			
		}else if(id.equals(professorVO.getId()) && passwd.equals(professorVO.getPw())) {
			
			professorVO.setId(id);
			professorVO.setPw(passwd);
			professorVO = dao.userSearch(professorVO);
			
			if(professorVO == null) { //쿼리문을 실행하지 못하면
				System.out.println("교수 로그인 실패");
				forward.setPath("/index.jsp");
				forward.setRedirect(true);
				
			}else { //쿼리문을 정상적으로 실행을 했다면
				HttpSession session = request.getSession(); //세션은 로그인한 아이디를 계속해서 유지시키기 위한 것.
				session.setAttribute("professorList", professorVO);
				forward.setPath("/loginSuccess.jsp");
				forward.setRedirect(true);
				
			}
			
		}else if(id.equals(managerVO.getId()) && passwd.equals(managerVO.getPw())) {
			
			managerVO.setId(id);
			managerVO.setPw(passwd);
			managerVO = dao.userSearch(managerVO);
			
			if(managerVO == null) { //쿼리문을 실행하지 못하면
				System.out.println("관리자 로그인 실패");
				forward.setPath("/index.jsp");
				forward.setRedirect(true);
				
			}else { //쿼리문을 정상적으로 실행을 했다면
				HttpSession session = request.getSession(); //세션은 로그인한 아이디를 계속해서 유지시키기 위한 것.
				session.setAttribute("managerList", managerVO);
				forward.setPath("/loginSuccess.jsp");
				forward.setRedirect(true);
				
			}
			
		}
		
		return forward;
		
	}

	
}
