
import java.util.Comparator;
import java.util.TreeSet;

public class D06_TreeSet extends D05_Comparator {

	/*
	  # TreeSet (Comparator�ʿ�) - comparator�� �����صΰ� treeset�� ���鶧 () �ȿ� comparator �Լ� ����� ����
	  
	   - �� �񱳿� �ſ� ���� (ceiling(), floor(), higher(), lower())
	   - ���Ŀ� �ſ� ���� (���鶧���� ������ �Ұ��ϸ� �ȸ������)
	   - ������ �ȵǾ��ִ� �迭������(���Ƿθ����Լ�������)�� ���� ���� Comparator ��������
	   - �ߺ����� ���� �� �� ����(set�̱⶧��)
	   - �����͸� ������ �� Comprarator�� �̿��� �̸� �����Ѵ�
	   - ��ҷ� null�� ������� �ʴ´�
	   - ó���� �����ؼ� �ֱ� ������ HashSet�� ���� ���� �ӵ��� ������
	   - ������ TreeSet���� ����(�ε���)�� ���� ������ ���ĵǾ��ְ� ���񱳰� �����ϴ�
	 */
	public static void main(String[] args) {
		TreeSet<Grape> grape_tree = new TreeSet<>(new �����з���_gno_��������());
		TreeSet<Grape> grape_tree2 = new TreeSet<>(new �����з���_�����˸���_��������());
		
		//�ش� ��ü ��ü�� �� ������ ��ü��� Comparator�� ������� ���� �� �ִ�
		TreeSet<String> word_tree = new TreeSet<>();
		TreeSet<Mango> mango_tree = new TreeSet<>();
		TreeSet<Mango> mango_tree2 = new TreeSet<>(new MangoComparatorByMnoAsc());
		
		mango_tree.add(new Mango(String.format("MANGO%05d", (int)(Math.random() * 100000)), 10, 10));
		mango_tree.add(new Mango(String.format("MANGO%05d", (int)(Math.random() * 100000)), 10, 10));
		mango_tree.add(new Mango(String.format("MANGO%05d", (int)(Math.random() * 100000)), 10, 10));
		mango_tree.add(new Mango(String.format("MANGO%05d", (int)(Math.random() * 100000)), 10, 10));
		mango_tree.add(new Mango(String.format("MANGO%05d", (int)(Math.random() * 100000)), 10, 10));
		
		System.out.println(mango_tree);
		
		grape_tree.add(new Grape().setGno("1").setFruit(37));
		grape_tree.add(new Grape().setGno("2").setFruit(31));
		grape_tree.add(new Grape().setGno("3").setFruit(40));
		grape_tree.add(new Grape().setGno("4").setFruit(37));
		grape_tree.add(new Grape().setGno("5").setFruit(37));
		
		grape_tree2.addAll(grape_tree);
		
		mango_tree2.add(new Mango("Mango002",100,10));
		mango_tree2.add(new Mango("Mango001",200,40));
		mango_tree2.add(new Mango("Mango004",400,30));
		mango_tree2.add(new Mango("Mango005",300,50));
		mango_tree2.add(new Mango("Mango003",250,20));
		
		// TreeSet Ȱ��
		// - descendingSet() : �̹� �����س��� ������ �ݴ�������� �ٲ�
			System.out.println(grape_tree.descendingSet());
		// - headSet(toElement) : �� �պ��� ���ϴ� ��ұ��� �ڸ� set�� ��ȯ
			System.out.println("headSet : " + grape_tree.headSet(new Grape().setGno("3")));
		// - tailSet(toElement) : ���ϴ� ��Һ��� �ǵڱ��� �ڸ� set�� ��ȯ
			System.out.println("tailSet : " + grape_tree.tailSet(new Grape().setGno("3")));
		// - subSet(fromElement, toElement) : ���ϴ� ��Һ��� ���ϴ� ��ұ��� �ڸ� Set�� ��ȯ
			System.out.println("subSet : " + grape_tree.subSet(new Grape().setGno("3"), new Grape().setGno("1")));
			
		//Integer Ÿ���� Comparable �Ǿ��ֱ� ������ TreeSet�� �׳ɸ�����ִ�
		TreeSet<Integer> int_tree = new TreeSet<>();
		int_tree.add(99);
		int_tree.add(59);
		int_tree.add(52);
		int_tree.add(43);
		int_tree.add(123);
		int_tree.add(1);
		int_tree.add(3);		
		System.out.println(int_tree);
		
		// ceiling(element) : ���ϴ� ��Ҹ� ���� �÷��� ����(������ ���� ����, ������ ���� �迭���� ���ԵǾ����� �����Ѵٴ°�, �迭���� ���ԾȵǸ� ������)
		System.out.println("ceiling : " + int_tree.ceiling(43));
			
		//floor(element) : ���ϴ� ��Ҹ� ���� ������ ����(������ ���� ����, ������ ���� �迭���� ���ԵǾ����� �����Ѵٴ°�)
		System.out.println("floor : " + int_tree.floor(43));
		
		//higher(element) : ���ϴ� ��Ҹ� ���� �÷��� ����(������ �� ������, ������ ���� �迭���� ���ԵǾ����� �������Ѵٴ°�)
		System.out.println("higher : " + int_tree.higher(43));

		//lower(element) :  ���ϴ� ��Ҹ� ���� ������ ����(������ �� ������, ������ ���� �迭���� ���ԵǾ����� �������Ѵٴ°�)
		System.out.println("lower : " + int_tree.lower(43));
		
		//�������� : ����Ʈ���� ���� 5�� �߰��ϰ� mno���� �������� ������ �غ�����
		System.out.println(grape_tree);
		System.out.println(grape_tree2);
		for(Mango c : mango_tree2) {
			c.mangoGet();
		}
		
		word_tree.add("cat");
		word_tree.add("pet");
		word_tree.add("pat");
		word_tree.add("fat");
		word_tree.add("bat");
		System.out.println(word_tree);		
	}
}

//Comparator : ���� �� ����ϴ� �� ���� Ŭ������ ����� �������̽�
//Comparable : �� ��ü�� �� ������ Ŭ�������� ǥ���ϴ� �������̽�
class Mango implements Comparable<Mango>{
	String mno;
	int sweet;
	int size;
	

	public Mango(String mno, int sweet, int size) {
		this.mno = mno;
		this.sweet = sweet;
		this.size = size;	
	}

	void mangoGet() {
		System.out.println("[" + mno + " / " + sweet + " / " + size + "]");
	}
	
	//this vs �Ű������� compare �޼��带 �����ϸ� �ȴ�
	@Override
	public int compareTo(Mango o) {
		return this.mno.compareTo(o.mno);
	}
	@Override
	public String toString() {
		
		return mno + "/" + sweet + "/" + size;
	}
}

class MangoComparatorBySweetDesc implements Comparator<Mango>{

	@Override
	public int compare(Mango o1, Mango o2) {
		if(o1.sweet < o2.sweet) {
			return 1;
		}else if(o1.sweet > o2.sweet) {
			return -1;
		}else {
			return 0;			
		}
	}
}

class MangoComparatorBySweetAsc implements Comparator<Mango>{

	@Override
	public int compare(Mango o1, Mango o2) {
		if(o1.sweet > o2.sweet) {
			return 1;
		}else if(o1.sweet < o2.sweet) {
			return -1;
		}else {
			return 0;			
		}
	}	
}

class MangoComparatorByMnoAsc implements Comparator<Mango>{

	@Override
	public int compare(Mango o1, Mango o2) {

		return o1.mno.compareTo(o2.mno);
	}	
}