package quiz;

import java.util.Scanner;

public class B15_Count369 {

	public static void main(String[] args) {
		
	/*
	 	# ����ڷκ��� ������ �ϳ� �Է¹ް� �ش� ���ڱ���
	 	  369������ ����� �� �ڼ��� ���ڸ� ����ϼ���
	 */
//		## ������ 369Ǯ��
		Scanner sc = new Scanner(System.in);
		System.out.println("���ڸ� �Է��ϼ��� : ");
//		int input = sc.nextInt();
//		int count = 0;
//		
//		for(int i = 1; i <= input; i++) {  								//input�� ���� ���� ���� üũ�ϰڴٴ°�
//			for(int j = i; j > 0;) { 									//j �� �����ϰ� ���߿� 10�� ������鼭 �������� üũ�Ϸ��°�
//				int k = j; 
//				j /= 10; 	
//				if((k % 10) == 3 || (k % 10) == 6 || (k % 10) == 9) {				
//						System.out.print(i + "�� ");
//						count++;
//				}
//			}
//		}
//		System.out.println();
//		System.out.println("�� ���� : " + count + "�� �Դϴ�.");
		
//		## ���ڿ��� 369 Ǯ��
//			- ������ ���ڿ��� �ٲٴ� �����
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
//					System.out.print("¦");
//				}
//			}
//			System.out.println();
//		}
//		System.out.println("�� �ڼ� Ƚ���� : " + count + "ȸ");
		
//		--------------------------------------------------
//		����� Ǯ��
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
				int value = testValue % (int)Math.pow(10, j) / (int)Math.pow(10, j - 1); //testvalue��θ� �������� ����� ���� ���Ѵ�

				if(value == 3 || value == 6 || value == 9) {
					clap++;
					System.out.print("¦");
				}
			}
			System.out.println();
		}
	}

}
