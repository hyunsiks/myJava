package jdbc.quiz;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import jdbc.DBConnector;

public class A05_SearchKeyword {

	/*
		# first_name�� ����ڰ� �Է��� ������ ���ԵǾ��ִ� ��� ����� ��ȸ�غ�����
		  (��, �˻���� �� ���� �̻��̾���ϰ�, �� ���� �̻��� �ƴ϶�� ���ܰ� �߻��ؾ���)
	 */
	
	
	public static void main(String[] args) {
		
		String sql = "SELECT * FROM employees WHERE first_name LIKE ?";
		Scanner sc = new Scanner(System.in);
		String name;
		
		while(true) {
			
			System.out.print("ã����� �̸��� �������� : ");
			name = sc.next();
			if(name.length() < 2) {
				System.out.println("2���� �̻����� �ٽ� ��������");
				continue;
			}else {
				System.out.println("���������� �Է��ϼ̽��ϴ�");
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
			
			ResultSet rs = pstmt.executeQuery(); //�̰��� �ϼ��� ������ db�� ������ ��ɾ�� ������ setString���� �ڿ��־����
			
			while(rs.next()) {
			System.out.println(rs.getString("first_name"));
			}
			
			rs.close();
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
}
