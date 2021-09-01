

public class C09_InnerClass {
	
	/*
	  	# 클래스 내부에 클래스 사용하기
	  	
	  	 - 클래스 내부에도 클래스를 정의하고 사용할 수 있다
	  	 - 클래스 내부에 존재하는 클래스는 인스턴스가 생성되어야 사용할 수 있는 설계도이다
	  	 - 
	 */
	
	public static void main(String args[]) {
		
		AppleBox box = new AppleBox("감귤박스");
		
		//이너클래스 인스턴스 생성하기
		AppleBox.Apple apple1 = new AppleBox("사과박스").new Apple();;
		AppleBox.Apple apple2 = box.new Apple();; //위에것과 같은것임

		apple1.whereAmI();
		apple2.whereAmI();
//		System.out.println(boxname); //이너클래스가 아니기 떄문에 다른 클래스의 변수 못씀
	}
}

class AppleBox{
	
	String boxName;	
	Apple[] box;
		
	public AppleBox(String name) {
		box = new Apple[10];
		
		for(int i = 0; i < 10; i++) {
			box[i] = new Apple();
		}
		boxName = name;
	}
	
	public void show() {
//		System.out.println(color);//밖의 클래스에서는 이너클래스의 변수를 사용못함
		Apple a1 = new Apple();
		System.out.println(a1.color); //밖의 클래스에서 이너클래스보려면 인스턴스생성해야함
	}
	
	
	
	class Apple{	
		String color;
		int size;
		boolean insect;
		
		void whereAmI() {
			System.out.println(boxName); //밖의 클래스의 변수를 끌어다 쓸수있다(이너클래스이기 때문)
		}
		
	}
}