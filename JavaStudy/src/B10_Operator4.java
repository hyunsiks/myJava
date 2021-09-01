

public class B10_Operator4 {

	public static void main(String[] args) {
		
	/*
	 	# 대입 연산자	 	
	 	 = : 왼쪽의 변수에 오른쪽의 값을 대입한다는 것
	 */
		int num = 10;
		num = num + 20; //30
		num = num + 5; //35
		System.out.println(num);
		
	/*
	 	# 복합 대입 연산자	 	
	 	 - 변수에 결과를 누적시키는 연산자
	 */
		num = 10;
		num += 20;
		num += 5;
		System.out.println(num);
		
	/*
	 	# 단항 연산자	 	
	 	 - 변수에 결과를 1씩 누적시키는 연산자
	 	 - ++, --의 위치에 따라 결과가 달라진다
	 */
		num = 10;
		num++;
		System.out.println(num);
	
		num = 3;
		System.out.println(num++); //그 줄의 모든 명령어를 다 실행하고 +해준다
		System.out.println(++num); //그 줄의 명령어를 시작할때 앞에 +해준다
		
	}

}
