package 연습장;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

public class JDBC사용법 {

	/*
	 	# 라이브러리 포함방법
		1. PROJECT(JavaStudy) 우클릭
		2. Build Path
		3. Configure Build Path
		4. Libraries
		5. Add External JARs...
		6. (MODULE PATH에) OJDBC 설치된 폴더 찾아서 포함
		
		//사용메소드
		 
			//1. Class.forName(drivername)으로 해당 DB사의 JDBC드라이버를 로드한다
			Class.forName("oracle.jdbc.driver.OracleDriver"); //클래스 이름을 넣어서 클래스가 있는지 확인 및 로드
	
			//2. DriverManager 클래스를 통해 DB와의 연결을 생성한다
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/XEPDB1", "hr", "1234");
				
			//3. 생성된 연결을 통해 전송할 쿼리문을 생성한다
			PreparedStatement pstmt = conn.prepareStatement("SELECT * FROM employees");
			
			//4. 생선된 쿼리문을 DB로 보낸다
			ResultSet rs = pstmt.executeQuery();
			
			//5. 받아온 결과를 마음대로 사용한다
			while(rs.next()) {
				System.out.println(rs.getString("first_name") + "/" + rs.getString("salary"));
			}
			
			//6. 다 썻으면 연결을 잘 끊어준다(가장 나중에 열었던 순서대로)
			rs.close();
			pstmt.close();
			conn.close();
	 */
	/*
	 	# DB의 컬럼명을 JDBC로 확인하기 (ResultSetMetaData 이용)
			ResultSetMetaData rsmd = rs.getMetaData();
			int columnCnt = rsmd.getColumnCount();
			
			if(rs.next()) { //전체 컬럼명 확인하기
				for(int i = 1; i < columnCnt; i++) {
					System.out.println(rsmd.getColumnName(i));
				}
			}
	 */
}
