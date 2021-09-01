import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class E03_FileIO {

	/*
		# Stream
		  - 데이터들이 오가는 통로
		  - 프로그램으로 들어올 때 사용하는 통로를 InputStream이라고 한다
		  - 프로그램에서 처리된 후 나갈 때 사용하는 통로를 OutputStream이라고 한다
		
		# InputStream의 공통 메서드
		  - read() : 스트림으로 부터 다음의 한 바이트를 읽어온다. EOF에 도달하면 -1을 반환(EOF : END OF FILE , 더이상읽을수없을때까지)
		  - read(byte[]) : byte[]을 만들어서 전달하면 거기에 담아준다
		  - read(byte[], off, len) : byte[]을 만들어서 전달하되 원하는 만큼 원하는 위치에 읽는다
		  - close() : 다 사용한 스트림을 닫는다. 닫지않으면 계속 메모리를 차지하고 있게된다
		# OutputStream의 공통 메서드
		  - write(int) : 한 글자씩 쓴다
		  - write(byte[]) : byte[]에 담긴 내용을 한번에 쓴다
		  - flush() : write로 모아놓은 내용들을 모두 내보낸다
		  - close() : 다 사용한 스트림을 닫는다. 닫지않으면 계쏙 메모리를 차지하고 있게된다
		  			  close()할 때 남은 데이터가 있다면 flush() 된다
		
	 */	
	public static void main(String[] args) {
		
		File git = new File("./note/01_Git");
		
		try {
			FileInputStream fin = new FileInputStream(git);
			// ※ 원하는 바이트씩 읽기
//			byte[] buffer = new byte[100];
//			
//			int len;
//			while((len = fin.read(buffer)) != -1) {
//				System.out.println(new String(buffer, 0, len));
//			}
			
			//안녕하세요 반갑습니다!!
			//안녕하
			//세요^
			//반갑습
			//니다!
			//!
			
			// ※ 1바이트씩 읽기
//			int _byte = 0;
//			while((_byte = fin.read()) != -1) { //EOF 가 되면 -1이 되기때문에 끝까지 하겠다는것
//												//fin.read() 는 쓰자마자 바로 출력되기때문에 while문 안에 넣어두면안된다
//				System.out.print((char)_byte);
//				
//			}
			fin.close();
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		System.out.println(git.exists());
		
		//--------------------------------------------------
		
		File newFile = new File("./note/my first file output.txt");
		try {
			
			FileOutputStream fout = new FileOutputStream(newFile);
			
			//1. int를 사용하는 방식
			fout.write(65); //a가 써짐
			fout.write(66); //b가 써짐
			fout.write('\n');
			
			//2. byte[]를 이용하는 방식
			fout.write("안녕하세요!\n".getBytes());
			fout.close();
			
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}














