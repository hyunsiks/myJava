

import java.util.Scanner;

import quiz.A01_printQuiz;
import quiz.A02_introduce;
//import quiz.advance.AbcQuiz;
//import quiz.basic.AbcTest;

public class B02_Import {

	public static void main(String[] args) {
		
		//같은 패키지의 자원 사용
		A00_Hello.main(null);
		A01_Escape.main(null);
		
		//다른 패키지의 자원을 사용 (import필요)
		A01_printQuiz.main(null);//(import quiz.A01_printQuiz; 생김)
		A02_introduce.main(null);//(import quiz.A02_introduce; 생김)
		
		Scanner sc = new Scanner(System.in); //Ctrl + Shift + O
		
		//연습 : quiz밑의 advance밑의 AbcQuiz 클래스를 사용해보세요
//		AbcQuiz.main(null);
		
		//재시험 : quiz밑에 basic이라는 패키지를 만든후 abcTest클래스를 만든 후
		//		 불러와서 사용해보세요.(나타나는 메세지는 아무거나)
//		AbcTest.main(null);
	}
}
