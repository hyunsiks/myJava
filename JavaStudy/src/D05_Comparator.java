
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class D05_Comparator {
	
	/*
	 	# Comparator
	 	
	 	 - 구현하면 두 객체의 크기를 비교할 때 사용하는 클래스가 되는 인터페이스
	 	 - 객체간의 크기를 정할 때 사용된다
	 */
	public static void main(String[] args) {
		
		LinkedList<Grape> grapes = new LinkedList<>();
		
		for(int i = 0; i < 10; i++) {
			
			grapes.addLast(new Grape()
					.setGno(String.format("PODO%04d", i))
					.setLocation((int)(Math.random() * Grape.LOCATIONS))
					.setFruit((int)(Math.random() * 11 + 30)));
			System.out.println(grapes.getLast());
		}
		//포도는 무엇을 기준삼아 정렬할까?
		//원래는 Grape에 대해 sort를 쓸수없다 
		Collections.sort(grapes, new 포도분류기_포도알맹이_오름차순());
		
		System.out.println("=====정렬후=====");
		for(Grape grape : grapes) {
			System.out.println(grape);
		}
		
		//연습1 : 포도 알맹이 기준 내림차순 정렬해보기
		System.out.println("연습 1 ===========");
		Collections.sort(grapes, new 포도분류기_포도알맹이_내림차순());
		System.out.println("=====정렬후=====");
		for(Grape grape : grapes) {
			System.out.println(grape);
		}
		//연습2 : 포도 gno 기준 내림차순 정렬해보기
		System.out.println("연습 2 ===========");
		Collections.sort(grapes, new 포도분류기_gno_내림차순());
		for(Grape grape : grapes) {
			System.out.println(grape);
		}
	}
}
class 포도분류기_포도알맹이_오름차순 implements Comparator<Grape>{

	/*
	   # Comparator 의 규칙
	  
	 	- compare 메서드의 리턴 값이 양수이면 o1과 o2의 순서를 바꾼다
	 	- compare 메서드의 리턴 값이 0이면 같은 크기로 취급한다
	 	- compare 메서드의 리턴 값이 음수이면 o1과 o2의 순서를 그대로 유지한다
	 */
	@Override
	public int compare(Grape o1, Grape o2) {
		
		if(o1.fruit < o2.fruit) {
			return -1;
		}else if(o1.fruit == o2.fruit) {
			return 0;
		}else {
			return 1;			
		}		
	}	
}

class 포도분류기_포도알맹이_내림차순 implements Comparator<Grape>{

	@Override
	public int compare(Grape o1, Grape o2) {
		
		if(o1.fruit > o2.fruit) {
			return -1;
		}else if(o1.fruit == o2.fruit) {
			return 0;
		}else {
			return 1;			
		}	
	}	
}

class 포도분류기_gno_내림차순 implements Comparator<Grape>{

	@Override
	public int compare(Grape o1, Grape o2) {
		
//		if(o1.gno.equals(o2.gno)) {
//			return 0;
//		}else if(o1.gno.charAt(7) > o2.gno.charAt(7)) {
//			return -1;
//		}else if(o1.gno.charAt(6) > o2.gno.charAt(6)) {
//			return -1;
//		}else if(o1.gno.charAt(5) > o2.gno.charAt(5)) {
//			return -1;
//		}else if(o1.gno.charAt(4) > o2.gno.charAt(4)) {
//			return -1;
//		}else {
//			return  1;
//		}
//		int a = 1;
//		
//		for(int i = 0; i < o1.gno.length(); i++) {
//			if(o1.gno.charAt(i) > o2.gno.charAt(i)) {
//				a = -1;			
//			}else if(o1.gno.charAt(i) < o2.gno.charAt(i)) {
//				a = 1;
//			}else{
//				a = 0;
//			}
//		}
//		return a;
		
		//문자열의 알파벳 순서 비교는 이미 String 클래스에 구현되어있다
//		return o1.gno.compareTo(o2.gno); //오름차순
		return o1.gno.compareTo(o2.gno) * -1; //내림차순
		
	}
}


class Grape{
	private static String[] locationNames = {"말레이시아", "필리핀", "체코", "한국", "미국"};
	public static int LOCATIONS = locationNames.length;
	
	String gno;
	int location;
	int fruit;
	
	Grape setGno(String gno) {
		this.gno = gno;
		return this;
	}
	
	Grape setLocation(int location_id) {
		this.location = location_id;
		return this;
	}
	Grape setFruit(int fruit) {
		this.fruit = fruit;
		return this;
	}
	
	/*
	 	# equals()
	 
	 
	 	 - Object 메서드
	 	 - 같은 객체인지 비교할 때 어떤 동작으로 구분해야 하는지를 구현해놓은 메서드
	 	 - 원래의 기본동작은 주소값 비교이다
	 	 - return 값을 바꿔서 다른 것을 같다고 표현할수있다
	*/
	@Override
	public boolean equals(Object obj) {
		
		return this.gno == ((Grape)obj).gno;
	}
	/*
	 	# toString()
	 	
	 	 - 모든 객체에 포함되어 있는 메서드 (object 메서드)
	 	 - 이 인스턴스를 문자열로 표현한다면? 을 구현해놓은 메서드
	 	 - System.out.println()은 사실 전달한 인스턴스의 
	 	   toString() 메서드의 결과를 콘솔에 출력하는 메서드이다
	 	 - Object 클래스에 구현되어있는 메서드의 기본동작은
	 	   toString() 동작은 "클래스명@주소값" 이다(super.toString)
	 */
	@Override
	public String toString() {
	
		return gno + "/" + fruit + "/" + locationNames[location] + "/";
	}
}
