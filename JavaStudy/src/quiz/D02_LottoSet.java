package quiz;

import java.util.ArrayList;
import java.util.HashSet;

import myobj.lotto.Lotto;

public class D02_LottoSet {
	
	/*
	    1���� 45������ �ߺ����� �������� 7���� �̷���� HashSet�� �����Ͽ�
	    ��ȯ�ϴ� �޼��带 �ۼ� �� �׽�Ʈ�غ��� 
	 */
	HashSet<Integer> winNumbers;
	int[] arr;
	ArrayList<Integer> winNumberForArrayList;
	
	public static void main(String[] args) {
		
		D02_LottoSet num = new D02_LottoSet();
		num.winNumber();
		
		System.out.println(num.changeArrayList());
		
		String a = "";
		System.out.print("[");
		for(int c : num.changeIntArray()) {
			System.out.print(c);
			System.out.print(" ");
			a += (c + " ");
		}

		
	}
	
	public D02_LottoSet() {
		
		winNumbers = new HashSet<>();
		
	}
	public void winNumber() {
		
		while(true) {
			winNumbers.add((int)(Math.random()*45 + 1));
			
			if(winNumbers.size() == 7) {
				break;
			}
		}
		System.out.println(winNumbers);
	}
	/*
	 	1���� 45������ �ߺ����� ���� ���� 7���� �̷���� ArrayList�� �����Ͽ�
	 	��ȯ�ϴ� �޼��带 �ۼ� �� �׽�Ʈ
	 */
	public ArrayList<Integer> changeArrayList() {
		winNumberForArrayList = new ArrayList<>(winNumbers);
		return winNumberForArrayList;
	}

	/*
	 	1���� 45������ �ߺ����� ���� ���� 7���� �̷���� int[]�� �����Ͽ�
	 	��ȯ�ϴ� �޼��带 �ۼ� �� �׽�Ʈ
	 */
	public int[] changeIntArray() {
		winNumberForArrayList = new ArrayList<>(winNumbers);
		
		arr = new int[winNumberForArrayList.size()];
		for(int i = 0; i < winNumberForArrayList.size(); i++) {
			arr[i] = winNumberForArrayList.get(i);
		}
		
		return arr;
	}
}
