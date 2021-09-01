
import java.util.Scanner;

public class B18_Array2 {

	public static void main(String[] args) {
		
		//배열 내부에도 배열을 넣을 수 있다
		int[] num1 = {1, 2, 3, 4, 5, 6};
		int[] num2 = new int[10];
		int[] num3 = new int[] {100, 200, 300, 400};
		
		int[][]arr2 = {num1, num2, num3};
		
		
		System.out.println(arr2[0]); //arr2라는 이중배열안에 arr2[0]의 배열 시작주소
		System.out.println(num1);	//num1 의 배열 시작주소
		
		//2차원 배열의 값 사용하기
		System.out.println("arr2[][]에 0번쨰 배열인 num1[]의 3번주소 값이다 : " + arr2[0][3]);
		System.out.println("arr[1][8]" + arr2[1][8]);
		System.out.println("arr[2][3]" + arr2[2][3]);
		
		//n차원 배열은 n중 반복문으로 모두 탐색할 수 있다
		for(int i = 0; i < arr2.length; i++) { //arr2.length : 배열의 갯수
			System.out.println("####" + i + "번째 배열의 길이 : " + arr2[i].length); //arr2[i]의 배열길이
			
			for(int j = 0; j < arr2[i].length; j++) { //arr2[i]의 길이만큼 j를 돌려서 arr2[i][j]의 값을 출력하기위함
				System.out.printf("arr2[%d][%d] : %d\n", i, j, arr2[i][j]);
			}
		}
		
		//2차원 배열의 활용 예
		char[][] block1 = {
				{'□', '■', '■', '□', },
				{'■', '□', '□', '■', },
				{'■', '□', '□', '■', },
				{'□', '■', '■', '□', },

		};
		for(int i = 0; i < block1.length; i++) {
			for(int j = 0; j < block1[i].length; j++) {
				System.out.print(block1[i][j]);
			}
			System.out.println();
		}
		
		//오목만들기
		Scanner sc = new Scanner(System.in);
		
		int[][] omok = new int[15][15]; //15 x 15 짜리 바둑판
	while(true) {
		System.out.print("좌표를 입력해 주세요 : ");
		String point = sc.nextLine();
		
		int x1 = Integer.parseInt(point.split(",")[0].trim());
		int y1 = Integer.parseInt(point.split(",")[0].trim());
		
		
		omok[x1][14 - y1] = 1;	//y축은 위에서 출력되는거를 아래를 0으로 출력하기 위해 뺀것임
		
		for(int y = 0; y < omok.length; y++) {
			for(int x = 0; x < omok[y].length; x++) {
				
				switch(omok[x][y]) {
				case 0:
					System.out.print('□');
					break;
				case 1:
					System.out.print('●');
					break;
				case 2:
					System.out.print('○');
					break;
				}
				System.out.print(" ");
			}
			System.out.println();
		}
	}
		
		
	}

}
