package quiz;

import java.util.Scanner;

public class B03_celToFahr {

	public static void main(String[] args) {
		
		//사용자로부터 섭씨 온도를 입력받으면
		//화씨 온도로 변환하여 출력해주는 프로그램을 만들어보세요
		//(변환공식은 구글검색, 출력은 소수 첫째 자리까지)
		
		Scanner sc = new Scanner(System.in);

		System.out.print("현재 섭시(℃) 온도를 입력하세요 >> ");
		double celsius = sc.nextDouble();
		double fahrenheit = (celsius * 9/5) + 32;
		
		System.out.printf("현재 화씨 온도는 %.1f℉ 입니다", fahrenheit);

		/*
		System.out.print("첫번째 숫자를 입력하세요 >> ");
		int a = sc.nextInt();
		System.out.print("두번째 숫자를 입력하세요 >> ");
		int b = sc.nextInt();
		int c = Math.max(a, b);
		int d = Math.min(a, b);
		System.out.printf("입력 받은 두 숫자 중에 큰수는 %d이고, 작은수는 %d입니다", c,d);
		*/
	}

}
