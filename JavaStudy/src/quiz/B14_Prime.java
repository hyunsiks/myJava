package quiz;

import java.util.Scanner;

public class B14_Prime {

	public static void main(String[] args) {
		
	/*
	  ����ڷκ��� ���ڸ� �Է¹�����
	  1���� �Է��� ���� ���̿� �����ϴ� �Ҽ��� ��� ����غ�����
	  ��1�� �ڱ��ڽ����θ� ������ �������� ��	  
	 */
		
		Scanner sc = new Scanner(System.in);
				
		System.out.println("���� �Է��Ͻÿ� : ");
		int num = sc.nextInt();
		
		for(int check = 2; check <= num; check++) { //���� ���� �������� ��� ���� �ϳ��� ������ 1,2,3,4,5,...�Է��Ѽ�
			int count = 0;							//�Ҽ����� �ƴ��� �ǰ����ϴ� ����
			for(int i = 2; i < check; i++) {		//�ϳ��� ���� ���� 2���� �ѹ��� ��������
				if(check % i == 0) {				//�ѹ��� ���������� �ѹ��̶� �������� 0�� ������ �Ҽ��� �ƴ϶�°�
					count++;						//�������� 0�� ������ ī��Ʈ ���ڰ� �ö󰣴�
					break;							//ī��Ʈ ���ڰ� �ö󰨰� ���ÿ� break�����ϸ� ������ for���� ������
				}				
			}
			if(count == 0) {			//������ for���� �����Ŀ��� ī��Ʈ�� 0�̶�� �Ҽ���� ��, ���߿� 1��2�� �Ҽ��� �ƴ����� 2�� �ʰ��ϴ� ���ڸ�üũ
				System.out.print(check + " ");
			}
		}



	}

}
