package quiz;

import java.util.Scanner;

public class B06_AppleQuiz {

	public static void main(String[] args) {
		
	/*
	 ����� 10���� ���� �� �ִ� �ٱ��ϰ� �ִ�.
	 ����ڰ� �����ϰ� ���� ����� ������ �Է��ϸ�
	 ����� ��� ��� ���� �ʿ��� �ٱ����� ������ �˷��ִ� ���α׷��� ��������.
	 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�����ϰ� ���� ����� ������ �Է��ϼ��� : ");
		int appleNumber = sc.nextInt();
		
		int basketNumber = appleNumber / 10 + 1;
		
		if(appleNumber >=0 && appleNumber % 10 == 0) {
			basketNumber -= 1; 
		} else if(appleNumber < 0) {
			basketNumber = 0;
		} 
		System.out.println("�ʿ��� �ٱ����� ������ " + basketNumber + "�Դϴ�.");
		
	}

}
