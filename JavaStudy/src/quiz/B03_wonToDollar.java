package quiz;

import java.util.Scanner;

public class B03_wonToDollar {
	
	//한국 돈을 입력하면 미국 달러로 환전해주는 프로그램을 만들어보세요
	//(현재 환율은 구글 검색, 소수 둘째 자리까지 출력, 환전 수수료 1.75%)

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		/*
		System.out.print("한국 돈을 입력하세요 >> ");
		int won = sc.nextInt();
		
		double dollar = won / 1122.60;
		double tax = dollar * 1.75 / 100;
		double exchange = dollar - tax;
		
		System.out.println("환율은 " + dollar + "이고, 수수료는 " + tax + "입니다.");
		System.out.printf("환전 가격은 %.2f$ 입니다", exchange);
		*/
		
		//final이 함께 선언된 변수는 나중에 값을 변경할 수 없다
		final double WON_TO_DOLLAR = 0.00089;
		
		System.out.println("한국 돈을 입력해주세요. 달러로 바꿔드립니다.(수수료 1.75%) : ");
		int korMoney = sc.nextInt();
		
		double usd = korMoney * WON_TO_DOLLAR;
		double exchangeFee = usd * 0.0175;
		System.out.printf("%d원은 %.2fUSD입니다.\n", korMoney, usd-exchangeFee);
		
		System.out.println(Math.round(usd*0.9825 * 100) / 100.0 + "$" );
	}

}
