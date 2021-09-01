package quiz;

import java.util.Calendar;
import java.util.Scanner;
import java.util.TimeZone;

public class D11_DiscountDay {

	/*
		어떤 카페에서 짝수번째 목요일마다 할인행사를 진행한다고 가정 할 때
		년도를 입력하면 해당 년도의 모든 할인 날짜를 출력해보세요
	 */
	
	public static void main(String[] args) {
		
		Calendar korea = Calendar.getInstance();
		
		System.out.println("년도 입력 : ");
		int insertYear = new Scanner(System.in).nextInt();
				
		korea.set(Calendar.YEAR, insertYear); //년도설정
		
		int year = korea.getActualMaximum(Calendar.DAY_OF_YEAR); //해당 년도에 길이

		for(int i =1; i <= year; i++) {
			korea.set(Calendar.DAY_OF_YEAR, i); //365일을 한번씩 거침
			
			int dowim = korea.get(Calendar.DAY_OF_WEEK_IN_MONTH);
			
			if(dowim == 2 || dowim == 4) { //2주차 4주차만
								
				if(korea.get(Calendar.DAY_OF_WEEK) == 5) { //목요일만 
					
					System.out.printf("%d년 %d월 %d일\n", korea.get(Calendar.YEAR), korea.get(Calendar.MONTH) + 1, korea.get(Calendar.DATE));
				}				
			}
		}
	}
}
