package myobj.pokerTeacher;

import java.util.Collections;
import java.util.LinkedList;

public class Deck {

	LinkedList<Card> deck;
	
	public Deck() {
		deck = new LinkedList<>();
		
		for(Rank rank : Card.RANKS) {
			
			for(Suit suit : Card.SUITS) {
				deck.add(new Card(suit, rank));
			}
		}
		Collections.shuffle(deck); //����
		
		System.out.println("ī�� ���� �Ϸ�");
		System.out.println(deck);
	}
	public Card draw() {
		return deck.pop();
	}
	
	
	public static void main(String[] args) {
		Deck d1 = new Deck();
		
		//7�庾�ƺ���
		System.out.println(d1.draw());
		System.out.println(d1.draw());
		System.out.println(d1.draw());
		System.out.println(d1.draw());
		System.out.println(d1.draw());
		System.out.println(d1.draw());
		System.out.println(d1.draw());
		
		System.out.println(d1);
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
}
