package quiz;

import java.util.Scanner;

public class B08_MonthToSeason {

	public static void main(String[] args) {
	
	/*
	 	사용자로부터 달을 입력받으면 해당하는 계쩔을 출력해보세요
	 	(switch-case문을 이용)
	 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("현재 달을 입력하세요.(숫자만 적으세요) : ");
		
		int month = 0;
		
		try {
			month = sc.nextInt();
		} catch(Exception e) {
			
		}
		switch(month) {
		case 12 : case 1 : case 2 :
			System.out.println(month + "월은 겨울 입니다.");
			break;
		case 3 : case 4 : case 5 :
			System.out.println(month + "월은 봄 입니다.");
			break;
		case 6 : case 7 : case 8 :
			System.out.println(month + "월은 여름 입니다.");
			break;
		case 9 : case 10 : case 11 :
			System.out.println(month + "월은 가을 입니다.");
			break;
		default :
			System.out.println("잘못된 입력입니다.");
			break;
		}

	}

}
