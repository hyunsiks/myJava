package quiz;

import java.util.Random;
import java.util.Scanner;

public class B17_CountRandomFruit {

	public static void main(String[] args) {
		
	/*
	 1. ����ڷ� ���� �迭�� ũ�⸦ �Է¹޴´�
	 2. �ش� ũ�⸸ŭ�� �迭�� ���� ���� ���ڿ��� �����Ѵ�
	 	(�������� �����ϴ� ���� : apple, banana, kiwi, orange, peach, strawberry, pineapple)
	 3. �� ������ �� �� �����ߴ��� ��� ����ϰ� ����غ���	
	 */
		
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();
		
		System.out.print("�迭�� ũ�⸦ ��������(����) : ");
		int size = sc.nextInt();
		
		String[] arr = new String[size];
		
		String[] fruit = new String[7];
		
		Scanner sc2 = new Scanner("apple banana kiwi orange peach strawberry pineapple");
		
		while(sc2.hasNext()) {		//sc2�� ��� ���� �ϳ��� ���������ѿ뵵, Space�� ���� ���ڸ� ������
			for(int i = 0; i < 7; i++) {
				fruit[i] = sc2.next();	// 0~6������ �迭�� hasNext()�� ���� ������ ��� �뵵			
			}			
		}		
		
		for(int j = 0; j < arr.length; j++) {	//����ڰ� ���� ��(size)��ŭ ������ �迭�� fruit[]�� �������� �������
			arr[j] = fruit[ran.nextInt(7)];
			System.out.println(j + "��° �������� " + arr[j] + "�� ����ֽ��ϴ�.");
		}
		
		
//		===================================================================================================
//		����� Ǯ��
		
		
	}
	
	

}
