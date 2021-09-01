package myobj.school;

import quiz.C07_SchoolTeacher;

public class SchoolTeacher {
	
	public static void main(String[] args) {
		int sno = 100000;
		
		Student[] program = new Student[30];
		Student[] network = new Student[30];
		Student[] machine_learning = new Student[30];
		
		for(int i = 0; i < program.length; i++) {
			program[i] = new ProgrammingStudent(sno++);
			program[i].printGradeCard();
		}
		
		
//		new C07_SchoolTeacher();
	}
}
