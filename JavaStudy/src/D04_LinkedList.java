
import java.util.ArrayList;
import java.util.LinkedList;

public class D04_LinkedList {
	
	/*
	 	# ���Ḯ��Ʈ
	 	
	 	 - ArrayList ���� �߰��� ����/������ ������ ����Ʈ
	 	 - ������ �߰��� ������ �߻����� �� ArrayList�� ��� �����͸� �ڷ� �о���Ѵ�
	 	 - LinkedList�� ����� ��常 �ٲٱ� ������ �ξ� ������
	 	 �� ArrayList(������ ���� �� �б�) LinkedList(������ �߰� �� ����) ����	 	 
	 */
	public static void main(String[] args) {
		LinkedList<String> animals = new LinkedList<>();
		
		//LinkedList�� add��
		animals.add("tiger");
		animals.add("lion");
		animals.add("horse");
		System.out.println(animals);
		
		animals.addFirst("turtle");
		animals.addLast("monkey");
		System.out.println(animals);
		
		//LinkedList�� get��
		System.out.println(animals.get(3));
		System.out.println(animals.getFirst());
		System.out.println(animals.getLast());
		
		//pop(), poll() : ����Ʈ���� �����͸� �����鼭 ���� (pop,poll�� ����)
		LinkedList<String> animals2 = new LinkedList<>();
		animals2.add("tiger");
		animals2.add("lion");
		animals2.add("horse");
		while(animals2.size() != 0) {
			System.out.println("pop!! " + animals2.pop());
		}
		System.out.println("animals2 : " + animals2);
		System.out.println("animals : " + animals);
		
		//pollLast() : poll()�� �ٸ��� �ڿ������� �����͸� �����鼭 ����
		animals2 = animals;
		while(animals2.size() != 0) {
			System.out.println("pollLast!! " + animals2.pollLast());
		}
		System.out.println(animals);
		System.out.println(animals2);
		
		//���� �׽�Ʈ
		int test = 1000000;
		
		ArrayList<Integer> arr = new ArrayList<>(test);
		for(int i = 0; i < test; i++) {
			arr.add(i);
		}
		
		LinkedList<Integer> arr2 = new LinkedList<>();
		for(int i = 0; i < test; i++) {
			arr2.add(i);
		}
		
		//������ �߰� ���ɺ�
		System.out.println("1. ArrayList Insertion Test");
		long startTime = System.currentTimeMillis();
		
		for(int i = 0; i < 5000; i++) {
			arr.add(50, 10);
		}
		long endTime = System.currentTimeMillis();
		System.out.println((endTime - startTime) + "ms �� ArrayList");
		
		System.out.println("1. ArrayList Insertion Test");
		long startTime2 = System.currentTimeMillis();
		
		for(int i = 0; i < 5000; i++) {
			arr2.add(50, 10);
		}
		long endTime2 = System.currentTimeMillis();
		System.out.println((endTime2 - startTime2) + "ms �� LinkedList");
	}
	
}
