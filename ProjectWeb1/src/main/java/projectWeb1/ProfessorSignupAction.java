package projectWeb1;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import loginProjectModel.LoginProjectDAO;
import loginProjectModel.LoginVO_Professor;

public class ProfessorSignupAction implements Action{

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		
		ActionForward forward = null;
		
		LoginProjectDAO dao = new LoginProjectDAO();
		LoginVO_Professor vo = new LoginVO_Professor();
		String professorID = request.getParameter("id");
		String professorPasswd = request.getParameter("pw");
		String professorPasswdch = request.getParameter("pwch");
		String professorName = request.getParameter("name");
		String professorNickname = request.getParameter("nickname");
		String professorEmail = request.getParameter("email");
		String emailCheck = request.getParameter("emailcheck");
		if(emailCheck.equals("YES") || emailCheck.equals("yes")) {
			emailCheck = "YES";
		}else if(emailCheck.equals("NO") || emailCheck.equals("no")) {
			emailCheck= "NO";
		}
		String SMScheck = request.getParameter("SMScheck");
		
		if(SMScheck.equals("YES") || SMScheck.equals("yes")) {
			SMScheck = "YES";
		}else if(SMScheck.equals("NO") || SMScheck.equals("no")) {
			SMScheck= "NO";
		}
		
		vo.setId(professorID);
		vo.setPw(professorPasswd);
		vo.setPwch(professorPasswdch);
		vo.setIrum(professorName);
		vo.setNickname(professorNickname);
		vo.setEmail(professorEmail);
		vo.setEmailcheck(emailCheck);
		vo.setSMScheck(SMScheck);
		
		
		if(dao.userInsert(vo)) {
			forward = new ActionForward();
			forward.setPath("index.jsp");
			forward.setRedirect(true);
		}else {
			throw new Exception("회원가입에서 에러발생");
		}
		
		return forward;
	}
		
}
