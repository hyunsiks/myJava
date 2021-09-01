package 연습장;

import java.util.InputMismatchException;
import java.util.Scanner;

public class 잘못된입력시반복입력하는법 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			try {
				System.out.print("숫자 > ");
				int num = sc.nextInt(); //int num의 값이 가져오다가 에러가 나서 스캐너에 걸려있기때문에 
										//스캐너에 걸려있는 값을 빼지 않으면 계속 반복해서 꺼내는 행위가일어남 
				System.out.println("입력하신 값은 " + num + "입니다");
				break;
			}catch(InputMismatchException e) {
				System.out.println("잘못된 입력입니다");
				String stuck = sc.nextLine();	//스캐너에 걸려있는 것을 빼주는 행위
//				System.out.println("걸려있던 걸 뺌 : " + stuck);
			}
		}
	}

}
