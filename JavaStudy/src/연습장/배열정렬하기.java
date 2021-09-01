package 연습장;

import java.util.Arrays;
import java.util.Collections;


public class 배열정렬하기 {

	public static void main(String[] args) {
		
		
		Integer[] dice = {3,1,2,3,4};
		int[] dice2 = {3,1,2,3,4,};
		String[] arr = {"apple", "orange","banana", "kiwi"};
		
		Arrays.sort(dice);
		System.out.print(dice[0]);
		System.out.print(dice[1]);
		System.out.print(dice[2]);
		System.out.print(dice[3]);
		System.out.print(dice[4]);
		
		//Collections 이용한 오름차순 내림차순 배열
		Arrays.sort(dice,Collections.reverseOrder()); // int형 배열에는 안된다
//		Arrays.sort(dice2,Collections.reverseOrder()); // Integer형 배열에만 된다
		Arrays.sort(arr,Collections.reverseOrder()); //String형 배열에도 사용가능
		
	}

}
