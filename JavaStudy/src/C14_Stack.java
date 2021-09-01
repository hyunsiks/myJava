

public class C14_Stack {

	public static void main(String[] args) {
		a();
	}
	
	public static void a() {
		b();
	}
	public static void b() {
		b_1();
		c();
	}
	public static void b_1() {
		b_2();
	}
	public static void b_2() {
		System.out.println("hi (b_2)");
	}
	public static void c() {
		System.out.println("hi");
	}
	//메인을 실행	(1)
	// a를 실행	(2)
	// b를 실행	(3)
	// b_1를 실행	(4)
	// b_2를 실행	(5)	b_2 끝 (6)
	//				b_1 끝 (7)
	// c를 실행	(8)
	//				c 끝   (9)
	//				b 끝	  (10)
	//				a 끝	  (11)
}
