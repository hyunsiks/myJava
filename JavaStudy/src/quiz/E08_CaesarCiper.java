package quiz;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Random;

public class E08_CaesarCiper {

	/*
		# ��ȣȭ
			- ���� �˾ƺ��� ���� ���·� ��ȯ�ϴ� ��
			- ���� �������� ������ ���� ���İ����� �˾ƺ� �� ���� �ϴ� ���� �����̴�

		# ��ȣȭ
			- ��ȣȭ �� ��ȣ���� �ٽ� ������ �ǵ����� ��
			
		# Ű
			- ��ȣȭ �Ǵ� ��ȣȭ�� ���Ǵ� ��
			
		# ���� ��ȣ
		"Hello, world!" ------ key : 5 ------> "Mjqqt, btwqi!"
		
		ABCDEFGHIJKLMNOPQRSTUVWXYZ
		
		��ȣȭ : key��ŭ ���������� ���ڸ� �̵� ��Ŵ
		��ȣȭ : key��ŭ �������� ���ڸ� �̵� ��Ŵ
		
		# "frankenstein.txt"�� 1~25������ ���� Ű�� ��ȣȭ��
		  "frankenstein.encrypted.txt"�� �����غ�����
		  (��, ���ĺ��� ��ȣȭ �� ��)
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
            		//Character.isAlphabetic((char)len) : ���ĺ����� �˻�
            		
            		
            		
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
		System.out.printf("Ű�� : %+d", key);
		
		decryption(decryptionKey);
		System.out.printf("Ű�� : %+d", key);
		
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
		System.out.println("===================== ��ȣȭ ���� ==============================");
		System.out.println(sb);
		System.out.println("��ȣȭ�Ϸ�");
		System.out.println("��ȣȭ Ű : " + key);
	}
}
