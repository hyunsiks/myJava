package quiz;

import java.util.Scanner;

public class B03_wonToDollar {
	
	//�ѱ� ���� �Է��ϸ� �̱� �޷��� ȯ�����ִ� ���α׷��� ��������
	//(���� ȯ���� ���� �˻�, �Ҽ� ��° �ڸ����� ���, ȯ�� ������ 1.75%)

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		/*
		System.out.print("�ѱ� ���� �Է��ϼ��� >> ");
		int won = sc.nextInt();
		
		double dollar = won / 1122.60;
		double tax = dollar * 1.75 / 100;
		double exchange = dollar - tax;
		
		System.out.println("ȯ���� " + dollar + "�̰�, ������� " + tax + "�Դϴ�.");
		System.out.printf("ȯ�� ������ %.2f$ �Դϴ�", exchange);
		*/
		
		//final�� �Բ� ����� ������ ���߿� ���� ������ �� ����
		final double WON_TO_DOLLAR = 0.00089;
		
		System.out.println("�ѱ� ���� �Է����ּ���. �޷��� �ٲ�帳�ϴ�.(������ 1.75%) : ");
		int korMoney = sc.nextInt();
		
		double usd = korMoney * WON_TO_DOLLAR;
		double exchangeFee = usd * 0.0175;
		System.out.printf("%d���� %.2fUSD�Դϴ�.\n", korMoney, usd-exchangeFee);
		
		System.out.println(Math.round(usd*0.9825 * 100) / 100.0 + "$" );
	}

}
