package quiz;

import java.util.Random;
import java.util.Scanner;

public class B16_31Game2 {

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
		
		int turn = ran.nextInt(2);
		int count  = 0;
		boolean game = true;
		switch(turn) {
		case 0 : { //���̽� 0,1�� ��������
			while(game) { //count�� 31�ɶ����� true�� �ڵ��ݺ�
				count++;  //�ּ� �ѹ��� �ҷ��� �ϹǷ� �ݺ��� ���� �ѹ� ī��Ʈ��
				if(count == 31) {	//�ּ� ī��Ʈ�� ��Ȳ�ÿ� 31�� �Ǹ� ��ǻ�� �й�
					System.out.println("��ǻ���� �й��Դϴ�");
					game = false;
				}
				System.out.println("��ǻ�� ���� : " + count);
				for(int i = 0; i < 2; i++) {//��ǻ������  �ѹ��� �̹� ���� �Ǿ��� ������ for������ ������ �ι��� ���� ��ǻ�� �����ݺ�					
					int comDecision = ran.nextInt(2);					
					if(comDecision == 1) {		//1���� ������ ��� ī��Ʈ�� 			
						count++;
						System.out.println("��ǻ�� ���� : " + count);
					}else {						//2���� ������ ��� break���� for�� Ż��
						System.out.println("��ǻ�Ͱ� ������ ���߾����ϴ�");
						break;
					}
					if(count == 31) {			//��ǻ�Ͱ� ī��Ʈ�� �ϴ� ���� 31�� �Ǹ� false�� �ǰ� while�� Ż��
						System.out.println("��ǻ���� �й��Դϴ�");
						game = false;
						break;
					}
				}
				for(int j = 0; j < 3; j++) {//���� ����
					System.out.println("���ÿ��θ� �����ϼ���(��ȣ) : ");
					System.out.println("1. �����ϰڴ�");
					System.out.println("2. �׸��ϰڴ�");
					int myDecision = sc.nextInt();
					if(myDecision == 1) {
						count++;
						System.out.println("���� ���� : " + count);
					}else if(myDecision == 2){
						System.out.println("����� ������ ���߾����ϴ�");
						break;
					}else {
						System.out.println("�ٽ� �����ϼ���");
						j--;
					}
					if(count == 31) {
						System.out.println("����� �й��Դϴ�");
						game = false;
						break;						
					}
				}
			}
		}
		case 1 :{
			while(game) { //count�� 31�ɶ����� true�� �ڵ��ݺ�
				for(int j = 0; j < 3; j++) {//���� ����
					System.out.println("���ÿ��θ� �����ϼ���(��ȣ) : ");
					System.out.println("1. �����ϰڴ�");
					System.out.println("2. �׸��ϰڴ�");
					int myDecision = sc.nextInt();
					if(myDecision == 1) {
						count++;
						System.out.println("���� ���� : " + count);
					}else if(myDecision == 2){
						System.out.println("����� ������ ���߾����ϴ�");
						break;
					}else {
						System.out.println("�ٽ� �����ϼ���");
						j--;
					}
					if(count == 31) {
						System.out.println("����� �й��Դϴ�");
						game = false;
						break;						
					}
				}
				count++;
				if(count == 31) {
					System.out.println("��ǻ���� �й��Դϴ�");
					game = false;
				}
				System.out.println("��ǻ�� ���� : " + count);
				for(int i = 0; i < 2; i++) {//��ǻ������ 2���ݺ� ù���� ������ ����					
					int comDecision = ran.nextInt(2);					
					if(comDecision == 1) {						
						count++;
						System.out.println("��ǻ�� ���� : " + count);
					}else {
						System.out.println("��ǻ�Ͱ� ������ ���߾����ϴ�");
						break;
					}
					if(count == 31) {
						System.out.println("��ǻ���� �й��Դϴ�");
						game = false;
						break;
					}
				}
			}
		}
		
		}
		
		
		
	}

}
