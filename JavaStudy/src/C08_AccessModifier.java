


public class C08_AccessModifier {

	/*
	 	# ���� ������ (Access Modifier)
	 	
	 		- �ٸ� Ŭ������ �ش� Ŭ������ �ڿ��� ����Ϸ��� �� ��
	 		  �������� ��������� �����Ѵ�
	 	
	 	# ���� �����ڸ� ���� ������ �� �ִ� �Ÿ��� ����
	 		
	 		- ���� Ŭ���� ������ �ٸ� �ڿ� (���� ����� �Ÿ�)
	 		- ���� ��Ű�� ������ �ٸ� �ڿ�
	 		- �ٸ� ��Ű���� ������ ��ӹ��� �ڿ�
	 		- �ٸ� ��Ű���� �ڿ� (���� �� �Ÿ�)
	 	
	 	# ���� ������ ����
	 	
	 		- private
	 			: �տ� private�� ���� �ڿ��� ���� Ŭ���� ���ο����� ������ �� �ְ� �ȴ�
	 		- default (�ƹ��͵� �Ⱦ���)
	 			: ���� ��Ű�� ���ο����� �����Ӱ� ������ �� �ְ� �ȴ�
	 		- protected
	 			: ���� ��Ű������ �����Ӱ� ���ٰ���
	 			  �ٸ� ��Ű�������� ��ӹ��� Ŭ������ ������ �� �ִ� �ڿ��� �ȴ�
	 		- public
	 			: �ٸ� ��Ű�������� �����Ӱ� ������ �� �ִ� �ڿ��� �ȴ�
	 */
	public static void main(String[] args) {
		
		//��Ű�� ���� �ٸ� Ŭ��������
		C08_SamePackage instance = new C08_SamePackage();
		instance.public_var();
		instance.protected_var();
		instance.default_var();
//		instance.private_var(); //���� Ŭ���� ���ο����� ���� �� �� �ֱ� ������ ����� ���� ����
		
	}
}

//private ����----------------------------------------
class Snack{
	private int size = 10; //���� Ŭ���� ���ο����� ��밡��

	private void eat() {
		System.out.println(size); //���� Ŭ���� ���ο��� size����غ�
	}
}
class HoneyButterChip extends Snack{

	private void abc() {
//		System.out.println(size); //����� �޾Ҿ private����,�Լ��� ��������
	}		
}
class Choco extends C08_AccessModifier{
	
	public Choco() {
		
	}
	
	void abc() {
		Snack s = new Snack();
//		s.size; //private ����� ����
	}
}


