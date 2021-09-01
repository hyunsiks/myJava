package 연습장;

import java.util.Random;

public class 중복없는랜덤값배열만들기 {

	public static void main(String[] args) {
		
		int a[] = new int[10];
		Random ran = new Random();
		
		for(int i = 0; i < 10; i++) {
			a[i] = ran.nextInt(10) + 1; //a[1]
			for(int j = 0; j < i; j++) { // 0 < 1
				if(a[i] == a[j]) {		//a[4] < a[0],a[1],a[2],a[3]를 a[0]부터 중복이 안되는것이 나올때까지 계속 반복
					i--;
				}
			}
		}
		for(int b = 0; b < 10; b++) {
			System.out.println(a[b]);
		}
	}

}
