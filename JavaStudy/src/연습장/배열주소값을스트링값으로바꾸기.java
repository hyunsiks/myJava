package ������;

import java.util.ArrayList;

public class �迭�ּҰ�����Ʈ�������ιٲٱ� {

	public static void main(String[] args) {
		
		
		//�迭�� <Ŭ��������>�� ����ϸ� ����Ҷ� �ּҰ��� ��µȴ�
		ArrayList<Apple> arr = new ArrayList<>();
		arr.add(new Apple(10,20));
		arr.add(new Apple(50,43));
		arr.add(new Apple(31,25));
		arr.add(new Apple(12,73));
		System.out.println(arr);
		
	}

}
class Apple{
	
	
	int size;
	int num;
	public Apple(int size, int num) {
		this.size = size;
		this.num = num;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "[ũ�� : " + size + ", " + " ���� : " + num + "]";
	}
}
