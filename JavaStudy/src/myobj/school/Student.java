package myobj.school;

import java.util.Random;

public abstract class Student {

	static String[] lastNameList = {"��","��","��","��","��","��","��"
						,"��","��","����","����","��","��","��","����","��","��"};
	
	static String[] firstNameList = {
		"����", "��ȯ", "�¿�", "����", "�¿�", "��ȣ", "����", "����", "�缱", 
		"����", "����", "����", "����", "����", "�¹�", "����", "���"};	
	
	
	String name;
	int kor;
	int eng;
	int sno;
	Random ran = new Random();
	
	public Student() { //�л��� ���񸶴� ��������
		ran = new Random();
		
		kor = getRandomScore();
		eng = getRandomScore();
		name = getRandomName();
	}	
	
	public abstract void printGradeCard();
	
	 int getRandomScore() {
		return ran.nextInt(101);
	}
	 String getRandomName() {
		 return lastNameList[ran.nextInt(lastNameList.length)] + 
				 firstNameList[ran.nextInt(firstNameList.length)];
	 }
}
