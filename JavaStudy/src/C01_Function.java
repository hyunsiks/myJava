

public class C01_Function {

	public static void main(String[] args) {
		
	/*
	  # 함수 (Function)
	  
	  	- 기능을 미리 정의해두고 나중에 가져다 쓰는 것	
	  	- 자바에서 함수(메서드)는 클래스 내부에 선언해야한다
	  	- 정의해둔 함수 이름 뒤에 ()를 붙여서 함수를 호출하면
	  	  호출한 자리에 함수의 실행 결과가 반환된다
	  	- 함수를 정의할 때 해당 함수가 반환할 값의 타입을 앞에 적어둔다 
	  	- 나중에 재사용 할 가능성이 있는 기능들을 미리 만들어둠으로써
	  	  작업의 반복을 줄일 수 있다
	  	- void는 해당함수에서 리턴할 값이 없다는 것
	 */
			print_rabbit();
			
			System.out.println("필요한 바구니의 개수는 : " + apple_basket(123, 10));

	}
	public static void print_rabbit() {
		System.out.println(" /)/)");
		System.out.println("(  ..)");
		System.out.println("(  >&)");		
	}
//	ex : 사과의 개수를 전달하면 필요한 바구니의 개수를 알려주는 함수
	
	//public static : 일단은 고정 나중에 다시 설명
	//int : 이 함수의 실행결과의 타입(return 타입)
	//apple_bascket : 타입뒤에 함수의 이름을 정의한 것
	//(int apple, int size) : 이 함수를 실행할 때 int 타입 값을 두개 전달 받도록 정의(매개변수, arguments)

	public static int apple_basket(int apple, int size) {
		
		int result;
		
		if(apple % size == 0) {
			result = apple / size;
		}else {
			result = apple / size + 1;
		}
		return result;
	}
	
	
}
