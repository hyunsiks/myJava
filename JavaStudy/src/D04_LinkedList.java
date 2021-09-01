
import java.util.ArrayList;
import java.util.LinkedList;

public class D04_LinkedList {
	
	/*
	 	# 연결리스트
	 	
	 	 - ArrayList 보다 중간에 삽입/삭제에 유리한 리스트
	 	 - 데이터 중간에 삽입이 발생했을 때 ArrayList는 모든 데이터를 뒤로 밀어야한다
	 	 - LinkedList는 연결된 노드만 바꾸기 때문에 훨씬 빠르다
	 	 ※ ArrayList(데이터 보관 및 읽기) LinkedList(데이터 추가 및 삭제) 유리	 	 
	 */
	public static void main(String[] args) {
		LinkedList<String> animals = new LinkedList<>();
		
		//LinkedList의 add들
		animals.add("tiger");
		animals.add("lion");
		animals.add("horse");
		System.out.println(animals);
		
		animals.addFirst("turtle");
		animals.addLast("monkey");
		System.out.println(animals);
		
		//LinkedList의 get들
		System.out.println(animals.get(3));
		System.out.println(animals.getFirst());
		System.out.println(animals.getLast());
		
		//pop(), poll() : 리스트에서 데이터를 꺼내면서 삭제 (pop,poll은 같음)
		LinkedList<String> animals2 = new LinkedList<>();
		animals2.add("tiger");
		animals2.add("lion");
		animals2.add("horse");
		while(animals2.size() != 0) {
			System.out.println("pop!! " + animals2.pop());
		}
		System.out.println("animals2 : " + animals2);
		System.out.println("animals : " + animals);
		
		//pollLast() : poll()과 다르게 뒤에서부터 데이터를 꺼내면서 삭제
		animals2 = animals;
		while(animals2.size() != 0) {
			System.out.println("pollLast!! " + animals2.pollLast());
		}
		System.out.println(animals);
		System.out.println(animals2);
		
		//성능 테스트
		int test = 1000000;
		
		ArrayList<Integer> arr = new ArrayList<>(test);
		for(int i = 0; i < test; i++) {
			arr.add(i);
		}
		
		LinkedList<Integer> arr2 = new LinkedList<>();
		for(int i = 0; i < test; i++) {
			arr2.add(i);
		}
		
		//데이터 추가 성능비교
		System.out.println("1. ArrayList Insertion Test");
		long startTime = System.currentTimeMillis();
		
		for(int i = 0; i < 5000; i++) {
			arr.add(50, 10);
		}
		long endTime = System.currentTimeMillis();
		System.out.println((endTime - startTime) + "ms 의 ArrayList");
		
		System.out.println("1. ArrayList Insertion Test");
		long startTime2 = System.currentTimeMillis();
		
		for(int i = 0; i < 5000; i++) {
			arr2.add(50, 10);
		}
		long endTime2 = System.currentTimeMillis();
		System.out.println((endTime2 - startTime2) + "ms 의 LinkedList");
	}
	
}
