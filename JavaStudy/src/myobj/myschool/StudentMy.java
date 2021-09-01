package myobj.myschool;

import java.util.Random;

abstract public class StudentMy {

	Random ran = new Random();
	
	int kor;
	int eng;
	String name;
	String[] firstname = {"현식", "바보", "천재"};
	String[] lastname = {"김", "이", "박"};
	
	
	public StudentMy() {
		kor = ran.nextInt(101);
		eng = ran.nextInt(101);
		name = lastname[ran.nextInt(3)] + firstname[ran.nextInt(3)];
	}

	abstract public void card();
	
	
	
}
