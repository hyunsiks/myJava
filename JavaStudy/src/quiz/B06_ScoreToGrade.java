package quiz;

import java.util.Scanner;

public class B06_ScoreToGrade {

	public static void main(String[] args) {
	
	/*
	 ������ �Է¹����� ������ �ش��ϴ� ����� ������ִ� ���α׷��� �ۼ��غ�����.
	 
	 90���̻� : A���
	 80���̻� : B���
	 70���̻� : C���
	 60���̻� : D���
	 �� �� : F���
	 */

		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �Է��ϼ��� : ");
		int score = sc.nextInt();
		
		if(score < 0 || score > 100) {
			System.out.print("�߸��� �Է��Դϴ�");
		}else if(score >= 90) {
			System.out.println(score + "���� A��� �Դϴ�");
		}else if(score >= 80) {
			System.out.println(score + "���� B��� �Դϴ�");
		}else if(score >= 70) {
			System.out.println(score + "���� C��� �Դϴ�");
		}else if(score >= 60) {
			System.out.println(score + "���� D��� �Դϴ�");
		}else {
			System.out.println(score + "���� F��� �Դϴ�");
		}
	}

}
