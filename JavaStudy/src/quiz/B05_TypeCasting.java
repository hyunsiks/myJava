package quiz;

public class B05_TypeCasting {

	public static void main(String[] args) {

	/*
	 	# 타입 캐스팅
	 	
	 	 - 타입이 자연스럽게 변하는 경우 (타입이 변하더라도 문제가 없을 때)
	 	 - 타입을 강제로 변환시켜야 하는 경우 (타입이 변하면 문제가 생길 때)
	 	 
	 	# 타입의 크기
	 	
	 	 - 정수 타입 : byte(1) < char, short(2) < int(4) < long(8)
	 	 - 실수 타입 : float(4) < double(8)	 
	 	 
	 	 *정수 타입은 무조건 실수타입 보다 작다
	 */
		
	// 1. 자연스러운 타입 캐스팅
		byte _byte = 127;
		short _short;
		int _int;
		float _float;
		long _long;
		
		_int = _byte;
		_long = _int;
		_float = _long;
		
	// 2. 값이 손상될 위험이 있는 타입 캐스팅
		_int = 50000;
//		_short = _int; //int에 short값을 넘어서는 숫자가 들어있으면 값이 손상될 수 있기 때문에 경고가 나옴
		_short = (short)_int; //이런식으로 강제로 타입캐스팅을 할 수 있다
		
		System.out.println(_short);
		int round = (int)Math.round(10.3);
		
	// 3. 같은 값이더라도 다르게 해석 될 수 있는 타입의 경우 타입 캐스팅이 필요하다
		int a = 80;
		char ch = 'Z';
		System.out.println((char)a);
		System.out.println(a);
		System.out.println((int)ch);
		System.out.println(ch);
		System.out.println(ch > 'A');//아스키코드표 상 A = 65, Z = 90
		System.out.println(ch > 'a');//아스키코드표 상 a = 97
		//코드표는 외울 필요가 없다(char타입에 숫자를 사용할 이유가 없다)
		
		
	}

}
