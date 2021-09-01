package quiz;

import java.util.ArrayList;
import java.util.HashSet;

import myobj.lotto.Lotto;

public class D02_LottoSet {
	
	/*
	    1부터 45사이의 중복없는 랜덤숫자 7개로 이루어진 HashSet을 생성하여
	    반환하는 메서드를 작성 후 테스트해보기 
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
	 	1부터 45사이의 중복없는 랜덤 숫자 7개로 이루어진 ArrayList를 생성하여
	 	반환하는 메서드를 작성 후 테스트
	 */
	public ArrayList<Integer> changeArrayList() {
		winNumberForArrayList = new ArrayList<>(winNumbers);
		return winNumberForArrayList;
	}

	/*
	 	1부터 45사이의 중복없는 랜덤 숫자 7개로 이루어진 int[]을 생성하여
	 	반환하는 메서드를 작성 후 테스트
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
