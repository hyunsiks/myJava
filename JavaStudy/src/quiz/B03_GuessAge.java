package quiz;

import java.util.Scanner;

public class B03_GuessAge {

	// ����ڷκ��� �¾ �ؿ� ������ �⵵�� �Է¹�����
	// �� ����� �ѱ� ���̸� ����Ͽ� �� ������ �˷��ִ� ���α׷��� ��������
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�¾ �⵵�� �Է��Ͻÿ� >> ");
		int bornYear = sc.nextInt();
		System.out.print("������ �⵵�� �Է��Ͻÿ� >> ");
		int year = sc.nextInt();
		System.out.println("����� �¾ �⵵�� " + (year - bornYear + 1) + "�Դϴ�.");
		
	}
	
}
