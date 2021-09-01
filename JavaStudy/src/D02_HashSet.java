
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class D02_HashSet {

	/*
	  # Set
	  
	   - ������ �����س��� Ŭ����
	   - ��ҷ� ���� ���� ������ ���� ������� �ʴ´�(�ߺ��� �����ϰ� ������ set�� ���)
	   
	  # Hash
	  
	   - � ���� �־��� �� ���� ������ �� ���� ���� �����Ǿ�� �ϴ� �˰���
	   - ���� ���� �־��� ���� �׻� ������ ���� ���;� �Ѵ�
	   - ������ ���� �־��� �� �����ϱ� ���� ���� �ٸ� ���� ���´�
	   - ������ �ؽ������� ���� ���� ã�� ���� �Ұ����ؾ� �Ѵ�
	   - �ٽ� ���� ������ ���ư� ���� ���� �ܹ��⼺ �˰���
	   - �ߺ� üũ�ÿ� �پ ������ ���δ�
	   - !!���� ������ �Ǿ��� �ȵǾ��� ���� ��븹���ϰԵ�(�ؽ����� �޶����⶧��)
	   - !!�ؽ��� ����ϴ� �˰����� ����(index)�� ����(hash���� �����ϱ� ��Ʊ⶧��)
	   ex) hello -> 5D41402ABC4B2A76B9719D911017C592 �̷������γ���
	   	   hello1 - > 203AD5FFA1D7C650AD681FDFF3965CD2
	   	   *MD5, SHA256 ���� �ؽ��� ��ȯ
	 */
	public static void main(String[] args) {
		HashSet<Integer> numbers = new HashSet<>();
		
		numbers.add(100);
		numbers.add(100);
		numbers.add(100);
		numbers.add(100);
		numbers.add(100);
		System.out.println(numbers);
		
		//���� �÷��� �������̽��̱� ������ ArrayList�� �ִ� �޼������ ���⿡�� �ִ�
		
		//remover(object) - HashSet�� remove(index)�� ���� �ֳ��ϸ� index�� ���� �����̴� �����̱⶧��
		if(numbers.remove(100)) {
			System.out.println("����⼺��");
		}else {
			System.out.println("��������");
		}
		System.out.println(numbers);
		
		//�̸��� �ؽ��� �� �˰������ ����������(�ؽ�����)
		HashSet<String> english = new HashSet<>();
		english.add("apple");
		english.add("airplane");
		english.add("bio");
		english.add("cat");
		english.add("drama");
		english.add("zebra");
		english.add("elephant");
		
		System.out.println(english);
		
		// �� Set�� �ε����� ���� ������ for-each�� ����� �� �ִ�
		for(String word : english) {
			System.out.println(word);
		}
		
		// �� �÷��ǳ����� ��ȯ�� �����Ӵ�
		//1. english�� HashSet�ε� �̰��� ArrayList�� ��ȯ�Ͽ��� �����Ҽ��ִ�
		//2. ArrayList�� ������ �ߺ����Ű� �ʿ��ϸ� HashSet���� ��ȯ�Ͽ� �ߺ������� �� �ִ�
		ArrayList<String> english_list = new ArrayList<>(english);
		Collections.sort(english_list);   //ArrayList�� ��ȯ�Ͽ� �����ϴ¹�
		System.out.println(english_list);
		
		ArrayList<Integer> numbers2 = new ArrayList<>();
		numbers2.add(1);
		numbers2.add(1);
		numbers2.add(1);
		numbers2.add(1);
		numbers2.add(3);
		numbers2.add(6);
		numbers2.add(6);
		numbers2.add(6);
		numbers2.add(13);
		System.out.println(new HashSet<>(numbers2)); //HashSet���� ��ȯ�Ͽ� �ߺ������ϴ¹�
		
		// �� �÷��ǵ��� �迭�� ��ȯ�ϱ�
		Object[] arr1 = english.toArray(); //1�����, Object[]����
		
		String[] arr2 = new String[english.size()]; //2�����, �̸� ������ �迭�� ����
		english.toArray(arr2);
		
		System.out.println("Object[]�� ��ȯ�� english : " + Arrays.toString(arr1));
		System.out.println("�迭�� ��ȯ�� english : " + Arrays.toString(arr2)); //toString���
		
		// �� ���׸��� ������� �ʴ� ���
		//		- ���׸��� ������� �ʴ� ��� ��� Ÿ���� ���� �� �ִ�
		//		- ��� Ÿ���� ObjectŸ������ ��ĳ���� �Ǿ� ����ȴ�
		//		- �ش� ���� �ٽ� ����� ����ϱ� ���ؼ��� �ٿ�ĳ������ �ʿ��ؼ� ���ŷӴ�
		ArrayList numbers3 = new ArrayList();
		numbers3.add("ȫ�浿");
		numbers3.add("ȫ�浿");
		numbers3.add("ȫ�浿");
		numbers3.add('A');
		numbers3.add(123.123);
		numbers3.add(333);
		
		System.out.println(numbers3);
//		String str = (String)numbers3.get(3); //�ڹ� ���������δ� �ƹ� ��������(�����Ͻ� ���ܳ���)
		
		// contains() : Ŀ�ؼǿ� �ش� ��Ұ� ���ԵǾ� �ִ��� ���θ� ��ȯ(boolean Ÿ��)
		System.out.println(english.contains("apple"));
		
		//containsAll(Collection) : ������ �÷����� ��� ���ԵǾ� �ִ����� �˻�
		Set<String> subset = new HashSet<>();
		List<String> sublist = new ArrayList<>();
		
		subset.add("zebra");
		subset.add("drama");
		subset.add("tiger");
		
		sublist.add("apple");
		sublist.add("apple");
		sublist.add("apple");
		//subset�� ��� ������ fruits�� ���ԵǴ��� Ȯ��
		
		System.out.println("english���� subset�� ��� ������ ����ֳ���? "
							+ english.containsAll(subset));
		System.out.println("english���� sublist�� ��� ������ ����ֳ���? "
							+ english.containsAll(sublist));
		
		// addAll(Collection) : ������ �÷����� ������ ��� �߰�
		//	- �߰� �������θ� boolean Ÿ������ ��ȯ
		//	- �̹� ��� ���ԵǾ������� false, ���� �߰��Ȱ��� ������ true
		System.out.println(english.addAll(subset));
		
		// # removeAll(Collection) : ������ �÷��ǰ� ���� ������ ��� ����
		System.out.println(english_list.removeAll(subset));
		
		// # retainAll(Collection) : ������ �÷��ǰ� ��ġ�� ���븸 �����(������)
		//	- ���� ���� ������ true, ������ false
		System.out.println(english.retainAll(subset));
	}
	
}
