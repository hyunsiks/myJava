package quiz;

import java.util.Scanner;

public class B08_ConvertSecond {

	public static void main(String[] args) {
		
	/*
	  # 초를 입력받으면 년/ 일/ 시간/ 분/ 초로 변환하여 출력해보세요
	   필요없는 단위는 출력하지 말것
	   ex) 0년 0일 5시간 0분 20초인 경우 0년 0일은 나오지 않아야 함
	 */

		Scanner sc = new Scanner(System.in);
		/*
		System.out.print("변경하길 원하는 수(초)를 입력하세요");
		
		
		long insertTime = sc.nextLong();
		int sec;
		int min = 60;
		int hour = min * 60;
		int day = hour * 24;
		int year = day * 365;
		long yearCount = 0, dayCount = 0, hourCount = 0, minCount = 0;
		
		if(insertTime / year > 0) {
			yearCount = insertTime / year;
			System.out.print(insertTime / year + "년 ");
			insertTime %= year;			
		}
		if(insertTime / day > 0) {
			dayCount = insertTime / day;
			System.out.print(insertTime / day + "일 ");
			insertTime %= day;		
		}else if(yearCount > 0) {
			dayCount = insertTime / day;
			System.out.print(insertTime / day + "일 ");
			insertTime %= day;
		}
		if(insertTime / hour > 0) {
			hourCount = insertTime / hour;
			System.out.print(insertTime / hour + "시간 ");
			insertTime %= hour;
		}else if(yearCount > 0 || dayCount > 0) {
			hourCount = insertTime / hour;
			System.out.print(insertTime / hour + "시간 ");
			insertTime %= hour;
		}
		if(insertTime / min > 0) {
			System.out.print(insertTime / min + "분 ");
			insertTime%= min;
		}else if(yearCount > 0 || dayCount > 0 || hourCount > 0) {
			System.out.print(insertTime / min + "분 ");
			insertTime %= min;
		}
		System.out.println(insertTime + "초 입니다.");
		*/
		
//		------------------------------------------------------------------------------------
	//강사님 풀이법
		System.out.print("초 > ");
		int second = sc.nextInt();
		int original = second;
		
		int y = 0, d = 0, h = 0, m = 0, s = 0;
		
		y = second / (60 * 60 * 24 * 365);
		second %= (60 * 60 * 24 * 365);

		d = second / (60 * 60 * 24);
		second %= (60 * 60 * 24);

		h = second / (60 * 60);
		second %= (60 * 60);

		m = second / 60;
		second %= 60;

		s = second;
		
//		System.out.printf("'%d'초는 변환하면 '%d'년 %d일 %시간 %분 %초' 입니다.\n", original, y, d, h, m, s);
		
		System.out.printf("%d 초는 변환하면", original);
		
		boolean exist = false;
		//true를 쓰는 이유는 앞이 true가 뜬다면 그 아래로는 무조건 0이든 아니든 출력하겠다는것
		//즉, y에서 true가 떠버리는 순간 그 아래로는 0이어도 출력하겠다는것
		if(y != 0) { 
			System.out.print(y + "년 ");
			exist = true;
		}
		if(exist || d != 0) {
			System.out.print(d + "일 ");
			exist = true;
		}
		if(exist || h != 0) {
			System.out.print(h + "시간 ");
			exist = true;
		}
		if(exist || m != 0) {
			System.out.print(m + "분 ");
		}
		System.out.print(s + "초 입니다.");
		
	}
	
	//53550000
}
