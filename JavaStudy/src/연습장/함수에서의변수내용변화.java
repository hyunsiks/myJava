package 연습장;

import java.util.HashSet;

public class 함수에서의변수내용변화 {

	public static void main(String[] args) {
		
		int int_a = 20;
		int int_b = 30;
		String string_a = "바보";
		String string_b = "천재";
		HashSet<Integer> hash_a = new HashSet<>();
		HashSet<Integer> hash_b = new HashSet<>();
		
		hash_a.add(10); hash_a.add(20);	hash_a.add(30);
		hash_b.add(30);	hash_a.add(40);	hash_a.add(50);
		
		System.out.println(plus(int_a, int_b));
		System.out.println("plus 후 int_a의 값 : " + int_a); //바뀌어있지않음(값만 복사하여 전달하기 때문에 안의 내용물은 그대로임)
		
		System.out.println(plus2(string_a, string_b));
		System.out.println("plus 후 String_a의 값 : " + string_a);//바뀌어있지않음(주소를 전달하지만, String클래스내에 final이 붙어있기 때문에 예외임)
		
		System.out.println(plus3(hash_a, hash_b));
		System.out.println("plus 후 hash_a의 값 : " + hash_a); //바뀌어있음(참조형변수의 주소전달)
		
		//소문자로 시작되는 (기본형)타입들은 매개변수로 전달할 때 '값' 을 복사하여 전달한다
		//ex) int 같은 것은 값을 복사전달하는것이기 때문에 주소에 있는 값은 그대로다
		
		//대문자로 시작되는 (참조형)타입(String제외)들은 매개변수로 전달할 때 '주소' 를 복사하여 전달한다
		//ex) set 같은 것은 주소를 전달하기 때문에 주소안의 값이 바뀔수있다
	}
	public static int plus(int a, int b) {
		a += b;
		return a;
	}
	public static String plus2(String a, String b) {
		//String은 값을 변화시킬수 없다
		//+=을 할때 알아서 새로운 String 인스턴스를 생성하도록 설계되어있다
		a += b;
		return a;
	}
	public static HashSet plus3(HashSet a, HashSet b) {
		
		a.addAll(b);
		
		return a;
	}
	

}
