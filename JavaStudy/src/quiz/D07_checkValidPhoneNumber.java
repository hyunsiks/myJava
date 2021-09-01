package quiz;

import java.util.Scanner;

public class D07_checkValidPhoneNumber {

	/*
	  사용자로부터 핸드폰번호를 입력받으면
	  올바른 전화번호인지 구분하는 프로그램을 만들어보세요
	  
	  앞의 3자리가 '숫자' 
	  두번째 숫자는 3자리 혹은 4자리
	  세번째 숫자는 4자리
	  4번째 또는 8번째 또는 9번째 문자는 '-'
	 */
	Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		D07_checkValidPhoneNumber pn = new D07_checkValidPhoneNumber();
		
		pn.checkNumber("010-123-1234");
		pn.checkNumber("010-1234-1234");
		pn.checkNumber("010-12345-123");
	}
	
	
	public void checkNumber (String number) {		
		
		int count = 0;
		
		while(true) {			
			try {
				for(int i = 0; i < 3; i++) { //3번째까지 숫자인지 아닌지확인
				
					Integer.parseInt(Character.toString(number.charAt(i)));
					count++;					
				}
				if(count == 3) {
					count = 0;
					break;
				}else {
					System.out.println("번호가 잘못되었습니다");
					System.out.println("번호를 다시 입력하세요 : ");
					number = sc.next();
				}
			}catch(NumberFormatException e) {
				System.out.println("번호가 잘못되었습니다");
				System.out.println("번호를 다시 입력하세요 : ");
				number = sc.next();
			}			
		}
		
	
		while(true) {
			
			if(number.charAt(3) == '-') { //4번째가 - 이어야함
				break;
			}else {
				System.out.println("번호가 잘못되었습니다");
				System.out.println("번호를 다시 입력하세요 : ");
				number = sc.next();
			}
		}
		
		while(true) { //중간 3개나 4개가 숫자여야함
			try {
				for(int i = 4; i < 7; i++) { //3번째까지 숫자인지 아닌지확인
				
//					System.out.println(number.charAt(i) - '0');
//					System.out.println(Integer.parseInt(Character.toString(number.charAt(i))));
					if(number.charAt(i) - '0' == Integer.parseInt(Character.toString(number.charAt(i)))) {
						count++;;
					}			
				}
				if(count == 3) {
					count = 0;
					break;
				}else {
					System.out.println("번호가 잘못되었습니다");
					System.out.println("번호를 다시 입력하세요 : ");
					number = sc.next();
				}
			}catch(NumberFormatException e) {
				System.out.println("번호가 잘못되었습니다");
				System.out.println("번호를 다시 입력하세요 : ");
				number = sc.next();
			}			
		}
		
		 //마지막 -
		while(true) {
			try {
				if(number.charAt(7) == '-' ||	number.charAt(7) - '0' == Integer.parseInt(Character.toString(number.charAt(7)))) {
					break;
				}else {
					System.out.println("번호가 잘못되었습니다");
					System.out.println("번호를 다시 입력하세요 : ");
					number = sc.next();
				}
			}catch(NumberFormatException e) {
				System.out.println("번호가 잘못되었습니다");
				System.out.println("번호를 다시 입력하세요 : ");
				number = sc.next();	
			}
		}
		//마지막 숫자 4자리
		if(number.charAt(7) == '-') {
			while(true) {			
				try {
					for(int i = 8; i < 12; i++) { 
					
						if(number.charAt(i) - '0' == Integer.parseInt(Character.toString(number.charAt(i)))) {
							count++;
						}			
					}
					if(count == 4) {
						count = 0;
						break;
					}else {
						System.out.println("번호가 잘못되었습니다");
						System.out.println("번호를 다시 입력하세요 : ");
						number = sc.next();
					}
				}catch(NumberFormatException e) {
					System.out.println("번호가 잘못되었습니다");
					System.out.println("번호를 다시 입력하세요 : ");
					number = sc.next();
					new D07_checkValidPhoneNumber().checkNumber(number);
					break;
				}			
			}
			System.out.println("정상적으로 번호가 입력되었습니다");
			System.out.println("입력하신번호 : " + number);
		}else {
			boolean judge = true;
			while(judge) {
				if(number.charAt(8) == '-') {
					while(true) {		
						try {
							for(int i = 9; i < 13; i++) { 
							
								if(number.charAt(i) - '0' == Integer.parseInt(Character.toString(number.charAt(i)))) {
									count++;
								}			
							}
							if(count == 4) {
								count = 0;								
								System.out.println("정상적으로 번호가 입력되었습니다");
								System.out.println("입력하신번호 : " + number);
								judge = false;
								break;
							}else {
								System.out.println("번호가 잘못되었습니다");
								System.out.println("번호를 다시 입력하세요 : ");
								number = sc.next();
							}
						}catch(NumberFormatException e) {
							System.out.println("번호가 잘못되었습니다");
							System.out.println("번호를 다시 입력하세요 : ");
							number = sc.next();
						}
						System.out.println("정상적으로 번호가 입력되었습니다");
						System.out.println("입력하신번호 : " + number);
						judge = false;
					}
				}else {
					System.out.println("번호가 잘못되었습니다");
					System.out.println("번호를 다시 입력하세요 : ");
					number = sc.next();
					new D07_checkValidPhoneNumber().checkNumber(number);
					break;
				}
			}
		}
	}
}
