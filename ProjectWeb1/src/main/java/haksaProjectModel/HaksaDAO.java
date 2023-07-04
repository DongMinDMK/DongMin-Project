package haksaProjectModel;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import loginProjectModel.LoginVO_Student;

public class HaksaDAO {
	Connection conn;
	PreparedStatement pstmt;
	
	final String sqlStudentInsert = "insert into student(id, passwd, name, student_id) values(?,?,?,?)";
	final String sqlStudentSearch = "select id, passwd, name, student_id from student where name = ?";
	final String sqlStudentDelete = "delete from student where name = ?";
	final String sqlStudentUpdate = "update student set id = ?, passwd = ?, name = ?, student_id = ? where name = ?";
	final String sqlStudentSelect = "select id, passwd, name, student_id from student";
	
	final String sqlProfessorInsert = "insert into professor(id, passwd, name, subject) values(?,?,?,?)";
	final String sqlProfessorSearch = "select id, passwd, name, subject from professor where name = ?";
	final String sqlProfessorDelete = "delete from professor where name = ?";
	final String sqlProfessorUpdate = "update professor set id = ?, passwd = ?, name = ?, subject = ? where name = ?";
	final String sqlProfessorSelect = "select id, passwd, name, subject from professor";
	
	final String sqlManagerInsert = "insert into manager(id, passwd, name, department) values(?,?,?,?)";
	final String sqlManagerSearch = "select id, passwd, name, department from manager where name = ?";
	final String sqlManagerDelete = "delete from manager where name = ?";
	final String sqlManagerUpdate = "update manager set id = ?, passwd = ?, name = ?, department = ? where name = ?";
	final String sqlManagerSelect = "select id, passwd, name, department from manager";
	
	
	public void haksaInsertStudent(HaksaVO_Student vos) { //학생등록
	      conn = JDBCUtil.connect();
	      
	      try {
	    	  pstmt = conn.prepareStatement(sqlStudentInsert);
			  pstmt.setString(1, vos.getId());
			  pstmt.setString(2, vos.getPasswd());
			  pstmt.setString(3, vos.getName());
			  pstmt.setString(4, vos.getStudent_id());
			  pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			JDBCUtil.disConnect(pstmt, conn);
		}
	      
		
	}
	
	
	public void haksaInsertProfessor(HaksaVO_Professor vop) { //교수등록
		conn = JDBCUtil.connect();
	      
	      try {
	    	  pstmt = conn.prepareStatement(sqlProfessorInsert);
			  pstmt.setString(1, vop.getId());
			  pstmt.setString(2, vop.getPasswd());
			  pstmt.setString(3, vop.getName());
			  pstmt.setString(4, vop.getSubject());
			  pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			JDBCUtil.disConnect(pstmt, conn);
		}
	}
	
	public void haksaInsertManager(HaksaVO_Manager vom) { //관리자등록
		conn = JDBCUtil.connect();
	      
	      try {
	    	  pstmt = conn.prepareStatement(sqlManagerInsert);
			  pstmt.setString(1, vom.getId());
			  pstmt.setString(2, vom.getPasswd());
			  pstmt.setString(3, vom.getName());
			  pstmt.setString(4, vom.getDepartment());
			  pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			JDBCUtil.disConnect(pstmt, conn);
		}
		
	}
	
	
	public HaksaVO_Student haksaSearchStudent(HaksaVO_Student voss) { //학생검색
		conn = JDBCUtil.connect();
		
		try {
			pstmt = conn.prepareStatement(sqlStudentSearch);
			pstmt.setString(1, voss.getName());
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
			     voss = new HaksaVO_Student();
			     voss.setId(rs.getString("id"));
			     voss.setPasswd(rs.getString("passwd"));
			     voss.setName(rs.getString("name"));
			     voss.setStudent_id(rs.getString("student_id"));
			  }
			rs.close();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			JDBCUtil.disConnect(pstmt, conn);
		}
		
