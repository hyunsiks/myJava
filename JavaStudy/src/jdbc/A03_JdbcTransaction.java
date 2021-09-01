package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class A03_JdbcTransaction {

	public static void main(String[] args) {
	
		String sql = "UPDATE fruits SET fcolor = 'RED' WHERE fname = 'Orange'";
		
		try(
				Connection conn = DBConnector.getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql);
		){
			//JDBC�� ó�� ������ �����ϸ� �⺻������ AutoCommit�� Ȱ��ȭ �Ǿ��ִ�.
			//Ʈ�������� ���� �����ϱ� ���ؼ��� �ڵ� Ŀ���� ��Ȱ��ȭ �ؾ��Ѵ�
			conn.setAutoCommit(false); //�̰��� ����ؾ� commit()�� rollback()���� �Ⱦ��� �ڵ� commit
			
			int rows = pstmt.executeUpdate();
			
			System.out.println(rows + " ���� ������Ʈ�Ǿ����ϴ�");
			
			//commit(), rollback()�� �� ���� �ִ�
			conn.rollback();
			System.out.println("�ѹ��������� ��ҵǾ����ϴ�");
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		
	}

}
