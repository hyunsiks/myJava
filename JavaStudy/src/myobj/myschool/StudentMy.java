package myobj.myschool;

import java.util.Random;

abstract public class StudentMy {

	Random ran = new Random();
	
	int kor;
	int eng;
	String name;
	String[] firstname = {"����", "�ٺ�", "õ��"};
	String[] lastname = {"��", "��", "��"};
	
	
	public StudentMy() {
		kor = ran.nextInt(101);
		eng = ran.nextInt(101);
		name = lastname[ran.nextInt(3)] + firstname[ran.nextInt(3)];
	}

	abstract public void card();
	
	
	
}
