package quiz;

public class B04_ConditionQuiz {

	public static void main(String[] args) {
	
//	[ 알맞은 비교연산을 만들어보세요]
//		*비교를 할 때에는 변수가 왼쪽에 있는 것이 좋다
	
//		1. int형 변수 a가 10보다 크고 20보다 작을 때 true
		int a = 15;
		System.out.print("1번 문제의 결과 : ");
		System.out.println(a > 10 && a < 20);
		
//		2. int형 변수 b가 짝수일 때 true
		int b = 16;
		System.out.print("2번 문제의 결과 : ");
		System.out.println(b % 2 == 0);
		
//		3. int형 변수 c가 7의 배수일 때 true
		int c = 21;
		System.out.print("3번 문제의 결과 : ");
		System.out.println(c % 7 == 0);
		
//		4. int형 변수 hour가 0미만 24이상이 아니고, 12이상 일 때 true
		int hour = 16;
		System.out.print("4번 문제의 결과 : ");
		System.out.println(hour >= 12 && hour < 24);
		
//		5. int형 변수 d와 e의 차이가 30일 때 true
		int d = 40, e = 10;
		System.out.print("5번 문제의 결과 : ");
		System.out.println(Math.abs(d - e) == 30);
		
//		6. int형 변수 year가 400으로 나누어 떨어지거나
//		   또는 4로 나누어 떨어지고 100으로 나누어떨어지지 않을 때 true
		int year = 800;
		System.out.print("6번 문제의 결과 : ");
		System.out.println(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0));
		
//		7. 민수가 철수보다 2살 많으면 true
		int minsuAge = 16, chulsuAge = 14;
		System.out.print("7번 문제의 결과 : ");
		System.out.println(minsuAge - chulsuAge == 2);
		
//		8. 민수가 철수보다 생일이 3달 빠르면 true
		int minsuBirth = 3, chulsuBirth = 6;
		System.out.print("8번 문제의 결과 : ");
		System.out.println(chulsuBirth - minsuBirth == 3);
		
//		9. boolean형 변수 powerOn이 false일 때 true
		boolean powerOn = false;
		System.out.print("9번 문제의 결과 : ");
		System.out.println(!powerOn);
		
//		10. 문자열 참조변수 str이 "yes"일 때 true
		String str = "yes";
		System.out.print("10번 문제의 결과 : ");
		System.out.println(str == "yes");
		
		//!!!! #문자열(참조형 타입)은 ==으로 비교하면 안된다.
		//  참조형 타입의 값을 비교할 때는 해당 클래스에 정의되어 있는
		//  equals()라는 메서드를 이용해야한다
		System.out.println(str.equals("yes"));
		/*
		  # 기본형 타입과 참조형 타입의 차이점
		  	- 기본형 타입은 내부 데이터의 크기를 예측하기 쉽다
		  		(차곡차곡 쌓이는 메모리를 사용한다, Stack)
		  	- 참조형 타입은 내부 데이터의 크기를 예측하기 어렵다
		  		(여기저기 막 쓰는 메모리를 사용한다, Heap)
		 */
		String str1 = "yes";
		String str2 = new String("yes"); //new를 쓰면 새로운 스트링을 만들겠다는것, 즉시 주소를 새로파겠다는것
		String str3 = "yes";
		
		System.out.println(str1 == str2); //주소가 다르기 때문에 false
		System.out.println(str1 == str3); //주소가 같기 때문에 true
		System.out.println(str1.equals(str3)); //주소들의 값들을 찾아가서 비교한다(즉, str1 주소와 str3의 주소의 값을 찾아가서 비교)
		

	}

}
