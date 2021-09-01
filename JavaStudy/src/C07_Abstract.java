

public class C07_Abstract {
	
	/*
		# 추상 클래스 (abstract)
		
		 - 완성을 자식 클라스에게 미루는 클래스
		 - 클래스 내부에 추상 메서드를 지닌 클래슨느 앞에 abstract를 붙여 표시해야 한다
		 - 내부의 추상 메서드를 구현하기 전에는 인스턴스 생성이 불가능하다(ex Vehicle 이라는 것을 new Vehicle(); 할수 없다는것 왜나면 아직 완성된것이없으니까
		 
		# 추상 메서드 (abstract method)
		 
		 - 함수의 형태(리턴 타입, 접근 제어자, 매개변수)만 정해놓고 자세한 구현은 자식 클래스에서 오버라이드
		 - 자식 클래스에서 오버라이드 하지 않으면 컴파일 에러가 발생한다
	 */
	public static void main(String[] args) {
		Vehicle v1 = new Bus();  //내부 추상메서드 구현 됫기때문에 인스턴스 생성가능
		
		//익명 클래스(Anonymous class)
		Vehicle v2 = new Vehicle() { //빨간줄에 대고 클릭하면 즉석해서 익명클래스 생성가능

			@Override
			void ride() { //생성과 동시에 즉석에서 수정하는것, 하지만 클래스 이름은 없다
				System.out.println("즉석에서 구현한 탈것");				
			}			
		};
		v1.ride();
		v2.ride();
	}
	
}

abstract class Vehicle{	
//	void ride() {
//		//나중에 자식클래스에서 오버라이드 할 것이므로 만들지 않아도된다
//	}
	abstract void ride(); //닫아놓고 나중에 만들겠다는것	
}

class Bus extends Vehicle{
	
	@Override
	void ride() {
		System.out.println("요금을 내고 타야함");
		
	}
}

class Bike extends Vehicle{ //추상 클래스를 상속하기 떄문에 오버라이드 해야만 하는 것

	//오버라이드 조건(같은 함수명, 같은 리턴타입, 같은 매개변수)
	@Override
	void ride() {
		
		
	}
}