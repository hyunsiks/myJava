package jdbc;

import java.lang.reflect.Method;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

import jdbc.model.Employee;

public class A04_DESC {

	/*
		# Metadata
		
			1. Connection conn = DBConnecter.getConnection();
			2. PreparedStatement pstmt = conn.prepareStatement(sql);
			3. ResultSet rs = pstmt.executeQuery();
			4. ResultSetMetaData meta = rs.getMetaData();
	 */
	
	public static void main(String[] args) {
		
		String sql = "SELECT * FROM employees";
		
		try(
			Connection conn = DBConnector.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
		){
			
			ResultSetMetaData meta = rs.getMetaData();
			
			//meta.getColumnCount(); : 컬럼의 개수 
			System.out.println("컬럼이 몇개인가? " + meta.getColumnCount() + "개");		
			
			//meta.getColumnLabel() : 컬럼명 알아보기
			//meta.getColumnTypeName() : 컬럼 타입 알아보기
			int len = meta.getColumnCount();
			for(int i = 1; i <= len; i++) { //DB에서 첫번쨰 컬럼은 0이아니고 1이다
				System.out.println("------------------------------------------------");
				System.out.println(i + "번째 컬럼의 이름은? " + meta.getColumnLabel(i));
				System.out.println(i + "번째 컬럼의 타입은? " + meta.getColumnTypeName(i));
				System.out.println(i + "번째 컬럼의 크기는? " + meta.getPrecision(i));
				
			}
			
			Employee em = new Employee();
			
//			Class<?> employee = Class.forName("jdbc.model.Employee");
//			
//			Method,Field를 import할때 (java.lang.reflect.Method)
//			for(Method method : employee.getMethods()) {
//				
//				System.out.println(method.getReturnType());
//				
//			}
			
			while(rs.next()) {
				
				em.setEmployee_id(rs.getInt("employee_id"));
			
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
}
