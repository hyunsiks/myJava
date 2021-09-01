package myobj.Onecard;

import java.util.ArrayList;
import java.util.Collections;

public class OneCardDeck {

	ArrayList<Card> cards;
	ArrayList<Card> table;

	public OneCardDeck() {
		
		cards = new ArrayList<>();
		table = new ArrayList<>();
		
		//��Ʈ JOKER�� Į����Ŀ, �����̽� JOKER�� �����Ŀ
		for(String rank : Card.RANKS) {
			
			for(Character suit : Card.SUITS) {
				
				if(suit.equals('��') && rank.equals("JOKER")) {
					continue;
				}else if(suit.equals('��') && rank.equals("JOKER")) {
					continue;
				}else if(rank.equals("A")){
					Card card = new Card(suit, rank);
					card.setAttack(true);
					card.setAttackValue(3);
					cards.add(card);
				}else if(rank.equals("2")){
					Card card = new Card(suit, rank);
					card.setAttack(true);
					card.setAttackValue(2);
					cards.add(card);
				}else if(suit.equals('��') && rank.equals("JOKER")){
					Card card = new Card(suit, rank);
					card.setAttack(true);
					card.setAttackValue(9);
					cards.add(card);
				}else if(suit.equals('��') && rank.equals("JOKER")){
					Card card = new Card(suit, rank);
					card.setAttack(true);
					card.setAttackValue(7);
					cards.add(card);
				}else if(rank.equals("J") || rank.equals("Q") || rank.equals("K")
						|| rank.equals("7")) {
					Card card = new Card(suit, rank);
					card.setSpecial(true);
					cards.add(card);
					
				}else {					
					cards.add(new Card(suit, rank));
				}
				
			}
		}
		shuffle();
	}
	
	public Card tableCard() {
		
		if(table.size() == 0) {
			table.add(cards.remove(0));
		}
		
		return table.get(table.size() - 1);
	}
	
	//������ ������ �������� �ƴ��� Ȯ���غ���
	public boolean submitCard(Card card) {
		
		Card tc = tableCard();
		
		boolean valid = false;
		
		if(tc.getRank().equals("JOKER")) {
			System.out.println("��Ŀ �ڿ��� ������ �߰���(������ ��������)");
			table.add(card);
		}else if(card.getRank().equals("JOKER")) {
			System.out.println("��Ŀ�� ������ �߰���");
			table.add(card);
			return true;
		}		
		
		if(tc.getRank().equals(card.getRank())) {
			System.out.println("���ڰ� �¾Ƽ� �߰���");
			table.add(card);
			return true;
		}else if(tc.getSuit().equals(card.getSuit())) {
			System.out.println("������ �¾Ƽ� �߰���");
			table.add(card);
			return true;
		}
		
		if(valid && card.isAttack()) {
			//���� ī�忡 ���� ó��
			System.out.println("��� ���� ī��� ����ī�� �Դϴ�");
			return true;
		}else if(valid && card.isSpecial()) {
			//Ư�� ī�忡 ���� ó��
			System.out.println("��� ���� ī��� Ư��ī�� �Դϴ�");
			return true;
		}
		
		return false;
	}
	
	public void shuffle() {
		
		Collections.shuffle(cards);
	}
	
	public Card draw() {
		
		if(cards.size() == 0) {
			
			for(int i = 0, len = table.size()-1; i < len; i++) { //�Ǹ����������� ���ܵ�
				cards.add(table.remove(0)); //�Ǿտ����ϳ��� ��ӻ��°�
			}
			shuffle();
			System.out.println("ī�尡 �����ؼ� ���̺��� ī�带 ������");
		}
		
		return cards.remove(0); //remove �� pop�� ���� ��ȯ�ϰ�����
	}
	
}









