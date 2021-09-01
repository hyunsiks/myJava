package 연습장;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class 파일쓸때덮어쓰기 {

	//FileOutputStream(fn, true); 이어씀
	//FileOutputStream(fn); 덮어써버림
	
	public static void main(String[] args) {
		
		File fn = new File("a.txt");
		try {
			
			FileOutputStream fin = new FileOutputStream(fn, true); //Output에 true를 사용하여 쓰면 이어쓰기가 되고 true없이 fn 만쓰면 덮어쓰기됨
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
