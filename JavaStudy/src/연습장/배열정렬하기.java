package ������;

import java.util.Arrays;
import java.util.Collections;


public class �迭�����ϱ� {

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
		
		//Collections �̿��� �������� �������� �迭
		Arrays.sort(dice,Collections.reverseOrder()); // int�� �迭���� �ȵȴ�
//		Arrays.sort(dice2,Collections.reverseOrder()); // Integer�� �迭���� �ȴ�
		Arrays.sort(arr,Collections.reverseOrder()); //String�� �迭���� ��밡��
		
	}

}
