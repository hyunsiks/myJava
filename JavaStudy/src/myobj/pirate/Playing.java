package myobj.pirate;

import java.util.Scanner;

public class Playing extends Lose {
	
	int number;
	int comselect;
	boolean game = true;
	int turn = 1;
	
	//��������� �� 
	public String selectPlayer(){
		Scanner sc = new Scanner(System.in);
		System.out.println("��� ���� ��ȣ�� ������");
		number = sc.nextInt();
		if(lose[number]) {
			return "����� �й��Ͽ����ϴ�";
		}else {
			return "����� ��Ƴ��ҽ��ϴ�";
		}
	}
	
	//��ǻ�������� ��
	public String selectCom() {
		comselect = ran.nextInt(20);
		if(lose[comselect]) {
			return "��ǻ�Ͱ� �й��Ͽ����ϴ�";
		}else {
			System.out.println(comselect + "���� ��");
			return "��ǻ�Ͱ� ��Ƴ��ҽ��ϴ�";	
		}
	}
	
	//���ӽ���
	public void play() {
		 while(game) {
			 switch(turn) {
			 case 1:
				 if(selectPlayer().equals("����� ��Ƴ��ҽ��ϴ�")) {
					 System.out.println("����� ��Ƴ��ҽ��ϴ�");
					 System.out.println("=================");
					 turn = 2;			
				 }else {
					 System.out.println("����� �й��Ͽ����ϴ�");
					 game = false;
					 break;
				 }
			 case 2:
				 if(selectCom().equals("��ǻ�Ͱ� ��Ƴ��ҽ��ϴ�")) {
					 System.out.println("��ǻ�Ͱ� ��Ƴ��ҽ��ϴ�");
					 System.out.println("=================");
					 turn = 1;
				 }else {
					 System.out.println("��ǻ�Ͱ� �й��Ͽ����ϴ�");
					 game = false;
					 break;
				 }
			 }
			 
		 }
	}
}
