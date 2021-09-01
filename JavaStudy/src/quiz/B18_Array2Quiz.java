package quiz;

import java.util.Arrays;
import java.util.Random;

public class B18_Array2Quiz {

	public static void main(String[] args) {
		
		int[][] numArr = new int[][] {
			{1, 1, 1, 1},
			{1, 1, 1, 1, 1, 1, 1},
			{1, 1, 1, 1, 1, 1},
			{1, 1},
			{1, 1, 1, 1, 1}
		};
		/*
		 1. numArr�� ��� ���� 0~100 ������ ���� ������ �ٲ㺸����
		 2. numArr�� ���հ� ����� ���ؼ� ����غ�����
		 3. numArr�� �� ���� ���� ��� ���ؼ� ����غ�����
		 3. numArr�� �� ���� ���� ��� ���ؼ� ����غ�����
		 */
		//1
		System.out.println("==========1������==========");
		Random ran = new Random();
		
		for(int i = 0; i < numArr.length; i++) {
			System.out.printf("=======%d��\n", i);
			for(int j = 0; j < numArr[i].length; j++) {
				numArr[i][j] = ran.nextInt(101);
				System.out.printf("numArr[%d][%d]�� ���� %d\n", i, j, numArr[i][j]);
			}			
		}
		//2
		System.out.println("==========2������==========");
		int sum = 0;
		double count = 0;
		for(int i = 0; i < numArr.length; i++) {

			for(int j = 0; j < numArr[i].length; j++) {
				numArr[i][j] = 1;
				sum += numArr[i][j];
				count++;
			}			
		}
		System.out.printf("������ %d �̰�, ����� %.2f�Դϴ�\n",sum ,(double)sum/count);
		
		//3
		System.out.println("==========3������==========");
		sum = 0;
		count = 0;
		for(int i = 0; i < numArr.length; i++) {

			for(int j = 0; j < numArr[i].length; j++) {
				numArr[i][j] = 1;
				sum += numArr[i][j];				
			}
			System.out.printf("%d���� ������ %d �Դϴ�\n",i, sum);
			sum = 0;
		}
		
		//4
		System.out.println("==========4������==========");
		int sum0 = 0, sum1 = 0, sum2 = 0, sum3 = 0, sum4 = 0, sum5 = 0, sum6 = 0;

		
		for(int i = 0; i < numArr.length; i++) {

			for(int j = 0; j < numArr[i].length; j++) {	//arr[0][0], [1][0], [2][0]
				numArr[i][j] = 1;
				switch(j) {
				case 0: 
					sum0 += numArr[i][j];
					break;
				case 1:
					sum1 += numArr[i][j];
					break;
				case 2:
					sum2 += numArr[i][j];
					break;
				case 3:
					sum3 += numArr[i][j];
					break;
				case 4:
					sum4 += numArr[i][j];
					break;
				case 5:
					sum5 += numArr[i][j];
					break;
				case 6:
					sum6 += numArr[i][j];
					break;
				}
			}		
		}
		System.out.println("0���� ���� : " + sum0);
		System.out.println("1���� ���� : " + sum1);
		System.out.println("2���� ���� : " + sum2);
		System.out.println("3���� ���� : " + sum3);
		System.out.println("4���� ���� : " + sum4);
		System.out.println("5���� ���� : " + sum5);
		System.out.println("6���� ���� : " + sum6);
	
		//3
		
		int[] rowSum = new int[numArr.length];
		
		for(int i = 0; i < rowSum.length; i++) {
			for(int j = 0; j < numArr[i].length; j++) {
				rowSum[i] += numArr[i][j];
			}
		}
		//�迭 ���ϰ� ����ϱ�
		System.out.println("���� �� : " + Arrays.toString(rowSum));;
		
		//4������ �����Ǯ��(���� �ձ��ϱ�)
		// *row : ��, column : ��
		
		//���� �� �迭 ã��
		int longest = 0;
		for(int i = 0; i < numArr.length; i++) {
			longest = Math.max(longest, numArr[i].length);
		}
		
		//Ǫ�¹��(1)
		int[]colSum = new int[7]; //0~6���� 7�� ������ �迭����
		for(int row = 0; row < colSum.length; row++) {//�迭�� ����
			
			for(int col = 0; col < numArr.length; col++) {//numArr�� �迭 ���� 0~4
				
				if(numArr[col].length > row) {//numArr ���迭�� ���̰� 
					colSum[row] += numArr[col][row];					
				}
			}
		}
		System.out.println("���� ��: " + Arrays.toString(colSum));
		
		//Ǫ�¹��(2)
		for(int i = 0; i <rowSum.length; i++) { //0 1 2 3 4 5 6
			for(int j = 0; j< numArr[i].length; j++) {
				colSum[j] += numArr[i][j];
			}
					
		}
	
		
	}

}
