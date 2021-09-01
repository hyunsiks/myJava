
import java.util.Random;

public class B16_Random {

	public static void main(String[] args) {
	
	/*
	 	# JAVA에서 무작위 숫자 생성하기
	 */	
//	 	 1. Math.random()
//	 	 	- double 타입의 랜덤 소수를 생성한다
//	 	 	- (0 <= X < 1)  의 범위를 가진다
			for(int i = 0; i < 10; i++) {
				System.out.println(Math.random());
			}	
//			- 원하는 범위의 숫자를 만드는 법(ex. 30~60 사이의 수)
//				(1) 생성된 랜덤 소수에 원하는 숫자의 개수를 곱한다(즉, 31개)
				System.out.println(Math.random() * 31);
				//0*31 <= X < 1*31 -> 0<= X < 31
//				(2) 원하는 숫자 중 가장 작은 숫자를 더한다(즉, 30)
				System.out.println(Math.random() + 30);
				//0+30 <= X < 61
//				(3-1) 소수점 아래를 삭제한다(더블타입)
				System.out.println(Math.floor(Math.random() * 31 + 30));
				//0.0 <= X <= 60.0
//				(3-2) 소수점 아래를 삭제한다(인트타입)
				System.out.println((int)(Math.random() * 31 + 30));
				// 0<= X <= 60
				
//		   # 연습문제 : 1 ~ 45의 랜덤 숫자를 7개 출력하세요
			
			for(int i = 0; i < 7; i++) { //int형
				System.out.println((int)(Math.random() * 45 + 1));
			}
			for(int i = 0; i < 7; i++) { //double형
				System.out.println(Math.floor(Math.random() * 45 + 1));
			}
			System.out.println("-------------------------------------");
			
//		 2. Random 클래스
//			- 좀 더 편리하게 랜덤 값을 선택할 수 있는 기능들이 모여있는 클래스
//			- 생성할 때 무작위 랜덤 시드가 선택된다 (ex.ran.nextInt(시드))(ex.new Random(시드))
//			- 원하는 랜덤 시드를 선택할 수도 있다 
			Random ran = new Random(); 
			// 0 ~ bound 미만의 정수를 반환한다
			System.out.println(ran.nextInt(45) + 1); //1~45랜덤정수
			System.out.println(ran.nextInt(45));//0~44랜덤정수
			System.out.println(ran.nextInt());
			System.out.println(ran.nextInt());
			System.out.println(ran.nextInt());
			System.out.println(ran.nextInt());
			System.out.println(ran.nextInt());
			System.out.println(ran.nextInt());
			
//			# 연습문제 : 동전던지기
			System.out.println(ran.nextBoolean()? "앞면" : "뒷면");
	}

}
