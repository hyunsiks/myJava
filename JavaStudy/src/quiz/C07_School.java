package quiz;

import java.util.Random;

public class C07_School {

	/*
	  1. 각 반의 정원은 30명이다
	  2 - 1. 프로그래밍 반 모든 학생은 각자의 국어, 영어, 수학, 프로그래밍언어 점수가 있다
	  2 - 2. 네트워크 반 학생은 각자의 국어, 영어, 리눅스, CCNA 점수가 있다
	  2 - 3. 머신러닝 반 학생은 각자의 국어, 영어, 수학, 통계학, 프로그래밍언어 점수가 있다ㅏ
	  3. 모든 학생의 점수와 이름을 랜덤으로 생성한다
	  	 학번은 중복없이 순차적으로 생성한다
	  4. 성적표 메서드를 통해 각 학생의 [이름/총점/평균점수]를 볼 수 있다
	 */
	public static void main(String[] args) {
		
		
		StudentScore stu1 = new StudentScore();
		stu1.StudentScore(3);
		Naming na1 = new Naming();
		na1.naming(3);
	}
}

class ProgramingClass {	
	
	int sum;
	int avg;
	
	int hakbun;
	String name;
	
	public ProgramingClass(String name, int sum, int avg) {
		this.sum = sum;
		this.avg = avg;
		this.name = name;
	}
	//30명의 정원
	Random ran = new Random();	
	
	void gradeCard() {
		System.out.printf("[%s/%d/%f]", this.name, this.sum, this.avg);
	}	
}



class StudentScore { //배열하나만들어서 30개의 랜덤점수 생성해주는 클래스
	
	int score;
	int[] arrStudent = new int[30];
	Random ran = new Random();
	
	public void StudentScore(int select) {
		
		for(int i = 0; i < 30; i++) {
			
			arrStudent[i] = ran.nextInt(101);
		}
		System.out.println(arrStudent[select]);
	}
}

class Naming extends StudentScore{
	
	Random ran = new Random();
	String[] arrName = new String[30];
	
	public void naming(int select) {
		
		for(int i = 0; i < 30; i++) {
			
			for(int j = 0; j < 3; j++) {
				
				int nn = ran.nextInt();
				if(nn >= 44032 && nn <= 55203) {
					
					arrName[i] += (char)nn; 
				}else {
					j--;
					continue;
				}
			}
		}
		System.out.println(arrName[select]);	
		
		StudentScore stu2 = new StudentScore();
	}
}
class NetworkClass extends Naming{
	public NetworkClass() {
		
	}
}
