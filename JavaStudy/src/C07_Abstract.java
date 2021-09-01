

public class C07_Abstract {
	
	/*
		# �߻� Ŭ���� (abstract)
		
		 - �ϼ��� �ڽ� Ŭ�󽺿��� �̷�� Ŭ����
		 - Ŭ���� ���ο� �߻� �޼��带 ���� Ŭ������ �տ� abstract�� �ٿ� ǥ���ؾ� �Ѵ�
		 - ������ �߻� �޼��带 �����ϱ� ������ �ν��Ͻ� ������ �Ұ����ϴ�(ex Vehicle �̶�� ���� new Vehicle(); �Ҽ� ���ٴ°� �ֳ��� ���� �ϼ��Ȱ��̾����ϱ�
		 
		# �߻� �޼��� (abstract method)
		 
		 - �Լ��� ����(���� Ÿ��, ���� ������, �Ű�����)�� ���س��� �ڼ��� ������ �ڽ� Ŭ�������� �������̵�
		 - �ڽ� Ŭ�������� �������̵� ���� ������ ������ ������ �߻��Ѵ�
	 */
	public static void main(String[] args) {
		Vehicle v1 = new Bus();  //���� �߻�޼��� ���� �̱⶧���� �ν��Ͻ� ��������
		
		//�͸� Ŭ����(Anonymous class)
		Vehicle v2 = new Vehicle() { //�����ٿ� ��� Ŭ���ϸ� �Ｎ�ؼ� �͸�Ŭ���� ��������

			@Override
			void ride() { //������ ���ÿ� �Ｎ���� �����ϴ°�, ������ Ŭ���� �̸��� ����
				System.out.println("�Ｎ���� ������ Ż��");				
			}			
		};
		v1.ride();
		v2.ride();
	}
	
}

abstract class Vehicle{	
//	void ride() {
//		//���߿� �ڽ�Ŭ�������� �������̵� �� ���̹Ƿ� ������ �ʾƵ��ȴ�
//	}
	abstract void ride(); //�ݾƳ��� ���߿� ����ڴٴ°�	
}

class Bus extends Vehicle{
	
	@Override
	void ride() {
		System.out.println("����� ���� Ÿ����");
		
	}
}

class Bike extends Vehicle{ //�߻� Ŭ������ ����ϱ� ������ �������̵� �ؾ߸� �ϴ� ��

	//�������̵� ����(���� �Լ���, ���� ����Ÿ��, ���� �Ű�����)
	@Override
	void ride() {
		
		
	}
}