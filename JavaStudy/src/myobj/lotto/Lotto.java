package myobj.lotto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class Lotto {

	HashSet<Integer> winNumbers;
	
	public static void main(String[] args) {
		
		Lotto num = new Lotto();
		num.winNumber();
		num.sortNumber();
		num.myNum();
	}
	
	public Lotto() {
		
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
	
	public void sortNumber() {
		ArrayList<Integer> numSort = new ArrayList<>(winNumbers);
		
		Collections.sort(numSort);
		System.out.println(numSort);
	}
	
	public void myNum() {
		System.out.println("당신이 선택할 번호를 입력하세요");
		Scanner sc = new Scanner(System.in);
		int[] my = new int[7];
		int i = 0;
	
		
		while(sc.hasNextInt()) {
		
			my[i] = sc.nextInt();
			System.out.println(my[i]);
			i++;
		}
		System.out.println("종료");
	}
	
	public void myRank() {
		
	}
}
