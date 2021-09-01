package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

public class A06_HikariCp {

	
	public static void main(String[] args) {
		/*
			��ī�� ���̺귯�� �ٿ�ε�
				1. ���ۿ� hikaricp �˻�
				2. hikaricp ����� ����
				3. �Ʒ��� ������ download from here Ŭ���ؼ� �ٿ�޴´�
		 
			��ī�� ���̺귯���� - Ŭ����path���ٰ� �־���Ѵ� (jdbc �ִ°��� ���path�� ������, ��ī���� Ŭ����path�� �־����)
			slf4j - �α׸� ��� �뵵�� ����ϴ� �α� ���̺귯��
			��ī���� �������ؼ��� slf4j�� �־���
		 */
		
		
		HikariConfig config = new HikariConfig();
		
		config.setJdbcUrl("jdbc:oracle:thin:@localhost:1521/XEPDB1");
		config.setUsername("hr");
		config.setPassword("1234");
		config.addDataSourceProperty("cachePrepStmts", "true");
		config.addDataSourceProperty("prepStmtCacheSize", "250");
		config.addDataSourceProperty("prepStmtCacheSqlLimit", "2048");

		HikariDataSource ds = new HikariDataSource(config);
		
		String sql = "SELECT * FROM employees";
		
		try(
				Connection conn = ds.getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql);
				ResultSet rs = pstmt.executeQuery();
		){
			while(rs.next()) {
				System.out.println(rs.getString(2));
			}
			
		ds.close();
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}

}
