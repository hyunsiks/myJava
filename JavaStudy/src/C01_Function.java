

public class C01_Function {

	public static void main(String[] args) {
		
	/*
	  # �Լ� (Function)
	  
	  	- ����� �̸� �����صΰ� ���߿� ������ ���� ��	
	  	- �ڹٿ��� �Լ�(�޼���)�� Ŭ���� ���ο� �����ؾ��Ѵ�
	  	- �����ص� �Լ� �̸� �ڿ� ()�� �ٿ��� �Լ��� ȣ���ϸ�
	  	  ȣ���� �ڸ��� �Լ��� ���� ����� ��ȯ�ȴ�
	  	- �Լ��� ������ �� �ش� �Լ��� ��ȯ�� ���� Ÿ���� �տ� ����д� 
	  	- ���߿� ���� �� ���ɼ��� �ִ� ��ɵ��� �̸� ���������ν�
	  	  �۾��� �ݺ��� ���� �� �ִ�
	  	- void�� �ش��Լ����� ������ ���� ���ٴ� ��
	 */
			print_rabbit();
			
			System.out.println("�ʿ��� �ٱ����� ������ : " + apple_basket(123, 10));

	}
	public static void print_rabbit() {
		System.out.println(" /)/)");
		System.out.println("(  ..)");
		System.out.println("(  >&)");		
	}
//	ex : ����� ������ �����ϸ� �ʿ��� �ٱ����� ������ �˷��ִ� �Լ�
	
	//public static : �ϴ��� ���� ���߿� �ٽ� ����
	//int : �� �Լ��� �������� Ÿ��(return Ÿ��)
	//apple_bascket : Ÿ�Եڿ� �Լ��� �̸��� ������ ��
	//(int apple, int size) : �� �Լ��� ������ �� int Ÿ�� ���� �ΰ� ���� �޵��� ����(�Ű�����, arguments)

	public static int apple_basket(int apple, int size) {
		
		int result;
		
		if(apple % size == 0) {
			result = apple / size;
		}else {
			result = apple / size + 1;
		}
		return result;
	}
	
	
}
