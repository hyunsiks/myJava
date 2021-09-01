package quiz;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Calendar;

/*
   월(1, 6) 화(2,7) 수(3,8) 목(4,9) 금(5, 0) 공휴일(다됨), 제외차량(장애인,유아동승,경차)
     
 */

public class D11_CarNumber {

	LocalDate today;
	DayOfWeek dayOfWeek;
	LocalDate day;
	
	public static void main(String[] args) {
		
		D11_CarNumber cn = new D11_CarNumber();
		cn.checkNumber("1236");
	}
	
	public D11_CarNumber() {
		today = LocalDate.now().plusDays(51);
		dayOfWeek = today.getDayOfWeek();
		day = LocalDate.of(today.getYear(), today.getMonth(), today.getDayOfMonth());
	}
	
	boolean checkNumber(String carNum) {
		
		System.out.println("오늘날짜 : " + day);
		
		char lastNum = carNum.charAt(3);
		
		if(holiday(dayOfWeek)) {
			System.out.println("오늘은 공휴일이므로 모든차량가능");
			return true;
		}
		
		if((lastNum - '0') % 5 == 1) {
			if(dayOfWeek == DayOfWeek.MONDAY) {
				System.out.println("출입제한요일");
				return false;
			}
		}else if((lastNum - '0') % 5 == 2) {
			if(dayOfWeek == DayOfWeek.TUESDAY) {
				System.out.println("출입제한요일");
				return false;
			}
		}else if((lastNum - '0') % 5 == 3) {
			if(dayOfWeek == DayOfWeek.WEDNESDAY) {
				System.out.println("출입제한요일");
				return false;
			}
		}else if((lastNum - '0') % 5 == 4) {
			if(dayOfWeek == DayOfWeek.THURSDAY) {
				System.out.println("출입제한요일");
				return false;
			}
		}else if((lastNum - '0') % 5 == 0) {
			if(dayOfWeek == DayOfWeek.FRIDAY) {
				System.out.println("출입제한요일");
				return false;
			}
		}
		System.out.printf("오늘은 '%s' 로 '%s' 차량은 출입가능합니다", dayOfWeek, carNum);
		return true;
	}
	
	boolean holiday(DayOfWeek dayofweek) {
		
		if(dayofweek == DayOfWeek.SATURDAY || dayofweek == DayOfWeek.SUNDAY) {
			return true;
		}
	
		LocalDate 설날 = LocalDate.of(today.getYear(), 1, 1);
		LocalDate 삼일절 = LocalDate.of(today.getYear(), 3, 1);
		LocalDate 어린이날 = LocalDate.of(today.getYear(), 5, 5);
		LocalDate 부처님오신날 = LocalDate.of(today.getYear(), 5, 19);
		LocalDate 현충일 = LocalDate.of(today.getYear(), 6, 6);
		LocalDate 광복절 = LocalDate.of(today.getYear(), 8, 15);
		LocalDate 개천절 = LocalDate.of(today.getYear(), 10, 3);
		LocalDate 한글날 = LocalDate.of(today.getYear(), 10, 9);
		LocalDate 크리스마스 = LocalDate.of(today.getYear(), 12, 25);
		
		if(day.equals(설날) || day.equals(삼일절) || day.equals(어린이날) || day.equals(부처님오신날) ||
		   day.equals(현충일) || day.equals(광복절) || day.equals(개천절) || day.equals(한글날) ||
		   day.equals(크리스마스)) {
			return true;
		}
		return false;
	}

}
