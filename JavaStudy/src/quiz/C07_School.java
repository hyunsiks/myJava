package quiz;

import java.util.Random;

public class C07_School {

	/*
	  1. �� ���� ������ 30���̴�
	  2 - 1. ���α׷��� �� ��� �л��� ������ ����, ����, ����, ���α׷��־�� ������ �ִ�
	  2 - 2. ��Ʈ��ũ �� �л��� ������ ����, ����, ������, CCNA ������ �ִ�
	  2 - 3. �ӽŷ��� �� �л��� ������ ����, ����, ����, �����, ���α׷��־�� ������ �ִ٤�
	  3. ��� �л��� ������ �̸��� �������� �����Ѵ�
	  	 �й��� �ߺ����� ���������� �����Ѵ�
	  4. ����ǥ �޼��带 ���� �� �л��� [�̸�/����/�������]�� �� �� �ִ�
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
	//30���� ����
	Random ran = new Random();	
	
	void gradeCard() {
		System.out.printf("[%s/%d/%f]", this.name, this.sum, this.avg);
	}	
}



class StudentScore { //�迭�ϳ����� 30���� �������� �������ִ� Ŭ����
	
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
