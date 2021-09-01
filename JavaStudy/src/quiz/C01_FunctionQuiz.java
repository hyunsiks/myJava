package quiz;

import java.util.Arrays;

public class C01_FunctionQuiz {

	/*
	  # 다음의 함수를 정의하고 올바르게 동작하는지 테스트해보세요
	  
	  	1. 전달한 문자가 알파벳이면 true를 반환, 아니면 false를 반환하는 함수
	  	2. 전달한 숫자가 3의 배수이면 true를 반환, 아니면 false를 반환하는 함수
	  	3. 숫자를 하나 전달하면 문자열 "짝수입니다" 또는 "홀수입니다"를 반환하는 함수
	  	4. 숫자를 전달하면 해당 숫자의 모든 약수를 배열 형태로 반환하는 함수
	  	5. 전달한 정수가 소수라면 true를 반환하고 아니면 false를 반환하는 함수
	  	6. 숫자를 전달하면 해당 숫자의 팩토리얼 결과를 반환하는 함수
	  		(factorial : 전달받은 숫자부터 1까지 줄이면서 계속 곱하는것)
	 */
	
	public static void main(String[] args) {
	
		System.out.println("1번문제 : " + alphabet('c'));
		System.out.println("2번문제 : " + threeTimes(36));
		System.out.println("3번문제 : " + evenOdd(25));
		System.out.print("4번문제 : ");
		
			System.out.print(Arrays.toString(findDevide(30)));
		
		System.out.println();
		System.out.println("5번문제 : " + prime(17));
		System.out.println("6번문제 : " + factorial(5));
	}
	//1
	public static boolean alphabet(char ch) {
		return(ch >= 'A' && ch <= 'z');
	}
	//2
	public static boolean threeTimes(int num) {
		
		return num % 3 == 0;
	}
	//3
	public static String evenOdd(int num) {
		
		return num % 2 == 0? "짝수입니다" : "홀수입니다";
	}
//  4. 숫자를 전달하면 해당 숫자의 모든 약수를 배열 형태로 반환하는 함수
//	public static int[] yaksu(int num) {
//			
//		int count = 0;
//		for(int i = 2; i < num; i++) {
//			if(num % i == 0) {
//				count++;
//			}
//		}
//		int[] arr = new int[count - 1];
//	
//		String sum = "";
//		for(int i = 2; i < num; i++) { //num가 5일때 2,3,4를 체크
//			if(num % i == 0) {			//2,3,4 중 나누어 떨어지는게 있으면
//				
//				sum += i + " ";					
//				
//			}
//			
//		}
//		sum.split(sum);
//		return arr;
//	}
	public static int[] findDevide(int num) {
		
		boolean[] divide = new boolean[num];
		
		int count = 0;
		for(int i = 1; i < num; i++) {
			if(num % i == 0) {
				divide[i - 1] = true;
				count++;
			}
		}
		int[] result = new int[count];
		int index = 0;
		for(int i = 0; i < divide.length; i++) {
			if(divide[i]) {
				result[index++] = i + 1;
			}
		}
		return result;
	}
	
//  5. 전달한 정수가 소수라면 true를 반환하고 아니면 false를 반환하는 함수
	public static boolean prime(int num) {
		for(int i = 2; i < num; i++) {
			if(num % i == 0) {
				return false;
			}
		}
		return true;
	}
//  6. 숫자를 전달하면 해당 숫자의 팩토리얼 결과를 반환하는 함수
	public static int factorial(int num) {
		int sum = 1;
		for(int i = num; i > 1; i--) {
			sum *= i;
		}
		return sum;
	}
}
