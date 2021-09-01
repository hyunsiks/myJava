package quiz;

import java.util.Scanner;

public class B07_CheckWord {

	public static void main(String[] args) {
	
	/*
	 사용자로부터 단어를 하나 입력받고 첫번째 글자와 마지막번째 글자가
	 일치하면 "OK"를 출력 아니라면 "NOT OK"를 출력해보세요
	 */

	Scanner sc = new Scanner(System.in);
	
	System.out.print("글자를 입력하세요 : ");
	
	//next() : 다음 문자열을 받아오기 (공백기준으로 앞에것만 가져옴)
	//nextLine() : 다음 한줄의 문자열을 받아오기 (\n기준으로 앞에것만 가져옴)
	
	String word = sc.nextLine();
	
	int firstWord = word.charAt(0);
	
	int length = word.length();
	
	int lastWord = word.charAt(length - 1);
	
	
	if(firstWord == lastWord) {
		System.out.println("OK");
	}else {
		System.out.println("NOT OK");
	}
	
	}

}
