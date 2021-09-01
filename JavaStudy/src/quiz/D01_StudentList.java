package quiz;

import java.io.PrintStream;
import java.util.ArrayList;


public class D01_StudentList {
	
	/*
	 	학생 클래스를 요소로 갖는 ArrayList를 생성하고 학생을 30명 추가해보세요
	 	
	 	1. 각 학생의 점수는 랜덤으로 설정됩니다
	 	2. 과목은 국,영,수 밖에 없습니다
	 	3. 30명의 평균을 출력해주세요
	 	4. 30명중 가장 총점이 높은 학생의 이름과 성적 출력해주세요
	 	5. 이름은 다음과 같이 생성됩니다
	 	   (학생000000, 학생000001, 학생000002)
	 */
	
	public static void main(String[] args) {
		
		ArrayList<Student> allStudent = new ArrayList<>();
		int max = 0;
		int arrNum = 0;
		
		for(int i = 0; i < 30; i++) {
			allStudent.add(new Student(i));
		
			max = allStudent.get(0).sum;
			if(allStudent.get(0).sum < allStudent.get(i).sum) {
				max = allStudent.get(i).sum;
				arrNum = i;
			}
			
		}
		System.out.printf("가장 총점이 높은 사람은 %s 이고 총점은 %d 입니다", allStudent.get(arrNum).name, max);
	}
}
class Student extends Score{
	
	String name;
	int sum;
	double avg;
	
	public Student(int num) {

		name = String.format("학생%06d", num+1);
		sum = kor + eng + math;
		avg = sum / 3.0;
		
		System.out.println("이름\t\t국어\t영어\t수학\t총합\t평균");
		System.out.printf("%s\t%d\t%d\t%d\t%d\t%.2f\n",name, kor, eng, math, sum, avg);
		System.out.println();
	}
}



class Score{
	
	int kor;
	int eng;
	int math;
	
	public Score() {

		kor = (int)(Math.random() * 100 + 1);
		eng = (int)(Math.random() * 100 + 1);
		math = (int)(Math.random() * 100 + 1);
	}
}