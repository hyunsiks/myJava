package 연습장;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;

public class 스트림리더사용법 {

	public static void main(String[] args) {
		
		//File fn = new File("./trash/write by Filewriter.py");
		//FileInputStream fis = new FileInputStream(fn);
		//InputStreamReader in = new InputStreamReader(fis, Charset.forName("UTF-8"));
		
		//InputStreamReader in = new InputStreamReader(
		//	new FileInputStream(
		//		new File("./note/01_Git")), Charset.forName("MS949"));
		
		//후자에 적은것은 close를 못해주는 상황이 발생하므로 그다지 좋지 못하다
		
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
