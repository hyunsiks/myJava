package quiz;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C13_InputRightThing {

	/*
	  # 사용자로부터 숫자를 제대로 입력받을 때까지 계속 입력 받는 프로그램을 만들어보세요
	  	(잘못된 값이 입력되어도 강제종료 되지 않고, 올바른 값이 입력되면 출력후 프로그램 종료)
	 */
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
				
//		Scanner sc = new Scanner(System.in);
//		
//		while(true) {
//			try {
//				System.out.print("숫자 > ");
//				int num = sc.nextInt(); //int num의 값이 가져오다가 에러가 나서 스캐너에 걸려있기때문에 
//										//스캐너에 걸려있는 값을 빼지 않으면 계속 반복해서 꺼내는 행위가일어남 
//				System.out.println("입력하신 값은 " + num + "입니다");
//				break;
//			}catch(InputMismatchException e) {
//				System.out.println("잘못된 입력입니다");
//				String stuck = sc.nextLine();	//스캐너에 걸려있는 것을 빼주는 행위
////				System.out.println("걸려있던 걸 뺌 : " + stuck);
//			}
//		}
//		System.out.println("프로그램이 정상적으로 종료되었습니다");
		
		int a = inputInt("숫자 > ");
		
		System.out.println("input 함수로 입력받은 값 : " + a);
		System.out.println("프로그램이 정상적으로 종료되었습니다");
	}
	
	public static int inputInt(String message) {
		int num;
		
		while(true) {
			try {
				System.out.print(message);
				num = sc.nextInt();
				break;
			}catch(InputMismatchException e){
				sc.nextLine();
			}
		}
		
		//sc.close(); //더이상 쓰지 않을 스캐너를 삭제하는 함수(System.in은 close를 하지 않는것이 좋음)
		
		return num;
	}

}
