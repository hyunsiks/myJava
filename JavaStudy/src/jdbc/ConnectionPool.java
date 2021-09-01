package jdbc;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

public class ConnectionPool {

	/*
		# ConnectionPool?
			- DB�� DML�� �����Ҷ����� ���ο� ������ �����ϴ� ���� ���ҽ��� ���� ����ȴ�
			  ���� ������ �̸� ������ �����صΰ�, ��������� ���� Ŀ�ؼ��� �����ִ� �����
			  Ŀ�ؼ� Ǯ�̶�� �Ѵ�
			  
			- Ŀ�ؼ�Ǯ������ ����Ŭ���� �ϸ� �ȵȴ�
	 */
	List<JdbcConnection> pool;
	
	
	public ConnectionPool(int size) {
		pool = new ArrayList<>(size);
		
		for(int i = 0; i < size; i++) {
			pool.add(new JdbcConnection());
		}
	}
	
	public JdbcConnection getConnection() {
		
		for(JdbcConnection jconn : pool) {
			if(!jconn.using()) {
				return jconn;
			}
		}
		return null;
	}
	
	//inner class���
	class JdbcConnection implements AutoCloseable{
		private Connection conn;
		private boolean using;
		
		public JdbcConnection() {
			conn = DBConnector.getConnection();
		}
		
		public boolean using() {
			
			return using;
		}
		
		public Connection use() {
			
			using = true;
			return conn;
		}

		@Override
		public void close() throws Exception {
			
			using = false;
			
		}
		
		
	}
}
