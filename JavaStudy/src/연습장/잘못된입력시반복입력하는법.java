package ������;

import java.util.InputMismatchException;
import java.util.Scanner;

public class �߸����Է½ùݺ��Է��ϴ¹� {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			try {
				System.out.print("���� > ");
				int num = sc.nextInt(); //int num�� ���� �������ٰ� ������ ���� ��ĳ�ʿ� �ɷ��ֱ⶧���� 
										//��ĳ�ʿ� �ɷ��ִ� ���� ���� ������ ��� �ݺ��ؼ� ������ �������Ͼ 
				System.out.println("�Է��Ͻ� ���� " + num + "�Դϴ�");
				break;
			}catch(InputMismatchException e) {
				System.out.println("�߸��� �Է��Դϴ�");
				String stuck = sc.nextLine();	//��ĳ�ʿ� �ɷ��ִ� ���� ���ִ� ����
//				System.out.println("�ɷ��ִ� �� �� : " + stuck);
			}
		}
	}

}
