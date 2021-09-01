
import java.util.Scanner;

import myobj.Apart;
import myobj.Peach;

public class C03_Constructor {
	
	/*
	  # 클래스의 생성자 (Constructor)
	  
	  	- 클래스의 이름과 똑같은 이름의 메서드
	  	- 메서드이지만 리턴타입을 정의하지 않는다
	  	- 인스턴스를 생성하기 위해서는 new를 통해 생성자를 호출해야 한다
	  	- 생성자를 하나도 정의하지 않은 클래스에는 기본 생성자가 자동으로 생성된다
	  	- 생성자가 모두 실행된 후에는 생성된 인스턴스의 주소가 반환된다(ex:sc.~~ sc라는 생성자에 점 찍으면 주소반환)
	  	
	 */
	
	
	public static void main(String[] args) {
		
		//클래스 이름과 똑같은 이름의 메서드를 호출해 인스턴스를 생성할 수 있다.
		
		//*생성자를 호출하는 행위들
		String s1 = new String(); //참조형 변수는 주소에 점을 찍고 찾아가기 때문에 참조형변수라고 한다
		Scanner sc = new Scanner(System.in);
		Peach p1 = new Peach();	//생성자가 없는 생성자는 자동으로 기본 생성자를 생성해준다
		
		
		Orange[] orange_box = new Orange[8]; 
		for(int i = 0; i< 5; i++) {		//인스턴스를 5개 만든다
			orange_box[i] = new Orange();
		}
		System.out.println(orange_box[0].sweet);
		System.out.println(orange_box[1].size);
		System.out.println(orange_box[2].color[0]);
		System.out.println(orange_box[3].color[1]);
		System.out.println(orange_box[4].color[2]);
		
		new Orange();  //생성자를 통해 새로운 인스턴스를 만든다는것 안에 인스턴스변수들은 다 초기값으로 되어있다
		new Orange(8); //당도를 8로 정해놓고 생성한다는것
		new Orange(9, 10, new int[] {255, 165, 0});
		Orange or1 = new Orange();
		
		System.out.println(sc); //주소가 반환된다
		System.out.println(p1); 
		System.out.println(s1); //주소가 안나오지만 스트링 타입도 주소 저장되있다
		
		//딸기
		Strawberry berry01 = new Strawberry(150);

		System.out.println(berry01.color);
		System.out.println(berry01.seed);
		
		//아파트
		Apart apt01 = new Apart();
		System.out.println("초기화 아파트 평당가격 : " + apt01.perOfPrice);
		System.out.println("초기화 아파트 가격 : " + apt01.price(33));
		Apart apt02 = new Apart(25000, 5, 1);
		System.out.println("2번 아파트 평당가격 : " + apt02.perOfPrice);
		System.out.println("2번 아파트 최종가격 : " + apt02.price(33));
		
		System.out.println("1번 아파트 층고적 가치 : " + apt01.floorValue(7));
		System.out.println("1번 아파트 위치적 가치 : " + apt01.locateValue(3));
		System.out.println("1번 아파트 최종가격 : " + apt01.price(33));
	}
}
class Orange{
	int sweet;
	int size;
	int[] color;
	
	//생성자 (클래스랑 똑같은 이름의 함수) - 클래스의 인스턴스를 생성할 때 가장 먼저 호출되는 메서드(주로 인스턴스를 초기화하는 용도로 사용)
	Orange(){
		System.out.println("오렌지가 생성되었습니다");
		sweet = 5;
		size = (int)(Math.random() * 3 + 7);
		color = new int[] {255, 165, 0};
	}
	
	//생성자도 메서드이기 때문에 오버로딩(같은이름함수) 할 수 있다
	Orange(int sweet){
		//인스턴스변수 sweet에 넘겨받은 sweet를 대입
		this.sweet = sweet; //뒤에있는sweet을 함수호출할때 받아서 클래스안의 sweet를 대입하겠다는것(지역변수 sweet과 멤버변수 sweet)
//		 *this : 각 인스턴스에서 자기 자신을 가리킨다
	}
	
	Orange(int sweet, int size, int[]color){
		this.sweet = sweet;
		this.size = size;
		this.color = color;
	}	
}

class Strawberry{
	
	// 클래스의 인스턴스 변수도 초기화를 하지 않으면 배열과 똑같은 초기값을 지닌다
	int seed;
	String color;
	
	//다른 오버로딩타입의 생성자가 존재하면 기본 생성자를 사용할 수 없는 클래스가 된다
	public Strawberry(int seed) { //ctrl + space 하면 생성자 자동생성기능도있다
		this.seed = seed;
	}
}
//아까 myobj에 만들었던 클래스에 알맞은 생성자를 2개이상 추가해보세요



