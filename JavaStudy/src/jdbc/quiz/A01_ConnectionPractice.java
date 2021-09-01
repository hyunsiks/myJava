package jdbc.quiz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class A01_ConnectionPractice {

	/*
		����ڷκ��� �μ���ȣ�� �Է¹�����
		�ش� �μ��� ��� ������� ��� ������ ��ȸ�ؼ� �ֿܼ� �������� ����غ�����
	 */
	public static void main(String[] args) {
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("db���Ἲ��");
			
			
			Connection conn;
			try {
				conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/XEPDB1", "hr", "1234");
				
				PreparedStatement pstmt = conn.prepareStatement("select * from employees");
//				PreparedStatement pstmt = conn.prepareStatement("DESC employees");
				
				ResultSet rs = pstmt.executeQuery();
		
				ResultSetMetaData rsmd = rs.getMetaData();
				int columnCnt = rsmd.getColumnCount();
				
				if(rs.next()) { //��ü �÷��� Ȯ���ϱ�
					for(int i = 1; i < columnCnt; i++) {
						System.out.println(rsmd.getColumnName(i));
					}
				}
				
				while(rs.next()) {
					String firstName = rs.getString("FIRST_NAME");
					if(firstName.length() < 8) {
						firstName += "\t";
					}
					String lastName = rs.getString("LAST_NAME");
					if(lastName.length() < 7) {
						lastName += "\t";
					}
					String email = rs.getString("EMAIL");
					if(email.length() < 8) {
						email += "\t";
					}
					String phoneNumber = rs.getString("PHONE_NUMBER");
					String hireDate = rs.getString("HIRE_DATE");
					String  jobID = rs.getString("JOB_ID");
					String  salary = rs.getString("SALARY");
					String  commission = rs.getString("COMMISSION_PCT");
					String  manager = rs.getString("MANAGER_ID");
					
					System.out.printf("%s\t/%s\t/%s\t\t/%s\t\t/%s\t\t/%s\t\t/%s\t\t/%s\t\t/%s\n",
							firstName, lastName, email, phoneNumber, hireDate, jobID, salary, commission, manager);
					}
				
	//			while(rs.next()) {
	//				System.out.println(rs.getString("salary"));
	//			}
			
				rs.close();
				pstmt.close();
				conn.close();
			
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		}
	}
	
}
