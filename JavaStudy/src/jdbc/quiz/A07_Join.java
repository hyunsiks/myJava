package jdbc.quiz;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.text.View;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

import jdbc.model.View1;

public class A07_Join {

	public static void main(String[] args) {
		
		// 이름에 en이 들어가는 모든 사원의 이름/부서번호/부서명/도시를 조회해보세요
		// 모델 View1 클래스를 이용해 저장한 후 출력해보세요
		
		HikariConfig config = new HikariConfig("./trash/hikari.properties");
		HikariDataSource ds = new HikariDataSource(config);
		
		String name = "en";
		String sql = "SELECT first_name, department_id, department_name, city"
				+ " FROM employees INNER JOIN departments using(department_id) INNER JOIN locations using(location_id)"
				+ " WHERE first_name LIKE ?";
		ArrayList<View1> v1Arr = null;
		
		try(
				Connection conn = ds.getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql);
		){
			pstmt.setString(1,String.format("%%%s%%", name));
			
			ResultSet rs = pstmt.executeQuery();
			
			v1Arr = new ArrayList<>();
			
			while(rs.next()) {
			
				v1Arr.add(new View1(
						rs.getString("first_name"),
						rs.getInt("department_id"),
						rs.getString("department_name"),
						rs.getString("city")));
						
			}
			
			rs.close();
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		System.out.println(v1Arr);
	}
}
