package quiz;

import java.util.Scanner;

public class B03_celToFahr {

	public static void main(String[] args) {
		
		//����ڷκ��� ���� �µ��� �Է¹�����
		//ȭ�� �µ��� ��ȯ�Ͽ� ������ִ� ���α׷��� ��������
		//(��ȯ������ ���۰˻�, ����� �Ҽ� ù° �ڸ�����)
		
		Scanner sc = new Scanner(System.in);

		System.out.print("���� ����(��) �µ��� �Է��ϼ��� >> ");
		double celsius = sc.nextDouble();
		double fahrenheit = (celsius * 9/5) + 32;
		
		System.out.printf("���� ȭ�� �µ��� %.1f�� �Դϴ�", fahrenheit);

		/*
		System.out.print("ù��° ���ڸ� �Է��ϼ��� >> ");
		int a = sc.nextInt();
		System.out.print("�ι�° ���ڸ� �Է��ϼ��� >> ");
		int b = sc.nextInt();
		int c = Math.max(a, b);
		int d = Math.min(a, b);
		System.out.printf("�Է� ���� �� ���� �߿� ū���� %d�̰�, �������� %d�Դϴ�", c,d);
		*/
	}

}
