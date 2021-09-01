
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class D13_Time {

	/*
	 	# java.time 패키지
	 	
	 	 - Calendar의 인스턴스를 set()을 통해 변화시킨다는 단점을 보완한 클래스
	 	 
	 	 - java.time 패키지의 클래스들은 시간을 계산한 뒤 새로운 인스턴스를 반환하고
	 	   원본 인스턴스는 그대로 유지한다
	 	   
	 	 - LocalDate, LocalTime, LocalDateTime이 있다
	 */
	public static void main(String[] args) {
		
//		1. now() : 지금 시간의 인스턴스를 생성하는 메서드
		
		//LocalDate : 날짜만 저장하기 위한 클래스
		LocalDate today = LocalDate.now();
		System.out.println(today);
		
		//LocalTime : 시간만 저장하기 위한 클래스
		LocalTime now = LocalTime.now();
		System.out.println(now);
		
		//LocalDateTime : 날짜와 시간을 모두저장하기위한 클래스(가운데 T라는 delemeter 해놓고 짤라쓰게해둠)
		LocalDateTime dateTime = LocalDateTime.now();
		System.out.println(dateTime);
		
//		2. of() : 원하는 날짜/시간의 인스턴스를 생성하는 메서드
		
		LocalDate childrensDay = LocalDate.of(2021, 5, 5);
		System.out.println(childrensDay);
		LocalTime promise = LocalTime.of(17, 8);
		System.out.println(promise);
		LocalDateTime my_promise = LocalDateTime.of(childrensDay, promise);
		System.out.println(my_promise);
		
//		3. 시간을 변경하기
		
		System.out.println(promise.plusHours(3)); //약속시간보다 3시간 뒤인 인스턴스를 반환
		//Calendar 같은 경우에는 Calendar.set 으로 변경하면 내부자체가 변경된다
		System.out.println(childrensDay.getMonth());
		System.out.println(childrensDay.getMonthValue());
		System.out.println(childrensDay.minusWeeks(1)); //일주일전
		
//		4. 시간을 문자열로 변환하기
		// 객체.format(DateTimeFormmater.ofPattern("y년 M월 d일"));
		//- DateTimeFormatter 클래스를 사용
		//- 다양한 static 메서드와 표준들을 이용해 문자열 형식을 지정할 수 있다
		
		// DateTimeFormatter.ofPattern(str) : 포맷 직접 만들기
		System.out.println(childrensDay.format(DateTimeFormatter.ofPattern("y년 M월 d일")));
		
		// .다양한 표준 이름들 : 표준사용하기
		System.out.println(childrensDay.format(DateTimeFormatter.BASIC_ISO_DATE));
		System.out.println(childrensDay.format(DateTimeFormatter.ISO_LOCAL_DATE));
		
//		5. 시간 객체끼리 비교하기 (isAfter, isBefore)
		LocalDate christmas = LocalDate.of(2021, 12, 25);
		
		System.out.println("2021년 어린이날이 2021년 크리스마스보다 뒤인가요? : " 
				+ childrensDay.isAfter(christmas));
		System.out.println("2021년 어린이날이 2021년 크리스마스보다 뒤인가요? : " 
				+ childrensDay.isBefore(christmas));
	}
}




















