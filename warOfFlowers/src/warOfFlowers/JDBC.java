package warOfFlowers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBC {

	/* 사용예시
	JDBC db = new JDBC();
	
	회원가입 (리턴타입 : boolean)
	db.signupsignup(String inputId, String inputPw, String InputNick);
	
	로그인 (리턴타입 : boolean)
	db.login(String inputId, String inputPw);
	
	포인트 받기 (리턴타입 : int)
	db.getPoint(String id);
	
	포인트 기록 (리턴타입 : void)
	db.setPoint(String id, int point);
	
	랭킹 출력 (리턴타입 : void)
	db.getRank();
	
	연결 (리턴타입 : void)
	db.getConn();
	
	연결해제 (리턴타입 : void)
	db.close;
	*/
	
	private Connection conn = null;
	private PreparedStatement pstm = null;
	private ResultSet rs = null;

	

	// 회원가입
	public boolean signup(String inputId, String inputPw, String InputNick) {
		getConn();
		try {
			String sql = "select P_ID from PLAYER_TABLE";
			pstm = conn.prepareStatement(sql);
			rs = pstm.executeQuery();
			while (rs.next()) {
				if (rs.getString("P_ID").equals(inputId)) {
					System.out.println("이미 존재하는 ID입니다.");
					return false;
				}
			}
			sql = "insert into PLAYER_TABLE values (?, ?, ?, 0)";
			pstm = conn.prepareStatement(sql);
			pstm.setString(1, inputId);
			pstm.setString(2, inputPw);
			pstm.setString(3, InputNick);

			int result = pstm.executeUpdate();
			if (result > 0) {
				System.out.println("회원가입 성공!");
			}
			close();
			return true;

		} catch (SQLException e) {
			System.out.println("쿼리문 오류");
			e.printStackTrace();
			close();
			return false;
		}

	}

	// 로그인
	public boolean login(String inputId, String inputPw) {
		getConn();
		try {
			String sql = "select P_ID, P_PASSWORD from PLAYER_TABLE where P_ID = ? and P_PASSWORD = ?";
			pstm = conn.prepareStatement(sql);
			pstm.setString(1, inputId);
			pstm.setString(2, inputPw);
			rs = pstm.executeQuery();
			while (rs.next()) {
				if (rs.getString("P_ID").equals(inputId) && rs.getString("P_PASSWORD").equals(inputPw)) {
					System.out.println("로그인 성공");
					close();
					return true;
				}
				
			}
		} catch (SQLException e) {
			System.out.println("쿼리문 오류");
			e.printStackTrace();
		}
		close();
		return false;
	}
	
	// 포인트 받기
	public int getPoint(String id) {
		getConn();
		int point = 0;
		try {
			String sql = "select P_Point from PLAYER_TABLE where P_ID = ?";
			pstm = conn.prepareStatement(sql);
			pstm.setString(1, id);
			rs = pstm.executeQuery();
			while (rs.next()) {
				point = rs.getInt("P_POINT");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		close();
		return point;
	}
	
	// 포인트 기록
	public void setPoint(String id, int point) {
		getConn();
		try {
			String sql = "update PLAYER_TABLE set P_POINT = ? where P_ID = ?";
			pstm = conn.prepareStatement(sql);
			pstm.setInt(1, point);
			pstm.setString(2, id);
			int result = pstm.executeUpdate();
			if (result > 0) {
				System.out.println("기록됨");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		close();
	}
	
	// 랭킹 출력
	public void getRank() {
		getConn();
		try {
			String sql = "select rownum, A.* from (select P_NICKNAME, P_POINT from PLAYER_TABLE order by P_POINT DESC) A";
			pstm = conn.prepareStatement(sql);
			rs = pstm.executeQuery();
			System.out.println("등수\t닉네임\t점수");
			while (rs.next()) {
				System.out.printf("%d\t%s\t%d\n", rs.getInt(1), rs.getString(2), rs.getInt(3));
			}
		} catch(SQLException e) {
			e.printStackTrace();
		}
		close();
	}

	// 연결
	public void getConn() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@project-db-stu.ddns.net:1524:xe";
			String id = "campus_k_0417_2";
			String pw = "smhrd2";
			conn = DriverManager.getConnection(url, id, pw);
			//System.out.println("접속 성공");
			
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println("접속 실패");
			e.printStackTrace();
			
		}
		

	}

	// 연결해제
	public void close() {
		if (rs != null) {
			try {
				if (rs != null) {
					rs.close();
				}
				if (pstm != null) {
					pstm.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		//System.out.println("연결해제");
	}
	
//	// 닉네임 받기
//	public String getNick(String id) {
//		String nick = "";
//		try {
//			String sql = "select P_ID, P_NICKNAME from PLAYER_TABLE where P_ID = ?";
//			pstm = conn.prepareStatement(sql);
//			pstm.setString(1, id);
//			rs = pstm.executeQuery();
//			while (rs.next()) {
//				nick = rs.getString("P_NICKNAME");
//			}
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//		return nick;
//	}

}
