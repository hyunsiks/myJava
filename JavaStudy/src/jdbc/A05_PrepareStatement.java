package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class A05_PrepareStatement {

	public static void main(String[] args) {
		
		// 사용자로부터 2개의 값을 입력받아 INSERT한다고 가정
		String fname = "Pair";
		String fcolor = "GREEN";
		
		//이런식으로 쓰면 보안 취약점이 생김(SQL Injection)
		//String sql = "INSERT INTO fruits VALUES(fruit_seq.nextval, " + fname + "," + fcolor + ")";
		
		//따라서 PreapareStatement에 준비시킬 쿼리문에 변수가 필요하다면 변수자리는 ?로 채운다
		String sql = "INSERT INTO fruits VALUES(50, ?, ?)";
		
		ConnectionPool pool = new ConnectionPool(10);
		
		try(
			Connection conn = pool.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql);
		){
			//다음과 같이 string의 ?를 채울수 있다
			pstmt.setString(1, fname);
			pstmt.setString(2, fcolor);
			
			//실행
			pstmt.executeUpdate();
			System.out.println(pstmt.getUpdateCount());
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
