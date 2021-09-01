package myobj.pirate;

import java.util.Scanner;

public class Playing extends Lose {
	
	int number;
	int comselect;
	boolean game = true;
	int turn = 1;
	
	//당신차례일 때 
	public String selectPlayer(){
		Scanner sc = new Scanner(System.in);
		System.out.println("찌르고 싶은 번호를 고르세요");
		number = sc.nextInt();
		if(lose[number]) {
			return "당신이 패배하였습니다";
		}else {
			return "당신이 살아남았습니다";
		}
	}
	
	//컴퓨터차례일 때
	public String selectCom() {
		comselect = ran.nextInt(20);
		if(lose[comselect]) {
			return "컴퓨터가 패배하였습니다";
		}else {
			System.out.println(comselect + "번을 고름");
			return "컴퓨터가 살아남았습니다";	
		}
	}
	
	//게임시작
	public void play() {
		 while(game) {
			 switch(turn) {
			 case 1:
				 if(selectPlayer().equals("당신이 살아남았습니다")) {
					 System.out.println("당신이 살아남았습니다");
					 System.out.println("=================");
					 turn = 2;			
				 }else {
					 System.out.println("당신이 패배하였습니다");
					 game = false;
					 break;
				 }
			 case 2:
				 if(selectCom().equals("컴퓨터가 살아남았습니다")) {
					 System.out.println("컴퓨터가 살아남았습니다");
					 System.out.println("=================");
					 turn = 1;
				 }else {
					 System.out.println("컴퓨터가 패배하였습니다");
					 game = false;
					 break;
				 }
			 }
			 
		 }
	}
}
