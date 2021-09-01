package quiz;

import java.util.Random;
import java.util.Scanner;

public class B16_GuessNumberGame {

	public static void main(String[] args) {
		
		/*
		 	# 게임이 시작되면 랜덤으로 4자리의 숫자가 선정된다
		 	1 플레이어는 8번의 시도를 할 수 있다
		 	2 각 시도마다 4자리의 숫자를 입력하면 다음과 같이 알려준다
		 		- 숫자와 위치가 다 맞을경우 - strike
		 		- 숫자만 맞을경우 - ball
		 	3 다맞추면 몇번만에 맞추었는지 알려준다
		 */
		
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();
		int i = 0;
		int turn = 1;
		int strike = 0, ball = 0;
		String value = "";
		String userInput = "";
		while(i < 4) { //4자리 랜덤값 만들기
			int random = ran.nextInt(9) + 1;
			value += random;
			i++;
		}
		System.out.println("value값은 = " + value);
		
		for(i = 0; i < 8; i++) {
			System.out.printf("%d번째 시도를 하세요", turn);
			userInput = sc.next(); //대조할 값을 사람이 넣는곳
			
			for(int j = 0; j < userInput.length(); ++j) { //사람이 넣은 값을 처음부터 하나씩 strike, ball 세보기위함
				if(userInput.charAt(j) == value.charAt(j)) { //strike인지 알아보기위함
					strike++;
				}else {				//strike가 아닐때 ball이 있는지 알아보기위함
					for(int k = 0; k < 4; ++k) { // strike가 아닐때 0 ~ 4 번째까지 대조하기위함
						if(j != k) {	//j=k 이면 strike이 되므로 아닐때만 검색
							if(userInput.charAt(j) == value.charAt(k)){
								ball++;								
							}
						}
					}
				}
			}
			if(strike == 4) {
				System.out.println("정답을 맞추었습니다!");
				break;
			}
			System.out.printf("%d스트라이크, %d볼 입니다.\n",strike, ball);
			strike = 0;
			ball = 0;
			turn += 1;			
		}
		
	}

}
