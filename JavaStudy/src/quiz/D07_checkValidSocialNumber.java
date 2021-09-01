package quiz;

public class D07_checkValidSocialNumber {

	/*
	  사용자가 주민등록번호를 입력하면 
	  그 주민등록번호가 유효한지 검사하는 프로그램
	 
	  맨앞 2자리 숫
	  월자리에 01~12 이내의 숫자
	  일자리에 01~31 
	  7번째자리 '-'
	  8번째자리 1,2,3,4
	 */
	String registrationNumber;
	int thirtyone;
	int thirty;
	
	public static void main(String[] args) {
		
		D07_checkValidSocialNumber ch = new D07_checkValidSocialNumber();
		if(ch.check("721212-1927483")) {
			System.out.println("올바른 주민번호입니다");
		}
		if(ch.check("725212-1927483")) {
			System.out.println("올바른 주민번호입니다");
		}
		if(ch.check("720252-1927483")) {
			System.out.println("올바른 주민번호입니다");
		}
		if(ch.check("720212-5927483")) {
			System.out.println("올바른 주민번호입니다");
		}
		if(ch.check("720232-1927483")) {
			System.out.println("올바른 주민번호입니다");
		}
		if(ch.check("000229-1927483")) {
			System.out.println("올바른 주민번호입니다");
		}
	}
	
	private static boolean checkNumeric(char ch) {
		return ch >= '0' && ch <= '9';
	}
	
	public boolean check(String registrationNumber) {
		
		this.registrationNumber = registrationNumber;
		
		int len = registrationNumber.length();
		
		char ch;
		
		for(int i = 0; i < len; i++) {					
			
			
			if(len != 14) {
				System.out.println("[error] 길이가 올바르지 않습니다");
				return false;
			}
			
			ch = registrationNumber.charAt(i);
			
			if(i < 2 && !checkNumeric(ch)) {
				System.out.println("[error] 맨앞 2자리에 숫자 아닌것이 있습니다");
				return false;
			}else if(i==2 && (ch != '0' && ch != '1')) {
				System.out.println("'월' 을 잘못표시했습니다");
				return false;
			}else if(i==3 && !checkNumeric(ch)){
				System.out.println("[error] 4번째 자리에 숫자 아닌것이 있습니다");
				return false;
			}else if(i==4 && !(ch == '0' || ch == '1' || ch == '2' || ch == '3')) {
				System.out.println("'일'을 잘못표시했습니다");				
				return false;
			}else if(i==5 && !checkNumeric(ch)) {
				System.out.println("[error] 6번째 자리에 숫자 아닌것이 있습니다");
				return false;
			}else if(i==6 && ch != '-') {
				System.out.println("'-' 표시가 올바르지 않습니다");
				return false;
			}else if(i==7 && !(ch == '1' || ch == '2' || ch == '3' || ch == '4')) {
				System.out.println("[error] 뒷자리 첫째 숫자가 잘못되었습니다");
				return false;
			}else if(i >= 8 && !checkNumeric(ch)) {
				System.out.println("[error] 뒷자리에 숫자 아닌것이 있습니다");
				return false;
			}
		}
		
		if(month(registrationNumber) == 31 && registrationNumber.charAt(4) == '3') {
			if(registrationNumber.charAt(5) != '1' && registrationNumber.charAt(5) != '0') {
				System.out.println("31일 범위내에 없습니다");
				return false;
			}
		}
		if(month(registrationNumber) == 30 && registrationNumber.charAt(4) == '3') {
			if(registrationNumber.charAt(5) != '0') {
				System.out.println("30일 범위내에 없습니다");
				return false;
			}
		}
		String year = "";
		
		if(registrationNumber.charAt(0) != '0' && registrationNumber.charAt(0) != '1'){
			
			year = "19" + registrationNumber.charAt(0) + registrationNumber.charAt(1);
		}else {
			year = "20" + registrationNumber.charAt(0) + registrationNumber.charAt(1);
		}
		
		int intYear;
		intYear = Integer.parseInt(year);
		
		if(month(registrationNumber) == 28) {
			if(registrationNumber.charAt(4) == '3') {
				System.out.println("일 범위를 초과하였습니다");
				return false;
			}
			if(intYear % 400 == 0 || ( intYear % 4 == 0 && intYear % 100 != 0)){
				if(registrationNumber.charAt(4) == '3') {
					System.out.println("윤달이기 때문에 날짜가 잘못되었습니다");
					return false;
				}
				if(registrationNumber.charAt(4) == '2' && registrationNumber.charAt(5) == '9') {
					System.out.println("윤달이기 때문에 날짜가 잘못되었습니다");
					return false;
				}
		    }
		}
		
		
		return true;			
	}
	
	int month(String registrationNumber) {
		//1,3,5,7,8,10,12 31일
		//4,6,9,11 30일
		//2월 윤달
	
		if(registrationNumber.charAt(3) == '4' ||  registrationNumber.charAt(3) == '6' ||registrationNumber.charAt(3) == '9' ||
				(registrationNumber.charAt(3) == '1' && registrationNumber.charAt(2) == '1')) {
				return 31;
		}else if(registrationNumber.charAt(3) == '2') {
			return 28;
		}else {
			return 30;
		}
	}
	
}
