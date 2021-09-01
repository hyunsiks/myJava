package quiz;

import java.util.Arrays;
import java.util.Scanner;

public class C01_FunctionQuiz2 {
	
	/*
	 # 다음의 함수를 정의하고 올바르게 동작하는지 테스트 해보세요
	 
	 	1. 최대값을 매개변수로 전달 받으면, 0부터 최대값 미만의
	 	   모든 값을 포함하는 int 배열을 생성하여 반환하는
	 	   range함수를 만들어보세요
	 	   
	 	   ex : range(10)의 결과 [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
	 	   
	 	2. 최소값과 최대값을 매개변수로 받으면 그 사이에 존재하는
	 	   모든 값을 포함하는 int 배열을 생성하여 반환하는
	 	   range함수를 만들어보세요(최소값 이상, 최대값 미만)
	 	   
	 	   ex : range(5, 10)의 결과 [5, 6, 7, 8, 9]
	 	   	 	   
	 	3. 최소값과 최대값과 증가값을 매개변수로 받으면 최소값에서 시작하여 
	 	   최대값까지 증가값만큼 증가하는 int배열을 생성하여 반환하는
	 	   range함수를 만들어보세요(최소값 이상, 최대값 미만)	
	 	   
	 	   ex : range(50, 56, 5)의 결과 [50, 55]
	 	        range(50, 55, 5)의 결과 [50]
	 */
	//1번함수
	public static int[] range(int max) {
		int count = 0;
		int[] arr = new int[max];
		for(int i = 0; i < max; i++) {
			arr[count++] = i;
		}
		return arr;		
	}
	//2번함수
	//매개변수의 개수 혹은 타입이 다르면 같은 함수명을 사용할 수 있다(함수의 오버로딩)
	public static int[] range(int min, int max) {
		int count = 0;
		if(min >= max) { //잘못된 입력이 되었을 경우 null을 리턴한다
			return null;
		}
		
		int[] arr = new int[max - min]; 
		for(int i = min; i < max; i++) { 
			arr[count++] = i;
		}
		return arr;
	}
	//3번함수
	public static int[] range(int min, int max, int increment) {
		int size = 0;
		int count = 0;
		for(int i = min; i < max; i+= increment) {
			size++;
		}
		int[] arr = new int[size];
		for(int i = min; i < max; i+= increment) {
			arr[count++] = i;
		}
		return arr;
	}	
	
	public static void main(String[] args) {
		//1번출력
		Scanner sc = new Scanner(System.in);
		System.out.println("1번문제의 최대값을 입력하세요 : ");
		int max = sc.nextInt();
		System.out.println(Arrays.toString(range(max)));
		
		//2번출력
		System.out.println("2번문제의 최소값을 입력하세요 : ");
		int min = sc.nextInt();
		System.out.println("2번문제의 최대값을 입력하세요 : ");
		max = sc.nextInt();
		System.out.println(Arrays.toString(range(min, max)));
		
		//3번출력
		System.out.println("3번문제의 최소값을 입력하세요 : ");
		min = sc.nextInt();
		System.out.println("3번문제의 최대값을 입력하세요 : ");
		max = sc.nextInt();
		System.out.println("3번문제의 증가값을 입력하세요");
		int increment = sc.nextInt();
		System.out.println(Arrays.toString(range(min, max, increment)));
	}

}
