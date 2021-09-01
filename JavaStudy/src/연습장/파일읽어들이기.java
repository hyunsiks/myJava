package 연습장;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalTime;

public class 파일읽어들이기 {

	public static void main(String[] args) {
		
		File novel = new File("./data/text/frankenstein.txt");
		
		long start = System.currentTimeMillis();
		long end = 0;
		
		try(FileReader in = new FileReader(novel)){
			StringBuilder sb = new StringBuilder();
			int ch = -1;
			while((ch = in.read()) != -1) {
				sb.append((char)ch);
			}
			end = System.currentTimeMillis();
			
//			System.out.println(sb);
			System.out.println("걸린시간 : " + (end - start) + "ms");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		start = System.currentTimeMillis();
		try(FileReader in = new FileReader(novel)){
			StringBuilder sb = new StringBuilder();
			char[] buff = new char[1024];
			int len = -1;
			while((len = in.read(buff)) != -1) {
				sb.append(new String(buff, 0, len));
			}
			end = System.currentTimeMillis();
			
//			System.out.println(sb);
			System.out.println("걸린시간2 : " + (end - start) + "ms");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
