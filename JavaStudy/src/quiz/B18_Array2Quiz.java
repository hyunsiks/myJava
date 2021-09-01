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
		 1. numArr의 모든 값을 0~100 사이의 랜덤 정수로 바꿔보세요
		 2. numArr의 총합과 평균을 구해서 출력해보세요
		 3. numArr의 각 행의 합을 모두 구해서 출력해보세요
		 3. numArr의 각 열의 합을 모두 구해서 출력해보세요
		 */
		//1
		System.out.println("==========1번문제==========");
		Random ran = new Random();
		
		for(int i = 0; i < numArr.length; i++) {
			System.out.printf("=======%d행\n", i);
			for(int j = 0; j < numArr[i].length; j++) {
				numArr[i][j] = ran.nextInt(101);
				System.out.printf("numArr[%d][%d]의 값은 %d\n", i, j, numArr[i][j]);
			}			
		}
		//2
		System.out.println("==========2번문제==========");
		int sum = 0;
		double count = 0;
		for(int i = 0; i < numArr.length; i++) {

			for(int j = 0; j < numArr[i].length; j++) {
				numArr[i][j] = 1;
				sum += numArr[i][j];
				count++;
			}			
		}
		System.out.printf("총합은 %d 이고, 평균은 %.2f입니다\n",sum ,(double)sum/count);
		
		//3
		System.out.println("==========3번문제==========");
		sum = 0;
		count = 0;
		for(int i = 0; i < numArr.length; i++) {

			for(int j = 0; j < numArr[i].length; j++) {
				numArr[i][j] = 1;
				sum += numArr[i][j];				
			}
			System.out.printf("%d행의 총합은 %d 입니다\n",i, sum);
			sum = 0;
		}
		
		//4
		System.out.println("==========4번문제==========");
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
		System.out.println("0열의 합은 : " + sum0);
		System.out.println("1열의 합은 : " + sum1);
		System.out.println("2열의 합은 : " + sum2);
		System.out.println("3열의 합은 : " + sum3);
		System.out.println("4열의 합은 : " + sum4);
		System.out.println("5열의 합은 : " + sum5);
		System.out.println("6열의 합은 : " + sum6);
	
		//3
		
		int[] rowSum = new int[numArr.length];
		
		for(int i = 0; i < rowSum.length; i++) {
			for(int j = 0; j < numArr[i].length; j++) {
				rowSum[i] += numArr[i][j];
			}
		}
		//배열 편하게 출력하기
		System.out.println("행의 합 : " + Arrays.toString(rowSum));;
		
		//4번문제 강사님풀이(열의 합구하기)
		// *row : 행, column : 열
		
		//제일 긴 배열 찾기
		int longest = 0;
		for(int i = 0; i < numArr.length; i++) {
			longest = Math.max(longest, numArr[i].length);
		}
		
		//푸는방식(1)
		int[]colSum = new int[7]; //0~6개의 7개 길이의 배열생성
		for(int row = 0; row < colSum.length; row++) {//배열의 길이
			
			for(int col = 0; col < numArr.length; col++) {//numArr의 배열 갯수 0~4
				
				if(numArr[col].length > row) {//numArr 각배열의 길이가 
					colSum[row] += numArr[col][row];					
				}
			}
		}
		System.out.println("열의 합: " + Arrays.toString(colSum));
		
		//푸는방식(2)
		for(int i = 0; i <rowSum.length; i++) { //0 1 2 3 4 5 6
			for(int j = 0; j< numArr[i].length; j++) {
				colSum[j] += numArr[i][j];
			}
					
		}
	
		
	}

}
