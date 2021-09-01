
import myobj.Bera31Employee;

public class C04_Static {
	
	/*
	  # static(정적 영역, 클래스 영역 <=> 인스턴스 영역)
	  
	  	- static은 같은 클래스의 모든 인스턴스가 공동으로사용하는 영역이다
	  	- static이 적용된 클래스의 자원은 모든 인스턴스에서 같은 값을 지니게 된다(메모리 절약을 위함)
	  	- static이 붙은 영역은 클래스당 하나밖에 생성되지 않으므로 메모리가 절약된다
	  	- static 영역은 클래스당 하나이기 때문에 클래스명에 .을 찍고 접근하는 것이 좋다
	  	- static 영역의 자원은 인스턴스가 생기기 전에도 호출할 수 있다
	  		(아직 생성된 인스턴스가 없더라도 static이 붙은 자원은 쓸 수 있다)
	  	- 인스턴스가 존재하지 않을 때도 static이 사용될 가능성이 있기 때문에 
	  	  static메서드에서는 인스턴스 자원을 사용할 수 없다(static 변수만 제어를 할 수가 있다는 것)
	 */

	public static void main(String[] args) {
		
		System.out.println(Lamp.width);	//Lamp lam = new Lamp(); 를 통해 생성하지도 않았는데 static자원은 사용가능
		System.out.println(Lamp.height);
		
		Lamp.chagewidth(500);
//		Lamp.turnOn();
		
		Lamp lamp01 = new Lamp();
		Lamp lamp02 = new Lamp();
		Lamp lamp03 = new Lamp();
		Lamp lamp04 = new Lamp();
		
		System.out.println(lamp01.width);
		System.out.println(lamp02.width);
		System.out.println(lamp03.width);
		System.out.println(lamp04.width);
		System.out.println(Lamp.width); //어차피 같기 때문에 이처럼 클래스명(Lamp)에다가 .을 찍고 접근하는게 좋다 (Lamp.width)
		
		lamp03.width = 30;
		
		System.out.println(lamp01.width);
		System.out.println(lamp02.width);
		System.out.println(lamp03.width);
		System.out.println(lamp04.width);
		System.out.println(Lamp.width);
		
		
		//베라직원
		Bera31Employee bera = new Bera31Employee();
		
		bera.quantity("pint", 3);
		bera.quantity("quater", 4);
		bera.quantity("family", 3);
		bera.quantity("halfgallon", 5);
		bera.quantity("halfgallon", 10);
	}
}
class Lamp {
	
	//강의장 내부의 모든 형광등의 너비와 높이는 일정하다
	static int width = 50;
	static int height = 200;
	
	int[] position;
	double brightness;
	boolean powerOn;
	
	//static메서드에서 static변수에 접근하는 것은 가능
	public static void chagewidth(int width) {
		Lamp.width = width;
	}
	static void turnOn() { //static에서는 인스턴스 못쓴다
//		this.powerOn = true;
	}
}

/*
  myobj 패키지에 static 변수를 포함한 클래스를 하나 정의 해보세요
  
 */






