package quiz;

import java.util.Scanner;

public class B08_MonthToSeason {

	public static void main(String[] args) {
	
	/*
	 	����ڷκ��� ���� �Է¹����� �ش��ϴ� ��¿�� ����غ�����
	 	(switch-case���� �̿�)
	 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� ���� �Է��ϼ���.(���ڸ� ��������) : ");
		
		int month = 0;
		
		try {
			month = sc.nextInt();
		} catch(Exception e) {
			
		}
		switch(month) {
		case 12 : case 1 : case 2 :
			System.out.println(month + "���� �ܿ� �Դϴ�.");
			break;
		case 3 : case 4 : case 5 :
			System.out.println(month + "���� �� �Դϴ�.");
			break;
		case 6 : case 7 : case 8 :
			System.out.println(month + "���� ���� �Դϴ�.");
			break;
		case 9 : case 10 : case 11 :
			System.out.println(month + "���� ���� �Դϴ�.");
			break;
		default :
			System.out.println("�߸��� �Է��Դϴ�.");
			break;
		}

	}

}
