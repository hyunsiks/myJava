

public class B08_Switch {

	public static void main(String[] args) {
	
	/*
	 # switch-case 문
	 	
	 	- ()안의 연산 결과에 따라 실행할 코드를 결정한다
	 	- ()안에 boolean 타입은 들어갈 수 없다
	 	- if문으로 완벽하게 대체가능하다. 그래서 파이썬에서는 switch문 자체가 없다
	 	- 결과에 대한 case를 나열하여 여러 case를 넣을 수 있다 ex) case 0: case 1:
	 	- break를 안쓰면 break를 만날 때까지 내려가면서 모든 case를 실행해버린다
	 	- default를 쓰면 case이 외의 결과에 대해 처리한다(즉, else같은 느낌)
	 */
	
		int a = 10;
		switch(a % 2) {
		case 0 : 
			System.out.println("a는 짝수입니다.");
			break;
		case 1 :
			System.out.println("a는 홀수입니다.");
			break;
		}
		
		
		char grade = 'B';
		
		switch(grade) {
		case 'A' : case 'a' :
			System.out.println("Fantastic");
			break;
		case 'B' : case 'b' :
			System.out.println("Great");
			break;
		case 'C' : case 'c' :
			System.out.println("Soso");
			break;
		case 'D' : case 'd' :
			System.out.println("Bad");
			break;
		case 'F' : case 'f' :
			System.out.println("Find another job");
			break;
		default :
			System.out.println("잘못된 입력입니다");
			break;
		}

	}

}
