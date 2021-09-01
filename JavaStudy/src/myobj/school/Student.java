package myobj.school;

import java.util.Random;

public abstract class Student {

	static String[] lastNameList = {"강","고","구","권","김","나","박"
						,"최","오","제갈","독고","이","신","차","남궁","배","안"};
	
	static String[] firstNameList = {
		"태현", "태환", "태영", "태희", "태욱", "태호", "태준", "세현", "재선", 
		"현식", "혜승", "지혜", "우현", "예림", "승미", "광민", "충민"};	
	
	
	String name;
	int kor;
	int eng;
	int sno;
	Random ran = new Random();
	
	public Student() { //학생별 과목마다 점수저장
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
