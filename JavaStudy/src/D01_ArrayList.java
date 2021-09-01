
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class D01_ArrayList {
	
	/*
	  # Java Collections 
	  
	  	- �ڹٿ��� �⺻������ �����ϴ� �ڷᱸ�� �������̽�
	  	- Collection �������̽��� ��ӹ��� �������̽��δ� List, Set ���� �ִ�(���߿� List�������̽��� ��ӹ��� ArrayListŬ������ ���� �Ǵ°�)
	  		(��, Collections�� ��ӹ��� List�� ��ӹ��� ArrayList)
	  		
	  # java.util.ArrayList
	  
	  	- �迭�� �ٸ��� ũ�Ⱑ �ڵ����� �����Ǵ� �ڷᱸ�� Ŭ����
	  	- �迭�� ������ �����̴�
	  	- ���������� ��� �����Ϳ� �����ؾ� �� �� ���� �����ϴ�
	 */
	public static void main(String[] args) {
		
		// Ÿ���� �����ϸ� ArrayList �����ϱ�
		// Ÿ���� ������ �� ����ϴ� <>�� ���׸�(Generic)�̶�� �θ���
		// ���׸����� �⺻�� Ÿ���� ����� �� ����(int���� �⺻���̱� ������ int�� ������ Ÿ���� Integer�� �����/ ��, �⺻Ÿ���� WrapperClass �̿�)
		ArrayList<String> fruits = new ArrayList<>();
		ArrayList<Integer> numbers = new ArrayList<>();
		
		// add(element) : ����Ʈ�� ���ϴ� �����͸� ���������� �ǵڿ� �߰��Ѵ�
		fruits.add("apple");
		fruits.add("kiwi");
		fruits.add("banana");
		fruits.add("strawberry");
		
		numbers.add(10);numbers.add(20);numbers.add(30);numbers.add(40);
		
		//add(index, element) : ����Ʈ�� ���ϴ� ��ġ�� �����͸� �ִ´�
		fruits.add(2, "orange");
		System.out.println(fruits);
		
		//get(index) : ���ϴ� ��ġ�� �����͸� ������
		System.out.println(fruits.get(2));
		
		//size() : �ش� �÷����� ũ�⸦ ��ȯ�Ѵ�(length����)
		System.out.println("fruits�� size : " + fruits.size());
		System.out.println("numbers�� size : " + numbers.size());
		
		//remove(index) : �ش� ������ �����͸� �����Ѵ�
		//remove("object") : �ش� ��ü�� �����Ϳ��� �����Ѵ�
		String deleted_fruit = fruits.remove(0);
		System.out.println("���� �� : " + fruits);
		System.out.println(deleted_fruit); //�������� Ȯ��
		fruits.remove("orange");
		System.out.println("���� �� : " + fruits);
		if(fruits.remove("strawberry")) {
			System.out.println("strawberry�� ���������� �����߽��ϴ�");
		}else {
			System.out.println("strawberry�� ��� �������� ���߽��ϴ�");			
		}
		
		//contains("object") : �ش� ��ü�� �ִ��� ������ booleanŸ������ ��ȯ
		System.out.println(fruits.contains("orange"));
		//containsAll(Collection) : ������ �÷����� ��� ���ԵǾ� �ִ����� �˻�
		Set<String> subset = new HashSet<>();
		
		subset.add("kiwi");
		subset.add("apple");
		//subset�� ��� ������ fruits�� ���ԵǴ��� Ȯ��
		fruits.containsAll(subset);
		System.out.println(fruits.containsAll(subset));
		
		// addAll(Collection) : ������ �÷����� ������ ��� �߰�
		//	- �߰� �������θ� boolean Ÿ������ ��ȯ
		//	- �̹� ��� ���ԵǾ������� false, ���� �߰��Ȱ��� ������ true
		System.out.println("addAll : " + fruits.addAll(subset));
		
		//removeAll(Collection) : ������ �÷����� ������ ��� ����
		System.out.println("removeAll : " + fruits.removeAll(subset));
		
		// # retainAll(Collection) : ������ �÷��ǰ� ��ġ�� ���븸 �����(������)
		//	- ���� ���� ������ true, ������ false
		System.out.println("retainAll : " + fruits.retainAll(subset));
		
		// # isEmpty() : �ش� �÷����� ��������� true
		System.out.println("isEmpty : " + fruits.isEmpty());
		
		//���� 
		Collections.sort(fruits); //��� ����Ʈ�� ���� �迭�� ����
		Collections.sort(numbers);
		int[] lottos = {45, 1, 7, 13, 8, 20, 11};
//		Collections.sort(lottos);
		Arrays.sort(lottos);
		System.out.println(Arrays.toString(lottos)); //�Ϲݹ迭�� ����
		
		
	}
}
