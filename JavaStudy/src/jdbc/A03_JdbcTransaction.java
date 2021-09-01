package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class A03_JdbcTransaction {

	public static void main(String[] args) {
	
		String sql = "UPDATE fruits SET fcolor = 'RED' WHERE fname = 'Orange'";
		
		try(
				Connection conn = DBConnector.getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql);
		){
			//JDBC로 처음 연결을 생성하면 기본적으로 AutoCommit이 활성화 되어있다.
			//트랜젝션을 직접 제어하기 위해서는 자동 커밋을 비활성화 해야한다
			conn.setAutoCommit(false); //이것을 사용해야 commit()과 rollback()가능 안쓰면 자동 commit
			
			int rows = pstmt.executeUpdate();
			
			System.out.println(rows + " 행이 업데이트되었습니다");
			
			//commit(), rollback()을 할 수가 있다
			conn.rollback();
			System.out.println("롤백으로인해 취소되었습니다");
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		
	}

}
