package boardProjectModel;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class BoardProjectDAO {
	Connection conn;
	PreparedStatement pstmt;
	
	final String sqlInsert = "insert into board(title, content, author, nal, readCount) values(?,?,?,now(), ?)";
	final String sqlSearch = "select no, title, content, author, nal, readCount from board where title = ?";
	final String sqlSelect = "select no, title, content, author, nal, readCount from board";
	final String sqlDelete = "delete from board where title = ?";
	final String sqlUpdate1 = "update board set title = ?, content = ? where title = ?";
	final String sqlReadCount1 = "update board set readCount = readCount + 1 where title = ?";
	
	
	public boolean boardInsert(BoardVO vo) { //등록
		conn = JDBCUtil.connect();
		
		try {
			pstmt = conn.prepareStatement(sqlInsert);
			pstmt.setString(1, vo.getTitle());
			pstmt.setString(2, vo.getContent());
			pstmt.setString(3, vo.getAuthor());
			pstmt.setInt(4, vo.getReadCount());
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			JDBCUtil.disConnect(pstmt, conn);
		}
		
		return true;
	}
	
	public BoardVO boardSearch(BoardVO data) { //검색
		conn = JDBCUtil.connect();
		
		try {
			pstmt = conn.prepareStatement(sqlSearch);
			pstmt.setString(1, data.getTitle());
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				data = new BoardVO();
				data.setNo(rs.getInt("no"));
				data.setTitle(rs.getString("title"));
				data.setContent(rs.getString("content"));
				data.setAuthor(rs.getString("author"));
				data.setNal(rs.getDate("nal"));
				data.setReadCount(rs.getInt("readCount"));

				pstmt = conn.prepareStatement(sqlReadCount1);
				pstmt.setString(1, data.getTitle());
				pstmt.executeUpdate();
			}
			rs.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			JDBCUtil.disConnect(pstmt, conn);
		}
		return data;
	}
	
	public boolean boardDelete(BoardVO vo) { //삭제
		conn = JDBCUtil.connect();
		
		try {
			pstmt = conn.prepareStatement(sqlDelete);
			pstmt.setString(1, vo.getTitle());
			
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			JDBCUtil.disConnect(pstmt, conn);
		}
		return true;
	}
	
	public boolean boardUpdate(BoardVO vo, String select) { //수정
		conn = JDBCUtil.connect();
		
		try {
			pstmt = conn.prepareStatement(sqlUpdate1);
			pstmt.setString(1, vo.getTitle());
			pstmt.setString(2, vo.getContent());
			pstmt.setString(3, select);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			JDBCUtil.disConnect(pstmt, conn);
		}
		
		return true;
	}
	
	
	public ArrayList<BoardVO> boardList(){ //전체출력
		ArrayList<BoardVO> datas = new ArrayList<BoardVO>();
		conn = JDBCUtil.connect();
		
		try {
			pstmt = conn.prepareStatement(sqlSelect);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				BoardVO vo = new BoardVO();
				vo.setNo(rs.getInt("no"));
				vo.setTitle(rs.getString("title"));
				vo.setContent(rs.getString("content"));
				vo.setAuthor(rs.getString("author"));
				vo.setNal(rs.getDate("nal"));
				vo.setReadCount(rs.getInt("readCount"));
				datas.add(vo);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			JDBCUtil.disConnect(pstmt, conn);
		}
		return datas;
	}

	

	

}
