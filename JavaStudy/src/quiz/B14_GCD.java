package quiz;

import java.util.Scanner;

public class B14_GCD {

	public static void main(String[] args) {
	
	/*
	 	�� ���ڸ� �Է¹ް� �� ������ �ִ������� ���غ�����
	 	�ص� ������ ����� �� ���� ū �����
	 */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("ù��° ���ڸ� �Է��ϼ��� : ");
		int firstInput = sc.nextInt();
		System.out.print("�ι�° ���ڸ� �Է��ϼ��� : ");
		int secondInput = sc.nextInt();
		int gcd = 0;
		int temp;
		
		if(firstInput > secondInput) {			
			temp = firstInput;
			firstInput = secondInput;
			secondInput = temp;
		}
		
		for(int i = 1; i <= firstInput; i++) {
			if(firstInput % i == 0 && secondInput % i == 0) {				
					gcd = i;				
			}
		}		
		System.out.println("�ִ������� " + gcd + "�Դϴ�.");
	}

}
