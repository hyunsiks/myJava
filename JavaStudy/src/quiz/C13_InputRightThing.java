package quiz;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C13_InputRightThing {

	/*
	  # ����ڷκ��� ���ڸ� ����� �Է¹��� ������ ��� �Է� �޴� ���α׷��� ��������
	  	(�߸��� ���� �ԷµǾ �������� ���� �ʰ�, �ùٸ� ���� �ԷµǸ� ����� ���α׷� ����)
	 */
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
				
//		Scanner sc = new Scanner(System.in);
//		
//		while(true) {
//			try {
//				System.out.print("���� > ");
//				int num = sc.nextInt(); //int num�� ���� �������ٰ� ������ ���� ��ĳ�ʿ� �ɷ��ֱ⶧���� 
//										//��ĳ�ʿ� �ɷ��ִ� ���� ���� ������ ��� �ݺ��ؼ� ������ �������Ͼ 
//				System.out.println("�Է��Ͻ� ���� " + num + "�Դϴ�");
//				break;
//			}catch(InputMismatchException e) {
//				System.out.println("�߸��� �Է��Դϴ�");
//				String stuck = sc.nextLine();	//��ĳ�ʿ� �ɷ��ִ� ���� ���ִ� ����
////				System.out.println("�ɷ��ִ� �� �� : " + stuck);
//			}
//		}
//		System.out.println("���α׷��� ���������� ����Ǿ����ϴ�");
		
		int a = inputInt("���� > ");
		
		System.out.println("input �Լ��� �Է¹��� �� : " + a);
		System.out.println("���α׷��� ���������� ����Ǿ����ϴ�");
	}
	
	public static int inputInt(String message) {
		int num;
		
		while(true) {
			try {
				System.out.print(message);
				num = sc.nextInt();
				break;
			}catch(InputMismatchException e){
				sc.nextLine();
			}
		}
		
		//sc.close(); //���̻� ���� ���� ��ĳ�ʸ� �����ϴ� �Լ�(System.in�� close�� ���� �ʴ°��� ����)
		
		return num;
	}

}
