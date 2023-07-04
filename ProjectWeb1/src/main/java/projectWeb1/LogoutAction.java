package projectWeb1;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LogoutAction implements Action{

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ActionForward forward = new ActionForward();
		forward.setPath("/index.jsp");
		forward.setRedirect(true);
		
		HttpSession session = request.getSession(false); //getSession을 false로 지정한 것은 새로운 사용자가 와서 session이라는 객체를 생성하는 것이 아니라 기존의 사용자의 세션을 원하기 때문에 false를 대입
		session.invalidate(); //이 함수는 session의 모든 세션의 데이터를 지워버림
		
		
		return forward;
	}

	
}
