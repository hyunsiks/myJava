package myobj.FiveDice;

import java.util.Scanner;

public class Made extends Score{

	int[] diceSave = new int[5];
	int[] countCheck;
	int countPair1;
	int pair, triple, fourcard, fivecard;
	int score = 0;
	int same = 0;
	String contrast;
	
	
	public Made() {
		// TODO Auto-generated constructor stub
		pair = 0;
		triple = 0;
		fourcard = 0;
		fivecard = 0;		
	}
	
	void myMade() {
		boolean[] check = new boolean[5];
		countCheck = new int[5];
		countPair1 = 0;
		pair = 0;
		fourcard = 0;
		triple = 0; 
		fivecard = 0;
		
		for(int i = 0; i < dice.length; i++) {
			
			if(check[i] == false) {
				check[i] = true;
				for(int j = 1 + i; j < 5; j++) {
					if(dice[i] == dice[j]) {
						countPair1++;
						check[j] = true;
					}
				}
				countCheck[i] = countPair1;
				countPair1 = 0;
			}
		}
		for(int i = 0; i < dice.length; i++) {
			
			switch(countCheck[i]) {
			case 1: {
				pair++;
				break;
			}					
			case 2: {
				triple++;
				break;
			}
			case 3: {
				fourcard++;
				break;
			}
			case 4: {
				fivecard++;
				break;
			}
			}			
		}
		for(int i = 0; i < 5; i++) { //배열하기전에 diceSave배열에 dice배열을 임시저장(배열 끝내고 되돌리기위함)
			diceSave[i] = dice[i];
		}
		
		if(fivecard >= 1) {
			String contrast = "결과 : ▶▶▶ 최강카드 ◀◀◀";
			System.out.println(contrast);
			this.contrast = contrast;
		}else if(fourcard >= 1) {
			String contrast = "결과 : ▶▶ 포카드 ◀◀";
			System.out.println(contrast);
			this.contrast = contrast;
		}else if(pair >= 1 && triple >=1) {
			String contrast = "결과 : ▶ 풀하우스 ◀";
			System.out.println(contrast);
			this.contrast = contrast;
		}else {
			//스트레이트에 대한 것 확인
//			(12345)(23456)큰스트레이트
			
			for(int i = 0; i < 5; i++) { //배열이용
				for(int j = 1 + i; j < 5; j++) {
					if(dice[i] > dice[j]) {
						int temp = 0;
						temp = dice[i];
						dice[i] = dice[j];
						dice[j] = temp;
					}
				}
			}
			String bigStreightCheck = "";
			String smallStreightCheck = "";
			
			for(int i = 0; i < 5; i++) {
				bigStreightCheck += dice[i];
			}
			for(int i = 0; i < 5; i++) { //작은스트레이트에 중복없애기
				for(int j =0; j < smallStreightCheck.length(); j++) {
					
					if((int)(smallStreightCheck.charAt(j)) == dice[i] + 48) {
						same++;
					}
				}
				if(same == 0) {
					smallStreightCheck += dice[i];					
				}else {
					same = 0;
					continue;
				}				
			}
			int just = 0;
			if(smallStreightCheck.length() == 5) {
				just = 4;
			}else {
				just = smallStreightCheck.length();
			}
			String smallStreightCheck2 = "";
			for(int j = 1; j < 7; j++) { 		//중복없앤 스몰첵에 작은순서부터 차례대로 다시 배열
				for(int i = 0; i < just; i++) {
					
					if(smallStreightCheck.charAt(i) == j + 48) {
						smallStreightCheck2 += j;
					}
				}
			}	

			if(bigStreightCheck.equals("12345") || bigStreightCheck.equals("23456")) {
				String contrast = "결과 : ▶▶ 큰스트레이트 ◀◀";
				System.out.println(contrast);
				this.contrast = contrast;
			}else if(bigStreightCheck.equals("13456")){
				String contrast = "결과 : ▶ 작은스트레이트 ◀";
				System.out.println(contrast);
				this.contrast = contrast;
			}else if(smallStreightCheck2.equals("1234") || smallStreightCheck2.equals("2345") || smallStreightCheck2.equals("3456")) {//(1234)(2345)(3456)작은스트레이트 체크
				String contrast = "결과 : ▶ 작은스트레이트 ◀";
				System.out.println(contrast);
				this.contrast = contrast;
			}else {
				String contrast = "결과 : 아무것도 충족못함";
				System.out.println(contrast);
				this.contrast = contrast;
			}
		}
		for(int i = 0; i < 5; i++) { //배열 전으로 되돌림
			dice[i] = diceSave[i];
		}
	}//여기까지 myMade메소드
	
//	  # 메서드
//	  	(1) 모든 주사위를 던지는 메서드
//	  	(2) 원하는 주사위를 제외하고 나머지를 던지는 메서드
//	  	(3) 주사위를 새로 던질때 마다 위의 1,2,3,4,5 중 해당하는 것이 있는지 체크하는 메서드
	void allDice() {
		//다시던진다
		for(int i = 0; i < dice.length; i++) {
			dice[i] = (int)(Math.random() * 6 + 1);
		}
		System.out.print("현재 번호 : [");
		for(int c : dice) {
			System.out.print(c + " ");
		}
		System.out.println("]");
	}
	
	void anotherDice() {
		//원하는것만 다시던진다
		for(int i = 0; i < dice.length; i++) {
			System.out.println((i+1) + "번 : " + dice[i]);
		}
		System.out.print("다시 던지길 원하는 번호를 고르세요 : "); //1, 3 이라고한다면
		Scanner sc = new Scanner(System.in);
		String reDice = sc.next();
		for(int i = 0; i < reDice.length(); i++) {
			for(int j = 1; j < 7; j++) {
				
				if((int)(reDice.charAt(i)) == j + 48) {
					dice[j - 1] = (int)(Math.random() * 6 + 1);
				}
			}
		}
		System.out.print("현재 번호 : [");
		for(int c : dice) {
			System.out.print(c + " ");
		}
		System.out.println("]");
	}
	
	void checkNow() {
		myMade();
	}
	
	void myScore() {
		myMade();

		if(this.contrast.equals("결과 : ▶▶▶ 최강카드 ◀◀◀")) {
			score = 50;
		}else if(this.contrast.equals("결과 : ▶▶ 포카드 ◀◀")){
			for(int i = 0; i < dice.length; i++) {
				
				if(countCheck[i] == 3) {
					score = dice[i] * 4;
				}
			}
		}else if(this.contrast.equals("결과 : ▶ 풀하우스 ◀")) {
			for(int i = 0; i < dice.length; i++) {
				if(countCheck[i] == 2) {
					score = score + dice[i] * 3;
				}
				if(countCheck[i] == 1) {
					score = score + (dice[i] * 2);
				}
			}
			
		}else if(this.contrast.equals("결과 : ▶▶ 큰스트레이트 ◀◀")){
			score = 40;
		}else if(this.contrast.equals("결과 : ▶ 작은스트레이트 ◀")) {
			score = 25;
		}else{
			score = 0;
		}			
		System.out.println("점수 : " + score);
	}
	
}
