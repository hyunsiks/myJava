package ������;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

public class JDBC���� {

	/*
	 	# ���̺귯�� ���Թ��
		1. PROJECT(JavaStudy) ��Ŭ��
		2. Build Path
		3. Configure Build Path
		4. Libraries
		5. Add External JARs...
		6. (MODULE PATH��) OJDBC ��ġ�� ���� ã�Ƽ� ����
		
		//���޼ҵ�
		 
			//1. Class.forName(drivername)���� �ش� DB���� JDBC����̹��� �ε��Ѵ�
			Class.forName("oracle.jdbc.driver.OracleDriver"); //Ŭ���� �̸��� �־ Ŭ������ �ִ��� Ȯ�� �� �ε�
	
			//2. DriverManager Ŭ������ ���� DB���� ������ �����Ѵ�
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/XEPDB1", "hr", "1234");
				
			//3. ������ ������ ���� ������ �������� �����Ѵ�
			PreparedStatement pstmt = conn.prepareStatement("SELECT * FROM employees");
			
			//4. ������ �������� DB�� ������
			ResultSet rs = pstmt.executeQuery();
			
			//5. �޾ƿ� ����� ������� ����Ѵ�
			while(rs.next()) {
				System.out.println(rs.getString("first_name") + "/" + rs.getString("salary"));
			}
			
			//6. �� ������ ������ �� �����ش�(���� ���߿� ������ �������)
			rs.close();
			pstmt.close();
			conn.close();
	 */
	/*
	 	# DB�� �÷����� JDBC�� Ȯ���ϱ� (ResultSetMetaData �̿�)
			ResultSetMetaData rsmd = rs.getMetaData();
			int columnCnt = rsmd.getColumnCount();
			
			if(rs.next()) { //��ü �÷��� Ȯ���ϱ�
				for(int i = 1; i < columnCnt; i++) {
					System.out.println(rsmd.getColumnName(i));
				}
			}
	 */
}
