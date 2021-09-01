package 연습장;

import java.util.Scanner;

public class 해즈넥스트로나누기 {

	public static void main(String[] args) {
		
		
//		Scanner sc2 = new Scanner("apple, banana, kiwi, orange, peach, strawberry, pineapple");
		System.out.print("나눌 문자를 적으세요 : ");
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()) {
			System.out.println(sc.next());
		}
		System.out.println("끝");

	}

}
