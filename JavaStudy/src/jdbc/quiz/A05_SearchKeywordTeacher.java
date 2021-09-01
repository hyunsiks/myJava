package jdbc.quiz;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import jdbc.DBConnector;

public class A05_SearchKeywordTeacher {

	public static void main(String[] args) {
		
		String keyword = "An";
		String sql = "SELECT * FROM employees WHERE first_name LIKE ?";
		
		try(
				Connection conn = DBConnector.getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql);
		){
			pstmt.setString(1, String.format("%%%s%%", keyword));
			//pstmt.setString(1, "%" + keyword "%");
			
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()) {
				System.out.printf("%-10d%-15s%-15s%-10d\n", 
						rs.getInt("employee_id"),
						rs.getString("first_name"),
						rs.getString("last_name"),
						rs.getInt("salary"));
			}
			
			rs.close();
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
	}

}
