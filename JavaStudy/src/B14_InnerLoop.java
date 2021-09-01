

public class B14_InnerLoop {

	public static void main(String[] args) {
	
	
//	  # 반복문 내부에 반복문 사용하기
		for(int i = 0; i < 3; i++) {
			System.out.printf("========================바깥쪽 반복문%d\n", i);
			
			for(int j = 0; j < 2; j++) {
				System.out.printf("==========안쪽 반복문%d-%d\n", i, j);
			}
		}
	
//	  # 연습문제 : 다중 반복문으로 구구단 출력해보기
		for(int i = 1; i <= 9; i++) {
			System.out.println("=====" + i + "단 =====");
			for(int j = 1; j <= 9; j++)
				System.out.printf("%d x %d = %d\n", i, j, i*j);
		}

	}

}
