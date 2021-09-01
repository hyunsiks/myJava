package jdbc;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

public class ConnectionPool {

	/*
		# ConnectionPool?
			- DB에 DML을 적용할때마다 새로운 접속을 생성하는 것은 리소스가 많이 낭비된다
			  따라서 연결을 미리 여러개 생성해두고, 사용중이지 않은 커넥션을 꺼내주는 방식을
			  커넥션 풀이라고 한다
			  
			- 커넥션풀에서는 오토클로즈 하면 안된다
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
	
	//inner class사용
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
