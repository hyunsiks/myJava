package quiz;

import java.util.Scanner;

public class B14_GCD {

	public static void main(String[] args) {
	
	/*
	 	두 숫자를 입력받고 두 숫자의 최대공약수를 구해보세요
	 	※두 숫자의 공약수 중 가장 큰 공약수
	 */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 숫자를 입력하세요 : ");
		int firstInput = sc.nextInt();
		System.out.print("두번째 숫자를 입력하세요 : ");
		int secondInput = sc.nextInt();
		int gcd = 0;
		int temp;
		
		if(firstInput > secondInput) {			
			temp = firstInput;
			firstInput = secondInput;
			secondInput = temp;
		}
		
		for(int i = 1; i <= firstInput; i++) {
			if(firstInput % i == 0 && secondInput % i == 0) {				
					gcd = i;				
			}
		}		
		System.out.println("최대공약수는 " + gcd + "입니다.");
	}

}
