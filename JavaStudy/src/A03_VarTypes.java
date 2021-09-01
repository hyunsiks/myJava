

public class A03_VarTypes {
	
	public static void main(String[] args){
		
	/*
		# 정수 타입
		 - byte	 : (1byte) -128 ~ 127
		 	1byte => 8bit : 2^8 즉, 256가지 신호함(0,1 이진법)
		 	0000 0000 ~ 1111 1111 까지 나타낼 수 있는 것
		 	* 첫번째 bit는 부호 비트로 사용된다
		 	byte타입의 양수 범위 0000 0000(0) ~ 0111 1111(127)
		 	byte타입의 음수 범위 1000 0000(-128) ~ 1111 1111(-1)
		 	
		 - short : (2byte) - 부호가있다, signed
		  	2^16 - 65536가지 
		  	양수범위 0 ~ 32767 음수범위 -32768 ~ -1
		  	
		 - char	 : (2byte) - 부호가없다, unsigned
		 	2byte -> short와 같이 65536가지 이지만
		 			 양수만 나타내기 때문에 0 ~ 65535의 양수만 나타냄

		 - int	 : (4byte) 2^32 - 약43억 절반잘라 양수, 음수

		 - long	 : (8byte) 2^64 - 거의무한과가까움
		
	*/
		byte a = 127; //128, -129 쓰면 에러가 난다 
		short b = 32767; //32768, -32769 쓰면 에러가 난다
		char c = 65535; //65536, -1쓰면 에러가 난다
		int d = 10;
		long e = 10;
		
		byte maxbyte = 127;
		byte minbyte = -128;
		System.out.println("byte타입에 저장할 수 있는 가장 큰 값은 : " + maxbyte + "이고, 가장 작은 값은 " + minbyte + "입니다.");
		
		short maxshort = 32767;
		short minshort = -32768;
		System.out.println("short타입에 저장할 수 있는 가장 큰 값은 : " + maxshort + "이고, 가장 작은 값은 " + minshort + "입니다.");
		
		char maxchar = 65535;
		char minchar = 0;
		char ch = 65;
		System.out.println("char 타입에 저장된 값은 기본적으로 문자로 출력된다. " + ch);
		System.out.println("char 타입에 저장된 코드값을 확인하고 싶으면 (int)를 붙인다. " + (int)ch);
		System.out.println("char타입에 저장할 수 있는 가장 큰 값은 : " + maxchar + "이고, 가장 작은 값은 " + minchar + "입니다.");
		System.out.println("char타입에 저장할 수 있는 가장 큰 값은 : " + (int)maxchar + "이고, 가장 작은 값은 " + (int)minchar + "입니다.");
		
		int maxint = 2_147_483_647;
		int minint = -2_147_483_648;
		System.out.println("int타입에 저장할 수 있는 가장 큰 값은 : " + maxint + "이고, 가장 작은 값은 " + minint + "입니다.");
		
		long _long =  2_147_483_648L;
		//int의 범위를 넘어가는 숫자를 사용할 때에는 L을 붙여야 롱타입으로 인식해준다.
		
	 /*

		# 실수 타입
		 - float  (4byte)
		 - double (8byte)
			실수는 주로 그래픽 계산에 사용된다
			부동소수점 방식을 사용한다
	*/
		//그냥 소수만 적는 것은 기본적으로 double 타입이다
		//float타입의 소수는 뒤에 F를 붙여야 한다
		float weight = 54.55F; //F가 소문자로 f도 가능
		double height = 179.23;
	/*		
		# 참,거짓 타입
		 - boolean
			참과 거짓을 표현하는데에 사용되는 타입
			값은 true와 false 밖에 없다
	*/
		boolean hasfood = true;
		boolean over130cm = false;
	/*		
		# 참조형 타입 (클래스 타입)
		 참조형 타입은 다른 기본형 타입들과는 다르게 대문자로 시작
		 - String : 문자열
		 - 그 외 모든 클래스들 .. ex)Scanner
	 */
		String hellomessage = "Hello, My name is Jhon Doe.";
		String byemessage = "Good bye. ";
		System.out.println(hellomessage);
		System.out.println("hellomessage");
		System.out.println(byemessage + byemessage + byemessage);
		
	}

}
