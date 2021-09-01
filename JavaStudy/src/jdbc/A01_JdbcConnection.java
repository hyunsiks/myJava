package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class A01_JdbcConnection {

/*
	# JDBC
		- Java DataBase Connectivity
		- DB�� �������� �����Ͽ� �����ϰ� ����� �޾ƿ��� Java API(�ڹٿ����̸� �������ٴ°�)
		- � DB�͵� ȣȯ�� �� �ֵ��� ����Ǿ��ִ�
		- Java �κ��� �ҽ��� � DB�� ����ϴ��� �׻� �����ϴ�
		- DB�� ������ �ʿ��� JDBC���� �䱸�ϴ� ���Ŀ� ���߾� �����ϱ� ������ 
		  ���α׷��ӵ��� ���ο� DB�� ������ JDBC�� ���ϰ� ����� �� �ִ�
		  
	# OJDBC
		- ����Ŭ �����ͺ��̽��� JDBC API�� �����ϱ� ���� ���� ���̺귯��
		- ����Ŭ DB�� ��ġ�� ������ ���ԵǾ� �ִ�
		
	# ���̺귯�� ���Թ��
		1. PROJECT(JavaStudy) ��Ŭ��
		2. Build Path
		3. Configure Build Path
		4. Libraries
		5. Add External JARs...
		6. (MODULE PATH��) OJDBC ��ġ�� ���� ã�Ƽ� ����
		
	# �߿�! � ȸ�� DB�� ����ϴ��� ���ľ� �ϴ� �Ȱ��� ������
		1. Class.forName(drivername)���� �ش� DB���� JDBC����̹��� �ε��Ѵ�  
	
 */
	public static void main(String[] args) {
	
		try {
			//1. Class.forName(drivername)���� �ش� DB���� JDBC����̹��� �ε��Ѵ� (�ڹ� ������ ���׷��̵� �Ǹ鼭 ������ ��������)
			Class.forName("oracle.jdbc.driver.OracleDriver"); //Ŭ���� �̸��� �־ Ŭ������ �ִ��� Ȯ�� �� �ε�
			System.out.println("OracleDriver�� ������");
			
			Class.forName("jdbc.A01_JdbcConnection");
			System.out.println("��� ���� Ŭ������ ������.");
			
			//2. DriverManager Ŭ������ ���� DB���� ������ �����Ѵ�
			try {
				Connection conn = DriverManager.getConnection(
						"jdbc:oracle:thin:@localhost:1521/XEPDB1", "hr", "1234");
			System.out.println("���� ������");
			
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
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		
	}
	
	
}

