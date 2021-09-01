
import java.util.Scanner;

public class B03_Scanner {

	public static void main(String[] args) {
		
	/*
	  # Math 클래스
	  	- 수학과 관련된 기능들이 모여있는 클래스
	  	  ex) abs(), round(), ceil()...
	  	  
	  # java.util.Scanner 클래스
	  	- 프로그램의 외부로부터 입력을 받을 수 있는 기능들이 모여있는 클래스
	  	- 어디에서 입력을 받을지 결정한 뒤에 다양한 값들을 입력받을 수 있다
		- 콘솔에서 입력받고 싶을 때는 System.in을 사용한다
	 */
		
		//System.in으로부터 입력받는 스케너를 하나 생성한것
		//Scanner타입 변수 sc에 생성한 스캐너를 담아놓는다
		Scanner sc = new Scanner(System.in);

		
		//Scanner의 nextInt() : 다음으로 들어오는 정수를 하나 입력받는다
		System.out.print("꼭 정수만 입력해 주세요 > ");
		int a = sc.nextInt();
		System.out.println("입력하신 값은 " + a + "입니다");
		System.out.println("입력하신 값에 3을 곱하면 " + a*3 + "입니다");
		System.out.println("1000과 입력하신 값의 차이는 " + (1000-a) + "입니다");
		
		//Scanner의 nextDouble() : 다음으로 들어오는 실수를 하나 입력받는다
		System.out.print("이번에는 실수를 입력해 주세요(정수도 가능) > ");
		double b = sc.nextDouble();
		System.out.println("두번째로 입력하신 값은 " + b + "입니다");
		System.out.println("첫번째 값과 두번째 값을 곱하면 " + (Math.round(a*b * 10) / 10.0) + "입니다");
		

	}
}
