package jdbc.quiz;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import jdbc.DBConnector;

public class A05_SearchKeyword {

	/*
		# first_name에 사용자가 입력한 내용이 포함되어있는 모든 사원을 조회해보세요
		  (단, 검색어는 두 글자 이상이어야하고, 두 글자 이상이 아니라면 예외가 발생해야함)
	 */
	
	
	public static void main(String[] args) {
		
		String sql = "SELECT * FROM employees WHERE first_name LIKE ?";
		Scanner sc = new Scanner(System.in);
		String name;
		
		while(true) {
			
			System.out.print("찾고싶은 이름을 적으세요 : ");
			name = sc.next();
			if(name.length() < 2) {
				System.out.println("2글자 이상으로 다시 적으세요");
				continue;
			}else {
				System.out.println("성공적으로 입력하셨습니다");
				break;
			}
		}
		
		
		try(
			Connection conn = A01_ConnectionPracticeTeacher.getConnection("hr", "1234");
			PreparedStatement pstmt =
						conn.prepareStatement(sql);

			
		){
			pstmt.setString(1,String.format("%%%s%%", name));
//			pstmt.setString(1, "%" + name + "%");
			
			ResultSet rs = pstmt.executeQuery(); //이것이 완성된 쿼리를 db로 보내는 명령어기 때무에 setString보다 뒤에있어야함
			
			while(rs.next()) {
			System.out.println(rs.getString("first_name"));
			}
			
			rs.close();
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
}
