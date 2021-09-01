

public class C10_LocalInnerClass {

	/*
	 	# 지역 내부 클래스
	 	
	 	 - 메서드 내부에서 선언하여 사용하는 클래스
	 	 - 메서드가 끝나면 해당 클래스도 수명이 다한다
	 */
	public static void main(String[] args) {
		
		class Apple{
			String size;
			String color;
			String insect;
		}
		
		Apple a = new Apple(); //함수 안에 클래스 만듬
		AppleBox.Apple a2 = new AppleBox("고구마 박스").new Apple(); //같은 애플이라는 함수지만 다른 곳에 생성된 애플함수를 가져다 쓰는방법
		//애플박스클래스에 있는 애플 함수 가져다 쓰는것(애플클래스 인스턴스 생성,  후에 애플 함수 인스턴스 생성)

		//내부지역 클래스가 업캐스팅 되어있는 상태
		Fruit2 banana = getBanana(); //업캐스팅된 클래스는 자기만 가지고있는 함수는 잊게된다
		banana.eat(); //
		
	}

	public static Fruit2 getBanana() {
		class Banana extends Fruit2{ 
			int fruit;
			int[] color;
			
			public Banana(int fruit) {
				this.fruit = fruit;
			}			
			void eat() {
				System.out.println("열매가 " + fruit + "개 열린 바나나는 맛있다");
			}
			void bababa만가지고있는고유의기능() {
				System.out.println("엄청난 기능");
			}
		}
		//솔직히 말해서 잠깐 비교할때 쓰는 것 말고는 의미가 없다
		//그러나 클래스가 상속을 받으면 리턴으로 넘길수 있게된다
		
		return new Banana(20);
	}
	
}
abstract class Fruit2{
	abstract void eat();
}
