package quiz;

import java.util.Scanner;

public class B11_is_contain_alpha {

	public static void main(String[] args) {
		
		/*
		 사용자가 입력한 문자열에 알파벳이 
		 포합되어 있으면 true를 출력, 없으면 false를 출력
		 */

		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열을 입력하세요 : ");
		String word = sc.nextLine();
		boolean exist = false;
		
		for(int i = 0; i < word.length(); i++) {
			if((word.charAt(i) > 'a' && word.charAt(i) < 'z') || (word.charAt(i) > 'A' && word.charAt(i) < 'Z')) {
				exist = true;
				break; //하나만 찾고나면 더이상 반복문을 진행할 이유가 없음
			}
		}
		System.out.println("문자열에 알파벳 포함이 되었는가? : " + exist);
			
		
	}

}
