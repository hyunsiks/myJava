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
			
			//meta.getColumnCount(); : �÷��� ���� 
			System.out.println("�÷��� ��ΰ�? " + meta.getColumnCount() + "��");		
			
			//meta.getColumnLabel() : �÷��� �˾ƺ���
			//meta.getColumnTypeName() : �÷� Ÿ�� �˾ƺ���
			int len = meta.getColumnCount();
			for(int i = 1; i <= len; i++) { //DB���� ù���� �÷��� 0�̾ƴϰ� 1�̴�
				System.out.println("------------------------------------------------");
				System.out.println(i + "��° �÷��� �̸���? " + meta.getColumnLabel(i));
				System.out.println(i + "��° �÷��� Ÿ����? " + meta.getColumnTypeName(i));
				System.out.println(i + "��° �÷��� ũ���? " + meta.getPrecision(i));
				
			}
			
			Employee em = new Employee();
			
//			Class<?> employee = Class.forName("jdbc.model.Employee");
//			
//			Method,Field�� import�Ҷ� (java.lang.reflect.Method)
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
