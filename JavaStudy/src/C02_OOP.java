
import myobj.Peach;
import myobj.Shoes;

public class C02_OOP {
		
	/*
	  # 객체지향 프로그래밍(OOP : Object Oriented Programming)
	  
	  	- 세상에 존재하는 모든 것들을 변수와 함수(메서드)로 표현하려는 프로그래밍 방법론
		  ex 사과 
		  	- 사과의 변수 : 크기, 색깔, 당도, 칼로리, 유통기한 ....
		  	- 사과의 메서드 : 던진다(크기 만큼의 데미지를 입힌다), 먹는다(칼로리가 증가하고, 크기가 줄어든다), 냉장고에 보관한다(유통기한이 증가한다)
		  	※ 클래스 내부에 있는 함수로 메서드라고 부른다(따라서 사실 java에는 메서드밖에 없다)  
		 - 변수와 함수를 무분별하게 사용하기 보다는 현실에 존재하는 객체단위로 묶어서 표현하여 가독성을 올린다
		 - 객체(Object) : 세상에 존재하는 모든 것을 말한다(사물, 개념 ... 등)
		 
	  # 클래스 (Class)
	  
	  	- 객체를 프로그래밍 언어로 표현한 것
	  	- 클래스는 객체의 설계도이다 (정의한 시점에서는 실체가 없다)
	  	- 클래스를 통해 생성하는 실제 객체를 '인스턴스'라고 부른다
	  	- 클래스는 참조형 변수 타입이다 (애플타입, 스트링타입)
	 */
	
	// 프로그램 실행 시에 public class에 있는 main만 찾을 수 있다
	public static void main(String[] args) {
	
		//Apple 클래스(설계도)로 만들어낸 인스턴스(생산품) a1
		Apple a1 = new Apple(); // 애플 타입을 만든다는것
		Apple a2 = new Apple();
		Apple a3 = new Apple();
		
		a1.calorie = 100;
		a2.calorie = 120;
		a3.calorie = 115;
		
		//다른 패키지에 선언한 public class를 사용할 수 있다
		//import안하고 풀네임선언하기
		myobj.Peach p1 = new myobj.Peach();
		//import하고 선언하기(다른 클래스에 있는 것을 끌어올때는 import한다)
		Peach p2 = new Peach();
		
		a1.eat();  //Apple 클래스를 선언한 a1에 있는 eat()메서드를 사용한다는것
		
		System.out.println(a1.calorie);
		System.out.println(a2.calorie);
		System.out.println(a3.calorie);
		
		
		
		String str1 = "abc"; //스트링 타입을 사용하는것 이것은 사실 클래스다
		String str2 = "abc";
		String str3 = "abc";
		
		/*
		 # 연습문제 : myobj 패키지에 현실의 객체를 참조하여 클래스를 하나 생성한 후
		   		   인스턴스를 생성하고 값을 채운다음 출력해보세요
		   		   - 인스턴스 변수 3개이상, 인스턴스 메서드 2개이상, 과일 금지
		 */
		myobj.Shoes shoe1 = new myobj.Shoes();
		Shoes shoe2 = new Shoes();
		
		System.out.println("현재가격 : " + shoe1.price);
		shoe1.use();
		shoe1.washing();
		System.out.println(shoe1.heigt(178));
		
		
		myobj.Apart apt = new myobj.Apart();
		System.out.println(apt.floorValue(15));
		System.out.println(apt.locateValue(5));
		System.out.println(apt.price(30));
	}

}
//dafault class(public이 안 붙은 class)는 찾을 수 가 없다
class Apple{
	/*
	  # 인스턴스 변수(a1.Apple, a2.Apple 마다 다 다르게 값 적용가능)
	  	- 각 인스턴스마다 다른 값을 가질 수 있는 변수
	  	- =필드 =속성 =멤버변수 =상태  다 같은 말이다
	 */
	int size;
	int calorie;
	long lifetime;
	double sweet;
	String color;
	
	/*
	  # 인스턴스 메서드
	  	- 인스턴스 변수를 활용하여 해당 인스턴스의 상태를 변화시키는 메서드
	 */
	 void eat() {
		 size--;
		 calorie -= 10;
	 }	
	
}
