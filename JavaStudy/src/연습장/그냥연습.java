package 연습장;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;

public class 그냥연습 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {			
			File fn = new File("./trash/write by Filewriter.py");
			FileInputStream fis = new FileInputStream(fn);
			InputStreamReader in = new InputStreamReader(fis, Charset.forName("UTF-8"));
					
			int ch;
			while((ch = in.read()) != -1) {
				System.out.print((char)ch);
			}
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
