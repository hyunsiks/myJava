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
		System.out.println("게임이 시작 되었습니다");
		game.myMade();
		
		while(gameSet) {
			System.out.print("원하는 메뉴를 선택하세요(번호) >> ");
			System.out.println();
			System.out.println("1 : 6개의 주사위를 전부 다시 돌리겠다");
			System.out.println("2 : 원하는 주사위만 선택하여 다시 돌리겠다");
			System.out.println("3 : 현재 메이드 상태를 확인하겠다");
			System.out.println("4 : 현재 점수를 저장하고 게임을 끝내겠다");
			menu = sc.nextInt();
			switch(menu) {
			case 1: {
				//다돌리는 메뉴
				game.allDice();
				count++;
				System.out.println(count + "번째 턴");
				if(count == 3) {
					game.myMade();
					gameSet = false;					
				}
				break;
			}
			case 2:{
				//원하는 번호만 돌리는 메뉴
				game.anotherDice();
				count++;
				System.out.println(count + "번째 턴");
				if(count == 3) {
					game.myMade();
					gameSet = false;
				}
				break;
			}
			case 3:{
				//현재메이드를 체크하는 메뉴
				game.myMade();
				System.out.print("현재 번호 : [");
				for(int c : game.dice) {
					System.out.print(c + " ");
				}
				System.out.println("]");
				break;
			}
			case 4:{
				//점수등록
				gameSet = false;
				break;
			}
			default : {
				System.out.println("잘못 선택하셨습니다 다시 선택하세요");
			}
			}
		}
		game.myScore();
		System.out.println("게임 종료");
		return game.score;
	}
}
