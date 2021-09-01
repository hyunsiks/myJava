package 연습장;

public class 정수를문자열로바꾸기 {

	public static void main(String[] args) {
		
		//기본적으로 문자열 + 정수 = 문자열 인것을 이용한다
		System.out.println("Hello World!!" + 123); //Hello World!!123 으로 출력되고 이것은 문자열이다
		System.out.println("" + 123); //""안에 아무것도 안들어있기 떄문에 123만 출력되지만 문자열 + 정수 이므로 문자열이다
		System.out.println(Integer.toString(123)); //정수를 문자열로 바꾸는 함수를 사용한다
		
		//정수를 문자열로 바꾸는 이유는 정수를 문자열로 취급하여 '한글자씩 확인해 보기 위함이다'
		//따라서 다음과 같이 사용할 수 있다.
		int a = 123;
		String b = "" + 123;
		System.out.println(b.charAt(0));
		System.out.println(b.charAt(1));
		System.out.println(b.charAt(2));
	}

}
