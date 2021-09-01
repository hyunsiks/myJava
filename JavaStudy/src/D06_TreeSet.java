
import java.util.Comparator;
import java.util.TreeSet;

public class D06_TreeSet extends D05_Comparator {

	/*
	  # TreeSet (Comparator필요) - comparator로 정렬해두고 treeset을 만들때 () 안에 comparator 함수 만들고 시작
	  
	   - 값 비교에 매우 유용 (ceiling(), floor(), higher(), lower())
	   - 정렬에 매우 유용 (만들때부터 정렬이 불가하면 안만들어짐)
	   - 정렬이 안되어있는 배열같은것(임의로만든함수같은것)은 내가 직접 Comparator 만들어야함
	   - 중복값을 저장 할 수 없다(set이기때문)
	   - 데이터를 저장할 때 Comprarator를 이용해 미리 정렬한다
	   - 요소로 null을 허용하지 않는다
	   - 처음에 정렬해서 넣기 때문에 HashSet에 비해 저장 속도가 느리다
	   - 하지만 TreeSet에는 순서(인덱스)가 없다 하지만 정렬되어있고 값비교가 가능하다
	 */
	public static void main(String[] args) {
		TreeSet<Grape> grape_tree = new TreeSet<>(new 포도분류기_gno_내림차순());
		TreeSet<Grape> grape_tree2 = new TreeSet<>(new 포도분류기_포도알맹이_내림차순());
		
		//해당 객체 자체가 비교 가능한 객체라면 Comparator를 사용하지 않을 수 있다
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
		
		// TreeSet 활용
		// - descendingSet() : 이미 정렬해놓은 방향의 반대방향으로 바꿈
			System.out.println(grape_tree.descendingSet());
		// - headSet(toElement) : 맨 앞부터 원하는 요소까지 자른 set을 반환
			System.out.println("headSet : " + grape_tree.headSet(new Grape().setGno("3")));
		// - tailSet(toElement) : 원하는 요소부터 맨뒤까지 자른 set을 반환
			System.out.println("tailSet : " + grape_tree.tailSet(new Grape().setGno("3")));
		// - subSet(fromElement, toElement) : 원하는 요소부터 원하는 요소까지 자른 Set을 반환
			System.out.println("subSet : " + grape_tree.subSet(new Grape().setGno("3"), new Grape().setGno("1")));
			
		//Integer 타입은 Comparable 되어있기 때문에 TreeSet을 그냥만들수있다
		TreeSet<Integer> int_tree = new TreeSet<>();
		int_tree.add(99);
		int_tree.add(59);
		int_tree.add(52);
		int_tree.add(43);
		int_tree.add(123);
		int_tree.add(1);
		int_tree.add(3);		
		System.out.println(int_tree);
		
		// ceiling(element) : 원하는 요소를 대충 올려서 선택(전달한 값도 포함, 전달한 값이 배열내에 포함되었을때 포함한다는것, 배열내에 포함안되면 미포함)
		System.out.println("ceiling : " + int_tree.ceiling(43));
			
		//floor(element) : 원하는 요소를 대충 내려서 선택(전달한 값도 포함, 전달한 값이 배열내에 포함되었을때 포함한다는것)
		System.out.println("floor : " + int_tree.floor(43));
		
		//higher(element) : 원하는 요소를 대충 올려서 선택(전달한 값 미포함, 전달한 값이 배열내에 포함되었을때 미포함한다는것)
		System.out.println("higher : " + int_tree.higher(43));

		//lower(element) :  원하는 요소를 대충 내려서 선택(전달한 값 미포함, 전달한 값이 배열내에 포함되었을때 미포함한다는것)
		System.out.println("lower : " + int_tree.lower(43));
		
		//연습문제 : 망고트리에 망고를 5개 추가하고 mno기준 오름차순 정렬을 해보세요
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

//Comparator : 비교할 때 사용하는 비교 도구 클래스로 만드는 인터페이스
//Comparable : 이 객체가 비교 가능한 클래스임을 표시하는 인터페이스
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
	
	//this vs 매개변수로 compare 메서드를 구현하면 된다
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