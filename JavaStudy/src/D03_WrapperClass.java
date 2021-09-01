

public class D03_WrapperClass {

	
	/*
	 	# Wrapper Class
	 	
	 	 - 기본 타입들을 참조형 타입으로 사용하기 위한 클래스
	 	 - 각 타입들에 대한 유용한 기능들이 모여있다
	 	 
	 	# 기본형 타입 이름
	 	
	 	 - byte, short, char, int, long, float, double
	 	 
	 	# 참조형 이름
	 	
	 	 - Byte, Short, Character, Integer, Long, Float, Double, Boolean
	 */
		
	
	public static void main(String[] args) {
	
		Integer i = Integer.valueOf(10);
		Integer i2 = new Integer(10); //가운데줄그어진것은 사용할수는 있지만 별로 추천하지 않고 지원하지 않겠다는것
		
		// # parse 시리즈 (스트링을 인트값으로, 인트값을 진수로 바꾸는데 유용)
		//	- 문자열을 원하는 타입으로 변환ㄴ시키는 기능
		//	- 각 타입에 스태틱 메서드로 존재한다
		//	- 데이터를 주고 받을때는 잠시 문자열로 변환하여 전송되는 경우가 많다
		//	- 다시 사용하기 위해서는 받은 데이터를 원래의 타입으로 되돌려야 한다
		//	- radix가 적혀있는 오버로딩은 진법을 의미한다
		
		try {
			int a = Integer.parseInt("1234ABC", 16);
			System.out.println(a); 
		}catch(NumberFormatException e) {
			System.out.println("int로 변환할 수 없는 문자열이었습니다...");
		}		
		System.out.printf("%.9f\n", Double.parseDouble("123.123456789"));
		System.out.println(Boolean.parseBoolean("tRuE"));
		
		// # toString() 시리즈
		//	- 해당 타입의 값을 손쉽게 문자열로 변환할 수 있다
		//	- toString은 Object의 메서드이기 때문에 모든 클래스에 존재한다
		//	- 인스턴스 메서드 toString()은 해당 인스턴스의 값을 문자열로 변환한다
		//	- 스태틱 메서드 toString()은 전달한 값을 문자열로 변환한다
		int num = 12;
		System.out.println(Integer.toString(num, 2)); //진법이 바뀜
		System.out.println(Integer.toString(num, 8));
		System.out.println(Integer.toString(num, 16));
		System.out.println(Character.toString('A'));
		
//		num.toString //int변수는 안됨
		Integer num2 = 10;
		num2.toString(); //Integer변수는 됨
		
		/*
		   # typeValue() 시리즈
		   
		    - 해당 인스턴스 값을 원하는 타입의 값으로 손쉽게 변경하는 메서드
		    - 타입캐스팅의 참조형 버젼(참조형 -> 기본형)
		 */
		Integer num3 = 10000000;
		
		System.out.println(num3.byteValue());
		System.out.println(num3.shortValue());
		System.out.println(num3.floatValue());
		System.out.println(num3.doubleValue());
		
	}

}
