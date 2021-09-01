package quiz;

import java.util.Scanner;

public class B11_forBasicQuiz {

	public static void main(String[] args) {
	
	/*
	  사용자가 숫자를 입력했을 때
	  
	  1. 10부터 입력한 숫자까지의 총 합을 구해보세요
	  
	  2. 1부터 입력한 숫자 사이의 5의 배수만 모두 출력해보세요
	 */
		
//		1번문제
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");
		int num = sc.nextInt();
		int sum = 0;
		
		for(int i = 10; i <= num; i++) {
			sum += i;
		}
		System.out.println("10부터 입력한 숫자까지의 총 합은 : " + sum);
		
//		2번문제 (Scanner, nextInt 생략)
		for(int i = 1; i <= num; i++) {
			if(i % 5 == 0) {
				System.out.print(i + " ");
			}
		}
	}
	
}
