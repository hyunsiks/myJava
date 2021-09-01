package quiz;

import java.util.Scanner;

public class B05_ConditionQuiz2 {

	public static void main(String[] args) {
		
		/*
        [ 알맞은 조건식을 만들어보세요 ]

        1. char형 변수 a가 'q'또는 'Q'일 때 true
        2. char형 변수 b가 공백이나 탭이 아닐 때 true
        3. char형 변수 c가 문자('0' ~ '9')일 때 true
        4. char형 변수 d가 영문자(대문자 또는 소문자)일 때 true
        5. char형 변수 e가 한글일 때 true
        6. char형 변수 f가 일본어일 때 true        
*/        
//      1. char형 변수 a가 'q'또는 'Q'일 때 true
			char a = 'q';
			System.out.println(a == 'q' | a == 'Q');		
//      2. char형 변수 b가 공백이나 탭이 아닐 때 true
			char b = ' '; 
			System.out.println(b == ' ' | a == '	');			
//      3. char형 변수 c가 문자('0' ~ '9')일 때 true
			char c = (int)'t';
			System.out.println(c >= 0 && c <= 9);			
//      4. char형 변수 d가 영문자(대문자 또는 소문자)일 때 true
			char d = (int)'A';
			System.out.println((d >= 65 && d <= 90) || (d >= 97 && d <= 122));			
//      5. char형 변수 e가 한글일 때 true   (유니코드표 검색)
			char e = (int)'감';
			System.out.println(d >= 44032 && d <= 55203);
//      6. char형 변수 f가 일본어일 때 true  (유니코드표 검색)
			char f = (int)'공';
			System.out.println(d >= 12352 && d <= 12543);
//			가타가나 d >= 12448 && d <= 12543, 히라가나 d >= 12352 && d <= 12447
//		7. 사용자가 입력한 문자열이 exit일 때 true			
			Scanner sc = new Scanner(System.in);
			System.out.print("문자를 입력하세요 >> ");
			String exit = sc.next();
			System.out.println(exit.equals("exit"));

	}

}
