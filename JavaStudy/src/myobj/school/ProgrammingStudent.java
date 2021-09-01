package myobj.school;

public class ProgrammingStudent extends Student {
	
	static String[] subject_name = {"����", "����","����","PL", "������"};
	
	int math;
	int pl;
	int linux;
	
	public ProgrammingStudent(int sno) {
		math = getRandomScore();
		pl = getRandomScore();
		linux = getRandomScore();
		this.sno = sno;
	}
	
	
	
	@Override
	public void printGradeCard() {
		System.out.printf("�й�\t�̸�\t%s\t%s\t%s\t%s\t%s\t����\t���\n",
				subject_name[0],subject_name[1],subject_name[2],subject_name[3],subject_name[4]);
		
		System.out.printf("%x\t%s\t%d\t%d\t%d\t%d\t%d\t%d\t%.2f\n",
				sno,
				name,
				kor,
				eng,
				math,
				pl,
				linux,
				kor + eng + math + pl + linux,
				(kor + eng + math + pl + linux)/4.0);
	}

}
