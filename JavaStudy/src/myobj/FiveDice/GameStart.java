package myobj.FiveDice;

import java.util.Scanner;

public class GameStart {

	int menu;
	int count;
	boolean gameSet;
	
	public int GameStart() {
		Made game = new Made();
		count = 0;
		gameSet = true;
		Scanner sc = new Scanner(System.in);
		System.out.println("������ ���� �Ǿ����ϴ�");
		game.myMade();
		
		while(gameSet) {
			System.out.print("���ϴ� �޴��� �����ϼ���(��ȣ) >> ");
			System.out.println();
			System.out.println("1 : 6���� �ֻ����� ���� �ٽ� �����ڴ�");
			System.out.println("2 : ���ϴ� �ֻ����� �����Ͽ� �ٽ� �����ڴ�");
			System.out.println("3 : ���� ���̵� ���¸� Ȯ���ϰڴ�");
			System.out.println("4 : ���� ������ �����ϰ� ������ �����ڴ�");
			menu = sc.nextInt();
			switch(menu) {
			case 1: {
				//�ٵ����� �޴�
				game.allDice();
				count++;
				System.out.println(count + "��° ��");
				if(count == 3) {
					game.myMade();
					gameSet = false;					
				}
				break;
			}
			case 2:{
				//���ϴ� ��ȣ�� ������ �޴�
				game.anotherDice();
				count++;
				System.out.println(count + "��° ��");
				if(count == 3) {
					game.myMade();
					gameSet = false;
				}
				break;
			}
			case 3:{
				//������̵带 üũ�ϴ� �޴�
				game.myMade();
				System.out.print("���� ��ȣ : [");
				for(int c : game.dice) {
					System.out.print(c + " ");
				}
				System.out.println("]");
				break;
			}
			case 4:{
				//�������
				gameSet = false;
				break;
			}
			default : {
				System.out.println("�߸� �����ϼ̽��ϴ� �ٽ� �����ϼ���");
			}
			}
		}
		game.myScore();
		System.out.println("���� ����");
		return game.score;
	}
}
