package quiz;

import java.util.Random;
import java.util.Scanner;

public class B17_CountRandomFruit {

	public static void main(String[] args) {
		
	/*
	 1. 사용자로 부터 배열의 크기를 입력받는다
	 2. 해당 크기만큼의 배열에 랜덤 과일 문자열을 저장한다
	 	(랜덤으로 등장하는 과일 : apple, banana, kiwi, orange, peach, strawberry, pineapple)
	 3. 각 과일이 몇 번 등장했는지 모두 기록하고 출력해본다	
	 */
		
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();
		
		System.out.print("배열의 크기를 적으세요(숫자) : ");
		int size = sc.nextInt();
		
		String[] arr = new String[size];
		
		String[] fruit = new String[7];
		
		Scanner sc2 = new Scanner("apple banana kiwi orange peach strawberry pineapple");
		
		while(sc2.hasNext()) {		//sc2에 담긴 값을 하나씩 나누기위한용도, Space를 통해 문자를 나눈다
			for(int i = 0; i < 7; i++) {
				fruit[i] = sc2.next();	// 0~6까지의 배열에 hasNext()로 나눈 과일을 담는 용도			
			}			
		}		
		
		for(int j = 0; j < arr.length; j++) {	//사용자가 정한 값(size)만큼 생성된 배열에 fruit[]의 랜덤값을 담기위함
			arr[j] = fruit[ran.nextInt(7)];
			System.out.println(j + "번째 번지에는 " + arr[j] + "가 들어있습니다.");
		}
		
		
//		===================================================================================================
//		강사님 풀이
		
		
	}
	
	

}
