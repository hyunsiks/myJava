package quiz;

import java.util.Random;
import java.util.Scanner;

public class B16_31Game {

	public static void main(String[] args) {
		
	/*
	 	31������ ����� ������
	 	-��ǻ�Ϳ� ����� �����ư��鼭 ���ڸ� �����ؾ� �Ѵ�.(��/�İ� ����)
	 	-��ǻ�ʹ� �������� ���ڸ� �����Ѵ�
	 	-�������� 31�̻��� ���ڸ� ���� �÷��̾ �й��Ѵ�	 	
	 */
		
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();
		System.out.println("31���� ����!!!");
		
		int num = 0;
		int turn = 0;
		
		while(num < 31) {
			if(turn == 0) {
				System.out.println("������ ���ڸ� �������� : ");				
					int userDecision = sc.nextInt();
					num+= userDecision;
					System.out.println("����� " + userDecision + "�� ����, ���� ���ڴ� : " + num);
					turn = 1;					
				if(num >= 31) {
					System.out.println("==========����� �й��߽��ϴ�==========");
				}
			}else {
				if(num == 27) {
					num += 3;
					System.out.println("��ǻ�Ͱ� 3�� ����, ���� ���ڴ� : " + num);
					turn = 0;
				}else if(num == 28) {
					num+= 2;
					System.out.println("��ǻ�Ͱ� 2�� ����, ���� ���ڴ� : " + num);
					turn = 0;
				}else if(num == 29) {
					num += 1;
					System.out.println("��ǻ�Ͱ� 1�� ����, ���� ���ڴ� : " + num);
					turn = 0;
				}else {
					int comDecision = ran.nextInt(3) + 1;
					num+= comDecision;
					System.out.println("��ǻ�Ͱ�" + comDecision + "�� ����, ���� ���ڴ� : " + num);
					turn = 0;				
					if(num >= 31) {
						System.out.println("==========��ǻ�Ͱ� �й��߽��ϴ�==========");					
					}
				}		
			}
		}
		
	}

}
