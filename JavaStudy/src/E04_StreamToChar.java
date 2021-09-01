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
		
		  - InputStream�� OutputStream�� �����͸� ����Ʈ ������ �а� ����
		  - ����Ʈ ������ �����͸� ����ϱ� ������ ���ϴ� Ÿ�������� �籸���� �ʿ��ϴ�
		  - Reader�� Writer�� �����͸� ���� ������ �а� ���� Ŭ�������̴�
		  - InputSteam/OutputStream�� Reader/Writer�� �ѹ� �� ���μ� ����Ѵ�
		  
		# abstract class Reader
		
		  - BufferedReader, InputStreamReader, FileReader ... ����
		    ��� Reader Ŭ������ ��ӹ޾� ������ Ŭ�������̴�
		  - Stream���� ���� �����͸� ���ڷ� �籸���Ͽ� ���α׷��Ӱ� ����ϱ� ���ϰ� ���ش�
		  - ���ڷ� ��ġ�ų� ����Ʈ�� ��ȯ�� �� ����� ���ڵ� Ÿ���� ������ �� �ִ�
	 */
	
	public static void main(String[] args) {
		
//		System.out.println(Charset.availableCharsets()); //������ ĳ����Ÿ�Ժ�����

		//Reader ����
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
		
		//Writer ���� (FileWriter)
		try {
			FileWriter fw = new FileWriter(
					new File("./trash/write by Filewriter.py"), 
					Charset.forName("UTF-8"));
			
			fw.append("Hello FileWriter!");
			
			fw.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		//Writer ���� (OutputStreamWriter)
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










