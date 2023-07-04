package loginProjectModel;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class LoginProjectDAO {
	
	Connection conn;
	PreparedStatement pstmt;
	
	final String sqlUserStudentInsert = "insert into member_Student(id, pw, pwch, irum, nickname, email, emailcheck, SMScheck) values(?,?,?,?,?,?,?,?)";
	final String sqlUserStudentSearch = "select id, pw, pwch, irum, nickname, email, emailcheck, SMScheck from member_Student where id = ?";
	final String sqlUserStudentDelete = "delete from member_Student where id = ?";
	final String sqlUserStudentUpdate = "update member_Student set id = ?, pw = ?, pwch = ?, irum = ?, nickname = ?, email = ?, emailcheck = ?, SMScheck = ? where id = ?";
	final String sqlUserStudentSelect = "select id, pw, pwch, irum, nickname, email, emailcheck, SMScheck from member_Student";
	
	final String sqlUserProfessorInsert = "insert into member_Professor(id, pw, pwch, irum, nickname, email, emailcheck, SMScheck) values(?,?,?,?,?,?,?,?)";
	final String sqlUserProfessorSearch = "select id, pw, pwch, irum, nickname, email, emailcheck, SMScheck from member_Professor where id = ?";
	final String sqlUserProfessorDelete = "delete from member_Professor where id = ?";
	final String sqlUserProfessorUpdate = "update member_Professor set id = ?, pw = ?, pwch = ?, irum = ?, nickname = ?, email = ?, emailcheck = ?, SMScheck = ? where id = ?";
	final String sqlUserProfessorSelect = "select id, pw, pwch, irum, nickname, email, emailcheck, SMScheck from member_Professor";
	
	final String sqlUserManagerInsert = "insert into member_Manager(id, pw, pwch, irum, nickname, email, emailcheck, SMScheck) values(?,?,?,?,?,?,?,?)";
	final String sqlUserManagerSearch = "select id, pw, pwch, irum, nickname, email, emailcheck, SMScheck from member_Manager where id = ?";
	final String sqlUserManagerDelete = "delete from member_Manager where id = ?";
	final String sqlUserManagerUpdate = "update member_Manager set id = ?, pw = ?, pwch = ?, irum = ?, nickname = ?, email = ?, emailcheck = ?, SMScheck = ? where id = ?";
	final String sqlUserManagerSelect = "select id, pw, pwch, irum, nickname, email, emailcheck, SMScheck from member_Manager";
	
	public boolean userInsert(LoginVO_Student vo) { //학생 회원가입
		
		conn = JDBCUtil.connect();
		
		try {
			pstmt = conn.prepareStatement(sqlUserStudentInsert);
			pstmt.setString(1, vo.getId());
			pstmt.setString(2, vo.getPw());
			pstmt.setString(3, vo.getPwch());
			pstmt.setString(4, vo.getIrum());
			pstmt.setString(5, vo.getNickname());
			pstmt.setString(6, vo.getEmail());
			pstmt.setString(7, vo.getEmailcheck());
			pstmt.setString(8, vo.getSMScheck());
			
			pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			JDBCUtil.disConnect(pstmt, conn);
		}
		
		return true;
		
	}
	public LoginVO_Student userSearch(LoginVO_Student vos) { //학생회원검색
		conn = JDBCUtil.connect();
		
	    try {
			pstmt = conn.prepareStatement(sqlUserStudentSearch);
			pstmt.setString(1, vos.getId());
			
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()) {
				vos = new LoginVO_Student();
				vos.setId(rs.getString("id"));
				vos.setPw(rs.getString("pw"));
				vos.setPwch(rs.getString("pwch"));
				vos.setIrum(rs.getString("irum"));
				vos.setNickname(rs.getString("nickname"));
				vos.setEmail(rs.getString("email"));
				vos.setEmailcheck(rs.getString("emailcheck"));
				vos.setSMScheck(rs.getString("SMScheck"));
			}
			rs.close();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			JDBCUtil.disConnect(pstmt, conn);
		}
	    return vos;
	    
	}
	public boolean userDelete(LoginVO_Student voss) { //학생회원삭제
		conn = JDBCUtil.connect();
		
		try {
			pstmt = conn.prepareStatement(sqlUserStudentDelete);
			pstmt.setString(1, voss.getId());
			pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			JDBCUtil.disConnect(pstmt, conn);
		}
		
		return true;
	}
	
	public void userUpdate(LoginVO_Student vosu, String userID) { //학생회원수정
		conn = JDBCUtil.connect();
		
		try {
			pstmt = conn.prepareStatement(sqlUserStudentUpdate);
			pstmt.setString(1, vosu.getId());
			pstmt.setString(2, vosu.getPw());
			pstmt.setString(3, vosu.getPwch());
			pstmt.setString(4, vosu.getIrum());
			pstmt.setString(5, vosu.getNickname());
			pstmt.setString(6, vosu.getEmail());
			pstmt.setString(7, vosu.getEmailcheck());
			pstmt.setString(8, vosu.getSMScheck());
			pstmt.setString(9, userID);
			
			pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			JDBCUtil.disConnect(pstmt, conn);
		}
	}
	
	public ArrayList<LoginVO_Student> userList(){ //학생회원 전체목록
		ArrayList<LoginVO_Student> lvos = new ArrayList<LoginVO_Student> ();
		
		conn = JDBCUtil.connect();
		
		try {
			pstmt = conn.prepareStatement(sqlUserStudentSelect);
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()) {
				LoginVO_Student lp = new LoginVO_Student();
				lp.setId(rs.getString("id"));
				lp.setPw(rs.getString("pw"));
				lp.setPwch(rs.getString("pwch"));
				lp.setIrum(rs.getString("irum"));
				lp.setNickname(rs.getString("nickname"));
				lp.setEmail(rs.getString("email"));
				lp.setEmailcheck(rs.getString("emailcheck"));
				lp.setSMScheck(rs.getString("SMScheck"));
				lvos.add(lp);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			JDBCUtil.disConnect(pstmt, conn);
		}
		return lvos;
	}
	
	public boolean userInsert(LoginVO_Professor vo) { //교수 회원가입
		
		conn = JDBCUtil.connect();
		
		try {
			pstmt = conn.prepareStatement(sqlUserProfessorInsert);
			pstmt.setString(1, vo.getId());
			pstmt.setString(2, vo.getPw());
			pstmt.setString(3, vo.getPwch());
			pstmt.setString(4, vo.getIrum());
			pstmt.setString(5, vo.getNickname());
			pstmt.setString(6, vo.getEmail());
			pstmt.setString(7, vo.getEmailcheck());
			pstmt.setString(8, vo.getSMScheck());
			
			pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			JDBCUtil.disConnect(pstmt, conn);
		}
		return true;
		
	}
	
	public LoginVO_Professor userSearch(LoginVO_Professor vos) { //교수 회원검색
		conn = JDBCUtil.connect();
		
	    try {
			pstmt = conn.prepareStatement(sqlUserProfessorSearch);
			pstmt.setString(1, vos.getId());
			
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()) {
				vos = new LoginVO_Professor();
				vos.setId(rs.getString("id"));
				vos.setPw(rs.getString("pw"));
				vos.setPwch(rs.getString("pwch"));
				vos.setIrum(rs.getString("irum"));
				vos.setNickname(rs.getString("nickname"));
				vos.setEmail(rs.getString("email"));
				vos.setEmailcheck(rs.getString("emailcheck"));
				vos.setSMScheck(rs.getString("SMScheck"));
			}
			rs.close();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			JDBCUtil.disConnect(pstmt, conn);
		}
	    return vos;
	    
	}
	
	public boolean userDelete(LoginVO_Professor voss) { //교수회원삭제
		conn = JDBCUtil.connect();
		
		try {
			pstmt = conn.prepareStatement(sqlUserProfessorDelete);
			pstmt.setString(1, voss.getId());
			pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			JDBCUtil.disConnect(pstmt, conn);
		}
		
		return true;
	}
	
	public void userUpdate(LoginVO_Professor vosu, String userID) { //교수회원수정
		conn = JDBCUtil.connect();
		
		try {
			pstmt = conn.prepareStatement(sqlUserProfessorUpdate);
			pstmt.setString(1, vosu.getId());
			pstmt.setString(2, vosu.getPw());
			pstmt.setString(3, vosu.getPwch());
			pstmt.setString(4, vosu.getIrum());
			pstmt.setString(5, vosu.getNickname());
			pstmt.setString(6, vosu.getEmail());
			pstmt.setString(7, vosu.getEmailcheck());
			pstmt.setString(8, vosu.getSMScheck());
			pstmt.setString(9, userID);
			
			pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			JDBCUtil.disConnect(pstmt, conn);
		}
	}
	
	public ArrayList<LoginVO_Professor> userList1(){ //교수회원 전체목록
		ArrayList<LoginVO_Professor> lvos = new ArrayList<LoginVO_Professor> ();
		
		conn = JDBCUtil.connect();
		
		try {
			pstmt = conn.prepareStatement(sqlUserProfessorSelect);
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()) {
				LoginVO_Professor lp = new LoginVO_Professor();
				lp.setId(rs.getString("id"));
				lp.setPw(rs.getString("pw"));
				lp.setPwch(rs.getString("pwch"));
				lp.setIrum(rs.getString("irum"));
				lp.setNickname(rs.getString("nickname"));
				lp.setEmail(rs.getString("email"));
				lp.setEmailcheck(rs.getString("emailcheck"));
				lp.setSMScheck(rs.getString("SMScheck"));
				lvos.add(lp);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			JDBCUtil.disConnect(pstmt, conn);
		}
		return lvos;
	}
		
		
	public boolean userInsert(LoginVO_Manager vo) { //관리자 회원가입
			
			conn = JDBCUtil.connect();
			
			try {
				pstmt = conn.prepareStatement(sqlUserManagerInsert);
				pstmt.setString(1, vo.getId());
				pstmt.setString(2, vo.getPw());
				pstmt.setString(3, vo.getPwch());
				pstmt.setString(4, vo.getIrum());
				pstmt.setString(5, vo.getNickname());
				pstmt.setString(6, vo.getEmail());
				pstmt.setString(7, vo.getEmailcheck());
				pstmt.setString(8, vo.getSMScheck());
				
				pstmt.executeUpdate();
			} catch (Exception e) {
				e.printStackTrace();
			}finally {
				JDBCUtil.disConnect(pstmt, conn);
			}
			
			return true;
			
	}
	
	public LoginVO_Manager userSearch(LoginVO_Manager vos) { //관리자 회원검색
		conn = JDBCUtil.connect();
		
	    try {
			pstmt = conn.prepareStatement(sqlUserManagerSearch);
			pstmt.setString(1, vos.getId());
			
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()) {
				vos = new LoginVO_Manager();
				vos.setId(rs.getString("id"));
				vos.setPw(rs.getString("pw"));
				vos.setPwch(rs.getString("pwch"));
				vos.setIrum(rs.getString("irum"));
				vos.setNickname(rs.getString("nickname"));
				vos.setEmail(rs.getString("email"));
				vos.setEmailcheck(rs.getString("emailcheck"));
				vos.setSMScheck(rs.getString("SMScheck"));
			}
			rs.close();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			JDBCUtil.disConnect(pstmt, conn);
		}
	    return vos;
	    
	}
	
	public boolean userDelete(LoginVO_Manager voss) { //관리자회원삭제
		conn = JDBCUtil.connect();
		
		try {
			pstmt = conn.prepareStatement(sqlUserManagerDelete);
			pstmt.setString(1, voss.getId());
			pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			JDBCUtil.disConnect(pstmt, conn);
		}
		return true;
	}
	
	public void userUpdate(LoginVO_Manager vosu, String userID) { //관리자회원수정
		conn = JDBCUtil.connect();
		
		try {
			pstmt = conn.prepareStatement(sqlUserManagerUpdate);
			pstmt.setString(1, vosu.getId());
			pstmt.setString(2, vosu.getPw());
			pstmt.setString(3, vosu.getPwch());
			pstmt.setString(4, vosu.getIrum());
			pstmt.setString(5, vosu.getNickname());
			pstmt.setString(6, vosu.getEmail());
			pstmt.setString(7, vosu.getEmailcheck());
			pstmt.setString(8, vosu.getSMScheck());
			pstmt.setString(9, userID);
			
			pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			JDBCUtil.disConnect(pstmt, conn);
		}
	}
	
	public ArrayList<LoginVO_Manager> userList2(){ //관리자회원 전체목록
		ArrayList<LoginVO_Manager> lvos = new ArrayList<LoginVO_Manager> ();
		
		conn = JDBCUtil.connect();
		
		try {
			pstmt = conn.prepareStatement(sqlUserManagerSelect);
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()) {
				LoginVO_Manager lp = new LoginVO_Manager();
				lp.setId(rs.getString("id"));
				lp.setPw(rs.getString("pw"));
				lp.setPwch(rs.getString("pwch"));
				lp.setIrum(rs.getString("irum"));
				lp.setNickname(rs.getString("nickname"));
				lp.setEmail(rs.getString("email"));
				lp.setEmailcheck(rs.getString("emailcheck"));
				lp.setSMScheck(rs.getString("SMScheck"));
				lvos.add(lp);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			JDBCUtil.disConnect(pstmt, conn);
		}
		return lvos;
	}
		
	


}
