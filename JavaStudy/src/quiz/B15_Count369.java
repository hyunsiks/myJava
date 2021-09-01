package quiz;

import java.util.Scanner;

public class B15_Count369 {

	public static void main(String[] args) {
		
	/*
	 	# 사용자로부터 정수를 하나 입력받고 해당 숫자까지
	 	  369게임이 진행될 때 박수의 숫자를 출력하세요
	 */
//		## 정수로 369풀기
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요 : ");
//		int input = sc.nextInt();
//		int count = 0;
//		
//		for(int i = 1; i <= input; i++) {  								//input한 숫자 까지 전부 체크하겠다는것
//			for(int j = i; j > 0;) { 									//j 를 생성하고 나중에 10씩 나누어가면서 나머지를 체크하려는것
//				int k = j; 
//				j /= 10; 	
//				if((k % 10) == 3 || (k % 10) == 6 || (k % 10) == 9) {				
//						System.out.print(i + "번 ");
//						count++;
//				}
//			}
//		}
//		System.out.println();
//		System.out.println("총 합은 : " + count + "번 입니다.");
		
//		## 문자열로 369 풀기
//			- 정수를 문자열로 바꾸는 방법들
//			System.out.println("hello : " + 369); 
//			System.out.println("" + 123);
//			System.out.println(Integer.toString(123));
		
		
//		for(int i = 1; i <= input; i++) {
//			String num_str = "" + i;
//			System.out.print(i + ": ");
//			
//			for(int j = 0; j < num_str.length(); j++) {
//				char num_ch = num_str.charAt(j);
//				if(num_ch == '3' || num_ch == '6' || num_ch == '9') {
//					count++;
//					System.out.print("짝");
//				}
//			}
//			System.out.println();
//		}
//		System.out.println("총 박수 횟수는 : " + count + "회");
		
//		--------------------------------------------------
//		강사님 풀이
		int input2 = sc.nextInt();
		int clap = 0;
		
		for(int i = 1; i <= input2; i++) {
			int testValue = i;
			int digit = 1;
			int n = 1;
			System.out.println(i + ": ");
			
			while((n *= 10) <= testValue) {
				digit++;
			}
			for(int j = digit; j > 0; j--) {
				int value = testValue % (int)Math.pow(10, j) / (int)Math.pow(10, j - 1); //testvalue모두를 나머지로 만들고 몫을 구한다

				if(value == 3 || value == 6 || value == 9) {
					clap++;
					System.out.print("짝");
				}
			}
			System.out.println();
		}
	}

}
