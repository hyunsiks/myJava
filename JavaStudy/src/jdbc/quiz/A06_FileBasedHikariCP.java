package jdbc.quiz;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

public class A06_FileBasedHikariCP {

	//메뉴얼의 File based 방식으로 HikariCP 구동해보기
	
	public static void main(String[] args) {
		
		HikariConfig config = new HikariConfig("./trash/hikari.properties");
		HikariDataSource ds = new HikariDataSource(config);
		
		String sql = "SELECT * FROM employees";
	
		try{
			Connection conn = ds.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			
			System.out.println(ds.getConnection());
//			while(rs.next()) {
//				System.out.println(rs.getString(2));
//			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
}
