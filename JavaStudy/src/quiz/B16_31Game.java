package quiz;

import java.util.Random;
import java.util.Scanner;

public class B16_31Game {

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
		
		int num = 0;
		int turn = 0;
		
		while(num < 31) {
			if(turn == 0) {
				System.out.println("선택할 숫자를 적으세요 : ");				
					int userDecision = sc.nextInt();
					num+= userDecision;
					System.out.println("당신이 " + userDecision + "을 선택, 현재 숫자는 : " + num);
					turn = 1;					
				if(num >= 31) {
					System.out.println("==========당신은 패배했습니다==========");
				}
			}else {
				if(num == 27) {
					num += 3;
					System.out.println("컴퓨터가 3을 선택, 현재 숫자는 : " + num);
					turn = 0;
				}else if(num == 28) {
					num+= 2;
					System.out.println("컴퓨터가 2를 선택, 현재 숫자는 : " + num);
					turn = 0;
				}else if(num == 29) {
					num += 1;
					System.out.println("컴퓨터가 1을 선택, 현재 숫자는 : " + num);
					turn = 0;
				}else {
					int comDecision = ran.nextInt(3) + 1;
					num+= comDecision;
					System.out.println("컴퓨터가" + comDecision + "을 선택, 현재 숫자는 : " + num);
					turn = 0;				
					if(num >= 31) {
						System.out.println("==========컴퓨터가 패배했습니다==========");					
					}
				}		
			}
		}
		
	}

}
