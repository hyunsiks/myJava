package myobj.myschool;

public class ProgramClass extends StudentMy {
	
	int math;
	int cl;
	int sco;
	
	public ProgramClass(int sco) {
		math = ran.nextInt(101);
		cl = ran.nextInt(101);
		this.sco = sco;
	}
	@Override
	public void card(){
		
		System.out.printf("%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\n", "�й�","�̸�","����","����","����","cl","����","���");
		System.out.printf("%d\t%s\t%s\t%s\t%s\t%s\t%s\t%s\n", sco, name, kor, eng, math, cl, kor+eng+math+cl,(kor+eng+math+cl)/4.0 );
		
	}
}
