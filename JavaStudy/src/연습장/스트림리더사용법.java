package ������;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;

public class ��Ʈ���������� {

	public static void main(String[] args) {
		
		//File fn = new File("./trash/write by Filewriter.py");
		//FileInputStream fis = new FileInputStream(fn);
		//InputStreamReader in = new InputStreamReader(fis, Charset.forName("UTF-8"));
		
		//InputStreamReader in = new InputStreamReader(
		//	new FileInputStream(
		//		new File("./note/01_Git")), Charset.forName("MS949"));
		
		//���ڿ� �������� close�� �����ִ� ��Ȳ�� �߻��ϹǷ� �״��� ���� ���ϴ�
		
		File fn = new File("./note/01_Git");
		
		try {
			FileInputStream ist = new FileInputStream(fn);
			InputStreamReader in = new InputStreamReader(ist);
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
