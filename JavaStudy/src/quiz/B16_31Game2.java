package quiz;

import java.util.Random;
import java.util.Scanner;

public class B16_31Game2 {

	public static void main(String[] args) {
		
	/*
	 	31게임을 만들어 보세요
	 	-컴퓨터와 사람이 번갈아가면서 숫자를 선택해야 한다.(선/후공 랜덤)
	 	-컴퓨터는 랜덤으로 숫자를 선택한다
	 	-마지막에 31이상의 숫자를 만든 플레이어가 패배한다	 	
	 */
		
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();
		System.out.println("31게임 시작!!!");
		
		int turn = ran.nextInt(2);
		int count  = 0;
		boolean game = true;
		switch(turn) {
		case 0 : { //케이스 0,1로 선공결정
			while(game) { //count가 31될때까지 true로 자동반복
				count++;  //최소 한번은 불러야 하므로 반복문 전에 한번 카운트업
				if(count == 31) {	//최소 카운트업 상황시에 31이 되면 컴퓨터 패배
					System.out.println("컴퓨터의 패배입니다");
					game = false;
				}
				System.out.println("컴퓨터 선택 : " + count);
				for(int i = 0; i < 2; i++) {//컴퓨터차례  한번은 이미 실행 되었기 때문에 for문으로 나머지 두번에 대한 컴퓨터 결정반복					
					int comDecision = ran.nextInt(2);					
					if(comDecision == 1) {		//1값이 나왔을 경우 카운트업 			
						count++;
						System.out.println("컴퓨터 선택 : " + count);
					}else {						//2값이 나왔을 경우 break으로 for문 탈출
						System.out.println("컴퓨터가 선택을 멈추었습니다");
						break;
					}
					if(count == 31) {			//컴퓨터가 카운트업 하는 도중 31이 되면 false가 되고 while문 탈출
						System.out.println("컴퓨터의 패배입니다");
						game = false;
						break;
					}
				}
				for(int j = 0; j < 3; j++) {//나의 차례
					System.out.println("선택여부를 결정하세요(번호) : ");
					System.out.println("1. 선택하겠다");
					System.out.println("2. 그만하겠다");
					int myDecision = sc.nextInt();
					if(myDecision == 1) {
						count++;
						System.out.println("나의 선택 : " + count);
					}else if(myDecision == 2){
						System.out.println("당신이 선택을 멈추었습니다");
						break;
					}else {
						System.out.println("다시 선택하세요");
						j--;
					}
					if(count == 31) {
						System.out.println("당신의 패배입니다");
						game = false;
						break;						
					}
				}
			}
		}
		case 1 :{
			while(game) { //count가 31될때까지 true로 자동반복
				for(int j = 0; j < 3; j++) {//나의 차례
					System.out.println("선택여부를 결정하세요(번호) : ");
					System.out.println("1. 선택하겠다");
					System.out.println("2. 그만하겠다");
					int myDecision = sc.nextInt();
					if(myDecision == 1) {
						count++;
						System.out.println("나의 선택 : " + count);
					}else if(myDecision == 2){
						System.out.println("당신이 선택을 멈추었습니다");
						break;
					}else {
						System.out.println("다시 선택하세요");
						j--;
					}
					if(count == 31) {
						System.out.println("당신의 패배입니다");
						game = false;
						break;						
					}
				}
				count++;
				if(count == 31) {
					System.out.println("컴퓨터의 패배입니다");
					game = false;
				}
				System.out.println("컴퓨터 선택 : " + count);
				for(int i = 0; i < 2; i++) {//컴퓨터차례 2번반복 첫번은 무조건 실행					
					int comDecision = ran.nextInt(2);					
					if(comDecision == 1) {						
						count++;
						System.out.println("컴퓨터 선택 : " + count);
					}else {
						System.out.println("컴퓨터가 선택을 멈추었습니다");
						break;
					}
					if(count == 31) {
						System.out.println("컴퓨터의 패배입니다");
						game = false;
						break;
					}
				}
			}
		}
		
		}
		
		
		
	}

}
