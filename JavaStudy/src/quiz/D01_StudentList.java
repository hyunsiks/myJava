package quiz;

import java.io.PrintStream;
import java.util.ArrayList;


public class D01_StudentList {
	
	/*
	 	�л� Ŭ������ ��ҷ� ���� ArrayList�� �����ϰ� �л��� 30�� �߰��غ�����
	 	
	 	1. �� �л��� ������ �������� �����˴ϴ�
	 	2. ������ ��,��,�� �ۿ� �����ϴ�
	 	3. 30���� ����� ������ּ���
	 	4. 30���� ���� ������ ���� �л��� �̸��� ���� ������ּ���
	 	5. �̸��� ������ ���� �����˴ϴ�
	 	   (�л�000000, �л�000001, �л�000002)
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
		System.out.printf("���� ������ ���� ����� %s �̰� ������ %d �Դϴ�", allStudent.get(arrNum).name, max);
	}
}
class Student extends Score{
	
	String name;
	int sum;
	double avg;
	
	public Student(int num) {

		name = String.format("�л�%06d", num+1);
		sum = kor + eng + math;
		avg = sum / 3.0;
		
		System.out.println("�̸�\t\t����\t����\t����\t����\t���");
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