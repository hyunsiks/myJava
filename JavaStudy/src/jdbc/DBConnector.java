package jdbc;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBConnector {
	/*
		# DB연결을 위한 클래스
	 */
	static {
		File jdbcs = new File("./trash/jdbcs.txt");
		try (
				FileInputStream fin = new FileInputStream(jdbcs);
				InputStreamReader isr = new InputStreamReader(fin);
		){
			
			int ch;
			String str = "";
			while((ch = isr.read()) != -1) {
				str += (char)ch;
			}
			String[] strArr = str.split("\n");
			driverName = strArr[0].trim();
			url = strArr[1].trim();
			id = strArr[2].trim();
			password = strArr[3].trim();
			
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	static String driverName;
	static String url;
	static String id;
	static String password;
	
	static {
	
		try {
			Class.forName(driverName);
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		System.out.println("드라이버로드완료");
	}
	
	public static Connection getConnection() {
		try{
			return DriverManager.getConnection(url, id, password);
		}catch(SQLException e) {
			return null;
		}
	}
	
	public static void main(String[] args) {
		
		
		Connection conn = DBConnector.getConnection();
		
		if(conn != null) {
			System.out.println("정답!");
		}else {
			System.out.println("오답!");
		}
		
	}

}
