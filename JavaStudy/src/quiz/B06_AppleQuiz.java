package quiz;

import java.util.Scanner;

public class B06_AppleQuiz {

	public static void main(String[] args) {
		
	/*
	 사과를 10개씩 담을 수 있는 바구니가 있다.
	 사용자가 구매하고 싶은 사과의 개수를 입력하면
	 사과를 모두 담기 위해 필요한 바구니의 개수를 알려주는 프로그램을 만들어보세요.
	 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("구매하고 싶은 사과의 개수를 입력하세요 : ");
		int appleNumber = sc.nextInt();
		
		int basketNumber = appleNumber / 10 + 1;
		
		if(appleNumber >=0 && appleNumber % 10 == 0) {
			basketNumber -= 1; 
		} else if(appleNumber < 0) {
			basketNumber = 0;
		} 
		System.out.println("필요한 바구니의 개수는 " + basketNumber + "입니다.");
		
	}

}
