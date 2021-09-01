

/** 문서화 주석 (해당 클래스 말풍선에 등장하게되는 주석) */

// Ecipse 단축키 정리
//	- Ctrl + [+, -] : 글자크기 조절
//	- Ctrl + f11 : 소스코드 컴파일 및 실행(Run)
//	- Alt + 방향키 : 소스코드 한 줄을 마음대로 이동(줄옮기기)
//	- Shift + End : 커서의 현재 위치부터 맨 뒤까지 블록지정
//	- Shift + Home : 커서의 현재 위치부터 맨 앞까지 블록지정

//public class 의 이름은 반드시 파일명과 같아야 한다
public class A00_Hello {
//빨간 줄이 생겼을 때는 그곳에 커서를 두고 f2를 누르면 에러에 대한 정보와 해결책을 볼 수 있다.
	
	/*
	  # main() 함수 라고 한다.
	   - 프로그램의 시작 지점
	   - 사용자가 프로그램을 시작하면 가장 먼저 main()함수를 찾아서 실행시킨다
	   - main() 함수의 범위는 중괄호{}로 결정된다
	   
	  # 함수란?
	   - 어떤단어뒤에 () 가 있는 것을 함수라고 한다
	   
	  # 콘솔이란?
	   - 글자만 나오는 검은 화면을 말한다 (옛날 컴퓨터 화면)
	   - CMOD같은 것에서 실행되는 화면을 말한다
	   - Eclipse에서는 테스트용으로 하얀바탕의 콘솔을 제공한다(Ctrl + F11 이용)
	   - 우리가 만든 소스 코드(.java)의 결과물(.class)은 bin폴더에 저장되어 있다
	  
	  # ; (세미콜론)?
	   - 한 명령어가 끝났음을 알린다
	    	  
	 */
	public static void main(String[] args) { //프로그램시작
		
		/* # System.out.println() 은 함수
		  - ()안에 전달한 데이터를 콘솔(아래쪽)에 출력하는 함수

		*/
		System.out.println("Hello, World! 1"); //Ctrl + f11
		System.out.println("Hello, World! 2"); 
		System.out.println("Hello, World! 3"); 
		System.out.println("Hello, World! 4"); 
		System.out.println("Hello, World! 5");
		
		System.out.println(12345 + 55);
		System.out.println("12345" + 55);
		
		System.out.println("┌──────────────────┐");
		System.out.println("│   1. New game    │");
		System.out.println("│   2. Load game   │");
		System.out.println("│   3. Exit        │");
		System.out.println("└──────────────────┘");
		
		/*
		  # 자바의 데이터들(리터럴)
		   1. "" 사이에 적는 것들 	: 문자열(String), 문자를 여러개 쓸 수 있는 데이터 타입
		   2. '' 사이에 적는 것		: 문자(Character), 문자 단 하나만 쓸 수 있는 데이터 타입
		   3. 그냥 숫자를 적는 것		: 정수(Integer), 타입
		   4. 소수를 적는 것		: 실수(Float, Double), 타입
		   5. 참, 거짓 적는 것 		: boolean 타입
		 */
		System.out.println("A한賢☆");
		System.out.println('A');
		System.out.println('한');
		System.out.println('賢');
		System.out.println('☆');
		System.out.println(1000 + 500);
		System.out.println(100.123 + 50.55);
		System.out.println(true);
		System.out.println(false);
		
		// # 문자들은 실제로는 숫자값을 가지고 있다
		//	 우리 눈에 보일떄만 문자로 보이는 것이다
		//즉, ''타입은 숫자타칩으로 전환될 수 있고, 숫자 타입도 ''타입으로 전환될 수 있다
		// 문자와 정수는 실제로는 같은 타입이며 서로 계산도 가능하다
		System.out.println('A');
		System.out.println((int)'A');
		System.out.println((int)'한'); //(int)의 역할 - 문자의 숫자값을 볼 수 있다
		System.out.println((char)54621); //(char)의 역할 - 숫자를 문자로 보이게 한다
		System.out.println((char)54622);
		System.out.println((int)'핟');
		System.out.println('A' + 1);
		System.out.println((char)('A' + 1));
		System.out.println((char)('A' + 2));
		System.out.println((int)'a');
		
		// # 문자열 타입과 다른 타입을 더하면 계산을 하는것이 아니라 이어붙인다
		System.out.println("'A'의 보여지는 모습 : " + 'A');
		System.out.println("'1'의 코드값 : " + (int)'1');
		//문자열타입('A'의 보여지는 모습 :) 과 문자타입('A')이기 때문에 이어붙임
		System.out.println("1" + 5); //문자열 + 숫자
		System.out.println('1' + 5); //문자(코드값) + 숫자
		System.out.println(1 + 5); //숫자 + 숫자
		
		// # 정수 + 실수는 실수가 된다
		System.out.println(10 + 10.0);

		// # 정수 + 문자는 정수가 된다
		System.out.println('a' + 10);
		System.out.println((char)('a' + 10));
		
		
		
	}//프로그램끝
	
}
