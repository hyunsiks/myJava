

public class A02_Variable {

	public static void main(String[] args){
		
	/*
		# 변수(Variable)
		 - 데이터를 담을 수 있는 공간
		 - 자바에서는 변수를 반드시 선언한 뒤에 사용해야 한다
		 - 변수 선언시에는 그 변수에 저장될 데이터의 타입을 정해줘야 한다
		 - ""나 ''가 없는 문자열 또는 문자는 변수이다
		 - 같은 이름의 변수는 다시 선언할 수 없다
		 
		# 변수의 선언(declare, declaration)
		 - 타입 변수명; ex) int a;
	 */
		
		//int 타입의 변수 a를 앞으로 쭉 사용하겠다!(선언)
		//int 타입 - 정수만 저장할 수 있는 타입
		int a;
		int apple;
		//원래 알고있던 =은 두 값이 서로 같다는 것이지만, 프로그래밍 언어에서의 
		//=의 의미는 왼쪽의 변수에 오른쪽의 값을 넣으라는 것(대입)
		a= 5000;
		//선언한 변수에 최초로 값을 대입하는 것을 초기화(initialize, init)라고 한다
		apple = a + 50;
		System.out.println(a);
		System.out.println(apple);
		
		a = 50; //원래있던 5000은 사라지고 50을 덮어쓴다
		System.out.println(a);
		
		// #여러가지 변수 선언 방식
		// 1. 변수 하나만 선언하기
			int b; 
		// 2. 변수를 한번에 여러개 선언하기
			int c,d; 
		// 3. 변수를 선언함과 동시에 값을 대입
			int e = 55; 
		// 4. 변수 여러개를 선언함과 동시에 값을 대입
			int f = 99, g = 999;
			System.out.println("f에 들어있는 값 : " + f);
			System.out.println("g에 들어있는 값 : " + g);
	}
}
