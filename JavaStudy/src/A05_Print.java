

public class A05_Print {

	public static void main(String[] args) {
		
	/*
	  # 콘솔에 출력하기 위한 여러가지 함수들
	  
	  	1. print()
	  		- 줄을 자동으로 바꾸지 않는 가장 기본 출력
	  		
	  	2. println()
	  		- 줄을 자동으로 바꿔주며 출력하는 함수
	  		- ()에 전달한 데이터 맨 뒤에 '\n'을 추가하여 출력하는 것과 같다
	  		- ()에 아무것도 전달하지 않으면 '\n'만 출력한다
	 
	  	3. printf()
	  		- 서식 문자를 이용할 수 있는 출력 함수
	  		- 문자열 +로 이어붙이는 것 보다 서식을 사용하는 경우가 편리할때도 있다
	  		- 줄을 자동으로 바꿔주지 않는다	 
			- %d 자리에 숫자를 하나씩 채워서 사용한다 */
			int year=2001, month=3, day=17, hour=11, minute=9, second=38, millisec=1234;
			System.out.println(year + "년 " + month + "월 " + day + "일 / "
					+ hour + ":" + minute + ":" + second + "." + millisec);
			System.out.printf("%d년 %d월 %d일 / %d:%d:%d.%d\n", year,month,day,hour,minute,second,millisec);
	/*
	  # 서식 문자의 종류
	 	
	 	%d		: 해당 자리에 전달한 정수를 10진수로 출력해준다(decimal)
	 	%x,%X	: 해당 자리에 전달한 정수를 16진수로 출력해준다(hexa decimal)
	 	%o		: 해당 자리에 전달한 정수를 8진수로 출력해준다(octal)
	 	%s		: 문자열(String)
	 	%c		: 문자(char)
	 	%f		: 실수(float)
	 	
	  # 진수의 이해
	  	1. 10진수의 숫자들
	  		0 1 2 3 4 5 6 7 8 9 10
	  	2. 8진수의 숫자들
	  		0 1 2 3 4 5 6 7 10
	  	3. 16진수의 숫자들
	  		0 1 2 3 4 5 6 7 8 9 a b c d e f 10 11 12 .... 19 1a 1b 1c 1d ... */
		int testNum=15;
		System.out.printf("16진수로 %d은(는) %x입니다.\n", testNum, testNum);	
		System.out.printf("16진수로 %d은(는) %X입니다.\n", testNum, testNum);	
		System.out.printf("8진수로 %d은(는) %o입니다.\n", testNum, testNum);	
	
//	  # 서식문자 옵션들(d만 넣는것이 아니라 s,c,f 모두가능)
//	  	1. %숫자d : 숫자만큼 칸을 확보한 뒤 오른쪽 정렬하여 출력한다
				System.out.printf("사과 : %d개\n", 10);
				System.out.printf("사과 : %5d개\n", 10);
				System.out.printf("사과 : %10d개\n", 10);
				System.out.printf("이름 : %10s입니다\n", "김현식");
				System.out.printf("성적 : %10c학점\n", 'A');
		
//		2. %-숫자d : 숫자만큼 칸을 확보한 뒤 왼쪽 정렬하여 출력한다
				System.out.printf("사과 : %d개\n", 10);
				System.out.printf("사과 : %-5d개\n", 10);
				System.out.printf("사과 : %-10d개\n", 10);
				
//		3. %0숫자d : 숫자만큼 칸을 확보한 뒤 빈 칸에 0을 채워서 출력한다
				System.out.printf("사과 : %d개\n", 10);
				System.out.printf("사과 : %05d개\n", 10);
				System.out.printf("사과 : %010d개\n", 10);
				
//		4. %+숫자d : 양수 앞에도 부호를 붙여준다
				System.out.printf("사과 : %d개\n", 10);
				System.out.printf("사과 : %+d개\n", 10);
				System.out.printf("사과 : %+5d개\n", 10);
				
//		5. %.숫자f : 소수 자릿수를 설정한다
				System.out.printf("평균점수 : %.2f\n", 0.123456789);
				System.out.printf("평균점수 : %.5f\n", 0.123456789);
	
	}

}
