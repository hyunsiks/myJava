package quiz;

import java.util.Scanner;

public class B11_is_numeric_str {

	public static void main(String[] args) {
		
		/*
		  �Է� ���� ���ڿ��� ���ڸ� ���ԵǾ� ������ result�� 1�� ���
		  �ٸ� ���ڰ� ���ԵǾ� ������ result�� 0�� ���
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���ڿ��� �Է��ϼ��� : ");
		String word = sc.next();
		
		int result = 1;
		
		for(int i = 0; i < word.length(); i++) {
//			if((int)word.charAt(i) < 48 || (int)word.charAt(i) > 57) { 
				
			if(word.charAt(i) < '0' || word.charAt(i) > '9') {	
			result = 0;					
			}
			
		}
		System.out.println(result);
		
	
	}

}
