package myobj.myschool;

public class SchoolMain {

	public static void main(String[] args) {
		
		int sco = 10000;
		
		
		ProgramClass[] p1 = new ProgramClass[30];
		
		p1[0] = new ProgramClass(sco);
//		System.out.println(p1[0]);
		
		
		
		for(int i = 0; i < p1.length; i++) {
		
			p1[i] = new ProgramClass(sco++);
			p1[i].card();
			
		}
		
		
		
	}

}
