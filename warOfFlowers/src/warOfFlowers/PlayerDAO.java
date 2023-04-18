package warOfFlowers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class PlayerDAO {

	/* 사용예시
	PlayerDAO dao = new JDBC();
	
	회원가입 (리턴타입 : boolean)
	dao.signupsignup(String inputId, String inputPw, String InputNick);
	
	로그인 (리턴타입 : PlayerDTO)
	dao.login(String inputId, String inputPw);
	
	포인트 기록 (리턴타입 : void)
	dao.setPoint(PlayerDTO pdto);
	
	랭킹 출력 (리턴타입 : ArrayList<PlayDTO>)
	dao.getRankedList();
	
	연결 (리턴타입 : void)
	dao.getConn();
	
	연결해제 (리턴타입 : void)
	dao.close;
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
					return false;
				}
			}
			sql = "insert into PLAYER_TABLE values (?, ?, ?, 0)";
			pstm = conn.prepareStatement(sql);
			pstm.setString(1, inputId);
			pstm.setString(2, inputPw);
			pstm.setString(3, InputNick);
			pstm.executeUpdate();
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
	public PlayerDTO login(String inputId, String inputPw) {
		getConn();
		PlayerDTO pdto = null;
		try {
			String sql = "select P_ID, P_NICKNAME, P_POINT, P_PASSWORD from PLAYER_TABLE where P_ID = ? and P_PASSWORD = ?";
			pstm = conn.prepareStatement(sql);
			pstm.setString(1, inputId);
			pstm.setString(2, inputPw);
			rs = pstm.executeQuery();
			while (rs.next()) {
				pdto = new PlayerDTO(rs.getString(1), rs.getString(2), rs.getInt(3));
			}
		} catch (SQLException e) {
			System.out.println("쿼리문 오류");
			e.printStackTrace();
		}
		close();
		return pdto;
	}
	
	// 포인트 기록
	public void setPoint(PlayerDTO pdto) {
		getConn();
		try {
			String sql = "update PLAYER_TABLE set P_POINT = ? where P_ID = ?";
			pstm = conn.prepareStatement(sql);
			pstm.setInt(1, pdto.getPoint());
			pstm.setString(2, pdto.getId());
			pstm.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		close();
	}
	
	// 랭킹 출력
	public ArrayList<PlayerDTO> getRankedList() {
		ArrayList<PlayerDTO> rankedList = new ArrayList<PlayerDTO>();
		getConn();
		try {
			String sql = "select rownum, A.* from (select P_ID, P_NICKNAME, P_POINT from PLAYER_TABLE order by P_POINT DESC) A";
			pstm = conn.prepareStatement(sql);
			rs = pstm.executeQuery();
			while (rs.next()) {
				rankedList.add(new PlayerDTO(rs.getString(2), rs.getString(3), rs.getInt(4)));
			}
		} catch(SQLException e) {
			e.printStackTrace();
		}
		close();
		return rankedList;
	}

	// 연결
	private void getConn() {
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
	private void close() {
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
	
//	// 포인트 받기
//		public int getPoint(String id) {
//			getConn();
//			int point = 0;
//			try {
//				String sql = "select P_Point from PLAYER_TABLE where P_ID = ?";
//				pstm = conn.prepareStatement(sql);
//				pstm.setString(1, id);
//				rs = pstm.executeQuery();
//				while (rs.next()) {
//					point = rs.getInt("P_POINT");
//				}
//			} catch (SQLException e) {
//				e.printStackTrace();
//			}
//			close();
//			return point;
//		}
	
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
