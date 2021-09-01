package jdbc.quiz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class A01_ConnectionPractice {

	/*
		사용자로부터 부서번호를 입력받으면
		해당 부서의 모든 사원들의 모든 정보를 조회해서 콘솔에 보기좋게 출력해보세요
	 */
	public static void main(String[] args) {
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("db연결성공");
			
			
			Connection conn;
			try {
				conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/XEPDB1", "hr", "1234");
				
				PreparedStatement pstmt = conn.prepareStatement("select * from employees");
//				PreparedStatement pstmt = conn.prepareStatement("DESC employees");
				
				ResultSet rs = pstmt.executeQuery();
		
				ResultSetMetaData rsmd = rs.getMetaData();
				int columnCnt = rsmd.getColumnCount();
				
				if(rs.next()) { //전체 컬럼명 확인하기
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
