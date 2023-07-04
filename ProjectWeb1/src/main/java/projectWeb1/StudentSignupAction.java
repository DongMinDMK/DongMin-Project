package projectWeb1;

import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import loginProjectModel.LoginProjectDAO;
import loginProjectModel.LoginVO_Student;

public class StudentSignupAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		
		ActionForward forward = null;
		
		LoginVO_Student vo = new LoginVO_Student();
		LoginProjectDAO dao = new LoginProjectDAO();
		String studentID = request.getParameter("id");
		String studentPasswd = request.getParameter("pw");
		String studentPasswdch = request.getParameter("pwch");
		String studentName = request.getParameter("name");
		String studentNickname = request.getParameter("nickname");
		String studentEmail = request.getParameter("email");
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
		
		vo.setId(studentID);
		vo.setPw(studentPasswd);
		vo.setPwch(studentPasswdch);
		vo.setIrum(studentName);
		vo.setNickname(studentNickname);
		vo.setEmail(studentEmail);
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
