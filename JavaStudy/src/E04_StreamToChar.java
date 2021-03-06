import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;

public class E04_StreamToChar {

	/*
		# Reader / Writer
		
		  - InputStream과 OutputStream은 데이터를 바이트 단위로 읽고 쓴다
		  - 바이트 단위로 데이터를 사용하기 때문에 원하는 타입으로의 재구성이 필요하다
		  - Reader와 Writer는 데이터를 문자 단위로 읽고 쓰는 클래스들이다
		  - InputSteam/OutputStream을 Reader/Writer로 한번 더 감싸서 사용한다
		  
		# abstract class Reader
		
		  - BufferedReader, InputStreamReader, FileReader ... 등은
		    모두 Reader 클래스를 상속받아 구현한 클래스들이다
		  - Stream으로 읽은 데이터를 문자로 재구성하여 프로그래머가 사용하기 편하게 해준다
		  - 문자로 합치거나 바이트로 변환할 때 사용할 인코딩 타입을 결정할 수 있다
	 */
	
	public static void main(String[] args) {
		
//		System.out.println(Charset.availableCharsets()); //가능한 캐릭터타입보여줌

		//Reader 사용법
		try {			
			InputStreamReader in = new InputStreamReader(
					new FileInputStream(
							new File("./note/01_Git")), Charset.forName("MS949"));
			
			int ch;
			while((ch = in.read()) != -1) {
				System.out.print((char)ch);
			}
			
//			char[] buff = new char[1028];
//			int ch2;
//			while((ch2 = in.read(buff)) != -1) {
//				System.out.println(new String(buff, 0, ch2));
//			}
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		//Writer 사용법 (FileWriter)
		try {
			FileWriter fw = new FileWriter(
					new File("./trash/write by Filewriter.py"), 
					Charset.forName("UTF-8"));
			
			fw.append("Hello FileWriter!");
			
			fw.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		//Writer 사용법 (OutputStreamWriter)
		try {
			OutputStreamWriter out = new OutputStreamWriter(
					new FileOutputStream("./trash/write by OutputStreamwriter.py"), 
					Charset.forName("UTF-8"));
			
			out.append("print('hello, python')\n");
			out.append("if True : \n");
			out.append("\tprint('that\'s true')");
			
			out.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
}










