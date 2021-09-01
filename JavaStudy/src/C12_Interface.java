

public class C12_Interface {

	/*
	  # �������̽� (Interface)
	  
	  	- abstract class�� ����� ������ ���� �� ���ٴ� ������ ������ ��
	  	- �������̽� ������ �޼���� �ڵ����� abstract public�� �ȴ�
	  	- �������̽� ������ ������ �ڵ����� final static�� �ȴ�
	  	- �������̽��� ������ �޼��带 ������ �� default�� ���̸� �⺻ ������ ������ �� �ִ�
	 */
	public static void main(String[] args) {
		new OrangeTree().click();
	}
}
interface CanClick{
//	int a = 10; //�̰��� ������ final static �̵ȴ�
	
	default void click() {
		System.out.println("Ŭ�� �������̽��� �޷��ִ� Ŭ������ �⺻����."
				+ " �������̵� �ؼ� ������ּ���");
	}
}

interface CanPunch{
	void punch(); //abstract�Ƚᵵ �ڵ����� abstract�� ��
}

class OrangeTree implements CanClick, CanPunch{ //�ڹٿ����� ������ ����� ����, ���� interface�����
	
	@Override	//�������̵� ���س����� CanclickŬ������ click()�Լ� �⺻���۳���
	public void click() {
		System.out.println("yesyes");
	}

	@Override
	public void punch() {

	}
}



