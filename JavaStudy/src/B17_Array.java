

public class B17_Array {

	public static void main(String[] args) {
		
	/*
	 # 배열(Array)
	 
	 	- 같은 타입 변수를 한번에 여러개 선언하는 방법
	 	- 같은 이름으로 변수를 여러개 선언한 뒤 인덱스를 활용해 구분한다
	 	- 배열도 배열.length 를 통해 길이를 알 수 있다
	 		* 일반 length() 랑 다른점은 배열에는 ()를 쓰지 않는다
	 	- 배열은 한번 크기가 정해지면 크기를 변경할 수 없다
	 	- 배열은 생성과 동시에 초기화가 되어있다(변수랑 다른점이다)
	 	 (정수 : 0/ 실수 : 0.0/ boolean : false/ 참조형 : null)
	 */
		
		int[] score = new int[100]; //[0] ~ [99]까지의 배열
		
		for(int index = 0; index < score.length; ++index) {
			score[index] = (int)(Math.random() * 101);
		}
		System.out.println("10번째 학생의 점수 : " + score[9]);		
	
	
	//연습문제 : Score의 총합과 평균(소수 둘째 자리)을 출력해보세요
		int sum = 0;
		for(int index = 0; index < score.length; ++index) {
			sum += score[index];		
		}
		//%.2f 사용
		System.out.printf("score의 총합은 %d이고 평균은 %.2f 이다", sum, (double)sum/(score.length));
		System.out.println();
	
		//Math.round 방법 사용
		System.out.print("Math.round 사용한 평균값 : ");
		System.out.print(Math.round(sum / (double)(score.length) * 100) / 100.0);
	
	/*
	 # 배열을 선언하는 방법
	 
	  1. 타입[] 배열이름 = new 타입[배열크기];
	  2. 타입[] 배열이름 = {값1, 값2, 값3 ...};
	  3. 타입[] 배열이름 = new 타입[]{값1, 값2, 값3 ...};
	 */
		int[] age = {10, 15, 18, 20, 32, 17};
		boolean[]passExam = {true, false, 80>70, false, false}; //80>70은 true와 같다
		String[] animals = new String[] {"lion", "tiger", "dog", "cat"};
		String[] animals2 = {"lion2", "tiger2","dog2","cat2"};
		
//	 # String은 char형 배열로 변환할 수 있다
		char[] msg1 = new char[] {'h','e','l','l','o'};
		
		String msg2 = "hello";
		
		System.out.println(msg1[0]);
		System.out.println(msg1[1]);
		System.out.println(msg1[2]);
		
		System.out.println(msg2.charAt(0));
		System.out.println(msg2.charAt(1));
		System.out.println(msg2.charAt(2));
		
		//둘이 너무 비스사기 때문에 스트링을 char형으로 변환가능
		char[] msg3 = msg2.toCharArray();
		
		//char형을 string으로 변환불가
		String msg4 = msg1.toString(); //이상한 문자출력
		
		System.out.println(msg3[0]);
		System.out.println(msg3[1]);
		System.out.println(msg3[2]);
		System.out.println(msg4);
		
		System.out.println(animals);
		
		
	
	}
}