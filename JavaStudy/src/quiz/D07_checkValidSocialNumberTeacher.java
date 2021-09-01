package quiz;

import java.util.Collections;
import java.util.HashSet;

public class D07_checkValidSocialNumberTeacher {

	/*
	 	주민등록번호 등록하기
	 */
	private static HashSet<Integer> month31;
	private static HashSet<Integer> month30;
	private static HashSet<Integer> gender2000;
	
	//static을 인스턴스 생성자에서 초기화하면 낭비이므로 static블록에서 초기화 한다
	static {
		month31 = new HashSet<>();
		month30 = new HashSet<>();
		gender2000 = new HashSet<>();
		//T...elements : 가변인자(매개변수여러개가능)
		Collections.addAll(month31, 1,3,5,7,8,10,12);
		Collections.addAll(month30, 4,6,9,11);
		Collections.addAll(gender2000, 3,4,7,8);
	}
	
	class InvalidMonthException extends Exception{
		public InvalidMonthException() {
			super("주민등록번호 3,4에 올바르지 않은 값 입력됨");
		}
	}
	
	class InvalidDateException extends Exception{
		public InvalidDateException() {
			super("주민등록번호 5,6에 올바르지 않은 값 입력됨");
		}
	}
	
	public boolean isValidSocialNumber(String sn) throws InvalidMonthException, InvalidDateException{
		
		if(sn.length() != 14 || sn.charAt(6) != '-') {
			System.out.println("잘못된 주민등록 번호입니다");
			return false;
		}
		
		try {
			int year = Integer.parseInt(sn.substring(0,2));
			int month = Integer.parseInt(sn.substring(2,4));
			int day = Integer.parseInt(sn.substring(4,6));
			int back_number = Integer.parseInt(sn.substring(7));
			
			int gender = sn.charAt(7) - '0';
			
			year = year + (gender2000.contains(gender) ? 2000 :1900);
			
			System.out.println("year : " + year);
			System.out.println("주민등록번호 뒷자리 : " + back_number);
			
			boolean day28 = (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
			
					
			if(month > 12) {
				throw new InvalidMonthException();
			}else if(month31.contains(month) && day > 31) {
				throw new InvalidDateException();
			}else if(month30.contains(month) && day > 30) {
				throw new InvalidDateException();
			}else if(month ==2 && day28 && day > 29) {
				throw new InvalidDateException();				
			}else if(month == 2 && !day28 && day > 28) {
				throw new InvalidDateException();								
			}
		}catch(NumberFormatException e) {
			System.out.println("[invalid] 숫자가 아닌것이 있음");
			return false;
		}
//		catch(InvalidMonthException e) {
//			System.out.println("[invalid] " + e.getMessage());
//			return false;
//		}
		
		return true;
	}
	
	public static void main(String[] args) {
		
//		Scanner sc = new Scanner(System.in);
		try {
			if(new D07_checkValidSocialNumberTeacher().
			isValidSocialNumber("021231-1234567")) {
				
				System.out.println("올바른 주민등록번호");
			}else {
				System.out.println("안올바른 주민등록번호");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
}