		return voss;
	}
	
	
	public HaksaVO_Professor haksaSearchProfessor(HaksaVO_Professor vopp) { //교수검색
		conn = JDBCUtil.connect();
		
		try {
			pstmt = conn.prepareStatement(sqlProfessorSearch);
			pstmt.setString(1, vopp.getName());
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
			     vopp = new HaksaVO_Professor();
			     vopp.setId(rs.getString("id"));
			     vopp.setPasswd(rs.getString("passwd"));
			     vopp.setName(rs.getString("name"));
			     vopp.setSubject(rs.getString("subject"));
			  }
			rs.close();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			JDBCUtil.disConnect(pstmt, conn);
		}
		
		return vopp;
	}
	
	public HaksaVO_Manager haksaSearchManager(HaksaVO_Manager vomm) { //관리자검색
		conn = JDBCUtil.connect();
		
		try {
			pstmt = conn.prepareStatement(sqlManagerSearch);
			pstmt.setString(1, vomm.getName());
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
			     vomm = new HaksaVO_Manager();
			     vomm.setId(rs.getString("id"));
			     vomm.setPasswd(rs.getString("passwd"));
			     vomm.setName(rs.getString("name"));
			     vomm.setDepartment(rs.getString("department"));
			  }
			rs.close();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			JDBCUtil.disConnect(pstmt, conn);
		}
		
		return vomm;
	}
	
	
	
	public void haksaUpdateStudent(HaksaVO_Student hs, String name) { //학생수정
		conn = JDBCUtil.connect();
		
		try {
			pstmt = conn.prepareStatement(sqlStudentUpdate);
			pstmt.setString(1, hs.getId());
			pstmt.setString(2, hs.getPasswd());
			pstmt.setString(3, hs.getName());
			pstmt.setString(4, hs.getStudent_id());
			pstmt.setString(5, name); //이거 틀릴수있음
			pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			JDBCUtil.disConnect(pstmt, conn);
		}
		
		
	}

	

	
	
	
	public void haksaUpdateProfessor(HaksaVO_Professor hp, String name) { //교수수정
		conn = JDBCUtil.connect();
		
		try {
			pstmt = conn.prepareStatement(sqlProfessorUpdate);
			pstmt.setString(1, hp.getId());
			pstmt.setString(2, hp.getPasswd());
			pstmt.setString(3, hp.getName());
			pstmt.setString(4, hp.getSubject());
			pstmt.setString(5, name); //이거 틀릴수있음
			pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			JDBCUtil.disConnect(pstmt, conn);
		}
	}
	
	public void haksaUpdateManager(HaksaVO_Manager hm, String name) { //관리자수정
		conn = JDBCUtil.connect();
		
		try {
			pstmt = conn.prepareStatement(sqlManagerUpdate);
			pstmt.setString(1, hm.getId());
			pstmt.setString(2, hm.getPasswd());
			pstmt.setString(3, hm.getName());
			pstmt.setString(4, hm.getDepartment());
			pstmt.setString(5, name); //이거 틀릴수있음
			pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			JDBCUtil.disConnect(pstmt, conn);
		}
	}
	
	
	
	public void haksaDeleteStudent(HaksaVO_Student vosss) { //학생삭제
		conn = JDBCUtil.connect();
		
		try {
			pstmt = conn.prepareStatement(sqlStudentDelete);
			pstmt.setString(1, vosss.getName());
			
			pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			JDBCUtil.disConnect(pstmt, conn);
		}
		
	}
	
	
	public void haksaDeleteProfessor(HaksaVO_Professor voppp) { //교수삭제
		conn = JDBCUtil.connect();
		
		try {
			pstmt = conn.prepareStatement(sqlProfessorDelete);
			pstmt.setString(1, voppp.getName());
			
			pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			JDBCUtil.disConnect(pstmt, conn);
		}
		
	}
	
	
	public void haksaDeleteManager(HaksaVO_Manager vommm) { //관리자삭제
		conn = JDBCUtil.connect();
		
		try {
			pstmt = conn.prepareStatement(sqlManagerDelete);
			pstmt.setString(1, vommm.getName());
			
			pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			JDBCUtil.disConnect(pstmt, conn);
		}
		
	}
	
	
	public ArrayList<HaksaVO_Student> studentList(){ //학생전체목록
		ArrayList<HaksaVO_Student> hvos = new ArrayList<HaksaVO_Student>();
		conn = JDBCUtil.connect();
		
		try {
			pstmt = conn.prepareStatement(sqlStudentSelect);
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()) {
				HaksaVO_Student aa = new HaksaVO_Student();
				aa.setId(rs.getString("id"));
				aa.setPasswd(rs.getString("passwd"));
				aa.setName(rs.getString("name"));
				aa.setStudent_id(rs.getString("student_id"));
				hvos.add(aa);
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			JDBCUtil.disConnect(pstmt, conn);
		}
		
		return hvos;
	}
	
	
	public ArrayList<HaksaVO_Professor> professorList(){ //교수전체목록
		ArrayList<HaksaVO_Professor> hpos = new ArrayList<HaksaVO_Professor>();
		conn = JDBCUtil.connect();
		
		try {
			pstmt = conn.prepareStatement(sqlProfessorSelect);
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()) {
				HaksaVO_Professor bb = new HaksaVO_Professor();
				bb.setId(rs.getString("id"));
				bb.setPasswd(rs.getString("passwd"));
				bb.setName(rs.getString("name"));
				bb.setSubject(rs.getString("subject"));
				hpos.add(bb);
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			JDBCUtil.disConnect(pstmt, conn);
		}
		
		return hpos;
	}
	
	
	public ArrayList<HaksaVO_Manager> managerList(){ //관리자전체목록
		ArrayList<HaksaVO_Manager> hmos = new ArrayList<HaksaVO_Manager>();
		conn = JDBCUtil.connect();
		
		try {
			pstmt = conn.prepareStatement(sqlManagerSelect);
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()) {
				HaksaVO_Manager cc = new HaksaVO_Manager();
				cc.setId(rs.getString("id"));
				cc.setPasswd(rs.getString("passwd"));
				cc.setName(rs.getString("name"));
				cc.setDepartment(rs.getString("department"));
				hmos.add(cc);
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			JDBCUtil.disConnect(pstmt, conn);
		}
		
		return hmos;
	}


	
	
}
