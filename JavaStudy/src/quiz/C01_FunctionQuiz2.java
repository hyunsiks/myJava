package quiz;

import java.util.Arrays;
import java.util.Scanner;

public class C01_FunctionQuiz2 {
	
	/*
	 # ������ �Լ��� �����ϰ� �ùٸ��� �����ϴ��� �׽�Ʈ �غ�����
	 
	 	1. �ִ밪�� �Ű������� ���� ������, 0���� �ִ밪 �̸���
	 	   ��� ���� �����ϴ� int �迭�� �����Ͽ� ��ȯ�ϴ�
	 	   range�Լ��� ��������
	 	   
	 	   ex : range(10)�� ��� [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
	 	   
	 	2. �ּҰ��� �ִ밪�� �Ű������� ������ �� ���̿� �����ϴ�
	 	   ��� ���� �����ϴ� int �迭�� �����Ͽ� ��ȯ�ϴ�
	 	   range�Լ��� ��������(�ּҰ� �̻�, �ִ밪 �̸�)
	 	   
	 	   ex : range(5, 10)�� ��� [5, 6, 7, 8, 9]
	 	   	 	   
	 	3. �ּҰ��� �ִ밪�� �������� �Ű������� ������ �ּҰ����� �����Ͽ� 
	 	   �ִ밪���� ��������ŭ �����ϴ� int�迭�� �����Ͽ� ��ȯ�ϴ�
	 	   range�Լ��� ��������(�ּҰ� �̻�, �ִ밪 �̸�)	
	 	   
	 	   ex : range(50, 56, 5)�� ��� [50, 55]
	 	        range(50, 55, 5)�� ��� [50]
	 */
	//1���Լ�
	public static int[] range(int max) {
		int count = 0;
		int[] arr = new int[max];
		for(int i = 0; i < max; i++) {
			arr[count++] = i;
		}
		return arr;		
	}
	//2���Լ�
	//�Ű������� ���� Ȥ�� Ÿ���� �ٸ��� ���� �Լ����� ����� �� �ִ�(�Լ��� �����ε�)
	public static int[] range(int min, int max) {
		int count = 0;
		if(min >= max) { //�߸��� �Է��� �Ǿ��� ��� null�� �����Ѵ�
			return null;
		}
		
		int[] arr = new int[max - min]; 
		for(int i = min; i < max; i++) { 
			arr[count++] = i;
		}
		return arr;
	}
	//3���Լ�
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
		//1�����
		Scanner sc = new Scanner(System.in);
		System.out.println("1�������� �ִ밪�� �Է��ϼ��� : ");
		int max = sc.nextInt();
		System.out.println(Arrays.toString(range(max)));
		
		//2�����
		System.out.println("2�������� �ּҰ��� �Է��ϼ��� : ");
		int min = sc.nextInt();
		System.out.println("2�������� �ִ밪�� �Է��ϼ��� : ");
		max = sc.nextInt();
		System.out.println(Arrays.toString(range(min, max)));
		
		//3�����
		System.out.println("3�������� �ּҰ��� �Է��ϼ��� : ");
		min = sc.nextInt();
		System.out.println("3�������� �ִ밪�� �Է��ϼ��� : ");
		max = sc.nextInt();
		System.out.println("3�������� �������� �Է��ϼ���");
		int increment = sc.nextInt();
		System.out.println(Arrays.toString(range(min, max, increment)));
	}

}
