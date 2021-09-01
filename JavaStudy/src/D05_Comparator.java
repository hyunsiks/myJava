
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class D05_Comparator {
	
	/*
	 	# Comparator
	 	
	 	 - �����ϸ� �� ��ü�� ũ�⸦ ���� �� ����ϴ� Ŭ������ �Ǵ� �������̽�
	 	 - ��ü���� ũ�⸦ ���� �� ���ȴ�
	 */
	public static void main(String[] args) {
		
		LinkedList<Grape> grapes = new LinkedList<>();
		
		for(int i = 0; i < 10; i++) {
			
			grapes.addLast(new Grape()
					.setGno(String.format("PODO%04d", i))
					.setLocation((int)(Math.random() * Grape.LOCATIONS))
					.setFruit((int)(Math.random() * 11 + 30)));
			System.out.println(grapes.getLast());
		}
		//������ ������ ���ػ�� �����ұ�?
		//������ Grape�� ���� sort�� �������� 
		Collections.sort(grapes, new �����з���_�����˸���_��������());
		
		System.out.println("=====������=====");
		for(Grape grape : grapes) {
			System.out.println(grape);
		}
		
		//����1 : ���� �˸��� ���� �������� �����غ���
		System.out.println("���� 1 ===========");
		Collections.sort(grapes, new �����з���_�����˸���_��������());
		System.out.println("=====������=====");
		for(Grape grape : grapes) {
			System.out.println(grape);
		}
		//����2 : ���� gno ���� �������� �����غ���
		System.out.println("���� 2 ===========");
		Collections.sort(grapes, new �����з���_gno_��������());
		for(Grape grape : grapes) {
			System.out.println(grape);
		}
	}
}
class �����з���_�����˸���_�������� implements Comparator<Grape>{

	/*
	   # Comparator �� ��Ģ
	  
	 	- compare �޼����� ���� ���� ����̸� o1�� o2�� ������ �ٲ۴�
	 	- compare �޼����� ���� ���� 0�̸� ���� ũ��� ����Ѵ�
	 	- compare �޼����� ���� ���� �����̸� o1�� o2�� ������ �״�� �����Ѵ�
	 */
	@Override
	public int compare(Grape o1, Grape o2) {
		
		if(o1.fruit < o2.fruit) {
			return -1;
		}else if(o1.fruit == o2.fruit) {
			return 0;
		}else {
			return 1;			
		}		
	}	
}

class �����з���_�����˸���_�������� implements Comparator<Grape>{

	@Override
	public int compare(Grape o1, Grape o2) {
		
		if(o1.fruit > o2.fruit) {
			return -1;
		}else if(o1.fruit == o2.fruit) {
			return 0;
		}else {
			return 1;			
		}	
	}	
}

class �����з���_gno_�������� implements Comparator<Grape>{

	@Override
	public int compare(Grape o1, Grape o2) {
		
//		if(o1.gno.equals(o2.gno)) {
//			return 0;
//		}else if(o1.gno.charAt(7) > o2.gno.charAt(7)) {
//			return -1;
//		}else if(o1.gno.charAt(6) > o2.gno.charAt(6)) {
//			return -1;
//		}else if(o1.gno.charAt(5) > o2.gno.charAt(5)) {
//			return -1;
//		}else if(o1.gno.charAt(4) > o2.gno.charAt(4)) {
//			return -1;
//		}else {
//			return  1;
//		}
//		int a = 1;
//		
//		for(int i = 0; i < o1.gno.length(); i++) {
//			if(o1.gno.charAt(i) > o2.gno.charAt(i)) {
//				a = -1;			
//			}else if(o1.gno.charAt(i) < o2.gno.charAt(i)) {
//				a = 1;
//			}else{
//				a = 0;
//			}
//		}
//		return a;
		
		//���ڿ��� ���ĺ� ���� �񱳴� �̹� String Ŭ������ �����Ǿ��ִ�
//		return o1.gno.compareTo(o2.gno); //��������
		return o1.gno.compareTo(o2.gno) * -1; //��������
		
	}
}


class Grape{
	private static String[] locationNames = {"�����̽þ�", "�ʸ���", "ü��", "�ѱ�", "�̱�"};
	public static int LOCATIONS = locationNames.length;
	
	String gno;
	int location;
	int fruit;
	
	Grape setGno(String gno) {
		this.gno = gno;
		return this;
	}
	
	Grape setLocation(int location_id) {
		this.location = location_id;
		return this;
	}
	Grape setFruit(int fruit) {
		this.fruit = fruit;
		return this;
	}
	
	/*
	 	# equals()
	 
	 
	 	 - Object �޼���
	 	 - ���� ��ü���� ���� �� � �������� �����ؾ� �ϴ����� �����س��� �޼���
	 	 - ������ �⺻������ �ּҰ� ���̴�
	 	 - return ���� �ٲ㼭 �ٸ� ���� ���ٰ� ǥ���Ҽ��ִ�
	*/
	@Override
	public boolean equals(Object obj) {
		
		return this.gno == ((Grape)obj).gno;
	}
	/*
	 	# toString()
	 	
	 	 - ��� ��ü�� ���ԵǾ� �ִ� �޼��� (object �޼���)
	 	 - �� �ν��Ͻ��� ���ڿ��� ǥ���Ѵٸ�? �� �����س��� �޼���
	 	 - System.out.println()�� ��� ������ �ν��Ͻ��� 
	 	   toString() �޼����� ����� �ֿܼ� ����ϴ� �޼����̴�
	 	 - Object Ŭ������ �����Ǿ��ִ� �޼����� �⺻������
	 	   toString() ������ "Ŭ������@�ּҰ�" �̴�(super.toString)
	 */
	@Override
	public String toString() {
	
		return gno + "/" + fruit + "/" + locationNames[location] + "/";
	}
}
