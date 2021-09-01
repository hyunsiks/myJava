package quiz;

public class B14_Gugudan {

	public static void main(String[] args) {
		
	/*
	 1. 구구단을 다음과 같이 가로로 출력해보세요
	 ex) 2단 : 2x1=2 2x2=4 2x3=6 ...
	 	 3단 : 3x1=3 3x2=6 3x3=9 ...
	 	 
	 2. 구구단을 다음과 같이 세로로 출력해보세요
	 ex) 2단		3단		4단
	 	 2x1=2	3x1=3	4x1=4
	 	 2x2=4	3x2=6	4x2=8
	 	 ...
	 */

//		1번문제
		for(int i = 2; i <= 9; i++) {
			System.out.printf("%d단 : ", i);
			for(int j = 1; j <= 9; j++) {
				System.out.printf("%dx%d=%-2d ", i, j, i*j);
			}
			System.out.println();
		}
		
//		2번문제
		for(int i = 2; i <= 9; i++) {
			System.out.print(i + "단\t ");
		}
		System.out.println();
		for(int k = 1; k <= 9; k++) {
			for(int j = 2; j <= 9; j++) {
				System.out.printf("%dx%d=%-2d\t ", j, k, j*k);
			}
			System.out.println();
		}
	}

}
