package myobj.poker;

import java.util.ArrayList;

public class Card {
	
	ArrayList<String> cardSet;
	String pattern;
	String number;
	
	public Card() {
		//card �����̽�,��Ʈ.Ŭ����,���̾� / 1~13
		//�� 4 x 13 = 52
		
		cardSet = new ArrayList<>();
		
	}
	
	void getCard(){ //ī���ϳ� ���ι޴°� �ߺ�����
		
			//�����üũ
//			cardSet.add("��J");	
//			cardSet.add("��4");
//			cardSet.add("��J");
//			cardSet.add("��2");
//			cardSet.add("��J");
//			cardSet.add("��3");
//			cardSet.add("��5");
//			cardSet.add("��K");
		
			String check = new Card().pattern() + new Card().number();
			int count = 0;
	
			while(true) {
				
				for(int i = 0; i < cardSet.size(); i++) {
	
					if(check.equals(cardSet.get(i))) {
						count++;
						break;
					}
				}
				if(count == 0) {
					cardSet.add(check);
					break;
				}else {
					check = new Card().pattern() + new Card().number();
					count = 0;
				}
			}
	}
	
	String pattern() {
		
		String[] pattern2 = {"��","��","��","��"};
		String pattern = pattern2[(int)(Math.random() * 3 + 1)];
		
		return pattern;
	}
	
	String number() {
		
		String[] arr = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
		number = arr[(int)(Math.random() * 13)];
		
		return number;
	}
	
	void notSame() {
		
	}
}
