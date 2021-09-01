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
		this(mode); //생성자에서 다른 생성자 불러주는것 this() 을 부르고 안에 mode넣은것
		this.numOfplayer = numOfPlayer;
	}
	
	public void start() {
		switch(this.mode) {
		case 0:
			System.out.println("사람끼리 대전");
			pvp();
			break;
		case 1:
			System.out.println("컴퓨터와 대전");
			pvc();
			break;
		default :
			System.out.println("아직 구현되지 않은 모드");
			break;
		}

	}
	
	public void config(int mode) {
		this.mode = mode;
	}
	
	void pvp() {
		while(true) {
			System.out.println("===========" + turn + "턴 ===========");
			System.out.print("Player '" + (turn % numOfplayer + 1) + "' 의 차례 > ");
			int slot = sc.nextInt();
			
			if(barrel.fork(slot)) { //찔럿던곳 찔럿을때 턴이 안늘어나기위함
				
				if(barrel.checkGameOver()) {
					System.out.println("통아저씨가 날아갔습니다....");
					System.out.print("Player '" + (turn % numOfplayer + 1) + "' 의 패배!!! ");
					break;
				}
				
				turn++;
			}			
		}		
	}
	
	void pvc() {
	
		while(true) {
			
			if(whosTurn == 1) {
				System.out.println("===========" + turn + "턴 ===========");
				System.out.print("Player '" + (turn % numOfplayer + 1) + "' 의 차례 > ");
				int slot = sc.nextInt();
					
				if(barrel.fork(slot)) { //찔럿던곳 찔럿을때 턴이 안늘어나기위함
						
					if(barrel.checkGameOver()) {
						System.out.println("통아저씨가 날아갔습니다....");
						System.out.print("Player '" + (turn % numOfplayer + 1) + "' 의 패배!!! ");
						break;
					}				
					turn++;
					whosTurn = 2;
				}		
			}else {
				
				System.out.println("===========" + turn + "턴 ===========");
				System.out.print("Computer의 차례 > ");
				
				if(barrel.forkCom((int)(Math.random()* 19 + 1))) {
					
					if(barrel.checkGameOver()) {
						System.out.println("통아저씨가 날아갔습니다....");
						System.out.print("Computer 의 패배!!! ");
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
		
		System.out.println("테스트 게임 끝!");
	}
}
