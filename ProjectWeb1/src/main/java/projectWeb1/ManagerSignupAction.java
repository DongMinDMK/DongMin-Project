package projectWeb1;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import loginProjectModel.LoginProjectDAO;
import loginProjectModel.LoginVO_Manager;

public class ManagerSignupAction implements Action{

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		
		ActionForward forward = null;
		LoginProjectDAO dao = new LoginProjectDAO();
		LoginVO_Manager vo = new LoginVO_Manager();
		String managerID = request.getParameter("id");
		String managerPasswd = request.getParameter("pw");
		String managerPasswdch = request.getParameter("pwch");
		String managerName = request.getParameter("name");
		String managerNickname = request.getParameter("nickname");
		String managerEmail = request.getParameter("email");
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
		
		vo.setId(managerID);
		vo.setPw(managerPasswd);
		vo.setPwch(managerPasswdch);
		vo.setIrum(managerName);
		vo.setNickname(managerNickname);
		vo.setEmail(managerEmail);
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
