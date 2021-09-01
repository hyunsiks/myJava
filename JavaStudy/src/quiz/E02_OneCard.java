package quiz;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class E02_OneCard {

	/*
	  ��ī�带 ���弼��
	  
	  1. 7ī�带 ���� ���� �ִ� ������ ���� �ִ�
	  2. ����ī�� ( A,2,joker)
	  3. J(����), Q(�ݴ����), K(�ѹ���)
	  4. ������ �ִ� ī�尡 ������ ���ӳ�
	  
	  ���ӽ���
	  1. ī�带 7�徿 ���´�
	  2. �����ϸ� ������ �԰ų� �������ų� �����ϳ� �����ϰ� ���� �Ѿ��
	 */
	Scanner sc = new Scanner(System.in);
	Random ran = new Random();
	
	LinkedList<String> cardSet;
	LinkedList<String> player1; LinkedList<String> player2; LinkedList<String> player3;	LinkedList<String> player4;
	
	int randomNum;
	int turn;
	int underAttack = 0;
	int cardCount = 0;
	int order; //'Q' �� ���� �����Ųٷ�
	String thrownCard;
	String cardNow;
	
	
	public static void main(String[] args) {
		 E02_OneCard oc = new E02_OneCard();
		 oc.allCard();
		 System.out.println(oc.cardSet);
		 oc.playerNum(3);
		 oc.startGame(3);
	}
	
	public E02_OneCard() {

		cardSet = new LinkedList<>();
		
		
	}
	
	void playerNum(int player) {
		
		if(player >= 1) {
			player1 = new LinkedList<>();
			for(int i = 0; i < 7; i++) {
				player1.add(cardSet.pop());
			}
			System.out.println("player1 �� : " + player1);
		}
		if(player >= 2) {
			player2 = new LinkedList<>();
			for(int i = 0; i < 7; i++) {
				player2.add(cardSet.pop());
			}
			System.out.println("player2 �� : " + player2);
		}
		if(player >= 3) {
			player3 = new LinkedList<>();
			for(int i = 0; i < 7; i++) {
				player3.add(cardSet.pop());
			}
			System.out.println("player3 �� : " + player3);
		}
		if(player == 4) {
			player4 = new LinkedList<>();
			for(int i = 0; i < 7; i++) {
				player4.add(cardSet.pop());
			}
			System.out.println("player4 �� : " + player4);
		}	
	}
	
	
	
	void allCard() { //ī�� ����
		
		String[] num = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
		String[] pattern = {"��","��","��","��"};
		
		for(int i = 0; i < num.length; i++) {
			for(int j = 0; j < pattern.length; j++) {
				
				cardSet.add(pattern[j] + num[i]);
			}
		}
		cardSet.add("Jk");
		Collections.shuffle(cardSet);
		System.out.println(cardSet);
	}
	
	void startGame(int player) {
		
	
		cardNow = cardSet.pop();
		System.out.println("���� �ִ� ī�� : " + cardNow);
		order = 0;
		turn = 1;
		boolean judge = true;
		while(judge) {
			
			switch(turn) {
			
			case 1:{
				
				System.out.println("player1�� ��");
				System.out.println("���� ���� �ִ� ī�� : " + cardNow);
				System.out.println(player1);
				
				
				if(selectTurn()) {
					throwCard(player1);					
				}else {
					getCard(player1);
				}
				
				if(player1.size() == 0) {
					System.out.println("player1 �¸�");
					judge = false;
					break;
				}
				
				System.out.println("player1 �� ���� ����");
				turn = 2;
				break;
				}
			case 2:{
				System.out.println("player2�� ��");
				System.out.println("���� ���� �ִ� ī�� : " + cardNow);
				System.out.println(player2);
				
				if(selectTurn()) {
					throwCard(player2);					
				}else {
					getCard(player2);
				}
				System.out.println("player2 �� ���� ����");
				
				if(player2.size() == 0) {
					System.out.println("player2 �¸�");
					judge = false;
					break;
				}
				
				if(player > 2) {
					if(order == 0) {
						turn = 3;						
					}else {
						turn = 1;
					}
					if(cardNow.charAt(1) == 'K') {
						turn = 2;
					}
					if(cardNow.charAt(1) == 'Q') {
						if(order == 0) {
							order = 1;
							turn = 1;
						}else {
							order = 0;
							turn = 3;
						}
					}
					if(cardNow.charAt(1) == 'J') {
						if(order == 0) {
							turn = 1;
						}else {
							turn = 3;
						}
					}
				}else {
					turn = 1;
				}
				break;
				}
			case 3:{
				System.out.println("player3�� ��");
				System.out.println("���� ���� �ִ� ī�� : " + cardNow);
				System.out.println(player3);
			
				if(selectTurn()) {
					throwCard(player3);					
				}else {
					getCard(player3);
				}
				System.out.println("player3 �� ���� ����");
				
				if(player3.size() == 0) {
					System.out.println("player3 �¸�");
					judge = false;
					break;
				}
				
				if(player > 3) {
					if(order == 0) {
						turn = 4;						
					}else {
						turn = 2;
					}
					if(cardNow.charAt(1) == 'K') {
						turn = 3;
					}
					if(cardNow.charAt(1) == 'Q') {
						if(order == 0) {
							order = 1;
							turn = 2;
						}else {
							order = 0;
							turn = 4;
						}
					}
					if(cardNow.charAt(1) == 'J') {
						turn = 1;
					}
				}else {
					if(order == 0) {
						turn = 1;						
					}else {
						turn = 2;
					}
					if(cardNow.charAt(1) == 'K') {
						turn = 3;
					}
					if(cardNow.charAt(1) == 'Q') {
						if(order == 0) {
							order = 1;
							turn = 2;
						}else {
							order = 0;
							turn = 1;
						}
					}
					if(cardNow.charAt(1) == 'J') {
						if(order == 0) {
							turn = 2;
						}else {
							turn = 1;
						}
					}
				}
				break;
				}
			case 4:{
				System.out.println("player4�� ��");
				System.out.println("���� ���� �ִ� ī�� : " + cardNow);
				System.out.println(player4);
				
				if(selectTurn()) {
					throwCard(player4);					
				}else {
					getCard(player4);
				}
				System.out.println("player4 �� ���� ����");
				
				if(player4.size() == 0) {
					System.out.println("player4 �¸�");
					judge = false;
					break;
				}
				turn = 1;
				break;
				}
			}
				
		}
		
	}
	
	void throwCard(LinkedList<String> players) {
		
		while(true) {
			System.out.println("������ ī�带 ������");
			int myThrownCard = sc.nextInt();
			
			try {
				if(rull(players.get(myThrownCard - 1), players)) {

				cardNow = players.get(myThrownCard-1); //���� ���� ������ ī��� ��ī���
				
				if(players.get(myThrownCard-1).charAt(0) == 'J') {
					underAttack = 1;
					cardCount += 5;
				}else if(players.get(myThrownCard-1).charAt(1) == 'A') {
					underAttack = 1;
					cardCount += 3;
				}else if(players.get(myThrownCard-1).charAt(1) == '2') {
					underAttack = 1;
					cardCount += 2;
				}
				
				players.remove(myThrownCard-1); //�� ������ ī���ϳ� ������
				
				sevenCard(cardNow);
			
				break;
				
				}else {
					System.out.printf("%s�� ������ �´�ī�尡 �ƴմϴ� �ٽ� �����ϼ���\n", players.get(myThrownCard - 1));
					System.out.println("���� �ִ� ī�� : " + cardNow);
					System.out.println(players);
					if(selectTurn()) {
						throwCard(players);		
						break;
					}else {
						getCard(players);
						break;
					}
					
				}
			}catch(IndexOutOfBoundsException e) {
				System.out.println("�߸� �Է��ϼ̽��ϴ� �ٽ� �����ϼ���");
				if(selectTurn()) {
					throwCard(players);	
					break;
				}else {
					getCard(players);
					break;
				}
				
			}
		}
		
		
	}
	void getCard(LinkedList<String> players) {
		
	
		
		if(underAttack == 0) {
			players.add(cardSet.pop());
			System.out.println("���������� ī�带 �߰��Ͽ����ϴ�");
			
		}else {
			
			if(cardNow.charAt(0) == 'J') {
				for(int i = 0; i < cardCount; i++) {
					players.add(cardSet.pop());
				}
				System.out.printf("�������� '%d'���� �߰��Ͽ����ϴ�", cardCount);
				cardCount = 0;
				underAttack = 0;
			}else if(cardNow.charAt(1) == 'A') {
				for(int i = 0; i < cardCount; i++) {
					players.add(cardSet.pop());
				}
				System.out.printf("�������� '%d'���� �߰��Ͽ����ϴ�", cardCount);
				cardCount = 0;
				underAttack = 0;
			}else if(cardNow.charAt(1) == '2') {
				for(int i = 0; i < cardCount; i++) {
					players.add(cardSet.pop());
				}
				System.out.printf("�������� '%d'���� �߰��Ͽ����ϴ�", cardCount);
				cardCount = 0;
				underAttack = 0;
			}else {
				players.add(cardSet.pop());
				System.out.println("���������� ī�带 �߰��Ͽ����ϴ�");
				underAttack = 0;
			}
		}
		
	}
	boolean selectTurn() {
		while(true) {
			System.out.println("������� : " + underAttack);
			System.out.println("1. ī�带 ���ڴ�");
			System.out.println("2. ī�带 �߰��ϰڴ�");
			int a = sc.nextInt();
			
			if(a == 1) {
				return true;
			}else if(a == 2){
				return false;
			}else {
				System.out.println("�߸��Է��ϼ̽��ϴ�");
				continue;
			}
		}
	}
	
	boolean rull(String card, LinkedList<String> players) {
		
		if(underAttack == 1) {
			
			if(attackCard(card,players) == 1) {
				return true;
			}else if(attackCard(card,players) == 2) {
				return false;
			}
		}
		if(cardNow.charAt(0) == 'J') {
			return true;
		}
		if(card.charAt(0) == 'J') {
			return true;
		}
		
		if(cardNow.charAt(0) == card.charAt(0) || cardNow.charAt(1) == card.charAt(1)) {
			return true;
		}else {
			return false;
		}
	}
	
	void sevenCard(String card) {

		if(card.charAt(1) == '7') {
			System.out.println("������ �������� �ٲٽðڽ��ϱ� ? 1.��  2.��  3.��  4.��  5.�ٲ�������");
			int select = sc.nextInt();
			switch(select) {
			case 1 :
				cardNow = "��7";
				break;
			case 2 :
				cardNow = "��7";
				break;
			case 3 :
				cardNow = "��7";
				break;
			case 4 :
				cardNow = "��7";
				break;	
			default :
				System.out.println("�ٲ��� �����̽��ϴ�");
			}
		}
	}
	
	int attackCard(String card, LinkedList<String> players) {
		
		
		
		if(cardNow.charAt(0) == 'J') {
			return 2;
		}
		if(cardNow.charAt(1) == 'A') {
			if(card.charAt(0) == 'J' || card.charAt(1) == 'A' || (card.charAt(1) == '2' && card.charAt(0) == cardNow.charAt(0))) {
				return 1;
			}else {
				return 2;
			}
		}
		if(cardNow.charAt(1) == '2') {
			if(card.charAt(0) == 'J' || (card.charAt(0) == cardNow.charAt(0) && card.charAt(1) == 'A')
									 || (card.charAt(1) == '2')) {
				return 1;
			}else {
				return 2;
			}
		}
		
		return 3;
	}
	

}

