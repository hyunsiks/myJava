package quiz;

import java.util.Scanner;

public class B11_Reverse {

	public static void main(String[] args) {
		
		/*
		  사용자가 문장을 입력하면 그 문장을 거꾸로 출력해보세요
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("문장을 입력하세요 : ");
		String word = sc.nextLine();
		
		for(int i = 0; i < word.length(); i++) {
			char ch = word.charAt(word.length() - i -1);
			System.out.print(ch);
		}

	}

}
