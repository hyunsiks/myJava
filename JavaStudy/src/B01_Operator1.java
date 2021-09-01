

public class B01_Operator1 {

	public static void main(String[] args) {
		
	/*
		# 연산자 (Operator)
			- 계산할 때 사용되는 것
			- +, -, *, / ...
	*/		
//	# 산술 연산자
		int a = 10, b = 7;
		double c = 7.0;
		float d = (float)a/b;
		System.out.println("+ : " + (a + b));
		System.out.println("- : " + (a - b));
		System.out.println("* : " + a * b);
		System.out.println("/ : " + a / b); //정수끼리 나누면 몫만나옴		
		System.out.println("/(float) : " + a / (float)b); //정수와 실수를 나누면 정확한 값을 계산함		
		System.out.println("/(double) : " + a / (double)b); //정수와 실수를 나누면 정확한 값을 계산함		
		System.out.println("% : " + a % b);		
		System.out.printf("%.6f", d);
		System.out.println();
		System.out.println("제곱 : " + Math.pow(a, 4));
		System.out.println("제곱? : " + (a ^ 4)); //^는 제곱이 아니다(프로그래밍언어에서 비트연산자이다)
		System.out.println("제곱근 : " + Math.sqrt(49));
		System.out.println("절대값 : " + Math.abs(-25.3));
		/*
		  Mate.round()는 소수 첫째 자리에서만 반올림 할 수 있다
		  셋째 자리에서 반올림 하고 싶은 경우 100으로 나누면 그대로 
		  3나오기때문에 100.0으로 실수타입으로해야 정확한 값이 나옴 
		 */
		System.out.println("소수 첫째 자리에서 반올림 : " + Math.round(3.335));
		System.out.println("소수 셋째 자리에서 반올림 : " + Math.round(3.335 * 100) / 100.0); //나눌 때 꼭 실수타입으로 나누어야 완전한 값나온다
		System.out.println("올림 : " + Math.ceil(1.001));
		System.out.println("내림 : " + Math.floor(1.001));
		
		System.out.println("더 큰 숫자 남기기 : " + Math.max(1900, 1500));
		System.out.println("더 작은 숫자 남기기 : " + Math.min(1900, 1500));
		
//	#비트연산자(&, |, ^, >>, <<)
	
		// 1010
		// 0111
		// ------&
		// 0010 (0이 하나라도 있으면 0)
		System.out.println("a & b : " + (a & b)); //AND
		
		// 1010
		// 0111 
		// ------|
		// 1111 (1이 하나라도 있으면 1)
		System.out.println("a | b : " + (a | b)); //OR
		
		// 1010
		// 0111
		// ------^
		// 1101 (같으면0, 다르면1)
		System.out.println("a | b : " + (a ^ b)); //XOR
		
		// 0000 1000 << 2
		// 0010 0000 
		System.out.println(8 << 2); 
		// 0000 1000 >> 2
		// 0000 0010 
		System.out.println(8 >> 2); 
		

	}
}
