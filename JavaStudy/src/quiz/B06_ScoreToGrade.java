package quiz;

import java.util.Scanner;

public class B06_ScoreToGrade {

	public static void main(String[] args) {
	
	/*
	 점수를 입력받으면 점수에 해당하는 등급을 출력해주는 프로그램을 작성해보세요.
	 
	 90점이상 : A등급
	 80점이상 : B등급
	 70점이상 : C등급
	 60점이상 : D등급
	 그 외 : F등급
	 */

		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수를 입력하세요 : ");
		int score = sc.nextInt();
		
		if(score < 0 || score > 100) {
			System.out.print("잘못된 입력입니다");
		}else if(score >= 90) {
			System.out.println(score + "점은 A등급 입니다");
		}else if(score >= 80) {
			System.out.println(score + "점은 B등급 입니다");
		}else if(score >= 70) {
			System.out.println(score + "점은 C등급 입니다");
		}else if(score >= 60) {
			System.out.println(score + "점은 D등급 입니다");
		}else {
			System.out.println(score + "점은 F등급 입니다");
		}
	}

}
