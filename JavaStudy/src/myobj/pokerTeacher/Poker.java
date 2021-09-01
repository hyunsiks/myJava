package myobj.pokerTeacher;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.TreeSet;

public class Poker {

	ArrayList<Player> players;
	
	Dealer dealer;
	Deck deck;
	int player;
	
	public Poker() {
		
		players = new ArrayList<>();
		deck = new Deck();		
		dealer = new Dealer(deck);
	}
	
	public void addPlayer() {
		players.add(new Player(deck));
	}
	
	public void start() {
		for(Player p : players) {
			p.firstDraw();
		}
	}
	
	public void next() {
		dealer.next();
	}
	
	public void peekTable() {
		System.out.println(dealer.table);
	}
	
	public void open() {
		
		System.out.println("테이블에 깔린 카드 : " + dealer.table); 
		
		for(Player p : players) {
			HashSet<Card> hand = new HashSet<>(dealer.table);
			
			System.out.println("사용자가 들고있는 카드 : " + p.hand);
			
			hand.addAll(p.hand);
			
			check(hand);
		}
		
	}
	
	private int[] countSuits(HashSet<Card> hand) {
		int[] suits = new int[4];
		
		for(Card card : hand) {
			
		}
		return suits;
	}
	
	//0 : not straight
	//1 : straight
	//2 : straight flush
	//3 : royal straight flush
	private int checkStraight(HashSet<Card> hand) {
		
		ArrayList<Card> sorted_hand = new ArrayList<>(hand);
		
		Collections.sort(sorted_hand);
		
		System.out.println("정렬된카드 : " + sorted_hand);
		
		for(int i = 2; i > -1; i--) {
			
			Card card0 = sorted_hand.get(i);
			
			System.out.printf("스트레이트 체크 %d : %s\n", (3 - i), sorted_hand.get(i));
			
			for(int j = 0; j < 5; j++) {
				
				if(sorted_hand.get(i+j).rank.getRankValue() == )
			}
		}
		
		
//		boolean straight = false;
//		
//		for(Card card : hand) {
//		
//			int value = card.rank.getRankValue();
//			
//			if(containsRankValue(value + 1)) && {
//			   containsRankValue(value + 2)
//			   containsRankValue(value + 3)
//			   containsRankValue(value + 4)
//			   straight = true;
//			}
//		}
//		
//		HashSet<Rank> ranks = makeRankSet(hand);
		
		return 0;
	}
	
	//넘어온 hand 내부의 카드 7장으로 어떤 족보인지 맞추고 승패를 가릴 수 있는 점수를 리턴
	private int check(HashSet<Card> hand) {
		
		int straight = checkStraight(hand);
		return 0;
	}
	
	private HashSet<Rank> makeRankSet(HashSet<Card> hand){
		
		HashSet<Rank> ranks = new HashSet<>();
		
		for(Card card : hand) {
			ranks.add(card.rank);
		}
		
		return ranks;
	}
	
	public static void main(String[] args) {
		
		Poker game = new Poker();
		
		game.addPlayer();
		game.addPlayer();
		game.addPlayer();
		
		game.start();
		
		
		//베팅끝나면 딜러가 3장 공개
		game.next();
		game.next();
		game.next();
		game.next();
		game.next();
	
//		
		game.peekTable();
		game.open();
		
	}
}
