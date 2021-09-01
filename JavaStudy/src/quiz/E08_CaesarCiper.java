package quiz;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Random;

public class E08_CaesarCiper {

	/*
		# 암호화
			- 평문을 알아볼수 없는 형태로 변환하는 것
			- 전달 과정에서 내용을 누가 훔쳐가더라도 알아볼 수 없게 하는 것이 목적이다

		# 복호화
			- 암호화 된 암호문을 다시 평문으로 되돌리는 것
			
		# 키
			- 암호화 또는 복호화에 사용되는 값
			
		# 시저 암호
		"Hello, world!" ------ key : 5 ------> "Mjqqt, btwqi!"
		
		ABCDEFGHIJKLMNOPQRSTUVWXYZ
		
		암호화 : key만큼 오른쪽으로 문자를 이동 시킴
		복호화 : key만큼 왼쪽으로 문자를 이동 시킴
		
		# "frankenstein.txt"를 1~25사이의 랜덤 키로 암호화한
		  "frankenstein.encrypted.txt"를 생성해보세요
		  (단, 알파벳만 암호화 할 것)
	 */
	
	public static void main(String[] args) {
		
		File frank = new File("./data/text/frankenstein.txt");
		StringBuilder sb = new StringBuilder();
		Random ran = new Random();
//		int key = ran.nextInt(25) + 1;
		int key = 2;
		int decryptionKey = 0;
		String c = null;
		
		try (FileReader in = new FileReader(frank, Charset.forName("UTF-8"))) {
			
            int len = -1;
      
            while ((len = in.read()) != -1) {
            	
            	if(('a' <= (char)len && (char)len <= 'z') || ('A' <= (char)len && (char)len <= 'Z')) {
            		//Character.isAlphabetic((char)len) : 알파벳인지 검사
            		
            		
            		
            		if(('a' < (char)len && (char)len <= 'z') && (char)len + key > 'z') {
            			
            			sb.append((char)('a' + (((char)len + key) - 'z') - 1));
            		}else if(('A' < (char)len && (char)len <= 'Z') && (char)len + key > 'Z') {
            			sb.append((char)('A' + (((char)len + key) - 'Z') - 1));
            		}else {
               			sb.append((char)(len + key));
            		}
            		
            	}else {
            		
            		sb.append((char)len);
            	}
            	
            }
            
		}catch (IOException e) {                        
            e.printStackTrace();
		}
		
		System.out.println(sb);
//		sb.insert(sb.length(), c);
//		System.out.println(c);
		File frank2 = new File("./data/text/frankenstein.encrypted.txt");
		try (FileWriter fw = new FileWriter(frank2, Charset.forName("UTF-8"))) {
			
			fw.append(sb);
            fw.close();
            
		}catch (IOException e) {                        
            e.printStackTrace();
		}
		decryptionKey = key;
		System.out.printf("키값 : %+d", key);
		
		decryption(decryptionKey);
		System.out.printf("키값 : %+d", key);
		
	}
	
	static void decryption(int key) {
		File frank3 = new File("./data/text/frankenstein.encrypted.txt");
		StringBuilder sb = new StringBuilder();
		
		try (FileReader in = new FileReader(frank3, Charset.forName("UTF-8"))) {
			
            int len = -1;
      
            while ((len = in.read()) != -1) {
            
            	if(('a' <= (char)len && (char)len <= 'z') || ('A' <= (char)len && (char)len <= 'Z')) {
        
            		if(('a' < (char)len && (char)len <= 'z') && (char)len - key < 'a') {
            			sb.append((char)('z' - ('a' - ((char)len - key) + 1)));
            		}else if(('A' < (char)len && (char)len <= 'Z') && (char)len + key > 'Z') {
            			sb.append((char)('Z' - ('A' - ((char)len - key) + 1)));
            		}else {
               			sb.append((char)(len - key));
            		}
            		
            	}else {
            		
            		sb.append((char)len);
            	}
            	
            }
            
		}catch (IOException e) {                        
            e.printStackTrace();
		}
		System.out.println("===================== 복호화 시작 ==============================");
		System.out.println(sb);
		System.out.println("복호화완료");
		System.out.println("복호화 키 : " + key);
	}
}
