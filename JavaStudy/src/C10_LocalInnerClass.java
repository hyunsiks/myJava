

public class C10_LocalInnerClass {

	/*
	 	# ���� ���� Ŭ����
	 	
	 	 - �޼��� ���ο��� �����Ͽ� ����ϴ� Ŭ����
	 	 - �޼��尡 ������ �ش� Ŭ������ ������ ���Ѵ�
	 */
	public static void main(String[] args) {
		
		class Apple{
			String size;
			String color;
			String insect;
		}
		
		Apple a = new Apple(); //�Լ� �ȿ� Ŭ���� ����
		AppleBox.Apple a2 = new AppleBox("���� �ڽ�").new Apple(); //���� �����̶�� �Լ����� �ٸ� ���� ������ �����Լ��� ������ ���¹��
		//���ùڽ�Ŭ������ �ִ� ���� �Լ� ������ ���°�(����Ŭ���� �ν��Ͻ� ����,  �Ŀ� ���� �Լ� �ν��Ͻ� ����)

		//�������� Ŭ������ ��ĳ���� �Ǿ��ִ� ����
		Fruit2 banana = getBanana(); //��ĳ���õ� Ŭ������ �ڱ⸸ �������ִ� �Լ��� �ذԵȴ�
		banana.eat(); //
		
	}

	public static Fruit2 getBanana() {
		class Banana extends Fruit2{ 
			int fruit;
			int[] color;
			
			public Banana(int fruit) {
				this.fruit = fruit;
			}			
			void eat() {
				System.out.println("���Ű� " + fruit + "�� ���� �ٳ����� ���ִ�");
			}
			void bababa���������ִ°����Ǳ��() {
				System.out.println("��û�� ���");
			}
		}
		//������ ���ؼ� ��� ���Ҷ� ���� �� ����� �ǹ̰� ����
		//�׷��� Ŭ������ ����� ������ �������� �ѱ�� �ְԵȴ�
		
		return new Banana(20);
	}
	
}
abstract class Fruit2{
	abstract void eat();
}
