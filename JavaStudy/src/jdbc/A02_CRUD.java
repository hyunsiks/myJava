package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class A02_CRUD {

	public static void main(String[] args) {
		/*
			# JDBC���� SELECT�� ResultSet�� ��ȯ�Ѵ�.
			  �� ���� DML(UPDATE,INSERT,DELETE)�� ����� ���� ������ ��ȯ�Ѵ�
			  
			# SELECT�� PreparedStatement�� executeQuery() �޼��带 ����ϰ�
			  �������� executeUpdate() �޼��带 �����
		 */
		String sql = "INSERT INTO fruits(fid, fname, fcolor) "
				+ "VALUES(4, 'Orange', 'RED')";
		String sql1 = "SELECT * FROM fruits";
		try (
				Connection conn = DBConnector.getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql);
				PreparedStatement pstmt2 = conn.prepareStatement(sql1);
		){
			//INSERT,DELETE,UPDATE �ÿ��� executeUpdate(); ���
			int rows = pstmt.executeUpdate();
			
			System.out.println(rows + " rows update");
			String sql2;
			for(int i = 5; i < 15; i++) {
				sql2 = "INSERT INTO fruits(fid, fname, fcolor) "
						+ "VALUES(" + i + ", 'Orange', 'RED')";
				System.out.println(sql2);
				
				
					PreparedStatement pstmt3 = conn.prepareStatement(sql2);
					int rows2 = pstmt3.executeUpdate();  // executeUpdate() ��� �޼ҵ带 ����ؾ� Ŀ�Ե�
					System.out.println(rows + "rows update");
					pstmt3.close();
				}
			
			
		
			// SELECT
			ResultSet rs = pstmt2.executeQuery();
			
			while(rs.next()) {
				System.out.printf("%d\t%s\t%s\n",
						rs.getInt(1), rs.getString(2), rs.getString(3));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
