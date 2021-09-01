package quiz;

import java.util.ArrayList;

import myobj.school.Student2;

public class D01_StudentListTeacher {

	public static void main(String[] args) {
		
		ArrayList<Student2> students = new ArrayList<>();
		
		for(int i = 0; i < 30; i++) {
			Student2 stu = new Student2();
			students.add(stu);
			System.out.println(students.get(i).getTranscript());
		}
		
		System.out.println("-----최고점수학생-----");
		for(Student2 student : students) {
			
			if(student.getTotal() == Student2.BEST_TOTAL) {
				System.out.println(student.getTranscript());
			}
		}
		
		
	}
}
