


public class C08_AccessModifier {

	/*
	 	# 접근 제어자 (Access Modifier)
	 	
	 		- 다른 클래스가 해당 클래스의 자원을 사용하려고 할 때
	 		  어디까지를 허용할지를 설정한다
	 	
	 	# 접근 제어자를 통해 구분할 수 있는 거리의 종류
	 		
	 		- 같은 클래스 내부의 다른 자원 (제일 가까운 거리)
	 		- 같은 패키지 내부의 다른 자원
	 		- 다른 패키지에 있지만 상속받은 자원
	 		- 다른 패키지의 자원 (제일 먼 거리)
	 	
	 	# 접근 제어자 종류
	 	
	 		- private
	 			: 앞에 private이 붙은 자원은 같은 클래스 내부에서만 접근할 수 있게 된다
	 		- default (아무것도 안쓴것)
	 			: 같은 패키지 내부에서는 자유롭게 접근할 수 있게 된다
	 		- protected
	 			: 같은 패키지내에 자유롭게 접근가능
	 			  다른 패키지에서는 상속받은 클래스만 접근할 수 있는 자원이 된다
	 		- public
	 			: 다른 패키지에서도 자유롭게 접근할 수 있는 자원이 된다
	 */
	public static void main(String[] args) {
		
		//패키지 내의 다른 클래스생성
		C08_SamePackage instance = new C08_SamePackage();
		instance.public_var();
		instance.protected_var();
		instance.default_var();
//		instance.private_var(); //같은 클래스 내부에서만 접근 할 수 있기 때문에 사용할 수가 없다
		
	}
}

//private 예제----------------------------------------
class Snack{
	private int size = 10; //같은 클래스 내부에서만 사용가능

	private void eat() {
		System.out.println(size); //같은 클래스 내부에서 size사용해봄
	}
}
class HoneyButterChip extends Snack{

	private void abc() {
//		System.out.println(size); //상속을 받았어도 private변수,함수를 쓸수없다
	}		
}
class Choco extends C08_AccessModifier{
	
	public Choco() {
		
	}
	
	void abc() {
		Snack s = new Snack();
//		s.size; //private 사이즈를 못씀
	}
}


