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
		for(int i = 0; i < 5; i++) { //�迭�ϱ����� diceSave�迭�� dice�迭�� �ӽ�����(�迭 ������ �ǵ���������)
			diceSave[i] = dice[i];
		}
		
		if(fivecard >= 1) {
			String contrast = "��� : ������ �ְ�ī�� ������";
			System.out.println(contrast);
			this.contrast = contrast;
		}else if(fourcard >= 1) {
			String contrast = "��� : ���� ��ī�� ����";
			System.out.println(contrast);
			this.contrast = contrast;
		}else if(pair >= 1 && triple >=1) {
			String contrast = "��� : �� Ǯ�Ͽ콺 ��";
			System.out.println(contrast);
			this.contrast = contrast;
		}else {
			//��Ʈ����Ʈ�� ���� �� Ȯ��
//			(12345)(23456)ū��Ʈ����Ʈ
			
			for(int i = 0; i < 5; i++) { //�迭�̿�
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
			for(int i = 0; i < 5; i++) { //������Ʈ����Ʈ�� �ߺ����ֱ�
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
			for(int j = 1; j < 7; j++) { 		//�ߺ����� ����ý�� ������������ ���ʴ�� �ٽ� �迭
				for(int i = 0; i < just; i++) {
					
					if(smallStreightCheck.charAt(i) == j + 48) {
						smallStreightCheck2 += j;
					}
				}
			}	

			if(bigStreightCheck.equals("12345") || bigStreightCheck.equals("23456")) {
				String contrast = "��� : ���� ū��Ʈ����Ʈ ����";
				System.out.println(contrast);
				this.contrast = contrast;
			}else if(bigStreightCheck.equals("13456")){
				String contrast = "��� : �� ������Ʈ����Ʈ ��";
				System.out.println(contrast);
				this.contrast = contrast;
			}else if(smallStreightCheck2.equals("1234") || smallStreightCheck2.equals("2345") || smallStreightCheck2.equals("3456")) {//(1234)(2345)(3456)������Ʈ����Ʈ üũ
				String contrast = "��� : �� ������Ʈ����Ʈ ��";
				System.out.println(contrast);
				this.contrast = contrast;
			}else {
				String contrast = "��� : �ƹ��͵� ��������";
				System.out.println(contrast);
				this.contrast = contrast;
			}
		}
		for(int i = 0; i < 5; i++) { //�迭 ������ �ǵ���
			dice[i] = diceSave[i];
		}
	}//������� myMade�޼ҵ�
	
//	  # �޼���
//	  	(1) ��� �ֻ����� ������ �޼���
//	  	(2) ���ϴ� �ֻ����� �����ϰ� �������� ������ �޼���
//	  	(3) �ֻ����� ���� ������ ���� ���� 1,2,3,4,5 �� �ش��ϴ� ���� �ִ��� üũ�ϴ� �޼���
	void allDice() {
		//�ٽô�����
		for(int i = 0; i < dice.length; i++) {
			dice[i] = (int)(Math.random() * 6 + 1);
		}
		System.out.print("���� ��ȣ : [");
		for(int c : dice) {
			System.out.print(c + " ");
		}
		System.out.println("]");
	}
	
	void anotherDice() {
		//���ϴ°͸� �ٽô�����
		for(int i = 0; i < dice.length; i++) {
			System.out.println((i+1) + "�� : " + dice[i]);
		}
		System.out.print("�ٽ� ������ ���ϴ� ��ȣ�� ������ : "); //1, 3 �̶���Ѵٸ�
		Scanner sc = new Scanner(System.in);
		String reDice = sc.next();
		for(int i = 0; i < reDice.length(); i++) {
			for(int j = 1; j < 7; j++) {
				
				if((int)(reDice.charAt(i)) == j + 48) {
					dice[j - 1] = (int)(Math.random() * 6 + 1);
				}
			}
		}
		System.out.print("���� ��ȣ : [");
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

		if(this.contrast.equals("��� : ������ �ְ�ī�� ������")) {
			score = 50;
		}else if(this.contrast.equals("��� : ���� ��ī�� ����")){
			for(int i = 0; i < dice.length; i++) {
				
				if(countCheck[i] == 3) {
					score = dice[i] * 4;
				}
			}
		}else if(this.contrast.equals("��� : �� Ǯ�Ͽ콺 ��")) {
			for(int i = 0; i < dice.length; i++) {
				if(countCheck[i] == 2) {
					score = score + dice[i] * 3;
				}
				if(countCheck[i] == 1) {
					score = score + (dice[i] * 2);
				}
			}
			
		}else if(this.contrast.equals("��� : ���� ū��Ʈ����Ʈ ����")){
			score = 40;
		}else if(this.contrast.equals("��� : �� ������Ʈ����Ʈ ��")) {
			score = 25;
		}else{
			score = 0;
		}			
		System.out.println("���� : " + score);
	}
	
}
