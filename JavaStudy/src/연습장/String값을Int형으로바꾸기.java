package 연습장;

public class String값을Int형으로바꾸기 {

	public static void main(String[] args) {
	
		String a = "123";
		String b = "456";
		String c = "ab";
		//Integer.parseInt() 로서 스트링 타입을 인트타입으로 바꿀수있다
//		System.out.println(Integer.parseInt(c)); 그러나 스트링(c)처럼 스트링값이 숫자가 아닌 문자이면 int타입으로 바꿀수 없다(에러)
		
		System.out.println(a + b);
		System.out.println(Integer.parseInt(a) + b);
		System.out.println(Integer.parseInt(a) + Integer.parseInt(b));

	}

}
