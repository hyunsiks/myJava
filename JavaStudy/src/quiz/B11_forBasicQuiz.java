package quiz;

import java.util.Scanner;

public class B11_forBasicQuiz {

	public static void main(String[] args) {
	
	/*
	  ����ڰ� ���ڸ� �Է����� ��
	  
	  1. 10���� �Է��� ���ڱ����� �� ���� ���غ�����
	  
	  2. 1���� �Է��� ���� ������ 5�� ����� ��� ����غ�����
	 */
		
//		1������
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڸ� �Է��ϼ��� : ");
		int num = sc.nextInt();
		int sum = 0;
		
		for(int i = 10; i <= num; i++) {
			sum += i;
		}
		System.out.println("10���� �Է��� ���ڱ����� �� ���� : " + sum);
		
//		2������ (Scanner, nextInt ����)
		for(int i = 1; i <= num; i++) {
			if(i % 5 == 0) {
				System.out.print(i + " ");
			}
		}
	}
	
}
