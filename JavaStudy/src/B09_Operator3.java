
import java.util.Scanner;

public class B09_Operator3 {

	public static void main(String[] args) {
		
	/*
		# 삼항 연산자
		
			- 간단한 if문을 한 줄로 표현할 수 있다
			- 조건식? 예 : 아니오;
	 */
		Scanner sc = new Scanner(System.in);
		System.out.print("사과의 개수를 출력하시오 : ");
		int apple = sc.nextInt();
		int size = 10;
		
		int needs = apple % size == 0? apple / size : apple / size + 1;
		System.out.println(needs);
		
		boolean isEven = apple % 2 == 0;
		System.out.printf("사과의 개수는 %s입니다.", isEven? "짝수" : "홀수");
		
		
	}

}
