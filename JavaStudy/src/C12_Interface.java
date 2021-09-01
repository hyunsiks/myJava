

public class C12_Interface {

	/*
	  # 인터페이스 (Interface)
	  
	  	- abstract class는 상속을 여러개 받을 수 없다는 단점을 보완한 것
	  	- 인터페이스 내부의 메서드는 자동으로 abstract public이 된다
	  	- 인터페이스 내부의 변수는 자동으로 final static이 된다
	  	- 인터페이스의 내부의 메서드를 정의할 때 default를 붙이면 기본 동작을 설정할 수 있다
	 */
	public static void main(String[] args) {
		new OrangeTree().click();
	}
}
interface CanClick{
//	int a = 10; //이것은 저절로 final static 이된다
	
	default void click() {
		System.out.println("클릭 인터페이스가 달려있는 클래스의 기본동작."
				+ " 오버라이드 해서 사용해주세요");
	}
}

interface CanPunch{
	void punch(); //abstract안써도 자동으로 abstract가 됨
}

class OrangeTree implements CanClick, CanPunch{ //자바에서는 여러개 상속을 못함, 따라서 interface를사용
	
	@Override	//오버라이드 안해놓으면 Canclick클래스의 click()함수 기본동작나옴
	public void click() {
		System.out.println("yesyes");
	}

	@Override
	public void punch() {

	}
}



