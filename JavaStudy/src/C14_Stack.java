

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
	//������ ����	(1)
	// a�� ����	(2)
	// b�� ����	(3)
	// b_1�� ����	(4)
	// b_2�� ����	(5)	b_2 �� (6)
	//				b_1 �� (7)
	// c�� ����	(8)
	//				c ��   (9)
	//				b ��	  (10)
	//				a ��	  (11)
}
