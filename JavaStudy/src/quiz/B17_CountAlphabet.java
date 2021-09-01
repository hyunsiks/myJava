package quiz;

import java.util.Scanner;

public class B17_CountAlphabet {

	public static void main(String[] args) {
		
		/*
		 사용자로 부터 문장을 하나 입력받고 
		 해당 문장에 어떤 알파벳이 몇 번 등장했는지 세어서 모두 출력해보세요
		 (대소문자 구분없이 셀 것)
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("문장을 입력하세요 : ");
		String sentence = sc.next();
		int[] alphabet = new int[26];
		
		
//		
//		for(int i = 0; i < 26; i++) {
//			for(int k = 0; k < sentence.length(); k++) {
//				if(sentence.charAt(k) == (char)('a' + i) || sentence.charAt(k) == (char)('A' + i)) {
//					alphabet[i] += 1;
//				}
//			}
//		}
//		for(int j = 0; j < 26; j++) {
//			
//			System.out.printf("%s또는 %s의 갯수는 %d 입니다\n",(char)('a'+ j),(char)('A' + j) ,alphabet[j]);
//			
//		}
//		-----------------------------------------------------------------------------------------
		
		for(int i = 0; i < sentence.length(); i++) {
			for(int j = 0; j < 26; j++) {
				if(sentence.charAt(i) == (char)('a' + j) || sentence.charAt(i) == (char)('A' + j)) {
					alphabet[j] += 1;
					break;
				}else {
					continue;
				}
			}
		}
		for(int j = 0; j < 26; j++) {
		
			System.out.printf("%s또는 %s의 갯수는 %d 입니다\n",(char)('a'+ j),(char)('A' + j) ,alphabet[j]);
		
		}
	}

}
