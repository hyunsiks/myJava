package quiz;

import java.util.Scanner;

public class B11_is_numeric_str {

	public static void main(String[] args) {
		
		/*
		  입력 받은 문자열에 숫자만 포함되어 있으면 result가 1을 출력
		  다른 문자가 포함되어 있으면 result가 0을 출력
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("문자열을 입력하세요 : ");
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
