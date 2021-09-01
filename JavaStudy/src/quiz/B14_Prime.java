package quiz;

import java.util.Scanner;

public class B14_Prime {

	public static void main(String[] args) {
		
	/*
	  사용자로부터 숫자를 입력받으면
	  1부터 입력한 숫자 사이에 존재하는 소수를 모두 출력해보세요
	  ※1과 자기자신으로만 나누어 떨어지는 수	  
	 */
		
		Scanner sc = new Scanner(System.in);
				
		System.out.println("수를 입력하시오 : ");
		int num = sc.nextInt();
		
		for(int check = 2; check <= num; check++) { //내가 적은 수까지의 모든 수를 하나씩 꺼낸다 1,2,3,4,5,...입력한수
			int count = 0;							//소수인지 아닌지 판가름하는 변수
			for(int i = 2; i < check; i++) {		//하나씩 꺼낸 수를 2부터 한번씩 나눠본다
				if(check % i == 0) {				//한번씩 나누었을때 한번이라도 나머지가 0이 나오면 소수가 아니라는것
					count++;						//나머지가 0이 나오면 카운트 숫자가 올라간다
					break;							//카운트 숫자가 올라감과 동시에 break선언하며 안쪽의 for문이 끝난다
				}				
			}
			if(count == 0) {			//안쪽의 for문이 끝난후에도 카운트가 0이라면 소수라는 것, 그중에 1과2는 소수가 아님으로 2를 초과하는 숫자만체크
				System.out.print(check + " ");
			}
		}



	}

}
