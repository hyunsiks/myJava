package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class A05_PrepareStatement {

	public static void main(String[] args) {
		
		// ����ڷκ��� 2���� ���� �Է¹޾� INSERT�Ѵٰ� ����
		String fname = "Pair";
		String fcolor = "GREEN";
		
		//�̷������� ���� ���� ������� ����(SQL Injection)
		//String sql = "INSERT INTO fruits VALUES(fruit_seq.nextval, " + fname + "," + fcolor + ")";
		
		//���� PreapareStatement�� �غ��ų �������� ������ �ʿ��ϴٸ� �����ڸ��� ?�� ä���
		String sql = "INSERT INTO fruits VALUES(50, ?, ?)";
		
		ConnectionPool pool = new ConnectionPool(10);
		
		try(
			Connection conn = pool.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql);
		){
			//������ ���� string�� ?�� ä��� �ִ�
			pstmt.setString(1, fname);
			pstmt.setString(2, fcolor);
			
			//����
			pstmt.executeUpdate();
			System.out.println(pstmt.getUpdateCount());
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
