package projectWeb1;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import haksaProjectModel.HaksaDAO;
import haksaProjectModel.HaksaVO_Manager;
import haksaProjectModel.HaksaVO_Professor;
import haksaProjectModel.HaksaVO_Student;
import loginProjectModel.LoginProjectDAO;
import loginProjectModel.LoginVO_Manager;
import loginProjectModel.LoginVO_Professor;
import loginProjectModel.LoginVO_Student;


@WebServlet("*.do")
public class FrontControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	HaksaDAO dao;
	LoginProjectDAO dao1;
	
	public FrontControllerServlet() {
		dao = new HaksaDAO();
		dao1 = new LoginProjectDAO();
	}


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		boolean isCheck = true;
		
		
		String requestURI = request.getRequestURI(); // 처음에 주소줄을 다 갖고왔는데 거기서 http://localhost:8083/Day20230602Web/insert.do 서  http://localhost:8083/을 빼고 Day20230602Web/insert.do만 나온다 
		String contextPath = request.getContextPath(); // 앞뒤 주소줄 다 자르고 Day20230602Web만 출력
		String command = requestURI.substring(contextPath.length()); // insert.do만 출력
		
		ActionForward forward = null;
		
		
		if(command.equals("/studentRegister.do")) { //학생등록
			
			HaksaVO_Student studentVO = new HaksaVO_Student();
			
			String id = request.getParameter("id");
			String passwd = request.getParameter("passwd");
			String name = request.getParameter("name");
			String student_id = request.getParameter("student_id");
			
			studentVO.setId(id);
			studentVO.setPasswd(passwd);
			studentVO.setName(name);
			studentVO.setStudent_id(student_id);
			
			dao.haksaInsertStudent(studentVO);
			
			if(dao == null) {
				response.sendRedirect("studentRegisterFail.html");
				
			}else {
				response.sendRedirect("studentRegisterSuccess.html");
			}
			
			
			
		}else if(command.equals("/studentSearch.do")) { //학생검색
			HaksaVO_Student vo = new HaksaVO_Student();
			
			String name = request.getParameter("name");
			vo.setName(name);
			
			vo = dao.haksaSearchStudent(vo);
			
			request.setAttribute("studentVO", vo);
			RequestDispatcher dis = request.getRequestDispatcher("studentSearchResult.jsp");
			dis.forward(request, response);
			
		}else if(command.equals("/studentUpdate.do")) { //학생수정
			HaksaVO_Student vo = new HaksaVO_Student();
			
			String name = request.getParameter("name");
			String id = request.getParameter("id");
			String passwd = request.getParameter("passwd");
			String updateName = request.getParameter("updateName");
			String student_id = request.getParameter("hakbun");
			
			vo.setId(id);
			vo.setPasswd(passwd);
			vo.setName(updateName);
			vo.setStudent_id(student_id);
			
			
			dao.haksaUpdateStudent(vo, name);
			
			if(dao == null) {
				response.sendRedirect("studentUpdateFail.html");
			}
			
			response.sendRedirect("studentUpdateSuccess.html");
			
		}else if(command.equals("/studentDelete.do")) { //학생삭제
			
			HaksaVO_Student vo = new HaksaVO_Student();
			
			String name = request.getParameter("name");
			
			vo.setName(name);
			
			dao.haksaDeleteStudent(vo);
			
			if(dao == null) {
				response.sendRedirect("studentDeleteFail.html");
			}
			response.sendRedirect("studentDeleteSuccess.html");
			
			
		}else if(command.equals("/studentList.do")) { //학생전체목록
			HaksaVO_Student vo = new HaksaVO_Student();
		    ArrayList<HaksaVO_Student> vos = new ArrayList<HaksaVO_Student>();
		    
		    
		    vos = dao.studentList();
		    
		    request.setAttribute("ArrayListStd", vos);
		    RequestDispatcher dis = request.getRequestDispatcher("studentSelectResult.jsp");
		    dis.forward(request, response);
		    
		    if(dao == null) {
				response.sendRedirect("studentSelectFail.html");
			}
		   
		  
		}else if(command.equals("/professorRegister.do")) { //교수등록
			HaksaVO_Professor vo = new HaksaVO_Professor();
			
			String id = request.getParameter("id");
			String passwd = request.getParameter("passwd");
			String name = request.getParameter("name");
			String subject = request.getParameter("subject");
			
			vo.setId(id);
			vo.setPasswd(passwd);
			vo.setName(name);
			vo.setSubject(subject);
			
			
			
			dao.haksaInsertProfessor(vo);
			
			if(dao == null) {
				response.sendRedirect("professorRegisterFail.html");
			}
			
			response.sendRedirect("professorRegisterSuccess.html");
			
		}else if(command.equals("/professorSearch.do")) { //교수검색
			
			HaksaVO_Professor vo = new HaksaVO_Professor();
			
			String name = request.getParameter("name");
			vo.setName(name);
			
			vo = dao.haksaSearchProfessor(vo);
			
			request.setAttribute("professorVO", vo);
			RequestDispatcher dis = request.getRequestDispatcher("professorSearchResult.jsp");
			dis.forward(request, response);
			
			
			
		}else if(command.equals("/professorUpdate.do")) { //교수수정
			
			HaksaVO_Professor vo = new HaksaVO_Professor();
			
			String name = request.getParameter("name");
			String id = request.getParameter("id");
			String passwd = request.getParameter("passwd");
			String updateName = request.getParameter("updateName");
			String subject = request.getParameter("subject");
			
			vo.setId(id);
			vo.setPasswd(passwd);
			vo.setName(updateName);
			vo.setSubject(subject);
			
			
			dao.haksaUpdateProfessor(vo, name);
			
			if(dao == null) {
				response.sendRedirect("studentUpdateFail.html");
			}
			
			response.sendRedirect("studentUpdateSuccess.html");
			
		}else if(command.equals("/professorDelete.do")) { //교수삭제
			
			HaksaVO_Professor vo = new HaksaVO_Professor();
			
			String name = request.getParameter("name");
			
			vo.setName(name);
			
			dao.haksaDeleteProfessor(vo);
			
			if(dao == null) {
				response.sendRedirect("studentDeleteFail.html");
			}
			response.sendRedirect("studentDeleteSuccess.html");
			
		}else if(command.equals("/professorList.do")) { //교수전체목록
			HaksaVO_Professor vo = new HaksaVO_Professor();
		    ArrayList<HaksaVO_Professor> vos = new ArrayList<HaksaVO_Professor>();
		    
		    
		    vos = dao.professorList();
		    
		    request.setAttribute("professorListPfs", vos);
		    RequestDispatcher dis = request.getRequestDispatcher("professorSelectResult.jsp");
		    dis.forward(request, response);
		    
		    if(dao == null) {
				response.sendRedirect("professorSelectFail.html");
			}
		    
		}else if(command.equals("/managerRegister.do")) { //관리자 등록
			HaksaVO_Manager vo = new HaksaVO_Manager();
			
			String id = request.getParameter("id");
			String passwd = request.getParameter("passwd");
			String name = request.getParameter("name");
			String department = request.getParameter("department");
			
			vo.setId(id);
			vo.setPasswd(passwd);
			vo.setName(name);
			vo.setDepartment(department);
			
			dao.haksaInsertManager(vo);
			
			
			if(dao == null) {
				response.sendRedirect("managerRegisterFail.html");
			}
			
			response.sendRedirect("managerRegisterSuccess.html");
			
		}else if(command.equals("/managerSearch.do")) { //관리자 검색
			HaksaVO_Manager vo = new HaksaVO_Manager();
			
			String name = request.getParameter("name");
			
			vo.setName(name);
			
			vo = dao.haksaSearchManager(vo);
			
			request.setAttribute("managerVO", vo);
			RequestDispatcher dis = request.getRequestDispatcher("managerSearchResult.jsp");
			dis.forward(request, response);
			
		}else if(command.equals("/managerUpdate.do")) { //관리자 수정
			HaksaVO_Manager vo = new HaksaVO_Manager();
			
			String name = request.getParameter("name");
			String id = request.getParameter("id");
			String passwd = request.getParameter("passwd");
			String updateName = request.getParameter("updateName");
			String department = request.getParameter("department");
			
			vo.setId(id);
			vo.setPasswd(passwd);
			vo.setName(updateName);
			vo.setDepartment(department);
			
			dao.haksaUpdateManager(vo, name);
			
			if(dao == null) {
				response.sendRedirect("managerUpdateFail.html");
			}
			response.sendRedirect("managerUpdateSuccess.html");
			
		}else if(command.equals("/managerDelete.do")) { //관리자 삭제
			HaksaVO_Manager vo = new HaksaVO_Manager();
			
			String name = request.getParameter("name");
			
			vo.setName(name);
			
			dao.haksaDeleteManager(vo);
			
			
			if(dao == null) {
				response.sendRedirect("managerDeleteFail.html");
			}
			response.sendRedirect("managerDeleteSuccess.html");
		}else if(command.equals("/managerList.do")) { //관리자전체목록
			HaksaVO_Manager vo = new HaksaVO_Manager();
			ArrayList<HaksaVO_Manager> vos = new ArrayList<HaksaVO_Manager>();
			
			vos = dao.managerList();
			
			request.setAttribute("ListManager", vos);
			RequestDispatcher dis = request.getRequestDispatcher("managerSelectResult.jsp");
			dis.forward(request, response);
			
			
			if(dao == null) {
				response.sendRedirect("managerSelectFail.html");
			}
			
			
		}
		//회원가입 하는 여기부터 인터페이스를 이용하여 메소드를 각각 오버라이딩 받아서 RequestDispatcher로 보내고 .jsp 파일에서 출력하기
	
		else if(command.equals("/studentSignup.do")) { //학생회원가입
			System.out.println("학생 회원가입");
			
			
			try {
				forward = new StudentSignupAction().execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
			 RequestDispatcher dispatcher = request.getRequestDispatcher(forward.getPath());
			 dispatcher.forward(request, response);
			
		}else if(command.equals("/professorSignup.do")) {
			
			
			System.out.println("교수 회원가입");
			
			try {
				forward = new ProfessorSignupAction().execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
			 RequestDispatcher dispatcher = request.getRequestDispatcher(forward.getPath());
			 dispatcher.forward(request, response);
			
		}else if(command.equals("/managerSignup.do")) {
			
			System.out.println("관리자 회원가입");
			
			try {
				forward = new ManagerSignupAction().execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			 RequestDispatcher dispatcher = request.getRequestDispatcher(forward.getPath());
			 dispatcher.forward(request, response);
			
		}else if(command.equals("/loginStudent.do")) { //로그인화면 선택
			
			System.out.println("학생 로그인 요청");
			
			try {
					forward = new LoginActionStudent().execute(request, response);
				} catch (Exception e) {
					e.printStackTrace();
			}
			RequestDispatcher dispatcher = request.getRequestDispatcher(forward.getPath());
			dispatcher.forward(request, response);
		}else if(command.equals("/loginProfessor.do")) {
			System.out.println("교수 로그인 요청");
			
			try {
				forward = new LoginActionProfessor().execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
			RequestDispatcher dispatcher = request.getRequestDispatcher(forward.getPath());
			dispatcher.forward(request, response);
			
		}else if(command.equals("/loginManager.do")) {
			System.out.println("관리자 로그인 요청");
			
			try {
				forward = new LoginActionManager().execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
			RequestDispatcher dispatcher = request.getRequestDispatcher(forward.getPath());
			dispatcher.forward(request, response);
		}
		
		else if(command.equals("/logout.do")) { //로그아웃 선택
			System.out.println("로그아웃 요청");
			
			try {
				forward = new LogoutAction().execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			RequestDispatcher dispatcher = request.getRequestDispatcher(forward.getPath());
			dispatcher.forward(request, response);
		}else if(command.equals("/studentUserDelete.do")) { //학생 회원탈퇴
			System.out.println("학생 회원탈퇴");
			
			try {
				forward = new StudentDeleteAction().execute(request, response);
			} catch (Exception e) {
				
				e.printStackTrace();
			}
			RequestDispatcher dispatcher = request.getRequestDispatcher(forward.getPath());
			dispatcher.forward(request, response);
			
		}else if(command.equals("/professorUserDelete.do")) {
			System.out.println("교수 회원탈퇴");
			
			try {
				forward = new ProfessorDeleteAction().execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			RequestDispatcher dispatcher = request.getRequestDispatcher(forward.getPath());
			dispatcher.forward(request, response);
			
			
		}else if(command.equals("/managerUserDelete.do")) {
			System.out.println("관리자 회원탈퇴");
			
			try {
				forward = new ManagerDeleteAction().execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
			RequestDispatcher dispatcher = request.getRequestDispatcher(forward.getPath());
			dispatcher.forward(request, response);
		}else if(command.equals("/boardInsert.do")) {
			
			//세션을 활용하기 위해 로그인 상태로 게시판을 들어가야 로그인한 기존 ID가 나온다. 
			System.out.println("게시판글작성하기");
			
			try {
				forward = new BoardInsertAction().execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			RequestDispatcher dispatcher = request.getRequestDispatcher(forward.getPath());
			dispatcher.forward(request, response);
		}else if(command.equals("/boardSearch.do")) {
			System.out.println("게시판 글 검색하기");
			
			try {
				forward = new BoardSearchAction().execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
			RequestDispatcher dispatcher = request.getRequestDispatcher(forward.getPath());
			dispatcher.forward(request, response);
			
		}else if(command.equals("/boardUpdate.do")) {
			System.out.println("게시판 글 수정하기");
			
			try {
				forward = new BoardUpdateAction().execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			RequestDispatcher dispatcher = request.getRequestDispatcher(forward.getPath());
			dispatcher.forward(request, response);
			
		}else if(command.equals("/boardDelete.do")) {
			System.out.println("게시판 글 삭제하기");
			
			try {
				forward = new BoardDeleteAction().execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			RequestDispatcher dispatcher = request.getRequestDispatcher(forward.getPath());
			dispatcher.forward(request, response);
		}else if(command.equals("/boardList.do")) {
			System.out.println("게시판전체목록 출력하기");
			
			try {
				forward = new BoardListAction().execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
			RequestDispatcher dispatcher = request.getRequestDispatcher(forward.getPath());
			dispatcher.forward(request, response);
			
		}
		
	}

}
