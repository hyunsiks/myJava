package myobj.PirateTeacher;

import java.util.Scanner;

public class PirateGame {

	Scanner sc;
	
	Barrel barrel;
	int mode;
	int turn;
	int numOfplayer;
	int whosTurn;
	public int repeat = 0;
	
	public PirateGame(int mode) {
		this.barrel = new Barrel(20);
		this.mode = mode;
		this.numOfplayer = 2;
		this.whosTurn = 1;
		this.sc = new Scanner(System.in);
	}	
	
	public PirateGame(int mode, int numOfPlayer) {
		this(mode); //�����ڿ��� �ٸ� ������ �ҷ��ִ°� this() �� �θ��� �ȿ� mode������
		this.numOfplayer = numOfPlayer;
	}
	
	public void start() {
		switch(this.mode) {
		case 0:
			System.out.println("������� ����");
			pvp();
			break;
		case 1:
			System.out.println("��ǻ�Ϳ� ����");
			pvc();
			break;
		default :
			System.out.println("���� �������� ���� ���");
			break;
		}

	}
	
	public void config(int mode) {
		this.mode = mode;
	}
	
	void pvp() {
		while(true) {
			System.out.println("===========" + turn + "�� ===========");
			System.out.print("Player '" + (turn % numOfplayer + 1) + "' �� ���� > ");
			int slot = sc.nextInt();
			
			if(barrel.fork(slot)) { //�񷵴��� ������ ���� �ȴþ������
				
				if(barrel.checkGameOver()) {
					System.out.println("��������� ���ư����ϴ�....");
					System.out.print("Player '" + (turn % numOfplayer + 1) + "' �� �й�!!! ");
					break;
				}
				
				turn++;
			}			
		}		
	}
	
	void pvc() {
	
		while(true) {
			
			if(whosTurn == 1) {
				System.out.println("===========" + turn + "�� ===========");
				System.out.print("Player '" + (turn % numOfplayer + 1) + "' �� ���� > ");
				int slot = sc.nextInt();
					
				if(barrel.fork(slot)) { //�񷵴��� ������ ���� �ȴþ������
						
					if(barrel.checkGameOver()) {
						System.out.println("��������� ���ư����ϴ�....");
						System.out.print("Player '" + (turn % numOfplayer + 1) + "' �� �й�!!! ");
						break;
					}				
					turn++;
					whosTurn = 2;
				}		
			}else {
				
				System.out.println("===========" + turn + "�� ===========");
				System.out.print("Computer�� ���� > ");
				
				if(barrel.forkCom((int)(Math.random()* 19 + 1))) {
					
					if(barrel.checkGameOver()) {
						System.out.println("��������� ���ư����ϴ�....");
						System.out.print("Computer �� �й�!!! ");
						break;
					}
					turn++;
					whosTurn = 1;
				}
			}				
		}		
	}	
		
	public static void main(String[] args) {
		
		PirateGame testgame = new PirateGame(99);
		
		testgame.config(1);
		testgame.start();
		
		System.out.println("�׽�Ʈ ���� ��!");
	}
}
