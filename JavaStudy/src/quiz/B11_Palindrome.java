package quiz;

import java.util.Scanner;

public class B11_Palindrome {

	public static void main(String[] args) {
		
		/*
		  사용자로부터 단어를 하나 입력받고
		  해당 단어가 회문이라면 "PALINDROME" 을 출력
		  회문이 아니라면 "NOT PALINDROME" 을 출력해보세요
		  (※회문? MOM,BOB,ABBA,MADAM 처럼 좌우 대칭인 단어)		  
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("단어를 입력하세요 : ");
		String word = sc.next();
		/*
		String result = "PALINDROME";
		
		int length = word.length() - 1;

		for(int i = 0; i < (word.length() / 2); i++) {				
			for(int j = length; length >= (word.length() / 2); ) {
				if(word.charAt(i) != word.charAt(j)){
					result = "NOT PALINDROME";
					length--;
					break;
					
				}else {
					length--;
					break;
				}
			}			
		}
		System.out.println("결과는 : " + result);
		*/
		
//		---------------------------------------------------
//		강사님풀이
		String result = "PALINDROME";
		for(int i = 0; i < word.length() / 2; ++i) {
			char ch = word.charAt(i);
			char ch2 = word.charAt(word.length() - i -1);

			if(ch != ch2) {
				result = "NOT PALINDROME";
				break;
			}
		}
		System.out.printf("[%s]의 결과는 %s입니다. \n", word, result);

	}

}
