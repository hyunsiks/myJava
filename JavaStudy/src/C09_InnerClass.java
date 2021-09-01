

public class C09_InnerClass {
	
	/*
	  	# Ŭ���� ���ο� Ŭ���� ����ϱ�
	  	
	  	 - Ŭ���� ���ο��� Ŭ������ �����ϰ� ����� �� �ִ�
	  	 - Ŭ���� ���ο� �����ϴ� Ŭ������ �ν��Ͻ��� �����Ǿ�� ����� �� �ִ� ���赵�̴�
	  	 - 
	 */
	
	public static void main(String args[]) {
		
		AppleBox box = new AppleBox("���ֹڽ�");
		
		//�̳�Ŭ���� �ν��Ͻ� �����ϱ�
		AppleBox.Apple apple1 = new AppleBox("����ڽ�").new Apple();;
		AppleBox.Apple apple2 = box.new Apple();; //�����Ͱ� ��������

		apple1.whereAmI();
		apple2.whereAmI();
//		System.out.println(boxname); //�̳�Ŭ������ �ƴϱ� ������ �ٸ� Ŭ������ ���� ����
	}
}

class AppleBox{
	
	String boxName;	
	Apple[] box;
		
	public AppleBox(String name) {
		box = new Apple[10];
		
		for(int i = 0; i < 10; i++) {
			box[i] = new Apple();
		}
		boxName = name;
	}
	
	public void show() {
//		System.out.println(color);//���� Ŭ���������� �̳�Ŭ������ ������ ������
		Apple a1 = new Apple();
		System.out.println(a1.color); //���� Ŭ�������� �̳�Ŭ���������� �ν��Ͻ������ؾ���
	}
	
	
	
	class Apple{	
		String color;
		int size;
		boolean insect;
		
		void whereAmI() {
			System.out.println(boxName); //���� Ŭ������ ������ ����� �����ִ�(�̳�Ŭ�����̱� ����)
		}
		
	}
}