

public class C05_Inheritance {

	/*
	  # 클래스 상속
	  
	   - 이미 존재하는 클래스를 그대로 물려받거나 고쳐서 사용하는 것
	   - 상속해주는 클래스를 부모 클래스 또는 슈퍼 클래스라고 한다
	   - 상속받는 클래스를 자식 클래스 또는 서브 클래스라고 한다 
	 */
	public static void main(String[] args) {
		
		Person[] persons = new Person[3];
		
		persons[0] = new Person("홍길동", 10, 10);
		persons[1] = new Person("고길동", 45, 15);
		persons[2] = new Person("이길동", 30, 12);
		
		persons[0].sayHi();
		persons[1].sayHi();
		persons[2].sayHi();
		
		Police police1 = new Police();
		police1.sayHi(); //부모클래스에서 만들어둔 기능을 자식클래스에서 마음대로 사용할 수 있다
		police1.walk();
		police1.run();
		System.out.println();
		
		police1.thisSuperTest("둘리");
	}
	
}

class Person{
	String name;
	int age;
	int speed;
	
	
	public Person(String name, int age, int speed) {
		this.name = name;
		this.age = age;	
		this.speed = speed;
	}
	
	void sayHi() {
		// 연습문제 : 나이를 먹을수록 공손하게 인사하도록 만들어보세요
		if(age < 0) {
			System.out.println("?");
		}else if(age > 40) {
			System.out.printf("안녕하세요 반갑습니다. 제 이름은 %s이고, 나이는 %d세입니다\n", name, age);
		}else if(age > 19) {
			System.out.printf("안녕하세요! 제 이름은 %s이고, 나이는 %d살이에요\n", name, age);
		}else {
			System.out.printf("안녕! 내 이름은 %s이야. 나이는 %d살이야\n", name, age);			
		}
	}
	
	void walk() {
		System.out.printf("%s씨는 %d만큼 걸었습니다\\n", name, speed/2);
	}
	
	void run() {
		System.out.printf("%s씨는 %d미터 뛰었습니다\\n", name, speed);		
	}
}

/*
  1. 상속받는 클래스는 생성자에서 가장 먼저 부모의 생성자를 호출해야 한다.
  	 부모 클래스에 기본생성자가 존재하면 생략할 수 있지만, 
  	 존재하지 않을때는 생략이 불가능하다
  
  2. 자식 클래스는 부모의 메서드를 마음대로 고쳐서 사용할 수 있다(오버라이다, Override)(@Override 라고 윗줄에 표시한다)
  	 
  3. 부모 클래스와 자식 클래스에 똑같은 이름을 가진 자원이 있는 경우
  	 super와 this로 정확하게 구분할 수 있다
 */
class Police extends Person{ //클래스를 생성할때 extends 클래스명 하면 클래스명에 적힌 클래스를 상속한다
	
	String name = "마동석";
	
	//자식 클래스의 생성자에서는 첫 줄에 super()를 반드시 호출해야한다(필수) (부모클래스가 기본생성자 있는경우, super생략가능)
	public Police(){
		super("김경찰", 23, 20); //super()는 부모클래스의 생성자를 호출한다
							   //슈퍼클래스(부모클래스)에 현재 기본생성자가 없는상태 (기본생성자란, 인스턴스변수를 정의해놓은 매개변수가 필요없는 생성자)ex. Person();
							   //부모클래스에 기본생성자가 있을 때에는 super()를 적어두지 않아도 생략된 상태로 있는 상태가 된다(즉, 생략해도된다)
							   //모든 생성자를 생략할 시 자식 클래스에도 기본 생성자가 생기고 부모 클래스의 기본 생성자를 사용한다
	}
	
	@Override	//오버라이드라고 표시만해주면 위에 부모클래스의 sayHi가 사라지면 오버라이드인데 왜 부모에는 같은함수가 없냐고 표시가뜸, 안써두면 부모에 sayHi를 삭제해도 아무 문제없음
	void sayHi() {	//오버라이드 : 부모클래스와 같은이름의 메서드를 사용하면 자식클래스의 메서드로 수정할수있다(맨왼쪽에 오버라이드했다는표시나옴)
		System.out.printf("안녕하십니까! 저는 %s 형사입니다.\n", name);
	}
	
	void thisSuperTest(String name) {
		System.out.println("그냥 name : " + name);	//메인에서 사용하는 이름 호출
		System.out.println("this. name : " + this.name);  //자식 클래스(여기클래스) 이름호출
		System.out.println("super.name : " + super.name); //부모 클래스의 이름호출
	}
	
	void arrest(String suspect) {//String 자리에 Person 을 넣으면 Person에 있는 모든 사람을 체포하게될수있게된다
		System.out.printf("%s 형사는 용의자 %s씨를 체포하였습니다.", name, suspect);
	}
}
